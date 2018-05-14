package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_staff as TABLE. <br>
 * <pre>
 * [primary key]
 *     staff_id
 *
 * [column]
 *     staff_id, family_name, given_name, phone1_1, phone1_2, phone1_3, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_staff_staff_id_seq
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
public class LoaderOfMStaff {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MStaff> _selectedList;
    protected BehaviorSelector _selector;
    protected MStaffBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMStaff ready(List<MStaff> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MStaffBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MStaffBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MStaff> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
