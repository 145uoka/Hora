package com.olympus.hora.controller.shop;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.hora.Exception.RecordNotFoundException;
import com.olympus.hora.common.util.DateUtil;
import com.olympus.hora.common.util.MessageKeyUtil;
import com.olympus.hora.common.util.TimeUtils;
import com.olympus.hora.constants.LogMessageKeyConstants;
import com.olympus.hora.constants.MessageKeyConstants;
import com.olympus.hora.constants.SystemCodeConstants;
import com.olympus.hora.constants.SystemCodeConstants.Flag;
import com.olympus.hora.constants.SystemCodeConstants.MessageType;
import com.olympus.hora.dbflute.exentity.MShop;
import com.olympus.hora.dto.LabelValueDto;
import com.olympus.hora.dto.shop.MWorkingDayDeffDto;
import com.olympus.hora.dto.shop.MWorkingDayDetailDeffDto;
import com.olympus.hora.form.WorkshopEditFrom;
import com.olympus.hora.service.LoggerService;
import com.olympus.hora.service.WorkshopEditService;

/**
 * 営業日設定のコントローラークラス．
 * @author hasegawa_m
 *
 */
@Controller
public class WorkshopEditController {

    @Autowired
    protected MessageSource messageSource;

    @Autowired
    WorkshopEditService workshopEditService;

    @Autowired
    LoggerService loggerService;

    //private static final Logger logger = LoggerFactory.getLogger(WorkshopEditController.class);

