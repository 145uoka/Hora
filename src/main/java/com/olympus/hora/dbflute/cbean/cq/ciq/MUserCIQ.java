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
 * The condition-query for in-line of m_user.
 * @author DBFlute(AutoGenerator)
 */
public class MUserCIQ extends AbstractBsMUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMUserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MUserCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMUserCQ myCQ) {
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
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    protected ConditionValue xgetCValueFamilyName() { return _myCQ.xdfgetFamilyName(); }
    protected ConditionValue xgetCValueGivenName() { return _myCQ.xdfgetGivenName(); }
    protected ConditionValue xgetCValueFamilyNameKana() { return _myCQ.xdfgetFamilyNameKana(); }
    protected ConditionValue xgetCValueGivenNameKana() { return _myCQ.xdfgetGivenNameKana(); }
    protected ConditionValue xgetCValueSex() { return _myCQ.xdfgetSex(); }
    protected ConditionValue xgetCValueBirthday() { return _myCQ.xdfgetBirthday(); }
    protected ConditionValue xgetCValuePhoneFirst1() { return _myCQ.xdfgetPhoneFirst1(); }
    protected ConditionValue xgetCValuePhoneFirst2() { return _myCQ.xdfgetPhoneFirst2(); }
    protected ConditionValue xgetCValuePhoneFirst3() { return _myCQ.xdfgetPhoneFirst3(); }
    protected ConditionValue xgetCValuePhoneSecond1() { return _myCQ.xdfgetPhoneSecond1(); }
    protected ConditionValue xgetCValuePhoneSecond2() { return _myCQ.xdfgetPhoneSecond2(); }
    protected ConditionValue xgetCValuePhoneSecond3() { return _myCQ.xdfgetPhoneSecond3(); }
    protected ConditionValue xgetCValueEmail1() { return _myCQ.xdfgetEmail1(); }
    protected ConditionValue xgetCValueEmail2() { return _myCQ.xdfgetEmail2(); }
    protected ConditionValue xgetCValuePostalCode() { return _myCQ.xdfgetPostalCode(); }
    protected ConditionValue xgetCValuePrefecture() { return _myCQ.xdfgetPrefecture(); }
    protected ConditionValue xgetCValueCity() { return _myCQ.xdfgetCity(); }
    protected ConditionValue xgetCValueAddress1() { return _myCQ.xdfgetAddress1(); }
    protected ConditionValue xgetCValueAddress2() { return _myCQ.xdfgetAddress2(); }
    protected ConditionValue xgetCValueRemarks() { return _myCQ.xdfgetRemarks(); }
    protected ConditionValue xgetCValueDeleteFlag() { return _myCQ.xdfgetDeleteFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MUserCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MUserCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MUserCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MUserCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MUserCB.class.getName(); }
    protected String xinCQ() { return MUserCQ.class.getName(); }
}
