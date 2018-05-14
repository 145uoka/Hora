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
 * The base condition-query of m_code.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCodeCQ extends AbstractBsMCodeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCodeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCodeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_code) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCodeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCodeCIQ xcreateCIQ() {
        MCodeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCodeCIQ xnewCIQ() {
        return new MCodeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_code on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCodeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCodeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _codeId;
    public ConditionValue xdfgetCodeId()
    { if (_codeId == null) { _codeId = nCV(); }
      return _codeId; }
    protected ConditionValue xgetCValueCodeId() { return xdfgetCodeId(); }

    /**
     * Add order-by as ascend. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_CodeId_Asc() { regOBA("code_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_CodeId_Desc() { regOBD("code_id"); return this; }

    protected ConditionValue _groupCode;
    public ConditionValue xdfgetGroupCode()
    { if (_groupCode == null) { _groupCode = nCV(); }
      return _groupCode; }
    protected ConditionValue xgetCValueGroupCode() { return xdfgetGroupCode(); }

    /**
     * Add order-by as ascend. <br>
     * group_code: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_GroupCode_Asc() { regOBA("group_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * group_code: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_GroupCode_Desc() { regOBD("group_code"); return this; }

    protected ConditionValue _code1;
    public ConditionValue xdfgetCode1()
    { if (_code1 == null) { _code1 = nCV(); }
      return _code1; }
    protected ConditionValue xgetCValueCode1() { return xdfgetCode1(); }

    /**
     * Add order-by as ascend. <br>
     * code1: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_Code1_Asc() { regOBA("code1"); return this; }

    /**
     * Add order-by as descend. <br>
     * code1: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_Code1_Desc() { regOBD("code1"); return this; }

    protected ConditionValue _code2;
    public ConditionValue xdfgetCode2()
    { if (_code2 == null) { _code2 = nCV(); }
      return _code2; }
    protected ConditionValue xgetCValueCode2() { return xdfgetCode2(); }

    /**
     * Add order-by as ascend. <br>
     * code2: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_Code2_Asc() { regOBA("code2"); return this; }

    /**
     * Add order-by as descend. <br>
     * code2: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_Code2_Desc() { regOBD("code2"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

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
    public BsMCodeCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsMCodeCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsMCodeCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMCodeCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsMCodeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCodeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCodeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCodeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCodeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCodeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCodeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCodeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCodeCQ> _myselfExistsMap;
    public Map<String, MCodeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCodeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCodeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCodeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCodeCB.class.getName(); }
    protected String xCQ() { return MCodeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