    /**
     * 営業日設定画面初期表示．
     *
     * @param form WorkshopEditFrom
     * @param model Model
     * @return "challenge/workshopEdit"
     * @throws RecordNotFoundException
     */
    @RequestMapping(value = "shop/{paramShopId}/workshopEdit", method = RequestMethod.GET)
    public String shop(@PathVariable String paramShopId, @ModelAttribute("form") WorkshopEditFrom form, Model model) throws RecordNotFoundException {

        Integer shopId = Integer.parseInt(paramShopId);

        OptionalEntity<MShop> mShopEntity = workshopEditService.findMShopEntity(shopId);

        if(!mShopEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"店舗マスタ", shopId});
            throw new RecordNotFoundException();
        }

        form.setShopId(paramShopId);
        model.addAttribute("form", form);

        List<LabelValueDto> dateList = workshopEditService.datePullDown(true);
        model.addAttribute("dateList", dateList);

        return "shop/workshopEdit";
    }

    /**
     * 営業日設定画面の登録処理コントローラー．
     *
     * @param form WorkshopEditFrom
     * @param bindingResult エラー情報
     * @param redirectAttributes redirectAttributes
     * @param model Model
     * @return
     * @throws Exception 例外
     */
    @RequestMapping(value = "shop/workshopEdit/store", method = RequestMethod.POST)
    public String store(@Validated @ModelAttribute("form") WorkshopEditFrom form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) throws Exception {

        ArrayList<String> errorMsgList = new ArrayList<String>();

        //適応開始日の日付妥当性チェック
        //boolean isNotValidStartDay = false;
        if(StringUtils.isNotEmpty(form.getStartDay())){
            if(!DateUtil.isValidDateFormat(form.getStartDay(), DateUtil.DATE_TIME_FORMAT_YYYYMMDD)){
                String message = messageSource.getMessage(
                        MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTDATE),
                        null, Locale.getDefault());
                bindingResult.rejectValue("startDay",null, null, message);
            }
        }

        //1レコードごとにバリデーションチェック
        for(int i= 0; i < SystemCodeConstants.WOKING_DETAIL_RECORD_NUM; i++){

            //指定日の日付妥当性チェック
            if(StringUtils.isNotEmpty(form.getSpecifiedDay()[i])){
                if(!DateUtil.isValidDateFormat(form.getSpecifiedDay()[i], DateUtil.DATE_TIME_FORMAT_YYYYMMDD)){
                    bindingResult.rejectValue("specifiedDay["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTDATEPATTERN),
                            new Object[]{(i+1),"指定日"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
            }

            //開始時刻の時刻妥当性・前後チェック
            if(StringUtils.isNotEmpty(form.getStartTime()[i]) && StringUtils.isNotEmpty(form.getEndTime()[i])){
                if(TimeUtils.isValidTimeFormat(form.getStartTime()[i])){
                    if(TimeUtils.isValidTimeFormat(form.getEndTime()[i])){
                        LocalTime startTime = TimeUtils.convertToLocalTime(form.getStartTime()[i]);
                        LocalTime endTime = TimeUtils.convertToLocalTime(form.getEndTime()[i]);
                        if(!TimeUtils.isValidTimeTerm(startTime, endTime)){
                            bindingResult.rejectValue("startTime["+i+"]",null, null, null);
                            bindingResult.rejectValue("endTime["+i+"]",null, null, null);
                            String message = messageSource.getMessage(
                                    MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTTIMETERM),
                                    new Object[]{(i+1)}, Locale.getDefault());
                            errorMsgList.add(message);
                        }
                    }else{
                        bindingResult.rejectValue("endTime["+i+"]",null, null, null);
                        String message = messageSource.getMessage(
                                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTTIMEPATTERN),
                                new Object[]{(i+1), "終了時刻"}, Locale.getDefault());
                        errorMsgList.add(message);
                    }
                }else{
                    bindingResult.rejectValue("startTime["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTTIMEPATTERN),
                            new Object[]{(i+1), "開始時刻"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
            }

            //第ｘ週Flagのチェックリスト
            boolean isWeekNumberInput = false;
            List<String> weekNumberList = new ArrayList<String>();
            weekNumberList.add(form.getWeek1Flag()[i]);
            weekNumberList.add(form.getWeek2Flag()[i]);
            weekNumberList.add(form.getWeek3Flag()[i]);
            weekNumberList.add(form.getWeek4Flag()[i]);
            weekNumberList.add(form.getWeek5Flag()[i]);

            //いずれかにチェックがある場合、isWeekNumberInputはtrue。
            if(weekNumberList.contains("1")){
                isWeekNumberInput = true;
            }

            //曜日Flagのチェックリスト
            boolean isDayOfWeekInput = false;
            List<String> dayOfWeekList = new ArrayList<String>();
            dayOfWeekList.add(form.getMonFlg()[i]);
            dayOfWeekList.add(form.getTueFlg()[i]);
            dayOfWeekList.add(form.getWebFlg()[i]);
            dayOfWeekList.add(form.getThuFlg()[i]);
            dayOfWeekList.add(form.getFriFlg()[i]);
            dayOfWeekList.add(form.getSatFlg()[i]);
            dayOfWeekList.add(form.getSunFlg()[i]);
            dayOfWeekList.add(form.getHolidayFlg()[i]);

            //いずれかにチェックがある場合、isDayOfWeekInputはtrue。
            if(dayOfWeekList.contains("1")){
                isDayOfWeekInput = true;
            }

            //適応Flag//
            if (StringUtils.isNotEmpty(form.getEffectiveFlag()[i])){
                //適応FlagがONの場合、以下の条件をいずれも満たさなければ、エラー。
                if(!isDayOfWeekInput){
                    //曜日Flagの設定がない、かつ
                    if(StringUtils.isEmpty(form.getDayOfMonth()[i])){
                        //毎月指定日の設定がない、かつ
                        if(StringUtils.isEmpty(form.getSpecifiedDay()[i])){
                            //指定日の設定がない。
                            bindingResult.rejectValue("monFlg["+i+"]" ,null, null, null);
                            bindingResult.rejectValue("tueFlg["+i+"]",null, null, null);
                            bindingResult.rejectValue("webFlg["+i+"]",null, null, null);
                            bindingResult.rejectValue("thuFlg["+i+"]",null, null, null);
                            bindingResult.rejectValue("friFlg["+i+"]",null, null, null);
                            bindingResult.rejectValue("satFlg["+i+"]",null, null, null);
                            bindingResult.rejectValue("sunFlg["+i+"]",null, null, null);
                            bindingResult.rejectValue("holidayFlg["+i+"]",null, null, null);
                            bindingResult.rejectValue("dayOfMonth["+i+"]",null, null, null);
                            bindingResult.rejectValue("specifiedDay["+i+"]",null, null, null);
                            String message = messageSource.getMessage(
                                    MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTEMPTY_WORKDAY),
                                    new Object[]{(i+1)}, Locale.getDefault());
                            errorMsgList.add(message);
                        }
                    }
                }
            }

            //営業Flag//
            if (StringUtils.isNotEmpty(form.getWorkingDayFlg()[i])) {
                //営業FlagがONの場合
                if(StringUtils.isEmpty(form.getStartTime()[i])){
                    //開始時刻が未入力であれば、エラー
                    bindingResult.rejectValue("startTime["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTEMPTY_WITH_ITEM),
                            new Object[]{(i+1), "開始時刻"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
                if(StringUtils.isEmpty(form.getEndTime()[i])){
                    //終了時刻が未入力であれば、エラー
                    bindingResult.rejectValue("endTime["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTEMPTY_WITH_ITEM),
                            new Object[]{(i+1), "終了時刻"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
            }else if (StringUtils.isEmpty(form.getWorkingDayFlg()[i])){
                //営業FlagがOFFの場合
                if(StringUtils.isNotEmpty(form.getStartTime()[i])){
                    //開始時刻が入力されていれば、エラー
                    bindingResult.rejectValue("startTime["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "開始時刻"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
                if(StringUtils.isNotEmpty(form.getEndTime()[i])){
                    //終了時刻が入力されていれば、エラー
                    bindingResult.rejectValue("endTime["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "終了時刻"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
            }

            //第ｘ週Flag//
            if(isWeekNumberInput){
                //第ｘ週FlagのいずれかがONの場合
                if(!isDayOfWeekInput){
                    //曜日Flagのいずれも未設定であれば、エラー。
                    bindingResult.rejectValue("monFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("tueFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("webFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("thuFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("friFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("satFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("sunFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("holidayFlg["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTEMPTY_WITH_ITEM),
                            new Object[]{(i+1), "曜日Flag"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
                if(StringUtils.isNotEmpty(form.getDayOfMonth()[i])){
                    //毎月指定日の設定されていれば、エラー。
                    bindingResult.rejectValue("dayOfMonth["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "毎月指定日"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
                if(StringUtils.isNotEmpty(form.getSpecifiedDay()[i])){
                    //指定日の設定されていれば、エラー。
                    bindingResult.rejectValue("specifiedDay["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "指定日"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
            }

            //曜日Flag//
            if(isDayOfWeekInput){
                //曜日FlagのいずれかがONの場合
                if(StringUtils.isNotEmpty(form.getDayOfMonth()[i])){
                    //毎月指定日の設定されていれば、エラー。
                    bindingResult.rejectValue("dayOfMonth["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "毎月指定日"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
                if(StringUtils.isNotEmpty(form.getSpecifiedDay()[i])){
                    //指定日の設定されていれば、エラー。
                    bindingResult.rejectValue("specifiedDay["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "指定日"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
            }

            //指定日Flag//
            if(StringUtils.isNotEmpty(form.getSpecifiedDay()[i])){
                //指定日がONの場合
                if(isDayOfWeekInput){
                    //曜日Flagのいずれかが設定されていれば、エラー。
                    bindingResult.rejectValue("monFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("tueFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("webFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("thuFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("friFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("satFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("sunFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("holidayFlg["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "曜日Flag"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
                if(isWeekNumberInput){
                    //第ｘ週Flagのいずれかが設定されていれば、エラー。
                    bindingResult.rejectValue("week1Flag["+i+"]",null, null, null);
                    bindingResult.rejectValue("week2Flag["+i+"]",null, null, null);
                    bindingResult.rejectValue("week3Flag["+i+"]",null, null, null);
                    bindingResult.rejectValue("week4Flag["+i+"]",null, null, null);
                    bindingResult.rejectValue("week5Flag["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "第ｘ週Flag"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
                if(StringUtils.isNotEmpty(form.getDayOfMonth()[i])){
                    //毎月指定日の設定されていれば、エラー。
                    bindingResult.rejectValue("dayOfMonth["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "毎月指定日"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
            }

            //毎月指定日Flag//
            if(StringUtils.isNotEmpty(form.getDayOfMonth()[i])){
                //毎月指定日がONの場合
                if(isDayOfWeekInput){
                    //曜日Flagのいずれかが設定されていれば、エラー。
                    bindingResult.rejectValue("monFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("tueFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("webFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("thuFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("friFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("satFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("sunFlg["+i+"]",null, null, null);
                    bindingResult.rejectValue("holidayFlg["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "曜日Flag"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
                if(isWeekNumberInput){
                    //第ｘ週Flagのいずれかが設定されていれば、エラー。
                    bindingResult.rejectValue("week1Flag["+i+"]",null, null, null);
                    bindingResult.rejectValue("week2Flag["+i+"]",null, null, null);
                    bindingResult.rejectValue("week3Flag["+i+"]",null, null, null);
                    bindingResult.rejectValue("week4Flag["+i+"]",null, null, null);
                    bindingResult.rejectValue("week5Flag["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "第ｘ週Flag"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
                if(StringUtils.isNotEmpty(form.getSpecifiedDay()[i])){
                    //指定日の設定されていれば、エラー。
                    bindingResult.rejectValue("specifiedDay["+i+"]",null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTINPUT),
                            new Object[]{(i+1), "指定日"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
            }

        }

        // validation確認
        if (bindingResult.hasErrors()) {

            model.addAttribute("form", form);
            model.addAttribute("errors", bindingResult);
            // エラーメッセージをメッセージ表示領域に格納。
            model.addAttribute(MessageType.ERROR, errorMsgList);

            List<LabelValueDto> dateList = workshopEditService.datePullDown(true);
            model.addAttribute("dateList", dateList);

            return "shop/workshopEdit";
        }

        // DB登録
        MWorkingDayDeffDto mWorkingDayDeffDto = convaertToMWorkingDayDeffDto(form);
        List<MWorkingDayDetailDeffDto> mWorkingDayDetailDeffDtoList = convertTomWorkingDayDetailDeffDtoList(form);
        workshopEditService.store(mWorkingDayDeffDto, mWorkingDayDetailDeffDtoList);

        // 完了メッセージを設定
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        return "redirect:/";

    }


    /**
     * formから営業日詳細定義マスタのdtoリストを生成する．
     *
     * @param form WorkshopEditFrom
     * @return MWorkingDayDetailDeffDtoリスト
     */
    private List<MWorkingDayDetailDeffDto> convertTomWorkingDayDetailDeffDtoList(WorkshopEditFrom form) {

        ArrayList<MWorkingDayDetailDeffDto> dtoList = new ArrayList<MWorkingDayDetailDeffDto>();

        for(int i =0; i < SystemCodeConstants.WOKING_DETAIL_RECORD_NUM; i++){
            //10件のレコードを確認

                MWorkingDayDetailDeffDto dto = new MWorkingDayDetailDeffDto();

                //営業日詳細定義マスタのdtoにform情報をセット
                BeanUtils.copyProperties(form, dto);
                dto.setDeleteFlag(false);

                if(StringUtils.isNotEmpty(form.getEffectiveFlag()[i])){
                    dto.setEffectiveFlag(form.getEffectiveFlag()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getWorkingDayFlg()[i])){
                    dto.setWorkingDayFlg(form.getWorkingDayFlg()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getWeek1Flag()[i])){
                    dto.setWeek1Flag(form.getWeek1Flag()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getWeek2Flag()[i])){
                    dto.setWeek2Flag(form.getWeek2Flag()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getWeek3Flag()[i])){
                    dto.setWeek3Flag(form.getWeek3Flag()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getWeek4Flag()[i])){
                    dto.setWeek4Flag(form.getWeek4Flag()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getWeek5Flag()[i])){
                    dto.setWeek5Flag(form.getWeek5Flag()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getMonFlg()[i])){
                    dto.setMonFlg(form.getMonFlg()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getTueFlg()[i])){
                    dto.setTueFlg(form.getTueFlg()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getWebFlg()[i])){
                    dto.setWebFlg(form.getWebFlg()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getThuFlg()[i])){
                    dto.setThuFlg(form.getThuFlg()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getFriFlg()[i])){
                    dto.setFriFlg(form.getFriFlg()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getSatFlg()[i])){
                    dto.setSatFlg(form.getSatFlg()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getSunFlg()[i])){
                    dto.setSunFlg(form.getSunFlg()[i].equals(Flag.ON.getStringValue()));
                }
                if(StringUtils.isNotEmpty(form.getHolidayFlg()[i])){
                    dto.setHolidayFlg(form.getHolidayFlg()[i].equals(Flag.ON.getStringValue()));
                }

                if (StringUtils.isNotEmpty(form.getDayOfMonth()[i])) {
                    // 毎月指定日が入力されていれば、型変換を行いdtoにセット。
                    dto.setDayOfMonth(Integer.parseInt(form.getDayOfMonth()[i]));
                } else {
                    // 未入力であれば、nullをdtoにセット。
                    dto.setDayOfMonth(null);
                }

                // 指定日に 入力有：型変換を行いdtoにセット。 未入力：nullをdtoにセット。
                dto.setSpecifiedDay(DateUtil.convertToLocalDateOrNull(form.getSpecifiedDay()[i]));

                // 開始時刻に 入力有：型変換を行いdtoにセット。 未入力：nullをdtoにセット。
                dto.setStartTime(TimeUtils.convertToLocalTimeOrNull(form.getStartTime()[i]));

                // 終了時刻に 入力有：型変換を行いdtoにセット。 未入力：nullをdtoにセット。
                dto.setEndTime(TimeUtils.convertToLocalTimeOrNull(form.getEndTime()[i]));

                dtoList.add(dto);
            }
        return dtoList;
    }

    /**
     * formから営業日定義マスタのdtoを生成する．
     *
     * @param form WorkshopEditFrom
     * @return dto
     */
    private MWorkingDayDeffDto convaertToMWorkingDayDeffDto(WorkshopEditFrom form) {

        MWorkingDayDeffDto dto = new MWorkingDayDeffDto();

        //営業日定義マスタのdtoにform情報をセット
        BeanUtils.copyProperties(form, dto);
        dto.setShopId(Integer.parseInt(form.getShopId()));
        dto.setStartDay(DateUtil.convertToLocalDate(form.getStartDay()));
        dto.setDeleteFlag(false);

        return dto;
    }

    /**
     * 入力なしの場合はnullにトリム
     *
     * @param binder binder
     */
    @InitBinder
    private void initBinder(WebDataBinder binder) {
        // 入力なしの場合はnullにトリム
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

}