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
 * The base condition-query of m_shop.
 * @author DBFlute(AutoGenerator)
 */
public class BsMShopCQ extends AbstractBsMShopCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MShopCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMShopCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_shop) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MShopCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MShopCIQ xcreateCIQ() {
        MShopCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MShopCIQ xnewCIQ() {
        return new MShopCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_shop on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MShopCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MShopCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shopId;
    public ConditionValue xdfgetShopId()
    { if (_shopId == null) { _shopId = nCV(); }
      return _shopId; }
    protected ConditionValue xgetCValueShopId() { return xdfgetShopId(); }

    public Map<String, MCourseGroupCQ> xdfgetShopId_ExistsReferrer_MCourseGroupList() { return xgetSQueMap("shopId_ExistsReferrer_MCourseGroupList"); }
    public String keepShopId_ExistsReferrer_MCourseGroupList(MCourseGroupCQ sq) { return xkeepSQue("shopId_ExistsReferrer_MCourseGroupList", sq); }

    public Map<String, MWorkingDayCQ> xdfgetShopId_ExistsReferrer_MWorkingDayList() { return xgetSQueMap("shopId_ExistsReferrer_MWorkingDayList"); }
    public String keepShopId_ExistsReferrer_MWorkingDayList(MWorkingDayCQ sq) { return xkeepSQue("shopId_ExistsReferrer_MWorkingDayList", sq); }

    public Map<String, MWorkingDayDeffCQ> xdfgetShopId_ExistsReferrer_MWorkingDayDeffList() { return xgetSQueMap("shopId_ExistsReferrer_MWorkingDayDeffList"); }
    public String keepShopId_ExistsReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq) { return xkeepSQue("shopId_ExistsReferrer_MWorkingDayDeffList", sq); }

    public Map<String, MWorkingStaffCQ> xdfgetShopId_ExistsReferrer_MWorkingStaffList() { return xgetSQueMap("shopId_ExistsReferrer_MWorkingStaffList"); }
    public String keepShopId_ExistsReferrer_MWorkingStaffList(MWorkingStaffCQ sq) { return xkeepSQue("shopId_ExistsReferrer_MWorkingStaffList", sq); }

    public Map<String, TReservationCQ> xdfgetShopId_ExistsReferrer_TReservationList() { return xgetSQueMap("shopId_ExistsReferrer_TReservationList"); }
    public String keepShopId_ExistsReferrer_TReservationList(TReservationCQ sq) { return xkeepSQue("shopId_ExistsReferrer_TReservationList", sq); }

    public Map<String, MCourseGroupCQ> xdfgetShopId_NotExistsReferrer_MCourseGroupList() { return xgetSQueMap("shopId_NotExistsReferrer_MCourseGroupList"); }
    public String keepShopId_NotExistsReferrer_MCourseGroupList(MCourseGroupCQ sq) { return xkeepSQue("shopId_NotExistsReferrer_MCourseGroupList", sq); }

    public Map<String, MWorkingDayCQ> xdfgetShopId_NotExistsReferrer_MWorkingDayList() { return xgetSQueMap("shopId_NotExistsReferrer_MWorkingDayList"); }
    public String keepShopId_NotExistsReferrer_MWorkingDayList(MWorkingDayCQ sq) { return xkeepSQue("shopId_NotExistsReferrer_MWorkingDayList", sq); }

