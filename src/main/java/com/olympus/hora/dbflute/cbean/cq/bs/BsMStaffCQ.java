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
 * The base condition-query of m_staff.
 * @author DBFlute(AutoGenerator)
 */
public class BsMStaffCQ extends AbstractBsMStaffCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MStaffCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMStaffCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_staff) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MStaffCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MStaffCIQ xcreateCIQ() {
        MStaffCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MStaffCIQ xnewCIQ() {
        return new MStaffCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_staff on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MStaffCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MStaffCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _staffId;
    public ConditionValue xdfgetStaffId()
    { if (_staffId == null) { _staffId = nCV(); }
      return _staffId; }
    protected ConditionValue xgetCValueStaffId() { return xdfgetStaffId(); }

    public Map<String, MWorkingStaffCQ> xdfgetStaffId_ExistsReferrer_MWorkingStaffList() { return xgetSQueMap("staffId_ExistsReferrer_MWorkingStaffList"); }
    public String keepStaffId_ExistsReferrer_MWorkingStaffList(MWorkingStaffCQ sq) { return xkeepSQue("staffId_ExistsReferrer_MWorkingStaffList", sq); }

    public Map<String, TReservationCQ> xdfgetStaffId_ExistsReferrer_TReservationList() { return xgetSQueMap("staffId_ExistsReferrer_TReservationList"); }
    public String keepStaffId_ExistsReferrer_TReservationList(TReservationCQ sq) { return xkeepSQue("staffId_ExistsReferrer_TReservationList", sq); }

    public Map<String, TShiftCQ> xdfgetStaffId_ExistsReferrer_TShiftList() { return xgetSQueMap("staffId_ExistsReferrer_TShiftList"); }
    public String keepStaffId_ExistsReferrer_TShiftList(TShiftCQ sq) { return xkeepSQue("staffId_ExistsReferrer_TShiftList", sq); }

    public Map<String, MWorkingStaffCQ> xdfgetStaffId_NotExistsReferrer_MWorkingStaffList() { return xgetSQueMap("staffId_NotExistsReferrer_MWorkingStaffList"); }
    public String keepStaffId_NotExistsReferrer_MWorkingStaffList(MWorkingStaffCQ sq) { return xkeepSQue("staffId_NotExistsReferrer_MWorkingStaffList", sq); }

    public Map<String, TReservationCQ> xdfgetStaffId_NotExistsReferrer_TReservationList() { return xgetSQueMap("staffId_NotExistsReferrer_TReservationList"); }
    public String keepStaffId_NotExistsReferrer_TReservationList(TReservationCQ sq) { return xkeepSQue("staffId_NotExistsReferrer_TReservationList", sq); }

    public Map<String, TShiftCQ> xdfgetStaffId_NotExistsReferrer_TShiftList() { return xgetSQueMap("staffId_NotExistsReferrer_TShiftList"); }
    public String keepStaffId_NotExistsReferrer_TShiftList(TShiftCQ sq) { return xkeepSQue("staffId_NotExistsReferrer_TShiftList", sq); }

    public Map<String, MWorkingStaffCQ> xdfgetStaffId_SpecifyDerivedReferrer_MWorkingStaffList() { return xgetSQueMap("staffId_SpecifyDerivedReferrer_MWorkingStaffList"); }
    public String keepStaffId_SpecifyDerivedReferrer_MWorkingStaffList(MWorkingStaffCQ sq) { return xkeepSQue("staffId_SpecifyDerivedReferrer_MWorkingStaffList", sq); }

    public Map<String, TReservationCQ> xdfgetStaffId_SpecifyDerivedReferrer_TReservationList() { return xgetSQueMap("staffId_SpecifyDerivedReferrer_TReservationList"); }
    public String keepStaffId_SpecifyDerivedReferrer_TReservationList(TReservationCQ sq) { return xkeepSQue("staffId_SpecifyDerivedReferrer_TReservationList", sq); }

    public Map<String, TShiftCQ> xdfgetStaffId_SpecifyDerivedReferrer_TShiftList() { return xgetSQueMap("staffId_SpecifyDerivedReferrer_TShiftList"); }
    public String keepStaffId_SpecifyDerivedReferrer_TShiftList(TShiftCQ sq) { return xkeepSQue("staffId_SpecifyDerivedReferrer_TShiftList", sq); }

    public Map<String, MWorkingStaffCQ> xdfgetStaffId_QueryDerivedReferrer_MWorkingStaffList() { return xgetSQueMap("staffId_QueryDerivedReferrer_MWorkingStaffList"); }
    public String keepStaffId_QueryDerivedReferrer_MWorkingStaffList(MWorkingStaffCQ sq) { return xkeepSQue("staffId_QueryDerivedReferrer_MWorkingStaffList", sq); }
    public Map<String, Object> xdfgetStaffId_QueryDerivedReferrer_MWorkingStaffListParameter() { return xgetSQuePmMap("staffId_QueryDerivedReferrer_MWorkingStaffList"); }
    public String keepStaffId_QueryDerivedReferrer_MWorkingStaffListParameter(Object pm) { return xkeepSQuePm("staffId_QueryDerivedReferrer_MWorkingStaffList", pm); }

    public Map<String, TReservationCQ> xdfgetStaffId_QueryDerivedReferrer_TReservationList() { return xgetSQueMap("staffId_QueryDerivedReferrer_TReservationList"); }
    public String keepStaffId_QueryDerivedReferrer_TReservationList(TReservationCQ sq) { return xkeepSQue("staffId_QueryDerivedReferrer_TReservationList", sq); }
    public Map<String, Object> xdfgetStaffId_QueryDerivedReferrer_TReservationListParameter() { return xgetSQuePmMap("staffId_QueryDerivedReferrer_TReservationList"); }
    public String keepStaffId_QueryDerivedReferrer_TReservationListParameter(Object pm) { return xkeepSQuePm("staffId_QueryDerivedReferrer_TReservationList", pm); }

    public Map<String, TShiftCQ> xdfgetStaffId_QueryDerivedReferrer_TShiftList() { return xgetSQueMap("staffId_QueryDerivedReferrer_TShiftList"); }
    public String keepStaffId_QueryDerivedReferrer_TShiftList(TShiftCQ sq) { return xkeepSQue("staffId_QueryDerivedReferrer_TShiftList", sq); }
    public Map<String, Object> xdfgetStaffId_QueryDerivedReferrer_TShiftListParameter() { return xgetSQuePmMap("staffId_QueryDerivedReferrer_TShiftList"); }
    public String keepStaffId_QueryDerivedReferrer_TShiftListParameter(Object pm) { return xkeepSQuePm("staffId_QueryDerivedReferrer_TShiftList", pm); }

    /**
     * Add order-by as ascend. <br>
     * staff_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_StaffId_Asc() { regOBA("staff_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * staff_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_StaffId_Desc() { regOBD("staff_id"); return this; }

    protected ConditionValue _familyName;
    public ConditionValue xdfgetFamilyName()
    { if (_familyName == null) { _familyName = nCV(); }
      return _familyName; }
    protected ConditionValue xgetCValueFamilyName() { return xdfgetFamilyName(); }

    /**
     * Add order-by as ascend. <br>
     * family_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_FamilyName_Asc() { regOBA("family_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * family_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_FamilyName_Desc() { regOBD("family_name"); return this; }

    protected ConditionValue _givenName;
    public ConditionValue xdfgetGivenName()
    { if (_givenName == null) { _givenName = nCV(); }
      return _givenName; }
    protected ConditionValue xgetCValueGivenName() { return xdfgetGivenName(); }

    /**
     * Add order-by as ascend. <br>
     * given_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_GivenName_Asc() { regOBA("given_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * given_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_GivenName_Desc() { regOBD("given_name"); return this; }

    protected ConditionValue _phone11;
    public ConditionValue xdfgetPhone11()
    { if (_phone11 == null) { _phone11 = nCV(); }
      return _phone11; }
    protected ConditionValue xgetCValuePhone11() { return xdfgetPhone11(); }

    /**
     * Add order-by as ascend. <br>
     * phone1_1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_Phone11_Asc() { regOBA("phone1_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone1_1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_Phone11_Desc() { regOBD("phone1_1"); return this; }

    protected ConditionValue _phone12;
    public ConditionValue xdfgetPhone12()
    { if (_phone12 == null) { _phone12 = nCV(); }
      return _phone12; }
    protected ConditionValue xgetCValuePhone12() { return xdfgetPhone12(); }

    /**
     * Add order-by as ascend. <br>
     * phone1_2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_Phone12_Asc() { regOBA("phone1_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone1_2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_Phone12_Desc() { regOBD("phone1_2"); return this; }

    protected ConditionValue _phone13;
    public ConditionValue xdfgetPhone13()
    { if (_phone13 == null) { _phone13 = nCV(); }
      return _phone13; }
    protected ConditionValue xgetCValuePhone13() { return xdfgetPhone13(); }

    /**
     * Add order-by as ascend. <br>
     * phone1_3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_Phone13_Asc() { regOBA("phone1_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone1_3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_Phone13_Desc() { regOBD("phone1_3"); return this; }

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
    public BsMStaffCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsMStaffCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsMStaffCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMStaffCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsMStaffCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMStaffCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MStaffCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MStaffCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MStaffCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MStaffCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MStaffCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MStaffCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MStaffCQ> _myselfExistsMap;
    public Map<String, MStaffCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MStaffCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MStaffCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MStaffCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MStaffCB.class.getName(); }
    protected String xCQ() { return MStaffCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
