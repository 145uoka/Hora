package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

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
 *     m_working_staff, t_reservation, t_shift
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     mWorkingStaffList, tReservationList, tShiftList
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
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MWorkingStaff> _referrerMWorkingStaff;

    /**
     * Load referrer of MWorkingStaffList by the set-upper of referrer. <br>
     * m_working_staff by staff_id, named 'MWorkingStaffList'.
     * <pre>
     * <span style="color: #0000C0">mStaffBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mStaffList</span>, <span style="color: #553000">staffLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">staffLoader</span>.<span style="color: #CC4747">loadMWorkingStaff</span>(<span style="color: #553000">staffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">staffCB</span>.setupSelect...
     *         <span style="color: #553000">staffCB</span>.query().set...
     *         <span style="color: #553000">staffCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">staffLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    staffLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MStaff mStaff : <span style="color: #553000">mStaffList</span>) {
     *     ... = mStaff.<span style="color: #CC4747">getMWorkingStaffList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStaffId_InScope(pkList);
     * cb.query().addOrderBy_StaffId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMWorkingStaff> loadMWorkingStaff(ReferrerConditionSetupper<MWorkingStaffCB> refCBLambda) {
        myBhv().loadMWorkingStaff(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMWorkingStaff = refLs);
        return hd -> hd.handle(new LoaderOfMWorkingStaff().ready(_referrerMWorkingStaff, _selector));
    }

    protected List<TReservation> _referrerTReservation;

    /**
     * Load referrer of TReservationList by the set-upper of referrer. <br>
     * t_reservation by staff_id, named 'TReservationList'.
     * <pre>
     * <span style="color: #0000C0">mStaffBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mStaffList</span>, <span style="color: #553000">staffLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">staffLoader</span>.<span style="color: #CC4747">loadTReservation</span>(<span style="color: #553000">reservationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">reservationCB</span>.setupSelect...
     *         <span style="color: #553000">reservationCB</span>.query().set...
     *         <span style="color: #553000">reservationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">reservationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    reservationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MStaff mStaff : <span style="color: #553000">mStaffList</span>) {
     *     ... = mStaff.<span style="color: #CC4747">getTReservationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStaffId_InScope(pkList);
     * cb.query().addOrderBy_StaffId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReservation> loadTReservation(ReferrerConditionSetupper<TReservationCB> refCBLambda) {
        myBhv().loadTReservation(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReservation = refLs);
        return hd -> hd.handle(new LoaderOfTReservation().ready(_referrerTReservation, _selector));
    }

    protected List<TShift> _referrerTShift;

    /**
     * Load referrer of TShiftList by the set-upper of referrer. <br>
     * t_shift by staff_id, named 'TShiftList'.
     * <pre>
     * <span style="color: #0000C0">mStaffBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mStaffList</span>, <span style="color: #553000">staffLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">staffLoader</span>.<span style="color: #CC4747">loadTShift</span>(<span style="color: #553000">shiftCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shiftCB</span>.setupSelect...
     *         <span style="color: #553000">shiftCB</span>.query().set...
     *         <span style="color: #553000">shiftCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shiftLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shiftLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MStaff mStaff : <span style="color: #553000">mStaffList</span>) {
     *     ... = mStaff.<span style="color: #CC4747">getTShiftList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStaffId_InScope(pkList);
     * cb.query().addOrderBy_StaffId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShift> loadTShift(ReferrerConditionSetupper<TShiftCB> refCBLambda) {
        myBhv().loadTShift(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShift = refLs);
        return hd -> hd.handle(new LoaderOfTShift().ready(_referrerTShift, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MStaff> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
