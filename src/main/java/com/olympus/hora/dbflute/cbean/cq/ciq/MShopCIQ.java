package com.olympus.hora.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.olympus.hora.dbflute.cbean.*;
import com.olympus.hora.dbflute.cbean.cq.bs.*;
import com.olympus.hora.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of m_shop.
 * @author DBFlute(AutoGenerator)
 */
public class MShopCIQ extends AbstractBsMShopCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMShopCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MShopCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMShopCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueShopId() { return _myCQ.xdfgetShopId(); }
    public String keepShopId_ExistsReferrer_MCourseGroupList(MCourseGroupCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShopId_ExistsReferrer_MWorkingDayList(MWorkingDayCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShopId_ExistsReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShopId_ExistsReferrer_MWorkingStaffList(MWorkingStaffCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShopId_ExistsReferrer_TReservationList(TReservationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShopId_NotExistsReferrer_MCourseGroupList(MCourseGroupCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShopId_NotExistsReferrer_MWorkingDayList(MWorkingDayCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShopId_NotExistsReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShopId_NotExistsReferrer_MWorkingStaffList(MWorkingStaffCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShopId_NotExistsReferrer_TReservationList(TReservationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShopId_SpecifyDerivedReferrer_MCourseGroupList(MCourseGroupCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShopId_SpecifyDerivedReferrer_MWorkingDayList(MWorkingDayCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShopId_SpecifyDerivedReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShopId_SpecifyDerivedReferrer_MWorkingStaffList(MWorkingStaffCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShopId_SpecifyDerivedReferrer_TReservationList(TReservationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_MCourseGroupList(MCourseGroupCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_MCourseGroupListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_MWorkingDayList(MWorkingDayCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_MWorkingDayListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_MWorkingDayDeffList(MWorkingDayDeffCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_MWorkingDayDeffListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_MWorkingStaffList(MWorkingStaffCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_MWorkingStaffListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_TReservationList(TReservationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShopId_QueryDerivedReferrer_TReservationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCompanyId() { return _myCQ.xdfgetCompanyId(); }
    protected ConditionValue xgetCValueShopAbbreviatedName() { return _myCQ.xdfgetShopAbbreviatedName(); }
    protected ConditionValue xgetCValueShopName() { return _myCQ.xdfgetShopName(); }
    protected ConditionValue xgetCValuePhone11() { return _myCQ.xdfgetPhone11(); }
    protected ConditionValue xgetCValuePhone12() { return _myCQ.xdfgetPhone12(); }
    protected ConditionValue xgetCValuePhone13() { return _myCQ.xdfgetPhone13(); }
    protected ConditionValue xgetCValuePhone21() { return _myCQ.xdfgetPhone21(); }
    protected ConditionValue xgetCValuePhone22() { return _myCQ.xdfgetPhone22(); }
    protected ConditionValue xgetCValuePhone23() { return _myCQ.xdfgetPhone23(); }
    protected ConditionValue xgetCValueFax1() { return _myCQ.xdfgetFax1(); }
    protected ConditionValue xgetCValueFax2() { return _myCQ.xdfgetFax2(); }
    protected ConditionValue xgetCValueFax3() { return _myCQ.xdfgetFax3(); }
    protected ConditionValue xgetCValueEmail1() { return _myCQ.xdfgetEmail1(); }
    protected ConditionValue xgetCValueEmail2() { return _myCQ.xdfgetEmail2(); }
    protected ConditionValue xgetCValueUrl() { return _myCQ.xdfgetUrl(); }
    protected ConditionValue xgetCValuePrefecture() { return _myCQ.xdfgetPrefecture(); }
    protected ConditionValue xgetCValueCity() { return _myCQ.xdfgetCity(); }
    protected ConditionValue xgetCValueAddress1() { return _myCQ.xdfgetAddress1(); }
    protected ConditionValue xgetCValueAddress2() { return _myCQ.xdfgetAddress2(); }
    protected ConditionValue xgetCValueRemarks() { return _myCQ.xdfgetRemarks(); }
    protected ConditionValue xgetCValueDeleteFlag() { return _myCQ.xdfgetDeleteFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MShopCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MShopCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MShopCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MShopCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MShopCB.class.getName(); }
    protected String xinCQ() { return MShopCQ.class.getName(); }
}
