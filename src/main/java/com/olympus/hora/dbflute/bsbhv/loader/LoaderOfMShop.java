package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

/**
 * The referrer loader of m_shop as TABLE. <br>
 * <pre>
 * [primary key]
 *     shop_id
 *
 * [column]
 *     shop_id, company_id, shop_abbreviated_name, shop_name, phone1_1, phone1_2, phone1_3, phone2_1, phone2_2, phone2_3, fax_1, fax_2, fax_3, email1, email2, url, prefecture, city, address1, address2, remarks, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_shop_shop_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_company
 *
 * [referrer table]
 *     m_course_group, m_working_day, m_working_day_deff, m_working_staff, t_reservation
 *
 * [foreign property]
 *     mCompany
 *
 * [referrer property]
 *     mCourseGroupList, mWorkingDayList, mWorkingDayDeffList, mWorkingStaffList, tReservationList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMShop {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MShop> _selectedList;
    protected BehaviorSelector _selector;
    protected MShopBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMShop ready(List<MShop> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MShopBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MShopBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCourseGroup> _referrerMCourseGroup;

    /**
     * Load referrer of MCourseGroupList by the set-upper of referrer. <br>
     * m_course_group by shop_id, named 'MCourseGroupList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">shopLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shopLoader</span>.<span style="color: #CC4747">loadMCourseGroup</span>(<span style="color: #553000">groupCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">groupCB</span>.setupSelect...
     *         <span style="color: #553000">groupCB</span>.query().set...
     *         <span style="color: #553000">groupCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">groupLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    groupLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getMCourseGroupList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCourseGroup> loadMCourseGroup(ReferrerConditionSetupper<MCourseGroupCB> refCBLambda) {
        myBhv().loadMCourseGroup(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCourseGroup = refLs);
        return hd -> hd.handle(new LoaderOfMCourseGroup().ready(_referrerMCourseGroup, _selector));
    }

    protected List<MWorkingDay> _referrerMWorkingDay;

    /**
     * Load referrer of MWorkingDayList by the set-upper of referrer. <br>
     * m_working_day by shop_id, named 'MWorkingDayList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">shopLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shopLoader</span>.<span style="color: #CC4747">loadMWorkingDay</span>(<span style="color: #553000">dayCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dayCB</span>.setupSelect...
     *         <span style="color: #553000">dayCB</span>.query().set...
     *         <span style="color: #553000">dayCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dayLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dayLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getMWorkingDayList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMWorkingDay> loadMWorkingDay(ReferrerConditionSetupper<MWorkingDayCB> refCBLambda) {
        myBhv().loadMWorkingDay(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMWorkingDay = refLs);
        return hd -> hd.handle(new LoaderOfMWorkingDay().ready(_referrerMWorkingDay, _selector));
    }

    protected List<MWorkingDayDeff> _referrerMWorkingDayDeff;

    /**
     * Load referrer of MWorkingDayDeffList by the set-upper of referrer. <br>
     * m_working_day_deff by shop_id, named 'MWorkingDayDeffList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">shopLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shopLoader</span>.<span style="color: #CC4747">loadMWorkingDayDeff</span>(<span style="color: #553000">deffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">deffCB</span>.setupSelect...
     *         <span style="color: #553000">deffCB</span>.query().set...
     *         <span style="color: #553000">deffCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">deffLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    deffLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getMWorkingDayDeffList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMWorkingDayDeff> loadMWorkingDayDeff(ReferrerConditionSetupper<MWorkingDayDeffCB> refCBLambda) {
        myBhv().loadMWorkingDayDeff(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMWorkingDayDeff = refLs);
        return hd -> hd.handle(new LoaderOfMWorkingDayDeff().ready(_referrerMWorkingDayDeff, _selector));
    }

    protected List<MWorkingStaff> _referrerMWorkingStaff;

    /**
     * Load referrer of MWorkingStaffList by the set-upper of referrer. <br>
     * m_working_staff by shop_id, named 'MWorkingStaffList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">shopLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shopLoader</span>.<span style="color: #CC4747">loadMWorkingStaff</span>(<span style="color: #553000">staffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">staffCB</span>.setupSelect...
     *         <span style="color: #553000">staffCB</span>.query().set...
     *         <span style="color: #553000">staffCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">staffLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    staffLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getMWorkingStaffList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
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
     * t_reservation by shop_id, named 'TReservationList'.
     * <pre>
     * <span style="color: #0000C0">mShopBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mShopList</span>, <span style="color: #553000">shopLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shopLoader</span>.<span style="color: #CC4747">loadTReservation</span>(<span style="color: #553000">reservationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">reservationCB</span>.setupSelect...
     *         <span style="color: #553000">reservationCB</span>.query().set...
     *         <span style="color: #553000">reservationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">reservationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    reservationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MShop mShop : <span style="color: #553000">mShopList</span>) {
     *     ... = mShop.<span style="color: #CC4747">getTReservationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShopId_InScope(pkList);
     * cb.query().addOrderBy_ShopId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReservation> loadTReservation(ReferrerConditionSetupper<TReservationCB> refCBLambda) {
        myBhv().loadTReservation(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReservation = refLs);
        return hd -> hd.handle(new LoaderOfTReservation().ready(_referrerTReservation, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCompany _foreignMCompanyLoader;
    public LoaderOfMCompany pulloutMCompany() {
        if (_foreignMCompanyLoader == null)
        { _foreignMCompanyLoader = new LoaderOfMCompany().ready(myBhv().pulloutMCompany(_selectedList), _selector); }
        return _foreignMCompanyLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MShop> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
