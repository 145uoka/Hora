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
 * The base condition-query of m_working_day.
 * @author DBFlute(AutoGenerator)
 */
public class BsMWorkingDayCQ extends AbstractBsMWorkingDayCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MWorkingDayCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMWorkingDayCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_working_day) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MWorkingDayCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MWorkingDayCIQ xcreateCIQ() {
        MWorkingDayCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MWorkingDayCIQ xnewCIQ() {
        return new MWorkingDayCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_working_day on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MWorkingDayCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MWorkingDayCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _workingDayId;
    public ConditionValue xdfgetWorkingDayId()
    { if (_workingDayId == null) { _workingDayId = nCV(); }
      return _workingDayId; }
    protected ConditionValue xgetCValueWorkingDayId() { return xdfgetWorkingDayId(); }

    public Map<String, TShiftCQ> xdfgetWorkingDayId_ExistsReferrer_TShiftList() { return xgetSQueMap("workingDayId_ExistsReferrer_TShiftList"); }
    public String keepWorkingDayId_ExistsReferrer_TShiftList(TShiftCQ sq) { return xkeepSQue("workingDayId_ExistsReferrer_TShiftList", sq); }

    public Map<String, TShiftCQ> xdfgetWorkingDayId_NotExistsReferrer_TShiftList() { return xgetSQueMap("workingDayId_NotExistsReferrer_TShiftList"); }
    public String keepWorkingDayId_NotExistsReferrer_TShiftList(TShiftCQ sq) { return xkeepSQue("workingDayId_NotExistsReferrer_TShiftList", sq); }

    public Map<String, TShiftCQ> xdfgetWorkingDayId_SpecifyDerivedReferrer_TShiftList() { return xgetSQueMap("workingDayId_SpecifyDerivedReferrer_TShiftList"); }
    public String keepWorkingDayId_SpecifyDerivedReferrer_TShiftList(TShiftCQ sq) { return xkeepSQue("workingDayId_SpecifyDerivedReferrer_TShiftList", sq); }

    public Map<String, TShiftCQ> xdfgetWorkingDayId_QueryDerivedReferrer_TShiftList() { return xgetSQueMap("workingDayId_QueryDerivedReferrer_TShiftList"); }
    public String keepWorkingDayId_QueryDerivedReferrer_TShiftList(TShiftCQ sq) { return xkeepSQue("workingDayId_QueryDerivedReferrer_TShiftList", sq); }
    public Map<String, Object> xdfgetWorkingDayId_QueryDerivedReferrer_TShiftListParameter() { return xgetSQuePmMap("workingDayId_QueryDerivedReferrer_TShiftList"); }
    public String keepWorkingDayId_QueryDerivedReferrer_TShiftListParameter(Object pm) { return xkeepSQuePm("workingDayId_QueryDerivedReferrer_TShiftList", pm); }

    /**
     * Add order-by as ascend. <br>
     * working_day_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_WorkingDayId_Asc() { regOBA("working_day_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * working_day_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_WorkingDayId_Desc() { regOBD("working_day_id"); return this; }

    protected ConditionValue _shopId;
    public ConditionValue xdfgetShopId()
    { if (_shopId == null) { _shopId = nCV(); }
      return _shopId; }
    protected ConditionValue xgetCValueShopId() { return xdfgetShopId(); }

    /**
     * Add order-by as ascend. <br>
     * shop_id: {int4(10), FK to m_shop}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_ShopId_Asc() { regOBA("shop_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * shop_id: {int4(10), FK to m_shop}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_ShopId_Desc() { regOBD("shop_id"); return this; }

    protected ConditionValue _workingDate;
    public ConditionValue xdfgetWorkingDate()
    { if (_workingDate == null) { _workingDate = nCV(); }
      return _workingDate; }
    protected ConditionValue xgetCValueWorkingDate() { return xdfgetWorkingDate(); }

    /**
     * Add order-by as ascend. <br>
     * working_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_WorkingDate_Asc() { regOBA("working_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * working_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_WorkingDate_Desc() { regOBD("working_date"); return this; }

    protected ConditionValue _startTime;
    public ConditionValue xdfgetStartTime()
    { if (_startTime == null) { _startTime = nCV(); }
      return _startTime; }
    protected ConditionValue xgetCValueStartTime() { return xdfgetStartTime(); }

    /**
     * Add order-by as ascend. <br>
     * start_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_StartTime_Asc() { regOBA("start_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * start_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_StartTime_Desc() { regOBD("start_time"); return this; }

    protected ConditionValue _endTime;
    public ConditionValue xdfgetEndTime()
    { if (_endTime == null) { _endTime = nCV(); }
      return _endTime; }
    protected ConditionValue xgetCValueEndTime() { return xdfgetEndTime(); }

    /**
     * Add order-by as ascend. <br>
     * end_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_EndTime_Asc() { regOBA("end_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * end_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_EndTime_Desc() { regOBD("end_time"); return this; }

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
    public BsMWorkingDayCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsMWorkingDayCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsMWorkingDayCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsMWorkingDayCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMWorkingDayCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MWorkingDayCQ bq = (MWorkingDayCQ)bqs;
        MWorkingDayCQ uq = (MWorkingDayCQ)uqs;
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
        String nrp = xresolveNRP("m_working_day", "mShop"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, MWorkingDayCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MWorkingDayCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MWorkingDayCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MWorkingDayCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MWorkingDayCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MWorkingDayCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MWorkingDayCQ> _myselfExistsMap;
    public Map<String, MWorkingDayCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MWorkingDayCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MWorkingDayCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MWorkingDayCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MWorkingDayCB.class.getName(); }
    protected String xCQ() { return MWorkingDayCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
