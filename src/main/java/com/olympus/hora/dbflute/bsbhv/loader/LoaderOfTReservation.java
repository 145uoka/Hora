package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

/**
 * The referrer loader of t_reservation as TABLE. <br>
 * <pre>
 * [primary key]
 *     reservation_id
 *
 * [column]
 *     reservation_id, shop_id, staff_id, hist_staff_family_name, hist_shop_name, hist_shop_abbreviated_name, hist_staff_given_name, reservation_date, reservation_time, user_id, total_amount, remarks, status, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     t_reservation_reservation_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_shop, m_staff, m_user
 *
 * [referrer table]
 *     t_reservation_detail
 *
 * [foreign property]
 *     mShop, mStaff, mUser
 *
 * [referrer property]
 *     tReservationDetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReservation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReservation> _selectedList;
    protected BehaviorSelector _selector;
    protected TReservationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReservation ready(List<TReservation> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReservationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReservationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TReservationDetail> _referrerTReservationDetail;

    /**
     * Load referrer of TReservationDetailList by the set-upper of referrer. <br>
     * t_reservation_detail by reservation_id, named 'TReservationDetailList'.
     * <pre>
     * <span style="color: #0000C0">tReservationBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReservationList</span>, <span style="color: #553000">reservationLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reservationLoader</span>.<span style="color: #CC4747">loadTReservationDetail</span>(<span style="color: #553000">detailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">detailCB</span>.setupSelect...
     *         <span style="color: #553000">detailCB</span>.query().set...
     *         <span style="color: #553000">detailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">detailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    detailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReservation tReservation : <span style="color: #553000">tReservationList</span>) {
     *     ... = tReservation.<span style="color: #CC4747">getTReservationDetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReservationId_InScope(pkList);
     * cb.query().addOrderBy_ReservationId_Asc();
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
    protected LoaderOfMShop _foreignMShopLoader;
    public LoaderOfMShop pulloutMShop() {
        if (_foreignMShopLoader == null)
        { _foreignMShopLoader = new LoaderOfMShop().ready(myBhv().pulloutMShop(_selectedList), _selector); }
        return _foreignMShopLoader;
    }

    protected LoaderOfMStaff _foreignMStaffLoader;
    public LoaderOfMStaff pulloutMStaff() {
        if (_foreignMStaffLoader == null)
        { _foreignMStaffLoader = new LoaderOfMStaff().ready(myBhv().pulloutMStaff(_selectedList), _selector); }
        return _foreignMStaffLoader;
    }

    protected LoaderOfMUser _foreignMUserLoader;
    public LoaderOfMUser pulloutMUser() {
        if (_foreignMUserLoader == null)
        { _foreignMUserLoader = new LoaderOfMUser().ready(myBhv().pulloutMUser(_selectedList), _selector); }
        return _foreignMUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReservation> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
