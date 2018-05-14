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
 * The base condition-query of m_user.
 * @author DBFlute(AutoGenerator)
 */
public class BsMUserCQ extends AbstractBsMUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_user) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MUserCIQ xcreateCIQ() {
        MUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MUserCIQ xnewCIQ() {
        return new MUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_user on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

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
    public BsMUserCQ addOrderBy_FamilyName_Asc() { regOBA("family_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * family_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_FamilyName_Desc() { regOBD("family_name"); return this; }

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
    public BsMUserCQ addOrderBy_GivenName_Asc() { regOBA("given_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * given_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_GivenName_Desc() { regOBD("given_name"); return this; }

    protected ConditionValue _familyNameKana;
    public ConditionValue xdfgetFamilyNameKana()
    { if (_familyNameKana == null) { _familyNameKana = nCV(); }
      return _familyNameKana; }
    protected ConditionValue xgetCValueFamilyNameKana() { return xdfgetFamilyNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * family_name_kana: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_FamilyNameKana_Asc() { regOBA("family_name_kana"); return this; }

    /**
     * Add order-by as descend. <br>
     * family_name_kana: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_FamilyNameKana_Desc() { regOBD("family_name_kana"); return this; }

    protected ConditionValue _givenNameKana;
    public ConditionValue xdfgetGivenNameKana()
    { if (_givenNameKana == null) { _givenNameKana = nCV(); }
      return _givenNameKana; }
    protected ConditionValue xgetCValueGivenNameKana() { return xdfgetGivenNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * given_name_kana: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_GivenNameKana_Asc() { regOBA("given_name_kana"); return this; }

    /**
     * Add order-by as descend. <br>
     * given_name_kana: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_GivenNameKana_Desc() { regOBD("given_name_kana"); return this; }

    protected ConditionValue _sex;
    public ConditionValue xdfgetSex()
    { if (_sex == null) { _sex = nCV(); }
      return _sex; }
    protected ConditionValue xgetCValueSex() { return xdfgetSex(); }

    /**
     * Add order-by as ascend. <br>
     * sex: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Sex_Asc() { regOBA("sex"); return this; }

    /**
     * Add order-by as descend. <br>
     * sex: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Sex_Desc() { regOBD("sex"); return this; }

    protected ConditionValue _birthday;
    public ConditionValue xdfgetBirthday()
    { if (_birthday == null) { _birthday = nCV(); }
      return _birthday; }
    protected ConditionValue xgetCValueBirthday() { return xdfgetBirthday(); }

    /**
     * Add order-by as ascend. <br>
     * birthday: {date(13)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Birthday_Asc() { regOBA("birthday"); return this; }

    /**
     * Add order-by as descend. <br>
     * birthday: {date(13)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Birthday_Desc() { regOBD("birthday"); return this; }

    protected ConditionValue _phoneFirst1;
    public ConditionValue xdfgetPhoneFirst1()
    { if (_phoneFirst1 == null) { _phoneFirst1 = nCV(); }
      return _phoneFirst1; }
    protected ConditionValue xgetCValuePhoneFirst1() { return xdfgetPhoneFirst1(); }

    /**
     * Add order-by as ascend. <br>
     * phone_first1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneFirst1_Asc() { regOBA("phone_first1"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone_first1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneFirst1_Desc() { regOBD("phone_first1"); return this; }

    protected ConditionValue _phoneFirst2;
    public ConditionValue xdfgetPhoneFirst2()
    { if (_phoneFirst2 == null) { _phoneFirst2 = nCV(); }
      return _phoneFirst2; }
    protected ConditionValue xgetCValuePhoneFirst2() { return xdfgetPhoneFirst2(); }

    /**
     * Add order-by as ascend. <br>
     * phone_first2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneFirst2_Asc() { regOBA("phone_first2"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone_first2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneFirst2_Desc() { regOBD("phone_first2"); return this; }

    protected ConditionValue _phoneFirst3;
    public ConditionValue xdfgetPhoneFirst3()
    { if (_phoneFirst3 == null) { _phoneFirst3 = nCV(); }
      return _phoneFirst3; }
    protected ConditionValue xgetCValuePhoneFirst3() { return xdfgetPhoneFirst3(); }

    /**
     * Add order-by as ascend. <br>
     * phone_first3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneFirst3_Asc() { regOBA("phone_first3"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone_first3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneFirst3_Desc() { regOBD("phone_first3"); return this; }

    protected ConditionValue _phoneSecond1;
    public ConditionValue xdfgetPhoneSecond1()
    { if (_phoneSecond1 == null) { _phoneSecond1 = nCV(); }
      return _phoneSecond1; }
    protected ConditionValue xgetCValuePhoneSecond1() { return xdfgetPhoneSecond1(); }

    /**
     * Add order-by as ascend. <br>
     * phone_second1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneSecond1_Asc() { regOBA("phone_second1"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone_second1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneSecond1_Desc() { regOBD("phone_second1"); return this; }

    protected ConditionValue _phoneSecond2;
    public ConditionValue xdfgetPhoneSecond2()
    { if (_phoneSecond2 == null) { _phoneSecond2 = nCV(); }
      return _phoneSecond2; }
    protected ConditionValue xgetCValuePhoneSecond2() { return xdfgetPhoneSecond2(); }

    /**
     * Add order-by as ascend. <br>
     * phone_second2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneSecond2_Asc() { regOBA("phone_second2"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone_second2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneSecond2_Desc() { regOBD("phone_second2"); return this; }

    protected ConditionValue _phoneSecond3;
    public ConditionValue xdfgetPhoneSecond3()
    { if (_phoneSecond3 == null) { _phoneSecond3 = nCV(); }
      return _phoneSecond3; }
    protected ConditionValue xgetCValuePhoneSecond3() { return xdfgetPhoneSecond3(); }

    /**
     * Add order-by as ascend. <br>
     * phone_second3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneSecond3_Asc() { regOBA("phone_second3"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone_second3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PhoneSecond3_Desc() { regOBD("phone_second3"); return this; }

    protected ConditionValue _email1;
    public ConditionValue xdfgetEmail1()
    { if (_email1 == null) { _email1 = nCV(); }
      return _email1; }
    protected ConditionValue xgetCValueEmail1() { return xdfgetEmail1(); }

    /**
     * Add order-by as ascend. <br>
     * email1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Email1_Asc() { regOBA("email1"); return this; }

    /**
     * Add order-by as descend. <br>
     * email1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Email1_Desc() { regOBD("email1"); return this; }

    protected ConditionValue _email2;
    public ConditionValue xdfgetEmail2()
    { if (_email2 == null) { _email2 = nCV(); }
      return _email2; }
    protected ConditionValue xgetCValueEmail2() { return xdfgetEmail2(); }

    /**
     * Add order-by as ascend. <br>
     * email2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Email2_Asc() { regOBA("email2"); return this; }

    /**
     * Add order-by as descend. <br>
     * email2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Email2_Desc() { regOBD("email2"); return this; }

    protected ConditionValue _postalCode;
    public ConditionValue xdfgetPostalCode()
    { if (_postalCode == null) { _postalCode = nCV(); }
      return _postalCode; }
    protected ConditionValue xgetCValuePostalCode() { return xdfgetPostalCode(); }

    /**
     * Add order-by as ascend. <br>
     * postal_code: {bpchar(7)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PostalCode_Asc() { regOBA("postal_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * postal_code: {bpchar(7)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_PostalCode_Desc() { regOBD("postal_code"); return this; }

    protected ConditionValue _prefecture;
    public ConditionValue xdfgetPrefecture()
    { if (_prefecture == null) { _prefecture = nCV(); }
      return _prefecture; }
    protected ConditionValue xgetCValuePrefecture() { return xdfgetPrefecture(); }

    /**
     * Add order-by as ascend. <br>
     * prefecture: {int2(5)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Prefecture_Asc() { regOBA("prefecture"); return this; }

    /**
     * Add order-by as descend. <br>
     * prefecture: {int2(5)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Prefecture_Desc() { regOBD("prefecture"); return this; }

    protected ConditionValue _city;
    public ConditionValue xdfgetCity()
    { if (_city == null) { _city = nCV(); }
      return _city; }
    protected ConditionValue xgetCValueCity() { return xdfgetCity(); }

    /**
     * Add order-by as ascend. <br>
     * city: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_City_Asc() { regOBA("city"); return this; }

    /**
     * Add order-by as descend. <br>
     * city: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_City_Desc() { regOBD("city"); return this; }

    protected ConditionValue _address1;
    public ConditionValue xdfgetAddress1()
    { if (_address1 == null) { _address1 = nCV(); }
      return _address1; }
    protected ConditionValue xgetCValueAddress1() { return xdfgetAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * address1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Address1_Asc() { regOBA("address1"); return this; }

    /**
     * Add order-by as descend. <br>
     * address1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Address1_Desc() { regOBD("address1"); return this; }

    protected ConditionValue _address2;
    public ConditionValue xdfgetAddress2()
    { if (_address2 == null) { _address2 = nCV(); }
      return _address2; }
    protected ConditionValue xgetCValueAddress2() { return xdfgetAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * address2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Address2_Asc() { regOBA("address2"); return this; }

    /**
     * Add order-by as descend. <br>
     * address2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Address2_Desc() { regOBD("address2"); return this; }

    protected ConditionValue _remarks;
    public ConditionValue xdfgetRemarks()
    { if (_remarks == null) { _remarks = nCV(); }
      return _remarks; }
    protected ConditionValue xgetCValueRemarks() { return xdfgetRemarks(); }

    /**
     * Add order-by as ascend. <br>
     * remarks: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Remarks_Asc() { regOBA("remarks"); return this; }

    /**
     * Add order-by as descend. <br>
     * remarks: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_Remarks_Desc() { regOBD("remarks"); return this; }

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
    public BsMUserCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsMUserCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsMUserCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMUserCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsMUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MUserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MUserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MUserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MUserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MUserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MUserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MUserCQ> _myselfExistsMap;
    public Map<String, MUserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MUserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MUserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MUserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MUserCB.class.getName(); }
    protected String xCQ() { return MUserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
