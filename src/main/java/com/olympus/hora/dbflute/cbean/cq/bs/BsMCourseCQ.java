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
 * The base condition-query of m_course.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCourseCQ extends AbstractBsMCourseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCourseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCourseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_course) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCourseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCourseCIQ xcreateCIQ() {
        MCourseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCourseCIQ xnewCIQ() {
        return new MCourseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_course on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCourseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCourseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _courseId;
    public ConditionValue xdfgetCourseId()
    { if (_courseId == null) { _courseId = nCV(); }
      return _courseId; }
    protected ConditionValue xgetCValueCourseId() { return xdfgetCourseId(); }

    /**
     * Add order-by as ascend. <br>
     * course_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_CourseId_Asc() { regOBA("course_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * course_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_CourseId_Desc() { regOBD("course_id"); return this; }

    protected ConditionValue _courseGroupId;
    public ConditionValue xdfgetCourseGroupId()
    { if (_courseGroupId == null) { _courseGroupId = nCV(); }
      return _courseGroupId; }
    protected ConditionValue xgetCValueCourseGroupId() { return xdfgetCourseGroupId(); }

    /**
     * Add order-by as ascend. <br>
     * course_group_id: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_CourseGroupId_Asc() { regOBA("course_group_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * course_group_id: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_CourseGroupId_Desc() { regOBD("course_group_id"); return this; }

    protected ConditionValue _courseName;
    public ConditionValue xdfgetCourseName()
    { if (_courseName == null) { _courseName = nCV(); }
      return _courseName; }
    protected ConditionValue xgetCValueCourseName() { return xdfgetCourseName(); }

    /**
     * Add order-by as ascend. <br>
     * course_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_CourseName_Asc() { regOBA("course_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * course_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_CourseName_Desc() { regOBD("course_name"); return this; }

    protected ConditionValue _charge;
    public ConditionValue xdfgetCharge()
    { if (_charge == null) { _charge = nCV(); }
      return _charge; }
    protected ConditionValue xgetCValueCharge() { return xdfgetCharge(); }

    /**
     * Add order-by as ascend. <br>
     * charge: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_Charge_Asc() { regOBA("charge"); return this; }

    /**
     * Add order-by as descend. <br>
     * charge: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_Charge_Desc() { regOBD("charge"); return this; }

    protected ConditionValue _requiredTime;
    public ConditionValue xdfgetRequiredTime()
    { if (_requiredTime == null) { _requiredTime = nCV(); }
      return _requiredTime; }
    protected ConditionValue xgetCValueRequiredTime() { return xdfgetRequiredTime(); }

    /**
     * Add order-by as ascend. <br>
     * required_time: {interval(49, 6)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_RequiredTime_Asc() { regOBA("required_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * required_time: {interval(49, 6)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_RequiredTime_Desc() { regOBD("required_time"); return this; }

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
    public BsMCourseCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsMCourseCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsMCourseCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMCourseCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsMCourseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCourseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MCourseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCourseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCourseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCourseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCourseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCourseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCourseCQ> _myselfExistsMap;
    public Map<String, MCourseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCourseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCourseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCourseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCourseCB.class.getName(); }
    protected String xCQ() { return MCourseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
