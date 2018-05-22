package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

/**
 * The referrer loader of m_company as TABLE. <br>
 * <pre>
 * [primary key]
 *     company_id
 *
 * [column]
 *     company_id, company_name, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_company_company_id_seq
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
 *     m_shop
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     mShopList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCompany {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCompany> _selectedList;
    protected BehaviorSelector _selector;
    protected MCompanyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCompany ready(List<MCompany> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCompanyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCompanyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MShop> _referrerMShop;

    /**
     * Load referrer of MShopList by the set-upper of referrer. <br>
     * m_shop by company_id, named 'MShopList'.
     * <pre>
     * <span style="color: #0000C0">mCompanyBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCompanyList</span>, <span style="color: #553000">companyLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">companyLoader</span>.<span style="color: #CC4747">loadMShop</span>(<span style="color: #553000">shopCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shopCB</span>.setupSelect...
     *         <span style="color: #553000">shopCB</span>.query().set...
     *         <span style="color: #553000">shopCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shopLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shopLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCompany mCompany : <span style="color: #553000">mCompanyList</span>) {
     *     ... = mCompany.<span style="color: #CC4747">getMShopList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCompanyId_InScope(pkList);
     * cb.query().addOrderBy_CompanyId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMShop> loadMShop(ReferrerConditionSetupper<MShopCB> refCBLambda) {
        myBhv().loadMShop(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMShop = refLs);
        return hd -> hd.handle(new LoaderOfMShop().ready(_referrerMShop, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCompany> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
