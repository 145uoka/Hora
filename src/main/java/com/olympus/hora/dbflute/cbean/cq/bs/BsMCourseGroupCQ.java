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
 * The base condition-query of m_course_group.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCourseGroupCQ extends AbstractBsMCourseGroupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCourseGroupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCourseGroupCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_course_group) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCourseGroupCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCourseGroupCIQ xcreateCIQ() {
        MCourseGroupCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCourseGroupCIQ xnewCIQ() {
        return new MCourseGroupCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_course_group on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCourseGroupCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCourseGroupCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _courseGroupId;
    public ConditionValue xdfgetCourseGroupId()
    { if (_courseGroupId == null) { _courseGroupId = nCV(); }
      return _courseGroupId; }
    protected ConditionValue xgetCValueCourseGroupId() { return xdfgetCourseGroupId(); }

    public Map<String, MCourseCQ> xdfgetCourseGroupId_ExistsReferrer_MCourseList() { return xgetSQueMap("courseGroupId_ExistsReferrer_MCourseList"); }
    public String keepCourseGroupId_ExistsReferrer_MCourseList(MCourseCQ sq) { return xkeepSQue("courseGroupId_ExistsReferrer_MCourseList", sq); }

    public Map<String, MCourseCQ> xdfgetCourseGroupId_NotExistsReferrer_MCourseList() { return xgetSQueMap("courseGroupId_NotExistsReferrer_MCourseList"); }
    public String keepCourseGroupId_NotExistsReferrer_MCourseList(MCourseCQ sq) { return xkeepSQue("courseGroupId_NotExistsReferrer_MCourseList", sq); }

    public Map<String, MCourseCQ> xdfgetCourseGroupId_SpecifyDerivedReferrer_MCourseList() { return xgetSQueMap("courseGroupId_SpecifyDerivedReferrer_MCourseList"); }
    public String keepCourseGroupId_SpecifyDerivedReferrer_MCourseList(MCourseCQ sq) { return xkeepSQue("courseGroupId_SpecifyDerivedReferrer_MCourseList", sq); }

    public Map<String, MCourseCQ> xdfgetCourseGroupId_QueryDerivedReferrer_MCourseList() { return xgetSQueMap("courseGroupId_QueryDerivedReferrer_MCourseList"); }
    public String keepCourseGroupId_QueryDerivedReferrer_MCourseList(MCourseCQ sq) { return xkeepSQue("courseGroupId_QueryDerivedReferrer_MCourseList", sq); }
    public Map<String, Object> xdfgetCourseGroupId_QueryDerivedReferrer_MCourseListParameter() { return xgetSQuePmMap("courseGroupId_QueryDerivedReferrer_MCourseList"); }
    public String keepCourseGroupId_QueryDerivedReferrer_MCourseListParameter(Object pm) { return xkeepSQuePm("courseGroupId_QueryDerivedReferrer_MCourseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_CourseGroupId_Asc() { regOBA("course_group_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * course_group_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_CourseGroupId_Desc() { regOBD("course_group_id"); return this; }

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
    public BsMCourseGroupCQ addOrderBy_ShopId_Asc() { regOBA("shop_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * shop_id: {int4(10), FK to m_shop}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_ShopId_Desc() { regOBD("shop_id"); return this; }

    protected ConditionValue _groupName;
    public ConditionValue xdfgetGroupName()
    { if (_groupName == null) { _groupName = nCV(); }
      return _groupName; }
    protected ConditionValue xgetCValueGroupName() { return xdfgetGroupName(); }

    /**
     * Add order-by as ascend. <br>
     * group_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_GroupName_Asc() { regOBA("group_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * group_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_GroupName_Desc() { regOBD("group_name"); return this; }

    protected ConditionValue _requiredFlg;
    public ConditionValue xdfgetRequiredFlg()
    { if (_requiredFlg == null) { _requiredFlg = nCV(); }
      return _requiredFlg; }
    protected ConditionValue xgetCValueRequiredFlg() { return xdfgetRequiredFlg(); }

    /**
     * Add order-by as ascend. <br>
     * required_flg: {int2(5)}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_RequiredFlg_Asc() { regOBA("required_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * required_flg: {int2(5)}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_RequiredFlg_Desc() { regOBD("required_flg"); return this; }

    protected ConditionValue _reamarks;
    public ConditionValue xdfgetReamarks()
    { if (_reamarks == null) { _reamarks = nCV(); }
      return _reamarks; }
    protected ConditionValue xgetCValueReamarks() { return xdfgetReamarks(); }

    /**
     * Add order-by as ascend. <br>
     * reamarks: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_Reamarks_Asc() { regOBA("reamarks"); return this; }

    /**
     * Add order-by as descend. <br>
     * reamarks: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_Reamarks_Desc() { regOBD("reamarks"); return this; }

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
    public BsMCourseGroupCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsMCourseGroupCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsMCourseGroupCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMCourseGroupCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsMCourseGroupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCourseGroupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCourseGroupCQ bq = (MCourseGroupCQ)bqs;
        MCourseGroupCQ uq = (MCourseGroupCQ)uqs;
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
        String nrp = xresolveNRP("m_course_group", "mShop"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, MCourseGroupCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCourseGroupCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCourseGroupCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCourseGroupCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCourseGroupCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCourseGroupCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCourseGroupCQ> _myselfExistsMap;
    public Map<String, MCourseGroupCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCourseGroupCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCourseGroupCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCourseGroupCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCourseGroupCB.class.getName(); }
    protected String xCQ() { return MCourseGroupCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