    public Map<String, MWorkingDayDeffCQ> xdfgetShopId_NotExistsReferrer_MWorkingDayDeffList() { return xgetSQueMap("shopId_NotExistsReferrer_MWorkingDayDeffList"); }
    public String keepShopId_NotExistsReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq) { return xkeepSQue("shopId_NotExistsReferrer_MWorkingDayDeffList", sq); }

    public Map<String, MWorkingStaffCQ> xdfgetShopId_NotExistsReferrer_MWorkingStaffList() { return xgetSQueMap("shopId_NotExistsReferrer_MWorkingStaffList"); }
    public String keepShopId_NotExistsReferrer_MWorkingStaffList(MWorkingStaffCQ sq) { return xkeepSQue("shopId_NotExistsReferrer_MWorkingStaffList", sq); }

    public Map<String, TReservationCQ> xdfgetShopId_NotExistsReferrer_TReservationList() { return xgetSQueMap("shopId_NotExistsReferrer_TReservationList"); }
    public String keepShopId_NotExistsReferrer_TReservationList(TReservationCQ sq) { return xkeepSQue("shopId_NotExistsReferrer_TReservationList", sq); }

    public Map<String, MCourseGroupCQ> xdfgetShopId_SpecifyDerivedReferrer_MCourseGroupList() { return xgetSQueMap("shopId_SpecifyDerivedReferrer_MCourseGroupList"); }
    public String keepShopId_SpecifyDerivedReferrer_MCourseGroupList(MCourseGroupCQ sq) { return xkeepSQue("shopId_SpecifyDerivedReferrer_MCourseGroupList", sq); }

    public Map<String, MWorkingDayCQ> xdfgetShopId_SpecifyDerivedReferrer_MWorkingDayList() { return xgetSQueMap("shopId_SpecifyDerivedReferrer_MWorkingDayList"); }
    public String keepShopId_SpecifyDerivedReferrer_MWorkingDayList(MWorkingDayCQ sq) { return xkeepSQue("shopId_SpecifyDerivedReferrer_MWorkingDayList", sq); }

    public Map<String, MWorkingDayDeffCQ> xdfgetShopId_SpecifyDerivedReferrer_MWorkingDayDeffList() { return xgetSQueMap("shopId_SpecifyDerivedReferrer_MWorkingDayDeffList"); }
    public String keepShopId_SpecifyDerivedReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq) { return xkeepSQue("shopId_SpecifyDerivedReferrer_MWorkingDayDeffList", sq); }

    public Map<String, MWorkingStaffCQ> xdfgetShopId_SpecifyDerivedReferrer_MWorkingStaffList() { return xgetSQueMap("shopId_SpecifyDerivedReferrer_MWorkingStaffList"); }
    public String keepShopId_SpecifyDerivedReferrer_MWorkingStaffList(MWorkingStaffCQ sq) { return xkeepSQue("shopId_SpecifyDerivedReferrer_MWorkingStaffList", sq); }

    public Map<String, TReservationCQ> xdfgetShopId_SpecifyDerivedReferrer_TReservationList() { return xgetSQueMap("shopId_SpecifyDerivedReferrer_TReservationList"); }
    public String keepShopId_SpecifyDerivedReferrer_TReservationList(TReservationCQ sq) { return xkeepSQue("shopId_SpecifyDerivedReferrer_TReservationList", sq); }

    public Map<String, MCourseGroupCQ> xdfgetShopId_QueryDerivedReferrer_MCourseGroupList() { return xgetSQueMap("shopId_QueryDerivedReferrer_MCourseGroupList"); }
    public String keepShopId_QueryDerivedReferrer_MCourseGroupList(MCourseGroupCQ sq) { return xkeepSQue("shopId_QueryDerivedReferrer_MCourseGroupList", sq); }
    public Map<String, Object> xdfgetShopId_QueryDerivedReferrer_MCourseGroupListParameter() { return xgetSQuePmMap("shopId_QueryDerivedReferrer_MCourseGroupList"); }
    public String keepShopId_QueryDerivedReferrer_MCourseGroupListParameter(Object pm) { return xkeepSQuePm("shopId_QueryDerivedReferrer_MCourseGroupList", pm); }

    public Map<String, MWorkingDayCQ> xdfgetShopId_QueryDerivedReferrer_MWorkingDayList() { return xgetSQueMap("shopId_QueryDerivedReferrer_MWorkingDayList"); }
    public String keepShopId_QueryDerivedReferrer_MWorkingDayList(MWorkingDayCQ sq) { return xkeepSQue("shopId_QueryDerivedReferrer_MWorkingDayList", sq); }
    public Map<String, Object> xdfgetShopId_QueryDerivedReferrer_MWorkingDayListParameter() { return xgetSQuePmMap("shopId_QueryDerivedReferrer_MWorkingDayList"); }
    public String keepShopId_QueryDerivedReferrer_MWorkingDayListParameter(Object pm) { return xkeepSQuePm("shopId_QueryDerivedReferrer_MWorkingDayList", pm); }

    public Map<String, MWorkingDayDeffCQ> xdfgetShopId_QueryDerivedReferrer_MWorkingDayDeffList() { return xgetSQueMap("shopId_QueryDerivedReferrer_MWorkingDayDeffList"); }
    public String keepShopId_QueryDerivedReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq) { return xkeepSQue("shopId_QueryDerivedReferrer_MWorkingDayDeffList", sq); }
    public Map<String, Object> xdfgetShopId_QueryDerivedReferrer_MWorkingDayDeffListParameter() { return xgetSQuePmMap("shopId_QueryDerivedReferrer_MWorkingDayDeffList"); }
    public String keepShopId_QueryDerivedReferrer_MWorkingDayDeffListParameter(Object pm) { return xkeepSQuePm("shopId_QueryDerivedReferrer_MWorkingDayDeffList", pm); }

    public Map<String, MWorkingStaffCQ> xdfgetShopId_QueryDerivedReferrer_MWorkingStaffList() { return xgetSQueMap("shopId_QueryDerivedReferrer_MWorkingStaffList"); }
    public String keepShopId_QueryDerivedReferrer_MWorkingStaffList(MWorkingStaffCQ sq) { return xkeepSQue("shopId_QueryDerivedReferrer_MWorkingStaffList", sq); }
    public Map<String, Object> xdfgetShopId_QueryDerivedReferrer_MWorkingStaffListParameter() { return xgetSQuePmMap("shopId_QueryDerivedReferrer_MWorkingStaffList"); }
    public String keepShopId_QueryDerivedReferrer_MWorkingStaffListParameter(Object pm) { return xkeepSQuePm("shopId_QueryDerivedReferrer_MWorkingStaffList", pm); }

    public Map<String, TReservationCQ> xdfgetShopId_QueryDerivedReferrer_TReservationList() { return xgetSQueMap("shopId_QueryDerivedReferrer_TReservationList"); }
    public String keepShopId_QueryDerivedReferrer_TReservationList(TReservationCQ sq) { return xkeepSQue("shopId_QueryDerivedReferrer_TReservationList", sq); }
    public Map<String, Object> xdfgetShopId_QueryDerivedReferrer_TReservationListParameter() { return xgetSQuePmMap("shopId_QueryDerivedReferrer_TReservationList"); }
    public String keepShopId_QueryDerivedReferrer_TReservationListParameter(Object pm) { return xkeepSQuePm("shopId_QueryDerivedReferrer_TReservationList", pm); }

    /**
     * Add order-by as ascend. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_ShopId_Asc() { regOBA("shop_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_ShopId_Desc() { regOBD("shop_id"); return this; }

    protected ConditionValue _companyId;
    public ConditionValue xdfgetCompanyId()
    { if (_companyId == null) { _companyId = nCV(); }
      return _companyId; }
    protected ConditionValue xgetCValueCompanyId() { return xdfgetCompanyId(); }

    /**
     * Add order-by as ascend. <br>
     * company_id: {int4(10), FK to m_company}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_CompanyId_Asc() { regOBA("company_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * company_id: {int4(10), FK to m_company}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_CompanyId_Desc() { regOBD("company_id"); return this; }

    protected ConditionValue _shopAbbreviatedName;
    public ConditionValue xdfgetShopAbbreviatedName()
    { if (_shopAbbreviatedName == null) { _shopAbbreviatedName = nCV(); }
      return _shopAbbreviatedName; }
    protected ConditionValue xgetCValueShopAbbreviatedName() { return xdfgetShopAbbreviatedName(); }

    /**
     * Add order-by as ascend. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_ShopAbbreviatedName_Asc() { regOBA("shop_abbreviated_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * shop_abbreviated_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_ShopAbbreviatedName_Desc() { regOBD("shop_abbreviated_name"); return this; }

    protected ConditionValue _shopName;
    public ConditionValue xdfgetShopName()
    { if (_shopName == null) { _shopName = nCV(); }
      return _shopName; }
    protected ConditionValue xgetCValueShopName() { return xdfgetShopName(); }

    /**
     * Add order-by as ascend. <br>
     * shop_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_ShopName_Asc() { regOBA("shop_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * shop_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_ShopName_Desc() { regOBD("shop_name"); return this; }

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
    public BsMShopCQ addOrderBy_Phone11_Asc() { regOBA("phone1_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone1_1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Phone11_Desc() { regOBD("phone1_1"); return this; }

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
    public BsMShopCQ addOrderBy_Phone12_Asc() { regOBA("phone1_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone1_2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Phone12_Desc() { regOBD("phone1_2"); return this; }

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
    public BsMShopCQ addOrderBy_Phone13_Asc() { regOBA("phone1_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone1_3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Phone13_Desc() { regOBD("phone1_3"); return this; }

    protected ConditionValue _phone21;
    public ConditionValue xdfgetPhone21()
    { if (_phone21 == null) { _phone21 = nCV(); }
      return _phone21; }
    protected ConditionValue xgetCValuePhone21() { return xdfgetPhone21(); }

    /**
     * Add order-by as ascend. <br>
     * phone2_1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Phone21_Asc() { regOBA("phone2_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone2_1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Phone21_Desc() { regOBD("phone2_1"); return this; }

    protected ConditionValue _phone22;
    public ConditionValue xdfgetPhone22()
    { if (_phone22 == null) { _phone22 = nCV(); }
      return _phone22; }
    protected ConditionValue xgetCValuePhone22() { return xdfgetPhone22(); }

    /**
     * Add order-by as ascend. <br>
     * phone2_2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Phone22_Asc() { regOBA("phone2_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone2_2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Phone22_Desc() { regOBD("phone2_2"); return this; }

    protected ConditionValue _phone23;
    public ConditionValue xdfgetPhone23()
    { if (_phone23 == null) { _phone23 = nCV(); }
      return _phone23; }
    protected ConditionValue xgetCValuePhone23() { return xdfgetPhone23(); }

    /**
     * Add order-by as ascend. <br>
     * phone2_3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Phone23_Asc() { regOBA("phone2_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone2_3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Phone23_Desc() { regOBD("phone2_3"); return this; }

    protected ConditionValue _fax1;
    public ConditionValue xdfgetFax1()
    { if (_fax1 == null) { _fax1 = nCV(); }
      return _fax1; }
    protected ConditionValue xgetCValueFax1() { return xdfgetFax1(); }

    /**
     * Add order-by as ascend. <br>
     * fax_1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Fax1_Asc() { regOBA("fax_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * fax_1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Fax1_Desc() { regOBD("fax_1"); return this; }

    protected ConditionValue _fax2;
    public ConditionValue xdfgetFax2()
    { if (_fax2 == null) { _fax2 = nCV(); }
      return _fax2; }
    protected ConditionValue xgetCValueFax2() { return xdfgetFax2(); }

    /**
     * Add order-by as ascend. <br>
     * fax_2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Fax2_Asc() { regOBA("fax_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * fax_2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Fax2_Desc() { regOBD("fax_2"); return this; }

    protected ConditionValue _fax3;
    public ConditionValue xdfgetFax3()
    { if (_fax3 == null) { _fax3 = nCV(); }
      return _fax3; }
    protected ConditionValue xgetCValueFax3() { return xdfgetFax3(); }

    /**
     * Add order-by as ascend. <br>
     * fax_3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Fax3_Asc() { regOBA("fax_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * fax_3: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Fax3_Desc() { regOBD("fax_3"); return this; }

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
    public BsMShopCQ addOrderBy_Email1_Asc() { regOBA("email1"); return this; }

    /**
     * Add order-by as descend. <br>
     * email1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Email1_Desc() { regOBD("email1"); return this; }

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
    public BsMShopCQ addOrderBy_Email2_Asc() { regOBA("email2"); return this; }

    /**
     * Add order-by as descend. <br>
     * email2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Email2_Desc() { regOBD("email2"); return this; }

    protected ConditionValue _url;
    public ConditionValue xdfgetUrl()
    { if (_url == null) { _url = nCV(); }
      return _url; }
    protected ConditionValue xgetCValueUrl() { return xdfgetUrl(); }

    /**
     * Add order-by as ascend. <br>
     * url: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Url_Asc() { regOBA("url"); return this; }

    /**
     * Add order-by as descend. <br>
     * url: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Url_Desc() { regOBD("url"); return this; }

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
    public BsMShopCQ addOrderBy_Prefecture_Asc() { regOBA("prefecture"); return this; }

    /**
     * Add order-by as descend. <br>
     * prefecture: {int2(5)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Prefecture_Desc() { regOBD("prefecture"); return this; }

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
    public BsMShopCQ addOrderBy_City_Asc() { regOBA("city"); return this; }

    /**
     * Add order-by as descend. <br>
     * city: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_City_Desc() { regOBD("city"); return this; }

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
    public BsMShopCQ addOrderBy_Address1_Asc() { regOBA("address1"); return this; }

    /**
     * Add order-by as descend. <br>
     * address1: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Address1_Desc() { regOBD("address1"); return this; }

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
    public BsMShopCQ addOrderBy_Address2_Asc() { regOBA("address2"); return this; }

    /**
     * Add order-by as descend. <br>
     * address2: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Address2_Desc() { regOBD("address2"); return this; }

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
    public BsMShopCQ addOrderBy_Remarks_Asc() { regOBA("remarks"); return this; }

    /**
     * Add order-by as descend. <br>
     * remarks: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_Remarks_Desc() { regOBD("remarks"); return this; }

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
    public BsMShopCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsMShopCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsMShopCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMShopCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsMShopCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMShopCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MShopCQ bq = (MShopCQ)bqs;
        MShopCQ uq = (MShopCQ)uqs;
        if (bq.hasConditionQueryMCompany()) {
            uq.queryMCompany().reflectRelationOnUnionQuery(bq.queryMCompany(), uq.queryMCompany());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_company by my company_id, named 'MCompany'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCompanyCQ queryMCompany() {
        return xdfgetConditionQueryMCompany();
    }
    public MCompanyCQ xdfgetConditionQueryMCompany() {
        String prop = "mCompany";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCompany()); xsetupOuterJoinMCompany(); }
        return xgetQueRlMap(prop);
    }
    protected MCompanyCQ xcreateQueryMCompany() {
        String nrp = xresolveNRP("m_shop", "mCompany"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCompanyCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCompany", nrp);
    }
    protected void xsetupOuterJoinMCompany() { xregOutJo("mCompany"); }
    public boolean hasConditionQueryMCompany() { return xhasQueRlMap("mCompany"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MShopCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MShopCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MShopCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MShopCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MShopCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MShopCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MShopCQ> _myselfExistsMap;
    public Map<String, MShopCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MShopCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MShopCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MShopCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MShopCB.class.getName(); }
    protected String xCQ() { return MShopCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
