package com.olympus.hora.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.olympus.hora.dbflute.allcommon.EntityDefinedCommonColumn;
import com.olympus.hora.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The entity of m_code as TABLE. <br>
 * <pre>
 * [primary-key]
 *     code_id
 *
 * [column]
 *     code_id, group_code, code1, code2, name, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_code_code_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer codeId = entity.getCodeId();
 * Integer groupCode = entity.getGroupCode();
 * Integer code1 = entity.getCode1();
 * Integer code2 = entity.getCode2();
 * String name = entity.getName();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setCodeId(codeId);
 * entity.setGroupCode(groupCode);
 * entity.setCode1(code1);
 * entity.setCode2(code2);
 * entity.setName(name);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCode extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** code_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _codeId;

    /** group_code: {int4(10)} */
    protected Integer _groupCode;

    /** code1: {int4(10)} */
    protected Integer _code1;

    /** code2: {int4(10)} */
    protected Integer _code2;

    /** name: {text(2147483647)} */
    protected String _name;

    /** delete_flag: {NotNull, bool(1), default=[false]} */
    protected Boolean _deleteFlag;

    /** register_datetime: {NotNull, timestamp(26, 3), default=[now()]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** update_datetime: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "m_code";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_codeId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCode) {
            BsMCode other = (BsMCode)obj;
            if (!xSV(_codeId, other._codeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _codeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_codeId));
        sb.append(dm).append(xfND(_groupCode));
        sb.append(dm).append(xfND(_code1));
        sb.append(dm).append(xfND(_code2));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_deleteFlag));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public MCode clone() {
        return (MCode)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] code_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'code_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCodeId() {
        checkSpecifiedProperty("codeId");
        return _codeId;
    }

    /**
     * [set] code_id: {PK, ID, NotNull, serial(10)} <br>
     * @param codeId The value of the column 'code_id'. (basically NotNull if update: for the constraint)
     */
    public void setCodeId(Integer codeId) {
        registerModifiedProperty("codeId");
        _codeId = codeId;
    }

    /**
     * [get] group_code: {int4(10)} <br>
     * @return The value of the column 'group_code'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getGroupCode() {
        checkSpecifiedProperty("groupCode");
        return _groupCode;
    }

    /**
     * [set] group_code: {int4(10)} <br>
     * @param groupCode The value of the column 'group_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGroupCode(Integer groupCode) {
        registerModifiedProperty("groupCode");
        _groupCode = groupCode;
    }

    /**
     * [get] code1: {int4(10)} <br>
     * @return The value of the column 'code1'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCode1() {
        checkSpecifiedProperty("code1");
        return _code1;
    }

    /**
     * [set] code1: {int4(10)} <br>
     * @param code1 The value of the column 'code1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCode1(Integer code1) {
        registerModifiedProperty("code1");
        _code1 = code1;
    }

    /**
     * [get] code2: {int4(10)} <br>
     * @return The value of the column 'code2'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCode2() {
        checkSpecifiedProperty("code2");
        return _code2;
    }

    /**
     * [set] code2: {int4(10)} <br>
     * @param code2 The value of the column 'code2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCode2(Integer code2) {
        registerModifiedProperty("code2");
        _code2 = code2;
    }

    /**
     * [get] name: {text(2147483647)} <br>
     * @return The value of the column 'name'. (NullAllowed even if selected: for no constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {text(2147483647)} <br>
     * @param name The value of the column 'name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @return The value of the column 'delete_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDeleteFlag() {
        checkSpecifiedProperty("deleteFlag");
        return _deleteFlag;
    }

    /**
     * [set] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @param deleteFlag The value of the column 'delete_flag'. (basically NotNull if update: for the constraint)
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        registerModifiedProperty("deleteFlag");
        _deleteFlag = deleteFlag;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] update_datetime: {timestamp(26, 3)} <br>
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {timestamp(26, 3)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }
}
