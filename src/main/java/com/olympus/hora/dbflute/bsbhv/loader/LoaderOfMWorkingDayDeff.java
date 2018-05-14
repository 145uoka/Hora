package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_working_day_deff as TABLE. <br>
 * <pre>
 * [primary key]
 *     m_working_day_deff_id
 *
 * [column]
 *     m_working_day_deff_id, shop_id, start_day, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_deff_m_working_day_deff_id_seq
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
public class LoaderOfMWorkingDayDeff {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MWorkingDayDeff> _selectedList;
    protected BehaviorSelector _selector;
    protected MWorkingDayDeffBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMWorkingDayDeff ready(List<MWorkingDayDeff> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MWorkingDayDeffBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MWorkingDayDeffBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MWorkingDayDeff> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
