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
 * The condition-query for in-line of m_working_day.
 * @author DBFlute(AutoGenerator)
 */
public class MWorkingDayCIQ extends AbstractBsMWorkingDayCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMWorkingDayCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MWorkingDayCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMWorkingDayCQ myCQ) {
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
    protected ConditionValue xgetCValueWorkingDayId() { return _myCQ.xdfgetWorkingDayId(); }
    public String keepWorkingDayId_ExistsReferrer_TShiftList(TShiftCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepWorkingDayId_NotExistsReferrer_TShiftList(TShiftCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepWorkingDayId_SpecifyDerivedReferrer_TShiftList(TShiftCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepWorkingDayId_QueryDerivedReferrer_TShiftList(TShiftCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepWorkingDayId_QueryDerivedReferrer_TShiftListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueShopId() { return _myCQ.xdfgetShopId(); }
    protected ConditionValue xgetCValueWorkingDate() { return _myCQ.xdfgetWorkingDate(); }
    protected ConditionValue xgetCValueStartTime() { return _myCQ.xdfgetStartTime(); }
    protected ConditionValue xgetCValueEndTime() { return _myCQ.xdfgetEndTime(); }
    protected ConditionValue xgetCValueDeleteFlag() { return _myCQ.xdfgetDeleteFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MWorkingDayCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MWorkingDayCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MWorkingDayCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MWorkingDayCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MWorkingDayCB.class.getName(); }
    protected String xinCQ() { return MWorkingDayCQ.class.getName(); }
}
