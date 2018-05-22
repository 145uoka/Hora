package com.olympus.hora.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.olympus.hora.dbflute.cbean.cq.ciq.*;
import com.olympus.hora.dbflute.cbean.*;
import com.olympus.hora.dbflute.cbean.cq.*;

/**
 * The base condition-query of m_working_day_deff.
 * @author DBFlute(AutoGenerator)
 */
public class BsMWorkingDayDeffCQ extends AbstractBsMWorkingDayDeffCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MWorkingDayDeffCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMWorkingDayDeffCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_working_day_deff) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MWorkingDayDeffCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MWorkingDayDeffCIQ xcreateCIQ() {
        MWorkingDayDeffCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MWorkingDayDeffCIQ xnewCIQ() {
        return new MWorkingDayDeffCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_working_day_deff on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MWorkingDayDeffCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MWorkingDayDeffCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _mWorkingDayDeffId;
    public ConditionValue xdfgetMWorkingDayDeffId()
    { if (_mWorkingDayDeffId == null) { _mWorkingDayDeffId = nCV(); }
      return _mWorkingDayDeffId; }
    protected ConditionValue xgetCValueMWorkingDayDeffId() { return xdfgetMWorkingDayDeffId(); }

    public Map<String, MWorkingDayDetailDeffCQ> xdfgetMWorkingDayDeffId_ExistsReferrer_MWorkingDayDetailDeffList() { return xgetSQueMap("mWorkingDayDeffId_ExistsReferrer_MWorkingDayDetailDeffList"); }
    public String keepMWorkingDayDeffId_ExistsReferrer_MWorkingDayDetailDeffList(MWorkingDayDetailDeffCQ sq) { return xkeepSQue("mWorkingDayDeffId_ExistsReferrer_MWorkingDayDetailDeffList", sq); }

    public Map<String, MWorkingDayDetailDeffCQ> xdfgetMWorkingDayDeffId_NotExistsReferrer_MWorkingDayDetailDeffList() { return xgetSQueMap("mWorkingDayDeffId_NotExistsReferrer_MWorkingDayDetailDeffList"); }
    public String keepMWorkingDayDeffId_NotExistsReferrer_MWorkingDayDetailDeffList(MWorkingDayDetailDeffCQ sq) { return xkeepSQue("mWorkingDayDeffId_NotExistsReferrer_MWorkingDayDetailDeffList", sq); }

    public Map<String, MWorkingDayDetailDeffCQ> xdfgetMWorkingDayDeffId_SpecifyDerivedReferrer_MWorkingDayDetailDeffList() { return xgetSQueMap("mWorkingDayDeffId_SpecifyDerivedReferrer_MWorkingDayDetailDeffList"); }
    public String keepMWorkingDayDeffId_SpecifyDerivedReferrer_MWorkingDayDetailDeffList(MWorkingDayDetailDeffCQ sq) { return xkeepSQue("mWorkingDayDeffId_SpecifyDerivedReferrer_MWorkingDayDetailDeffList", sq); }

    public Map<String, MWorkingDayDetailDeffCQ> xdfgetMWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffList() { return xgetSQueMap("mWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffList"); }
    public String keepMWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffList(MWorkingDayDetailDeffCQ sq) { return xkeepSQue("mWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffList", sq); }
    public Map<String, Object> xdfgetMWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffListParameter() { return xgetSQuePmMap("mWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffList"); }
    public String keepMWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffListParameter(Object pm) { return xkeepSQuePm("mWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffList", pm); }

    /**
     * Add order-by as ascend. <br>
     * m_working_day_deff_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_MWorkingDayDeffId_Asc() { regOBA("m_working_day_deff_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * m_working_day_deff_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_MWorkingDayDeffId_Desc() { regOBD("m_working_day_deff_id"); return this; }

    protected ConditionValue _shopId;
    public ConditionValue xdfgetShopId()
    { if (_shopId == null) { _shopId = nCV(); }
      return _shopId; }
    protected ConditionValue xgetCValueShopId() { return xdfgetShopId(); }

    /**
     * Add order-by as ascend. <br>
     * shop_id: {NotNull, int4(10), FK to m_shop}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_ShopId_Asc() { regOBA("shop_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * shop_id: {NotNull, int4(10), FK to m_shop}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_ShopId_Desc() { regOBD("shop_id"); return this; }

    protected ConditionValue _startDay;
    public ConditionValue xdfgetStartDay()
    { if (_startDay == null) { _startDay = nCV(); }
      return _startDay; }
    protected ConditionValue xgetCValueStartDay() { return xdfgetStartDay(); }

    /**
     * Add order-by as ascend. <br>
     * start_day: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_StartDay_Asc() { regOBA("start_day"); return this; }

    /**
     * Add order-by as descend. <br>
     * start_day: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_StartDay_Desc() { regOBD("start_day"); return this; }

    protected ConditionValue _deleteFlag;
    public ConditionValue xdfgetDeleteFlag()
    { if (_deleteFlag == null) { _deleteFlag = nCV(); }
      return _deleteFlag; }
    protected ConditionValue xgetCValueDeleteFlag() { return xdfgetDeleteFlag(); }

    /**
     * Add order-by as ascend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMWorkingDayDeffCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MWorkingDayDeffCQ bq = (MWorkingDayDeffCQ)bqs;
        MWorkingDayDeffCQ uq = (MWorkingDayDeffCQ)uqs;
        if (bq.hasConditionQueryMShop()) {
            uq.queryMShop().reflectRelationOnUnionQuery(bq.queryMShop(), uq.queryMShop());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_shop by my shop_id, named 'MShop'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShopCQ queryMShop() {
        return xdfgetConditionQueryMShop();
    }
    public MShopCQ xdfgetConditionQueryMShop() {
        String prop = "mShop";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShop()); xsetupOuterJoinMShop(); }
        return xgetQueRlMap(prop);
    }
    protected MShopCQ xcreateQueryMShop() {
        String nrp = xresolveNRP("m_working_day_deff", "mShop"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShopCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShop", nrp);
    }
    protected void xsetupOuterJoinMShop() { xregOutJo("mShop"); }
    public boolean hasConditionQueryMShop() { return xhasQueRlMap("mShop"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MWorkingDayDeffCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MWorkingDayDeffCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MWorkingDayDeffCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MWorkingDayDeffCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MWorkingDayDeffCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MWorkingDayDeffCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MWorkingDayDeffCQ> _myselfExistsMap;
    public Map<String, MWorkingDayDeffCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MWorkingDayDeffCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MWorkingDayDeffCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MWorkingDayDeffCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MWorkingDayDeffCB.class.getName(); }
    protected String xCQ() { return MWorkingDayDeffCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
