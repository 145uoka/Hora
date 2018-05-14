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
 * The condition-query for in-line of m_working_day_detail_deff.
 * @author DBFlute(AutoGenerator)
 */
public class MWorkingDayDetailDeffCIQ extends AbstractBsMWorkingDayDetailDeffCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMWorkingDayDetailDeffCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MWorkingDayDetailDeffCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMWorkingDayDetailDeffCQ myCQ) {
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
    protected ConditionValue xgetCValueWorkingDayDetailDeffId() { return _myCQ.xdfgetWorkingDayDetailDeffId(); }
    protected ConditionValue xgetCValueMWorkingDayDeffId() { return _myCQ.xdfgetMWorkingDayDeffId(); }
    protected ConditionValue xgetCValueEffectiveFlag() { return _myCQ.xdfgetEffectiveFlag(); }
    protected ConditionValue xgetCValueWorkingDayFlg() { return _myCQ.xdfgetWorkingDayFlg(); }
    protected ConditionValue xgetCValueWeek1Flag() { return _myCQ.xdfgetWeek1Flag(); }
    protected ConditionValue xgetCValueWeek2Flag() { return _myCQ.xdfgetWeek2Flag(); }
    protected ConditionValue xgetCValueWeek3Flag() { return _myCQ.xdfgetWeek3Flag(); }
    protected ConditionValue xgetCValueWeek4Flag() { return _myCQ.xdfgetWeek4Flag(); }
    protected ConditionValue xgetCValueWeek5Flag() { return _myCQ.xdfgetWeek5Flag(); }
    protected ConditionValue xgetCValueMonFlg() { return _myCQ.xdfgetMonFlg(); }
    protected ConditionValue xgetCValueTueFlg() { return _myCQ.xdfgetTueFlg(); }
    protected ConditionValue xgetCValueWebFlg() { return _myCQ.xdfgetWebFlg(); }
    protected ConditionValue xgetCValueThuFlg() { return _myCQ.xdfgetThuFlg(); }
    protected ConditionValue xgetCValueFriFlg() { return _myCQ.xdfgetFriFlg(); }
    protected ConditionValue xgetCValueSatFlg() { return _myCQ.xdfgetSatFlg(); }
    protected ConditionValue xgetCValueSunFlg() { return _myCQ.xdfgetSunFlg(); }
    protected ConditionValue xgetCValueHolidayFlg() { return _myCQ.xdfgetHolidayFlg(); }
    protected ConditionValue xgetCValueDayOfMonth() { return _myCQ.xdfgetDayOfMonth(); }
    protected ConditionValue xgetCValueSpecifiedDay() { return _myCQ.xdfgetSpecifiedDay(); }
    protected ConditionValue xgetCValueStartTime() { return _myCQ.xdfgetStartTime(); }
    protected ConditionValue xgetCValueEndTime() { return _myCQ.xdfgetEndTime(); }
    protected ConditionValue xgetCValueDeleteFlag() { return _myCQ.xdfgetDeleteFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MWorkingDayDetailDeffCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MWorkingDayDetailDeffCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MWorkingDayDetailDeffCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MWorkingDayDetailDeffCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MWorkingDayDetailDeffCB.class.getName(); }
    protected String xinCQ() { return MWorkingDayDetailDeffCQ.class.getName(); }
}
