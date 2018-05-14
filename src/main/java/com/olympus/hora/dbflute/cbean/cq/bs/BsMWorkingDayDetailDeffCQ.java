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
 * The base condition-query of m_working_day_detail_deff.
 * @author DBFlute(AutoGenerator)
 */
public class BsMWorkingDayDetailDeffCQ extends AbstractBsMWorkingDayDetailDeffCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MWorkingDayDetailDeffCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMWorkingDayDetailDeffCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_working_day_detail_deff) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MWorkingDayDetailDeffCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MWorkingDayDetailDeffCIQ xcreateCIQ() {
        MWorkingDayDetailDeffCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MWorkingDayDetailDeffCIQ xnewCIQ() {
        return new MWorkingDayDetailDeffCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_working_day_detail_deff on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MWorkingDayDetailDeffCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MWorkingDayDetailDeffCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _workingDayDetailDeffId;
    public ConditionValue xdfgetWorkingDayDetailDeffId()
    { if (_workingDayDetailDeffId == null) { _workingDayDetailDeffId = nCV(); }
      return _workingDayDetailDeffId; }
    protected ConditionValue xgetCValueWorkingDayDetailDeffId() { return xdfgetWorkingDayDetailDeffId(); }

    /**
     * Add order-by as ascend. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_WorkingDayDetailDeffId_Asc() { regOBA("working_day_detail_deff_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_WorkingDayDetailDeffId_Desc() { regOBD("working_day_detail_deff_id"); return this; }

    protected ConditionValue _mWorkingDayDeffId;
    public ConditionValue xdfgetMWorkingDayDeffId()
    { if (_mWorkingDayDeffId == null) { _mWorkingDayDeffId = nCV(); }
      return _mWorkingDayDeffId; }
    protected ConditionValue xgetCValueMWorkingDayDeffId() { return xdfgetMWorkingDayDeffId(); }

    /**
     * Add order-by as ascend. <br>
     * m_working_day_deff_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_MWorkingDayDeffId_Asc() { regOBA("m_working_day_deff_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * m_working_day_deff_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_MWorkingDayDeffId_Desc() { regOBD("m_working_day_deff_id"); return this; }

    protected ConditionValue _effectiveFlag;
    public ConditionValue xdfgetEffectiveFlag()
    { if (_effectiveFlag == null) { _effectiveFlag = nCV(); }
      return _effectiveFlag; }
    protected ConditionValue xgetCValueEffectiveFlag() { return xdfgetEffectiveFlag(); }

    /**
     * Add order-by as ascend. <br>
     * effective_flag: {NotNull, bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_EffectiveFlag_Asc() { regOBA("effective_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * effective_flag: {NotNull, bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_EffectiveFlag_Desc() { regOBD("effective_flag"); return this; }

    protected ConditionValue _workingDayFlg;
    public ConditionValue xdfgetWorkingDayFlg()
    { if (_workingDayFlg == null) { _workingDayFlg = nCV(); }
      return _workingDayFlg; }
    protected ConditionValue xgetCValueWorkingDayFlg() { return xdfgetWorkingDayFlg(); }

    /**
     * Add order-by as ascend. <br>
     * working_day_flg: {NotNull, bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_WorkingDayFlg_Asc() { regOBA("working_day_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * working_day_flg: {NotNull, bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_WorkingDayFlg_Desc() { regOBD("working_day_flg"); return this; }

    protected ConditionValue _week1Flag;
    public ConditionValue xdfgetWeek1Flag()
    { if (_week1Flag == null) { _week1Flag = nCV(); }
      return _week1Flag; }
    protected ConditionValue xgetCValueWeek1Flag() { return xdfgetWeek1Flag(); }

    /**
     * Add order-by as ascend. <br>
     * week_1_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week1Flag_Asc() { regOBA("week_1_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * week_1_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week1Flag_Desc() { regOBD("week_1_flag"); return this; }

    protected ConditionValue _week2Flag;
    public ConditionValue xdfgetWeek2Flag()
    { if (_week2Flag == null) { _week2Flag = nCV(); }
      return _week2Flag; }
    protected ConditionValue xgetCValueWeek2Flag() { return xdfgetWeek2Flag(); }

    /**
     * Add order-by as ascend. <br>
     * week_2_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week2Flag_Asc() { regOBA("week_2_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * week_2_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week2Flag_Desc() { regOBD("week_2_flag"); return this; }

    protected ConditionValue _week3Flag;
    public ConditionValue xdfgetWeek3Flag()
    { if (_week3Flag == null) { _week3Flag = nCV(); }
      return _week3Flag; }
    protected ConditionValue xgetCValueWeek3Flag() { return xdfgetWeek3Flag(); }

    /**
     * Add order-by as ascend. <br>
     * week_3_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week3Flag_Asc() { regOBA("week_3_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * week_3_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week3Flag_Desc() { regOBD("week_3_flag"); return this; }

    protected ConditionValue _week4Flag;
    public ConditionValue xdfgetWeek4Flag()
    { if (_week4Flag == null) { _week4Flag = nCV(); }
      return _week4Flag; }
    protected ConditionValue xgetCValueWeek4Flag() { return xdfgetWeek4Flag(); }

    /**
     * Add order-by as ascend. <br>
     * week4_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week4Flag_Asc() { regOBA("week4_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * week4_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week4Flag_Desc() { regOBD("week4_flag"); return this; }

    protected ConditionValue _week5Flag;
    public ConditionValue xdfgetWeek5Flag()
    { if (_week5Flag == null) { _week5Flag = nCV(); }
      return _week5Flag; }
    protected ConditionValue xgetCValueWeek5Flag() { return xdfgetWeek5Flag(); }

    /**
     * Add order-by as ascend. <br>
     * week5_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week5Flag_Asc() { regOBA("week5_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * week5_flag: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_Week5Flag_Desc() { regOBD("week5_flag"); return this; }

    protected ConditionValue _monFlg;
    public ConditionValue xdfgetMonFlg()
    { if (_monFlg == null) { _monFlg = nCV(); }
      return _monFlg; }
    protected ConditionValue xgetCValueMonFlg() { return xdfgetMonFlg(); }

    /**
     * Add order-by as ascend. <br>
     * mon_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_MonFlg_Asc() { regOBA("mon_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * mon_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_MonFlg_Desc() { regOBD("mon_flg"); return this; }

    protected ConditionValue _tueFlg;
    public ConditionValue xdfgetTueFlg()
    { if (_tueFlg == null) { _tueFlg = nCV(); }
      return _tueFlg; }
    protected ConditionValue xgetCValueTueFlg() { return xdfgetTueFlg(); }

    /**
     * Add order-by as ascend. <br>
     * tue_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_TueFlg_Asc() { regOBA("tue_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * tue_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_TueFlg_Desc() { regOBD("tue_flg"); return this; }

    protected ConditionValue _webFlg;
    public ConditionValue xdfgetWebFlg()
    { if (_webFlg == null) { _webFlg = nCV(); }
      return _webFlg; }
    protected ConditionValue xgetCValueWebFlg() { return xdfgetWebFlg(); }

    /**
     * Add order-by as ascend. <br>
     * web_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_WebFlg_Asc() { regOBA("web_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * web_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_WebFlg_Desc() { regOBD("web_flg"); return this; }

    protected ConditionValue _thuFlg;
    public ConditionValue xdfgetThuFlg()
    { if (_thuFlg == null) { _thuFlg = nCV(); }
      return _thuFlg; }
    protected ConditionValue xgetCValueThuFlg() { return xdfgetThuFlg(); }

    /**
     * Add order-by as ascend. <br>
     * thu_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_ThuFlg_Asc() { regOBA("thu_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * thu_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_ThuFlg_Desc() { regOBD("thu_flg"); return this; }

    protected ConditionValue _friFlg;
    public ConditionValue xdfgetFriFlg()
    { if (_friFlg == null) { _friFlg = nCV(); }
      return _friFlg; }
    protected ConditionValue xgetCValueFriFlg() { return xdfgetFriFlg(); }

    /**
     * Add order-by as ascend. <br>
     * fri_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_FriFlg_Asc() { regOBA("fri_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * fri_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_FriFlg_Desc() { regOBD("fri_flg"); return this; }

    protected ConditionValue _satFlg;
    public ConditionValue xdfgetSatFlg()
    { if (_satFlg == null) { _satFlg = nCV(); }
      return _satFlg; }
    protected ConditionValue xgetCValueSatFlg() { return xdfgetSatFlg(); }

    /**
     * Add order-by as ascend. <br>
     * sat_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_SatFlg_Asc() { regOBA("sat_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * sat_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_SatFlg_Desc() { regOBD("sat_flg"); return this; }

    protected ConditionValue _sunFlg;
    public ConditionValue xdfgetSunFlg()
    { if (_sunFlg == null) { _sunFlg = nCV(); }
      return _sunFlg; }
    protected ConditionValue xgetCValueSunFlg() { return xdfgetSunFlg(); }

    /**
     * Add order-by as ascend. <br>
     * sun_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_SunFlg_Asc() { regOBA("sun_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * sun_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_SunFlg_Desc() { regOBD("sun_flg"); return this; }

    protected ConditionValue _holidayFlg;
    public ConditionValue xdfgetHolidayFlg()
    { if (_holidayFlg == null) { _holidayFlg = nCV(); }
      return _holidayFlg; }
    protected ConditionValue xgetCValueHolidayFlg() { return xdfgetHolidayFlg(); }

    /**
     * Add order-by as ascend. <br>
     * holiday_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_HolidayFlg_Asc() { regOBA("holiday_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * holiday_flg: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_HolidayFlg_Desc() { regOBD("holiday_flg"); return this; }

    protected ConditionValue _dayOfMonth;
    public ConditionValue xdfgetDayOfMonth()
    { if (_dayOfMonth == null) { _dayOfMonth = nCV(); }
      return _dayOfMonth; }
    protected ConditionValue xgetCValueDayOfMonth() { return xdfgetDayOfMonth(); }

    /**
     * Add order-by as ascend. <br>
     * day_of_month: {int2(5)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_DayOfMonth_Asc() { regOBA("day_of_month"); return this; }

    /**
     * Add order-by as descend. <br>
     * day_of_month: {int2(5)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_DayOfMonth_Desc() { regOBD("day_of_month"); return this; }

    protected ConditionValue _specifiedDay;
    public ConditionValue xdfgetSpecifiedDay()
    { if (_specifiedDay == null) { _specifiedDay = nCV(); }
      return _specifiedDay; }
    protected ConditionValue xgetCValueSpecifiedDay() { return xdfgetSpecifiedDay(); }

    /**
     * Add order-by as ascend. <br>
     * specified_day: {date(13)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_SpecifiedDay_Asc() { regOBA("specified_day"); return this; }

    /**
     * Add order-by as descend. <br>
     * specified_day: {date(13)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_SpecifiedDay_Desc() { regOBD("specified_day"); return this; }

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
    public BsMWorkingDayDetailDeffCQ addOrderBy_StartTime_Asc() { regOBA("start_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * start_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_StartTime_Desc() { regOBD("start_time"); return this; }

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
    public BsMWorkingDayDetailDeffCQ addOrderBy_EndTime_Asc() { regOBA("end_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * end_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_EndTime_Desc() { regOBD("end_time"); return this; }

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
    public BsMWorkingDayDetailDeffCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsMWorkingDayDetailDeffCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsMWorkingDayDetailDeffCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMWorkingDayDetailDeffCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsMWorkingDayDetailDeffCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMWorkingDayDetailDeffCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MWorkingDayDetailDeffCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MWorkingDayDetailDeffCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MWorkingDayDetailDeffCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MWorkingDayDetailDeffCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MWorkingDayDetailDeffCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MWorkingDayDetailDeffCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MWorkingDayDetailDeffCQ> _myselfExistsMap;
    public Map<String, MWorkingDayDetailDeffCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MWorkingDayDetailDeffCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MWorkingDayDetailDeffCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MWorkingDayDetailDeffCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MWorkingDayDetailDeffCB.class.getName(); }
    protected String xCQ() { return MWorkingDayDetailDeffCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
