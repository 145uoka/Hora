package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_working_staff as TABLE. <br>
 * <pre>
 * [primary key]
 *     working_staff_id
 *
 * [column]
 *     working_staff_id, shop_id, staff_id, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_staff_working_staff_id_seq
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
public class LoaderOfMWorkingStaff {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MWorkingStaff> _selectedList;
    protected BehaviorSelector _selector;
    protected MWorkingStaffBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMWorkingStaff ready(List<MWorkingStaff> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MWorkingStaffBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MWorkingStaffBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MWorkingStaff> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
