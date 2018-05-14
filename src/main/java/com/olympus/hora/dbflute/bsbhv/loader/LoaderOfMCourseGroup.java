package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_course_group as TABLE. <br>
 * <pre>
 * [primary key]
 *     course_group_id
 *
 * [column]
 *     course_group_id, shop_id, group_name, required_flg, reamarks, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_course_group_course_group_id_seq
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
public class LoaderOfMCourseGroup {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCourseGroup> _selectedList;
    protected BehaviorSelector _selector;
    protected MCourseGroupBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCourseGroup ready(List<MCourseGroup> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCourseGroupBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCourseGroupBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCourseGroup> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
