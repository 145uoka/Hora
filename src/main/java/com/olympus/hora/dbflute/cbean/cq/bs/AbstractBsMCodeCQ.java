package com.olympus.hora.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.olympus.hora.dbflute.allcommon.*;
import com.olympus.hora.dbflute.cbean.*;
import com.olympus.hora.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of m_code.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCodeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCodeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "m_code";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_Equal(Integer codeId) {
        doSetCodeId_Equal(codeId);
    }

    protected void doSetCodeId_Equal(Integer codeId) {
        regCodeId(CK_EQ, codeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_NotEqual(Integer codeId) {
        doSetCodeId_NotEqual(codeId);
    }

    protected void doSetCodeId_NotEqual(Integer codeId) {
        regCodeId(CK_NES, codeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_GreaterThan(Integer codeId) {
        regCodeId(CK_GT, codeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_LessThan(Integer codeId) {
        regCodeId(CK_LT, codeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_GreaterEqual(Integer codeId) {
        regCodeId(CK_GE, codeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_LessEqual(Integer codeId) {
        regCodeId(CK_LE, codeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of codeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of codeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCodeId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCodeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of codeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of codeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCodeId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCodeId(), "code_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeIdList The collection of codeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeId_InScope(Collection<Integer> codeIdList) {
        doSetCodeId_InScope(codeIdList);
    }

    protected void doSetCodeId_InScope(Collection<Integer> codeIdList) {
        regINS(CK_INS, cTL(codeIdList), xgetCValueCodeId(), "code_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeIdList The collection of codeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeId_NotInScope(Collection<Integer> codeIdList) {
        doSetCodeId_NotInScope(codeIdList);
    }

    protected void doSetCodeId_NotInScope(Collection<Integer> codeIdList) {
        regINS(CK_NINS, cTL(codeIdList), xgetCValueCodeId(), "code_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     */
    public void setCodeId_IsNull() { regCodeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     */
    public void setCodeId_IsNotNull() { regCodeId(CK_ISNN, DOBJ); }

    protected void regCodeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodeId(), "code_id"); }
    protected abstract ConditionValue xgetCValueCodeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     * @param groupCode The value of groupCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGroupCode_Equal(Integer groupCode) {
        doSetGroupCode_Equal(groupCode);
    }

    protected void doSetGroupCode_Equal(Integer groupCode) {
        regGroupCode(CK_EQ, groupCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     * @param groupCode The value of groupCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGroupCode_NotEqual(Integer groupCode) {
        doSetGroupCode_NotEqual(groupCode);
    }

    protected void doSetGroupCode_NotEqual(Integer groupCode) {
        regGroupCode(CK_NES, groupCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     * @param groupCode The value of groupCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGroupCode_GreaterThan(Integer groupCode) {
        regGroupCode(CK_GT, groupCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     * @param groupCode The value of groupCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGroupCode_LessThan(Integer groupCode) {
        regGroupCode(CK_LT, groupCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     * @param groupCode The value of groupCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGroupCode_GreaterEqual(Integer groupCode) {
        regGroupCode(CK_GE, groupCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     * @param groupCode The value of groupCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGroupCode_LessEqual(Integer groupCode) {
        regGroupCode(CK_LE, groupCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     * @param minNumber The min number of groupCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of groupCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGroupCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGroupCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     * @param minNumber The min number of groupCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of groupCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGroupCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGroupCode(), "group_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * group_code: {int4(10)}
     * @param groupCodeList The collection of groupCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupCode_InScope(Collection<Integer> groupCodeList) {
        doSetGroupCode_InScope(groupCodeList);
    }

    protected void doSetGroupCode_InScope(Collection<Integer> groupCodeList) {
        regINS(CK_INS, cTL(groupCodeList), xgetCValueGroupCode(), "group_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * group_code: {int4(10)}
     * @param groupCodeList The collection of groupCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGroupCode_NotInScope(Collection<Integer> groupCodeList) {
        doSetGroupCode_NotInScope(groupCodeList);
    }

    protected void doSetGroupCode_NotInScope(Collection<Integer> groupCodeList) {
        regINS(CK_NINS, cTL(groupCodeList), xgetCValueGroupCode(), "group_code");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     */
    public void setGroupCode_IsNull() { regGroupCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * group_code: {int4(10)}
     */
    public void setGroupCode_IsNotNull() { regGroupCode(CK_ISNN, DOBJ); }

    protected void regGroupCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGroupCode(), "group_code"); }
    protected abstract ConditionValue xgetCValueGroupCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     * @param code1 The value of code1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode1_Equal(Integer code1) {
        doSetCode1_Equal(code1);
    }

    protected void doSetCode1_Equal(Integer code1) {
        regCode1(CK_EQ, code1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     * @param code1 The value of code1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode1_NotEqual(Integer code1) {
        doSetCode1_NotEqual(code1);
    }

    protected void doSetCode1_NotEqual(Integer code1) {
        regCode1(CK_NES, code1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     * @param code1 The value of code1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode1_GreaterThan(Integer code1) {
        regCode1(CK_GT, code1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     * @param code1 The value of code1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode1_LessThan(Integer code1) {
        regCode1(CK_LT, code1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     * @param code1 The value of code1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode1_GreaterEqual(Integer code1) {
        regCode1(CK_GE, code1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     * @param code1 The value of code1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode1_LessEqual(Integer code1) {
        regCode1(CK_LE, code1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     * @param minNumber The min number of code1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of code1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCode1_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCode1_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     * @param minNumber The min number of code1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of code1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCode1_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCode1(), "code1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * code1: {int4(10)}
     * @param code1List The collection of code1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode1_InScope(Collection<Integer> code1List) {
        doSetCode1_InScope(code1List);
    }

    protected void doSetCode1_InScope(Collection<Integer> code1List) {
        regINS(CK_INS, cTL(code1List), xgetCValueCode1(), "code1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * code1: {int4(10)}
     * @param code1List The collection of code1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode1_NotInScope(Collection<Integer> code1List) {
        doSetCode1_NotInScope(code1List);
    }

    protected void doSetCode1_NotInScope(Collection<Integer> code1List) {
        regINS(CK_NINS, cTL(code1List), xgetCValueCode1(), "code1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     */
    public void setCode1_IsNull() { regCode1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * code1: {int4(10)}
     */
    public void setCode1_IsNotNull() { regCode1(CK_ISNN, DOBJ); }

    protected void regCode1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCode1(), "code1"); }
    protected abstract ConditionValue xgetCValueCode1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     * @param code2 The value of code2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode2_Equal(Integer code2) {
        doSetCode2_Equal(code2);
    }

    protected void doSetCode2_Equal(Integer code2) {
        regCode2(CK_EQ, code2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     * @param code2 The value of code2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode2_NotEqual(Integer code2) {
        doSetCode2_NotEqual(code2);
    }

    protected void doSetCode2_NotEqual(Integer code2) {
        regCode2(CK_NES, code2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     * @param code2 The value of code2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode2_GreaterThan(Integer code2) {
        regCode2(CK_GT, code2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     * @param code2 The value of code2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode2_LessThan(Integer code2) {
        regCode2(CK_LT, code2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     * @param code2 The value of code2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode2_GreaterEqual(Integer code2) {
        regCode2(CK_GE, code2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     * @param code2 The value of code2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCode2_LessEqual(Integer code2) {
        regCode2(CK_LE, code2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     * @param minNumber The min number of code2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of code2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCode2_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCode2_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     * @param minNumber The min number of code2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of code2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCode2_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCode2(), "code2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * code2: {int4(10)}
     * @param code2List The collection of code2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode2_InScope(Collection<Integer> code2List) {
        doSetCode2_InScope(code2List);
    }

    protected void doSetCode2_InScope(Collection<Integer> code2List) {
        regINS(CK_INS, cTL(code2List), xgetCValueCode2(), "code2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * code2: {int4(10)}
     * @param code2List The collection of code2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCode2_NotInScope(Collection<Integer> code2List) {
        doSetCode2_NotInScope(code2List);
    }

    protected void doSetCode2_NotInScope(Collection<Integer> code2List) {
        regINS(CK_NINS, cTL(code2List), xgetCValueCode2(), "code2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     */
    public void setCode2_IsNull() { regCode2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * code2: {int4(10)}
     */
    public void setCode2_IsNotNull() { regCode2(CK_ISNN, DOBJ); }

    protected void regCode2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCode2(), "code2"); }
    protected abstract ConditionValue xgetCValueCode2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)}
     * @param nameList The collection of name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)}
     * @param nameList The collection of name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     */
    public void setName_IsNull() { regName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     */
    public void setName_IsNullOrEmpty() { regName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DOBJ); }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "name"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @param deleteFlag The value of deleteFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeleteFlag_Equal(Boolean deleteFlag) {
        regDeleteFlag(CK_EQ, deleteFlag);
    }

    protected void regDeleteFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeleteFlag(), "delete_flag"); }
    protected abstract ConditionValue xgetCValueDeleteFlag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNotNull() { regUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCodeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCodeCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCodeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCodeCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCodeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCodeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCodeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCodeCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCodeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCodeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCodeCB&gt;() {
     *     public void query(MCodeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCodeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCodeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCodeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCodeCQ sq);

    protected MCodeCB xcreateScalarConditionCB() {
        MCodeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCodeCB xcreateScalarConditionPartitionByCB() {
        MCodeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCodeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCodeCB cb = new MCodeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "code_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCodeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCodeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCodeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCodeCB cb = new MCodeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "code_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCodeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCodeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCodeCB cb = new MCodeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCodeCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MCodeCB newMyCB() {
        return new MCodeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCodeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
