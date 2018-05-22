package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

/**
 * The referrer loader of m_user as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_id
 *
 * [column]
 *     user_id, family_name, given_name, family_name_kana, given_name_kana, sex, birthday, phone_first1, phone_first2, phone_first3, phone_second1, phone_second2, phone_second3, email1, email2, postal_code, prefecture, city, address1, address2, remarks, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_user_user_id_seq
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
 *     t_reservation
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tReservationList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MUser> _selectedList;
    protected BehaviorSelector _selector;
    protected MUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMUser ready(List<MUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TReservation> _referrerTReservation;

    /**
     * Load referrer of TReservationList by the set-upper of referrer. <br>
     * t_reservation by user_id, named 'TReservationList'.
     * <pre>
     * <span style="color: #0000C0">mUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTReservation</span>(<span style="color: #553000">reservationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">reservationCB</span>.setupSelect...
     *         <span style="color: #553000">reservationCB</span>.query().set...
     *         <span style="color: #553000">reservationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">reservationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    reservationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MUser mUser : <span style="color: #553000">mUserList</span>) {
     *     ... = mUser.<span style="color: #CC4747">getTReservationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
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
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
