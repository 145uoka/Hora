package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_holiday as TABLE. <br>
 * <pre>
 * [primary key]
 *     holiday_id
 *
 * [column]
 *     holiday_id, holiday_name, holiday, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_holiday_holiday_id_seq
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
public class LoaderOfMHoliday {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MHoliday> _selectedList;
    protected BehaviorSelector _selector;
    protected MHolidayBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMHoliday ready(List<MHoliday> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MHolidayBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MHolidayBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MHoliday> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
