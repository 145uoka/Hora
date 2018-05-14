package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_course as TABLE. <br>
 * <pre>
 * [primary key]
 *     course_id
 *
 * [column]
 *     course_id, course_group_id, course_name, charge, required_time, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     
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
public class LoaderOfMCourse {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCourse> _selectedList;
    protected BehaviorSelector _selector;
    protected MCourseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCourse ready(List<MCourse> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCourseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCourseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCourse> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
