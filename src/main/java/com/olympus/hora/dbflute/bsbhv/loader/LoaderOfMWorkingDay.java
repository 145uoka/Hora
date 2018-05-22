package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

/**
 * The referrer loader of m_working_day as TABLE. <br>
 * <pre>
 * [primary key]
 *     working_day_id
 *
 * [column]
 *     working_day_id, shop_id, working_date, start_time, end_time, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_working_day_id_seq
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
 *     t_shift
 *
 * [foreign property]
 *     mShop
 *
 * [referrer property]
 *     tShiftList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMWorkingDay {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MWorkingDay> _selectedList;
    protected BehaviorSelector _selector;
    protected MWorkingDayBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMWorkingDay ready(List<MWorkingDay> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MWorkingDayBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MWorkingDayBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TShift> _referrerTShift;

    /**
     * Load referrer of TShiftList by the set-upper of referrer. <br>
     * t_shift by working_day_id, named 'TShiftList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingDayBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWorkingDayList</span>, <span style="color: #553000">dayLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dayLoader</span>.<span style="color: #CC4747">loadTShift</span>(<span style="color: #553000">shiftCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shiftCB</span>.setupSelect...
     *         <span style="color: #553000">shiftCB</span>.query().set...
     *         <span style="color: #553000">shiftCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shiftLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shiftLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWorkingDay mWorkingDay : <span style="color: #553000">mWorkingDayList</span>) {
     *     ... = mWorkingDay.<span style="color: #CC4747">getTShiftList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWorkingDayId_InScope(pkList);
     * cb.query().addOrderBy_WorkingDayId_Asc();
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
    protected LoaderOfMShop _foreignMShopLoader;
    public LoaderOfMShop pulloutMShop() {
        if (_foreignMShopLoader == null)
        { _foreignMShopLoader = new LoaderOfMShop().ready(myBhv().pulloutMShop(_selectedList), _selector); }
        return _foreignMShopLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MWorkingDay> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
