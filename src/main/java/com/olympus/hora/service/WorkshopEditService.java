package com.olympus.hora.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.hora.Exception.RecordNotFoundException;
import com.olympus.hora.common.util.MonthUtil;
import com.olympus.hora.constants.SystemCodeConstants;
import com.olympus.hora.dbflute.exbhv.MHolidayBhv;
import com.olympus.hora.dbflute.exbhv.MShopBhv;
import com.olympus.hora.dbflute.exbhv.MWorkingDayBhv;
import com.olympus.hora.dbflute.exbhv.MWorkingDayDeffBhv;
import com.olympus.hora.dbflute.exbhv.MWorkingDayDetailDeffBhv;
import com.olympus.hora.dbflute.exentity.MHoliday;
import com.olympus.hora.dbflute.exentity.MShop;
import com.olympus.hora.dbflute.exentity.MWorkingDay;
import com.olympus.hora.dbflute.exentity.MWorkingDayDeff;
import com.olympus.hora.dbflute.exentity.MWorkingDayDetailDeff;
import com.olympus.hora.dto.LabelValueDto;
import com.olympus.hora.dto.shop.MWorkingDayDeffDto;
import com.olympus.hora.dto.shop.MWorkingDayDetailDeffDto;

/**
 * 営業日設定のサービスクラス．
 * @author hasegawa_m
 *
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class WorkshopEditService {

    @Autowired
    MWorkingDayDeffBhv mWorkingDayDeffBhv;

    @Autowired
    MWorkingDayDetailDeffBhv mWorkingDayDetailDeffBhv;

    @Autowired
    MWorkingDayBhv mWorkingDayBhv;

    @Autowired
    MShopBhv mShopBhv;

    @Autowired
    MHolidayBhv mHolidayBhv;

    @Autowired
    LoggerService loggerService;


    /**
     * 営業日の設定を行う．
     *
     * @param mWorkingDayDeffDto dto
     * @param mWorkingDayDetailDeffDtoList dtoList
     * @return 営業日マスタのentityリスト
     * @throws RecordNotFoundException レコード取得エラー
     */
    public List<MWorkingDay> store(MWorkingDayDeffDto mWorkingDayDeffDto, List<MWorkingDayDetailDeffDto> mWorkingDayDetailDeffDtoList) throws RecordNotFoundException{

      //営業日定義マスタ登録処理
        MWorkingDayDeff mWorkingDayDeffEntity = storeMWorkingDayDeff(mWorkingDayDeffDto);

      //営業日詳細定義マスタ登録処理
        storeMWorkingDayDetailDeff(mWorkingDayDetailDeffDtoList, mWorkingDayDeffEntity.getMWorkingDayDeffId());

        //営業日マスタ登録処理
        mWorkingDayDeffDto.setmWorkingDayDeffId(mWorkingDayDeffEntity.getMWorkingDayDeffId());
        List<MWorkingDay> MWorkingDayEntityList = storeMWorkingDay(mWorkingDayDeffDto);

        return MWorkingDayEntityList;
    }


    /**
     * 営業日定義マスタの登録処理を行う．
     *
     * @param dto MWorkingDayDeffDto
     * @return
     * @throws RecordNotFoundException レコード取得エラー
     */
    @Transactional(propagation = Propagation.REQUIRED)
    private MWorkingDayDeff storeMWorkingDayDeff(MWorkingDayDeffDto dto) throws RecordNotFoundException {

        //対象の店舗IDが店舗マスタに存在するかチェック。
        OptionalEntity<MShop> mShopEntity = mShopBhv.selectEntity(cb ->{
            cb.query().setShopId_Equal(dto.getShopId());
            cb.query().setDeleteFlag_Equal(false);
        });

        if(!mShopEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog("W_99_0001", new Object[]{"店舗マスタ", dto.getShopId()});
            throw new RecordNotFoundException("MShop", dto.getShopId());
        }

      //対象の設定開始日が営業日定義マスタに存在するかチェック。
        OptionalEntity<MWorkingDayDeff> mWorkingDayDeffSameDayCheckEntity = mWorkingDayDeffBhv.selectEntity(cb ->{
            cb.query().setShopId_Equal(dto.getShopId());
            cb.query().setStartDay_Equal(dto.getStartDay());
            cb.query().setDeleteFlag_Equal(false);
        });

        if(mWorkingDayDeffSameDayCheckEntity.isPresent()){
            // 同日のテーブル情報があれば、データを削除。
            MWorkingDayDeff mWorkingDayDeffSameDayEntity = mWorkingDayDeffSameDayCheckEntity.get();
            mWorkingDayDeffSameDayEntity.setDeleteFlag(true);
            mWorkingDayDeffBhv.update(mWorkingDayDeffSameDayEntity);
        }

        // 次の営業日定義IDを取得する。
        Integer mWorkingDayDeffId = mWorkingDayDeffBhv.selectNextVal();
        MWorkingDayDeff mWorkingDayDeffEntity = new MWorkingDayDeff();

        // 入力情報をDBに挿入する。
        BeanUtils.copyProperties(dto, mWorkingDayDeffEntity);
        mWorkingDayDeffEntity.setMWorkingDayDeffId(mWorkingDayDeffId);

        mWorkingDayDeffBhv.insert(mWorkingDayDeffEntity);
        loggerService.outLog("I_99_0004", new Object[]{"営業日定義マスタ", mWorkingDayDeffId});


        return mWorkingDayDeffEntity;
    }

    /**
     * 営業日詳細定義マスタの登録処理を行う．
     *
     * @param dtoList MWorkingDayDetailDeffDtoList
     * @return MWorkingDayDetailDeffEntityList
     * @throws RecordNotFoundException レコード取得エラー
     */
    @Transactional(propagation = Propagation.REQUIRED)
    private List<MWorkingDayDetailDeff> storeMWorkingDayDetailDeff(List<MWorkingDayDetailDeffDto> dtoList, Integer mWorkingDayDeffId) throws RecordNotFoundException {

        //対象の営業日定義IDが営業日定義マスタに存在するかチェック。
        OptionalEntity<MWorkingDayDeff> mWorkingDayDeffEntity = mWorkingDayDeffBhv.selectEntity(cb ->{
            cb.query().setMWorkingDayDeffId_Equal(mWorkingDayDeffId);
            cb.query().setDeleteFlag_Equal(false);
        });

        if(!mWorkingDayDeffEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog("W_99_0001", new Object[]{"営業日定義マスタ", mWorkingDayDeffId});
            throw new RecordNotFoundException("MWorkingDayDeff", mWorkingDayDeffId);
        }

        List<MWorkingDayDetailDeff> entityList = new ArrayList<MWorkingDayDetailDeff>();

        for(MWorkingDayDetailDeffDto dto : dtoList){
            // 次の営業日詳細定義IDを取得する。
            Integer workingDayDetailDeffId = mWorkingDayDetailDeffBhv.selectNextVal();
            MWorkingDayDetailDeff mWorkingDayDetailDeffEntity = new MWorkingDayDetailDeff();

            BeanUtils.copyProperties(dto, mWorkingDayDetailDeffEntity);
            mWorkingDayDetailDeffEntity.setWorkingDayDetailDeffId(workingDayDetailDeffId);
            mWorkingDayDetailDeffEntity.setMWorkingDayDeffId(mWorkingDayDeffId);

            entityList.add(mWorkingDayDetailDeffEntity);
        }

        // 入力情報をDBに挿入する。
        mWorkingDayDetailDeffBhv.batchInsert(entityList);
        loggerService.outLog("I_99_0005", new Object[]{"営業日詳細定義マスタ", dtoList.size()});

        return entityList;
    }


    /**
     * 営業日マスタの登録処理を行う．
     *
     * @param dto MWorkingDayDeffDto
     * @return MWorkingDayのentityリスト
     * @throws RecordNotFoundException レコード取得エラー
     */
    @Transactional(propagation = Propagation.REQUIRED)
    private List<MWorkingDay> storeMWorkingDay(MWorkingDayDeffDto dto) throws RecordNotFoundException {

        //対象の店舗IDが店舗マスタに存在するかチェック。
        OptionalEntity<MShop> mShopEntity = mShopBhv.selectEntity(cb ->{
            cb.query().setShopId_Equal(dto.getShopId());
            cb.query().setDeleteFlag_Equal(false);
        });

        if(!mShopEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog("W_99_0001", new Object[]{"店舗マスタ", dto.getShopId()});
            throw new RecordNotFoundException("MShop", dto.getShopId());
        }

        //対象の営業日定義マスタが存在するかチェック。(営業日定義Idで検索)
        OptionalEntity<MWorkingDayDeff> mWorkingDayDeffPreEntity = mWorkingDayDeffBhv.selectEntity(cb ->{
            cb.query().setMWorkingDayDeffId_Equal(dto.getmWorkingDayDeffId());
            cb.query().setDeleteFlag_Equal(false);
        });

        if(!mWorkingDayDeffPreEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog("W_99_0002", new Object[]{"営業日定義マスタ", "MWorkingDayDeffId", dto.getmWorkingDayDeffId()});
            throw new RecordNotFoundException("MWorkingDayDeff", dto.getmWorkingDayDeffId());
        }

        //営業日定義マスタのEntity取得
        MWorkingDayDeff mWorkingDayDeffEntity = mWorkingDayDeffPreEntity.get();


        //対象の営業日詳細定義マスタが存在するかチェック。(営業日定義Idで検索)
        ListResultBean<MWorkingDayDetailDeff> mWorkingDayDetailDeffSelectList = mWorkingDayDetailDeffBhv.selectList(cb ->{
            cb.query().setMWorkingDayDeffId_Equal(mWorkingDayDeffEntity.getMWorkingDayDeffId());
            cb.query().setDeleteFlag_Equal(false);
            cb.query().addOrderBy_WorkingDayFlg_Asc(); //営業Flagがfalseのレコードからチェックする。
            cb.query().addOrderBy_WorkingDayDetailDeffId_Asc();
        });

        if(mWorkingDayDetailDeffSelectList.size() == 0 || mWorkingDayDetailDeffSelectList == null){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog("W_99_0002", new Object[]{"営業日詳細定義マスタ", "MWorkingDayDeffId", mWorkingDayDeffEntity.getMWorkingDayDeffId()});
            throw new RecordNotFoundException("MWorkingDayDetailDeff", dto.getShopId());
        }


        //営業日マスタからレコードを削除する。
        ListResultBean<MWorkingDay> mWorkingDayDeleteList = mWorkingDayBhv.selectList(cb ->{
            cb.query().setShopId_Equal(dto.getShopId());
            cb.query().setWorkingDate_GreaterEqual(mWorkingDayDeffEntity.getStartDay());
            cb.query().setDeleteFlag_Equal(false);
        });
        //一括削除
        mWorkingDayBhv.batchDelete(mWorkingDayDeleteList);


        List<MWorkingDay> mWorkingDayStoreList = new ArrayList<MWorkingDay>();
        List<LocalDate> shopHolidayList = new ArrayList<LocalDate>();

        detailDeffRoop: for(MWorkingDayDetailDeff mWorkingDayDetailDeff :mWorkingDayDetailDeffSelectList){

            if((mWorkingDayDetailDeff.getEffectiveFlag()).equals(false)){
                //適応Flagがfalseであれば、スキップ。
                continue detailDeffRoop;
            }

            LocalDate InputStartDay = mWorkingDayDeffEntity.getStartDay();
            LocalDate CheckLimitDay = MonthUtil.getEndDayOfTheAfterManyMonths(InputStartDay, SystemCodeConstants.WOKING_STORE_MONTHS_NUM);

            //設定開始日から、xヵ月後の月末日まで繰り返し
            dateRoop: for(LocalDate date = InputStartDay; date.isBefore(CheckLimitDay) || date.isEqual(CheckLimitDay); date = date.plusDays(1)){

                for(LocalDate shopHoliday : shopHolidayList){
                    if(date.isEqual(shopHoliday)){
                        //休業日と一致すれば、dateRoopを抜ける。
                        continue dateRoop;
                    }
                }

                MWorkingDay mWorkingDayEntity = new MWorkingDay();

                dateCheckRoop:{

                    //指定日//
                    if(mWorkingDayDetailDeff.getSpecifiedDay() != null){
                        //指定日が入力されている場合
                        if(date.isEqual(mWorkingDayDetailDeff.getSpecifiedDay())){
                            //指定日と一致した場合
                            if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                                //営業Flagがtrueの場合、entityに日付をセット。
                                mWorkingDayEntity.setWorkingDate(date);
                                break dateCheckRoop;

                            }else{
                                //営業Flagがfalseの場合、休日リストに日付をセット。
                                shopHolidayList.add(date);
                                break dateCheckRoop;
                            }
                        }
                    }

                    //毎月指定日//
                    if(mWorkingDayDetailDeff.getDayOfMonth() != null){
                        //毎月指定日が入力されている場合
                        if(date.getDayOfMonth() == mWorkingDayDetailDeff.getDayOfMonth()){
                            //毎月指定日と一致した場合
                            if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                                //営業Flagがtrueの場合、entityに日付をセット。
                                mWorkingDayEntity.setWorkingDate(date);
                                break dateCheckRoop;

                            }else{
                                //営業Flagがfalseの場合、休日リストに日付をセット。
                                shopHolidayList.add(date);
                                break dateCheckRoop;
                            }
                        }
                    }

                    //祝日Flag//
                    if(mWorkingDayDetailDeff.getHolidayFlg().equals(true)){
                        //祝日Flagがtrueの場合、祝日マスタの日付と照会する。
                        OptionalEntity<MHoliday> mHolidayEntity = findHoliday(date);

                        if(mHolidayEntity.isPresent()){
                            //祝日日と一致した場合
                            if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                                //営業Flagがtrueの場合、entityに日付をセット。
                                mWorkingDayEntity.setWorkingDate(date);
                                break dateCheckRoop;

                            }else{
                                //営業Flagがfalseの場合、休日リストに日付をセット。
                                shopHolidayList.add(date);
                                break dateCheckRoop;
                            }
                        }
                    }

                    //第ｘ週Flag//
                    if(mWorkingDayDetailDeff.getWeek1Flag().equals(true)){
                        checkDayOfWeekInMonth(mWorkingDayDetailDeff, mWorkingDayEntity, date, 1, shopHolidayList);
                        //第1週目の指定曜日と一致した場合
                        if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                            //営業Flagがtrueの場合、entityに日付をセット。
                            mWorkingDayEntity.setWorkingDate(date);
                            break dateCheckRoop;

                        }else{
                            //営業Flagがfalseの場合、休日リストに日付をセット。
                            shopHolidayList.add(date);
                            break dateCheckRoop;
                        }
                    }

                    if(mWorkingDayDetailDeff.getWeek2Flag().equals(true)){
                        //第2週目の指定曜日と一致した場合
                        checkDayOfWeekInMonth(mWorkingDayDetailDeff, mWorkingDayEntity, date, 2, shopHolidayList);
                        if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                            //営業Flagがtrueの場合、entityに日付をセット。
                            mWorkingDayEntity.setWorkingDate(date);
                            break dateCheckRoop;

                        }else{
                            //営業Flagがfalseの場合、休日リストに日付をセット。
                            shopHolidayList.add(date);
                            break dateCheckRoop;
                        }
                    }

                    if(mWorkingDayDetailDeff.getWeek3Flag().equals(true)){
                        //第3週目の指定曜日と一致した場合
                        checkDayOfWeekInMonth(mWorkingDayDetailDeff, mWorkingDayEntity, date, 3, shopHolidayList);
                        if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                            //営業Flagがtrueの場合、entityに日付をセット。
                            mWorkingDayEntity.setWorkingDate(date);
                            break dateCheckRoop;

                        }else{
                            //営業Flagがfalseの場合、休日リストに日付をセット。
                            shopHolidayList.add(date);
                            break dateCheckRoop;
                        }
                    }

                    if(mWorkingDayDetailDeff.getWeek4Flag().equals(true)){
                        //第4週目の指定曜日と一致した場合
                        checkDayOfWeekInMonth(mWorkingDayDetailDeff, mWorkingDayEntity, date, 4, shopHolidayList);
                        if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                            //営業Flagがtrueの場合、entityに日付をセット。
                            mWorkingDayEntity.setWorkingDate(date);
                            break dateCheckRoop;

                        }else{
                            //営業Flagがfalseの場合、休日リストに日付をセット。
                            shopHolidayList.add(date);
                            break dateCheckRoop;
                        }
                    }

                    if(mWorkingDayDetailDeff.getWeek5Flag().equals(true)){
                        //第5週目の指定曜日と一致した場合
                        checkDayOfWeekInMonth(mWorkingDayDetailDeff, mWorkingDayEntity, date, 5, shopHolidayList);
                        if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                            //営業Flagがtrueの場合、entityに日付をセット。
                            mWorkingDayEntity.setWorkingDate(date);
                            break dateCheckRoop;

                        }else{
                            //営業Flagがfalseの場合、休日リストに日付をセット。
                            shopHolidayList.add(date);
                            break dateCheckRoop;
                        }
                    }

                    //曜日Flag//
                    //曜日Flagがtrueの場合、指定曜日と一致した場合
                    checkDayOfWeekInMonth(mWorkingDayDetailDeff, mWorkingDayEntity, date, 0, shopHolidayList);

                }

                if(mWorkingDayEntity.getWorkingDate() != null){
                    //日付がentityにセットできていれば、他のカラムもセットし、リストに格納する。
                    Integer workingDayId = mWorkingDayBhv.selectNextVal();
                    mWorkingDayEntity.setWorkingDayId(workingDayId);
                    mWorkingDayEntity.setShopId(dto.getShopId());
                    mWorkingDayEntity.setStartTime(mWorkingDayDetailDeff.getStartTime());
                    mWorkingDayEntity.setEndTime(mWorkingDayDetailDeff.getEndTime());

                    mWorkingDayStoreList.add(mWorkingDayEntity);
                }
            }
        }

        if(mWorkingDayStoreList.size() > 0){
            // entityリストに情報があれば、営業日情報をDBに一括挿入する。
            mWorkingDayBhv.batchInsert(mWorkingDayStoreList);
            loggerService.outLog("I_99_0005", new Object[]{"営業日マスタ", mWorkingDayStoreList.size()});
        }

        return mWorkingDayStoreList;
    }


    private OptionalEntity<MHoliday> findHoliday(LocalDate date) {
        OptionalEntity<MHoliday> mHolidayEntity = mHolidayBhv.selectEntity(cb ->{
            cb.query().setHoliday_Equal(date);
            cb.query().setDeleteFlag_Equal(false);
        });
        return mHolidayEntity;
    }


    /**
     * 第x週目の指定曜日と一致すれば、entityにdateをセットする。
     * @param mWorkingDayDetailDeff mWorkingDayDetailDeffEntity
     * @param mWorkingDayEntity mWorkingDayEntity
     * @param date 日付
     * @param weekIndex 第x週目
     */
    private void checkDayOfWeekInMonth(MWorkingDayDetailDeff mWorkingDayDetailDeff, MWorkingDay mWorkingDayEntity,
            LocalDate date, int weekIndex, List<LocalDate> shopHolidayList) {

        dateCheck:{

        if (mWorkingDayDetailDeff.getSunFlg().equals(true)) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.SUNDAY)){
                if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    break dateCheck;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    break dateCheck;
                }
            }
        }

        if (mWorkingDayDetailDeff.getMonFlg().equals(true)) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.MONDAY)){
                if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    break dateCheck;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    break dateCheck;
                }
            }
        }

        if (mWorkingDayDetailDeff.getTueFlg().equals(true)) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.TUESDAY)){
                if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    break dateCheck;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    break dateCheck;
                }
            }
        }

        if (mWorkingDayDetailDeff.getWebFlg().equals(true)) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.WEDNESDAY)){
                if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    break dateCheck;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    break dateCheck;
                }
            }
        }

        if (mWorkingDayDetailDeff.getThuFlg().equals(true)) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.THURSDAY)){
                if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    break dateCheck;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    break dateCheck;
                }
            }
        }

        if (mWorkingDayDetailDeff.getFriFlg().equals(true)) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.FRIDAY)){
                if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    break dateCheck;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    break dateCheck;
                }
            }
        }

        if (mWorkingDayDetailDeff.getSatFlg().equals(true)) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.SATURDAY)){
                if((mWorkingDayDetailDeff.getWorkingDayFlg()).equals(true)){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    break dateCheck;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    break dateCheck;
                }
            }
        }

        }
    }


    /**
     * 毎月指定日選択のプルダウン
     * @return dateList
     */
    public List<LabelValueDto> datePullDown(boolean hasBrank) {

        List<LabelValueDto> dateList = new ArrayList<LabelValueDto>();
        LabelValueDto dto;

        if (hasBrank) {
            //プルダウンの最初のメッセージをセット。
            dto = new LabelValueDto();
            dto.setValue("");
            dto.setLabel(SystemCodeConstants.PLEASE_SELECT_MSG);
            dateList.add(dto);
        }

        dto = new LabelValueDto();
        dto.setLabel("月末");
        dto.setValue("0");
        dateList.add(dto);

        for (int i = 1; i <= 31; i++) {
            dto = new LabelValueDto();
            dto.setLabel(String.valueOf(i));
            dto.setValue(i);
            dateList.add(dto);
        }

        return dateList;
    }

}
