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
 * The base condition-query of t_reservation_detail.
 * @author DBFlute(AutoGenerator)
 */
public class BsTReservationDetailCQ extends AbstractBsTReservationDetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TReservationDetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReservationDetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_reservation_detail) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TReservationDetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TReservationDetailCIQ xcreateCIQ() {
        TReservationDetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TReservationDetailCIQ xnewCIQ() {
        return new TReservationDetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_reservation_detail on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TReservationDetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TReservationDetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _reservationDetailId;
    public ConditionValue xdfgetReservationDetailId()
    { if (_reservationDetailId == null) { _reservationDetailId = nCV(); }
      return _reservationDetailId; }
    protected ConditionValue xgetCValueReservationDetailId() { return xdfgetReservationDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_ReservationDetailId_Asc() { regOBA("reservation_detail_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * reservation_detail_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_ReservationDetailId_Desc() { regOBD("reservation_detail_id"); return this; }

    protected ConditionValue _reservationId;
    public ConditionValue xdfgetReservationId()
    { if (_reservationId == null) { _reservationId = nCV(); }
      return _reservationId; }
    protected ConditionValue xgetCValueReservationId() { return xdfgetReservationId(); }

    /**
     * Add order-by as ascend. <br>
     * reservation_id: {int8(19), FK to t_reservation}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_ReservationId_Asc() { regOBA("reservation_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * reservation_id: {int8(19), FK to t_reservation}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_ReservationId_Desc() { regOBD("reservation_id"); return this; }

    protected ConditionValue _courseId;
    public ConditionValue xdfgetCourseId()
    { if (_courseId == null) { _courseId = nCV(); }
      return _courseId; }
    protected ConditionValue xgetCValueCourseId() { return xdfgetCourseId(); }

    /**
     * Add order-by as ascend. <br>
     * course_id: {int4(10), FK to m_course}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_CourseId_Asc() { regOBA("course_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * course_id: {int4(10), FK to m_course}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_CourseId_Desc() { regOBD("course_id"); return this; }

    protected ConditionValue _histCourseName;
    public ConditionValue xdfgetHistCourseName()
    { if (_histCourseName == null) { _histCourseName = nCV(); }
      return _histCourseName; }
    protected ConditionValue xgetCValueHistCourseName() { return xdfgetHistCourseName(); }

    /**
     * Add order-by as ascend. <br>
     * hist_course_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_HistCourseName_Asc() { regOBA("hist_course_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * hist_course_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_HistCourseName_Desc() { regOBD("hist_course_name"); return this; }

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
    public BsTReservationDetailCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsTReservationDetailCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsTReservationDetailCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsTReservationDetailCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsTReservationDetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTReservationDetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TReservationDetailCQ bq = (TReservationDetailCQ)bqs;
        TReservationDetailCQ uq = (TReservationDetailCQ)uqs;
        if (bq.hasConditionQueryMCourse()) {
            uq.queryMCourse().reflectRelationOnUnionQuery(bq.queryMCourse(), uq.queryMCourse());
        }
        if (bq.hasConditionQueryTReservation()) {
            uq.queryTReservation().reflectRelationOnUnionQuery(bq.queryTReservation(), uq.queryTReservation());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_course by my course_id, named 'MCourse'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCourseCQ queryMCourse() {
        return xdfgetConditionQueryMCourse();
    }
    public MCourseCQ xdfgetConditionQueryMCourse() {
        String prop = "mCourse";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCourse()); xsetupOuterJoinMCourse(); }
        return xgetQueRlMap(prop);
    }
    protected MCourseCQ xcreateQueryMCourse() {
        String nrp = xresolveNRP("t_reservation_detail", "mCourse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCourseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCourse", nrp);
    }
    protected void xsetupOuterJoinMCourse() { xregOutJo("mCourse"); }
    public boolean hasConditionQueryMCourse() { return xhasQueRlMap("mCourse"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_reservation by my reservation_id, named 'TReservation'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReservationCQ queryTReservation() {
        return xdfgetConditionQueryTReservation();
    }
    public TReservationCQ xdfgetConditionQueryTReservation() {
        String prop = "tReservation";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReservation()); xsetupOuterJoinTReservation(); }
        return xgetQueRlMap(prop);
    }
    protected TReservationCQ xcreateQueryTReservation() {
        String nrp = xresolveNRP("t_reservation_detail", "tReservation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReservationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReservation", nrp);
    }
    protected void xsetupOuterJoinTReservation() { xregOutJo("tReservation"); }
    public boolean hasConditionQueryTReservation() { return xhasQueRlMap("tReservation"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TReservationDetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TReservationDetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TReservationDetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TReservationDetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TReservationDetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TReservationDetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TReservationDetailCQ> _myselfExistsMap;
    public Map<String, TReservationDetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TReservationDetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TReservationDetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TReservationDetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TReservationDetailCB.class.getName(); }
    protected String xCQ() { return TReservationDetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
