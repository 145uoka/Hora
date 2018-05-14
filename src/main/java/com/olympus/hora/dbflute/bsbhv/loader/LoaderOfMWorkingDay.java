package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_working_day as TABLE. <br>
 * <pre>
 * [primary key]
 *     working_day_id
 *
 * [column]
 *     working_day_id, shop_id, working_date, start_time, end_time, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_working_day_id_seq
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
public class LoaderOfMWorkingDay {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MWorkingDay> _selectedList;
    protected BehaviorSelector _selector;
    protected MWorkingDayBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMWorkingDay ready(List<MWorkingDay> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MWorkingDayBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MWorkingDayBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MWorkingDay> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
