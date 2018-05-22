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
 * The base condition-query of t_shift.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShiftCQ extends AbstractBsTShiftCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShiftCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShiftCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_shift) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShiftCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShiftCIQ xcreateCIQ() {
        TShiftCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShiftCIQ xnewCIQ() {
        return new TShiftCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_shift on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShiftCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShiftCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shiftId;
    public ConditionValue xdfgetShiftId()
    { if (_shiftId == null) { _shiftId = nCV(); }
      return _shiftId; }
    protected ConditionValue xgetCValueShiftId() { return xdfgetShiftId(); }

    /**
     * Add order-by as ascend. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_ShiftId_Asc() { regOBA("shift_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_ShiftId_Desc() { regOBD("shift_id"); return this; }

    protected ConditionValue _workingDayId;
    public ConditionValue xdfgetWorkingDayId()
    { if (_workingDayId == null) { _workingDayId = nCV(); }
      return _workingDayId; }
    protected ConditionValue xgetCValueWorkingDayId() { return xdfgetWorkingDayId(); }

    /**
     * Add order-by as ascend. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_WorkingDayId_Asc() { regOBA("working_day_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_WorkingDayId_Desc() { regOBD("working_day_id"); return this; }

    protected ConditionValue _staffId;
    public ConditionValue xdfgetStaffId()
    { if (_staffId == null) { _staffId = nCV(); }
      return _staffId; }
    protected ConditionValue xgetCValueStaffId() { return xdfgetStaffId(); }

    /**
     * Add order-by as ascend. <br>
     * staff_id: {int4(10), FK to m_staff}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_StaffId_Asc() { regOBA("staff_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * staff_id: {int4(10), FK to m_staff}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_StaffId_Desc() { regOBD("staff_id"); return this; }

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
    public BsTShiftCQ addOrderBy_StartTime_Asc() { regOBA("start_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * start_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_StartTime_Desc() { regOBD("start_time"); return this; }

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
    public BsTShiftCQ addOrderBy_EndTime_Asc() { regOBA("end_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * end_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_EndTime_Desc() { regOBD("end_time"); return this; }

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
    public BsTShiftCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsTShiftCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsTShiftCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsTShiftCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsTShiftCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShiftCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TShiftCQ bq = (TShiftCQ)bqs;
        TShiftCQ uq = (TShiftCQ)uqs;
        if (bq.hasConditionQueryMStaff()) {
            uq.queryMStaff().reflectRelationOnUnionQuery(bq.queryMStaff(), uq.queryMStaff());
        }
        if (bq.hasConditionQueryMWorkingDay()) {
            uq.queryMWorkingDay().reflectRelationOnUnionQuery(bq.queryMWorkingDay(), uq.queryMWorkingDay());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_staff by my staff_id, named 'MStaff'.
     * @return The instance of condition-query. (NotNull)
     */
    public MStaffCQ queryMStaff() {
        return xdfgetConditionQueryMStaff();
    }
    public MStaffCQ xdfgetConditionQueryMStaff() {
        String prop = "mStaff";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMStaff()); xsetupOuterJoinMStaff(); }
        return xgetQueRlMap(prop);
    }
    protected MStaffCQ xcreateQueryMStaff() {
        String nrp = xresolveNRP("t_shift", "mStaff"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStaffCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStaff", nrp);
    }
    protected void xsetupOuterJoinMStaff() { xregOutJo("mStaff"); }
    public boolean hasConditionQueryMStaff() { return xhasQueRlMap("mStaff"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_working_day by my working_day_id, named 'MWorkingDay'.
     * @return The instance of condition-query. (NotNull)
     */
    public MWorkingDayCQ queryMWorkingDay() {
        return xdfgetConditionQueryMWorkingDay();
    }
    public MWorkingDayCQ xdfgetConditionQueryMWorkingDay() {
        String prop = "mWorkingDay";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMWorkingDay()); xsetupOuterJoinMWorkingDay(); }
        return xgetQueRlMap(prop);
    }
    protected MWorkingDayCQ xcreateQueryMWorkingDay() {
        String nrp = xresolveNRP("t_shift", "mWorkingDay"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWorkingDayCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWorkingDay", nrp);
    }
    protected void xsetupOuterJoinMWorkingDay() { xregOutJo("mWorkingDay"); }
    public boolean hasConditionQueryMWorkingDay() { return xhasQueRlMap("mWorkingDay"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShiftCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShiftCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TShiftCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TShiftCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TShiftCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TShiftCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TShiftCQ> _myselfExistsMap;
    public Map<String, TShiftCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TShiftCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TShiftCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TShiftCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShiftCB.class.getName(); }
    protected String xCQ() { return TShiftCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
