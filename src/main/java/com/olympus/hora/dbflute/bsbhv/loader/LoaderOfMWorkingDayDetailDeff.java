package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_working_day_detail_deff as TABLE. <br>
 * <pre>
 * [primary key]
 *     working_day_detail_deff_id
 *
 * [column]
 *     working_day_detail_deff_id, m_working_day_deff_id, effective_flag, working_day_flg, week_1_flag, week_2_flag, week_3_flag, week4_flag, week5_flag, mon_flg, tue_flg, web_flg, thu_flg, fri_flg, sat_flg, sun_flg, holiday_flg, day_of_month, specified_day, start_time, end_time, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_detail_deff_working_day_detail_deff_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMWorkingDayDetailDeff {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MWorkingDayDetailDeff> _selectedList;
    protected BehaviorSelector _selector;
    protected MWorkingDayDetailDeffBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMWorkingDayDetailDeff ready(List<MWorkingDayDetailDeff> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MWorkingDayDetailDeffBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MWorkingDayDetailDeffBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MWorkingDayDetailDeff> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
