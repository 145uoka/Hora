package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

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
 *     m_course_group
 *
 * [referrer table]
 *     t_reservation_detail
 *
 * [foreign property]
 *     mCourseGroup
 *
 * [referrer property]
 *     tReservationDetailList
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
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TReservationDetail> _referrerTReservationDetail;

    /**
     * Load referrer of TReservationDetailList by the set-upper of referrer. <br>
     * t_reservation_detail by course_id, named 'TReservationDetailList'.
     * <pre>
     * <span style="color: #0000C0">mCourseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCourseList</span>, <span style="color: #553000">courseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseLoader</span>.<span style="color: #CC4747">loadTReservationDetail</span>(<span style="color: #553000">detailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">detailCB</span>.setupSelect...
     *         <span style="color: #553000">detailCB</span>.query().set...
     *         <span style="color: #553000">detailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">detailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    detailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCourse mCourse : <span style="color: #553000">mCourseList</span>) {
     *     ... = mCourse.<span style="color: #CC4747">getTReservationDetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCourseId_InScope(pkList);
     * cb.query().addOrderBy_CourseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReservationDetail> loadTReservationDetail(ReferrerConditionSetupper<TReservationDetailCB> refCBLambda) {
        myBhv().loadTReservationDetail(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReservationDetail = refLs);
        return hd -> hd.handle(new LoaderOfTReservationDetail().ready(_referrerTReservationDetail, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCourseGroup _foreignMCourseGroupLoader;
    public LoaderOfMCourseGroup pulloutMCourseGroup() {
        if (_foreignMCourseGroupLoader == null)
        { _foreignMCourseGroupLoader = new LoaderOfMCourseGroup().ready(myBhv().pulloutMCourseGroup(_selectedList), _selector); }
        return _foreignMCourseGroupLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCourse> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
