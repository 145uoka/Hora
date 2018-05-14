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
 * The condition-query for in-line of t_reservation.
 * @author DBFlute(AutoGenerator)
 */
public class TReservationCIQ extends AbstractBsTReservationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTReservationCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TReservationCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTReservationCQ myCQ) {
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
    protected ConditionValue xgetCValueReservationId() { return _myCQ.xdfgetReservationId(); }
    protected ConditionValue xgetCValueShopId() { return _myCQ.xdfgetShopId(); }
    protected ConditionValue xgetCValueStaffId() { return _myCQ.xdfgetStaffId(); }
    protected ConditionValue xgetCValueHistStaffFamilyName() { return _myCQ.xdfgetHistStaffFamilyName(); }
    protected ConditionValue xgetCValueHistShopName() { return _myCQ.xdfgetHistShopName(); }
    protected ConditionValue xgetCValueHistShopAbbreviatedName() { return _myCQ.xdfgetHistShopAbbreviatedName(); }
    protected ConditionValue xgetCValueHistStaffGivenName() { return _myCQ.xdfgetHistStaffGivenName(); }
    protected ConditionValue xgetCValueReservationDate() { return _myCQ.xdfgetReservationDate(); }
    protected ConditionValue xgetCValueReservationTime() { return _myCQ.xdfgetReservationTime(); }
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    protected ConditionValue xgetCValueTotalAmount() { return _myCQ.xdfgetTotalAmount(); }
    protected ConditionValue xgetCValueRemarks() { return _myCQ.xdfgetRemarks(); }
    protected ConditionValue xgetCValueStatus() { return _myCQ.xdfgetStatus(); }
    protected ConditionValue xgetCValueDeleteFlag() { return _myCQ.xdfgetDeleteFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(TReservationCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TReservationCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TReservationCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TReservationCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TReservationCB.class.getName(); }
    protected String xinCQ() { return TReservationCQ.class.getName(); }
}
