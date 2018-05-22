package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

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
 *     m_shop
 *
 * [referrer table]
 *     m_course
 *
 * [foreign property]
 *     mShop
 *
 * [referrer property]
 *     mCourseList
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
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCourse> _referrerMCourse;

    /**
     * Load referrer of MCourseList by the set-upper of referrer. <br>
     * m_course by course_group_id, named 'MCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCourseGroupBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCourseGroupList</span>, <span style="color: #553000">groupLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">groupLoader</span>.<span style="color: #CC4747">loadMCourse</span>(<span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">courseCB</span>.setupSelect...
     *         <span style="color: #553000">courseCB</span>.query().set...
     *         <span style="color: #553000">courseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">courseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    courseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCourseGroup mCourseGroup : <span style="color: #553000">mCourseGroupList</span>) {
     *     ... = mCourseGroup.<span style="color: #CC4747">getMCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCourseGroupId_InScope(pkList);
     * cb.query().addOrderBy_CourseGroupId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCourse> loadMCourse(ReferrerConditionSetupper<MCourseCB> refCBLambda) {
        myBhv().loadMCourse(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCourse = refLs);
        return hd -> hd.handle(new LoaderOfMCourse().ready(_referrerMCourse, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMShop _foreignMShopLoader;
    public LoaderOfMShop pulloutMShop() {
        if (_foreignMShopLoader == null)
        { _foreignMShopLoader = new LoaderOfMShop().ready(myBhv().pulloutMShop(_selectedList), _selector); }
        return _foreignMShopLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCourseGroup> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
