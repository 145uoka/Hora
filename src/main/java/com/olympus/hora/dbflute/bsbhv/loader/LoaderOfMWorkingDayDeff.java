package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

/**
 * The referrer loader of m_working_day_deff as TABLE. <br>
 * <pre>
 * [primary key]
 *     m_working_day_deff_id
 *
 * [column]
 *     m_working_day_deff_id, shop_id, start_day, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_deff_m_working_day_deff_id_seq
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
 *     m_working_day_detail_deff
 *
 * [foreign property]
 *     mShop
 *
 * [referrer property]
 *     mWorkingDayDetailDeffList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMWorkingDayDeff {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MWorkingDayDeff> _selectedList;
    protected BehaviorSelector _selector;
    protected MWorkingDayDeffBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMWorkingDayDeff ready(List<MWorkingDayDeff> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MWorkingDayDeffBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MWorkingDayDeffBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MWorkingDayDetailDeff> _referrerMWorkingDayDetailDeff;

    /**
     * Load referrer of MWorkingDayDetailDeffList by the set-upper of referrer. <br>
     * m_working_day_detail_deff by m_working_day_deff_id, named 'MWorkingDayDetailDeffList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDeffBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWorkingDayDeffList</span>, <span style="color: #553000">deffLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">deffLoader</span>.<span style="color: #CC4747">loadMWorkingDayDetailDeff</span>(<span style="color: #553000">deffCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">deffCB</span>.setupSelect...
     *         <span style="color: #553000">deffCB</span>.query().set...
     *         <span style="color: #553000">deffCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">deffLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    deffLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWorkingDayDeff mWorkingDayDeff : <span style="color: #553000">mWorkingDayDeffList</span>) {
     *     ... = mWorkingDayDeff.<span style="color: #CC4747">getMWorkingDayDetailDeffList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMWorkingDayDeffId_InScope(pkList);
     * cb.query().addOrderBy_MWorkingDayDeffId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMWorkingDayDetailDeff> loadMWorkingDayDetailDeff(ReferrerConditionSetupper<MWorkingDayDetailDeffCB> refCBLambda) {
        myBhv().loadMWorkingDayDetailDeff(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMWorkingDayDetailDeff = refLs);
        return hd -> hd.handle(new LoaderOfMWorkingDayDetailDeff().ready(_referrerMWorkingDayDetailDeff, _selector));
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
    public List<MWorkingDayDeff> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
