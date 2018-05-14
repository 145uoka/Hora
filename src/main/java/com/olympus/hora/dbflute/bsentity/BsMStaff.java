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
 * The entity of m_staff as TABLE. <br>
 * <pre>
 * [primary-key]
 *     staff_id
 *
 * [column]
 *     staff_id, family_name, given_name, phone1_1, phone1_2, phone1_3, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_staff_staff_id_seq
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
 * Integer staffId = entity.getStaffId();
 * String familyName = entity.getFamilyName();
 * String givenName = entity.getGivenName();
 * String phone11 = entity.getPhone11();
 * String phone12 = entity.getPhone12();
 * String phone13 = entity.getPhone13();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setStaffId(staffId);
 * entity.setFamilyName(familyName);
 * entity.setGivenName(givenName);
 * entity.setPhone11(phone11);
 * entity.setPhone12(phone12);
 * entity.setPhone13(phone13);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMStaff extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** staff_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _staffId;

    /** family_name: {text(2147483647)} */
    protected String _familyName;

    /** given_name: {text(2147483647)} */
    protected String _givenName;

    /** phone1_1: {text(2147483647)} */
    protected String _phone11;

    /** phone1_2: {text(2147483647)} */
    protected String _phone12;

    /** phone1_3: {text(2147483647)} */
    protected String _phone13;

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
        return "m_staff";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_staffId == null) { return false; }
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
        if (obj instanceof BsMStaff) {
            BsMStaff other = (BsMStaff)obj;
            if (!xSV(_staffId, other._staffId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _staffId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_staffId));
        sb.append(dm).append(xfND(_familyName));
        sb.append(dm).append(xfND(_givenName));
        sb.append(dm).append(xfND(_phone11));
        sb.append(dm).append(xfND(_phone12));
        sb.append(dm).append(xfND(_phone13));
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
    public MStaff clone() {
        return (MStaff)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] staff_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'staff_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getStaffId() {
        checkSpecifiedProperty("staffId");
        return _staffId;
    }

    /**
     * [set] staff_id: {PK, ID, NotNull, serial(10)} <br>
     * @param staffId The value of the column 'staff_id'. (basically NotNull if update: for the constraint)
     */
    public void setStaffId(Integer staffId) {
        registerModifiedProperty("staffId");
        _staffId = staffId;
    }

    /**
     * [get] family_name: {text(2147483647)} <br>
     * @return The value of the column 'family_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getFamilyName() {
        checkSpecifiedProperty("familyName");
        return _familyName;
    }

    /**
     * [set] family_name: {text(2147483647)} <br>
     * @param familyName The value of the column 'family_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFamilyName(String familyName) {
        registerModifiedProperty("familyName");
        _familyName = familyName;
    }

    /**
     * [get] given_name: {text(2147483647)} <br>
     * @return The value of the column 'given_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getGivenName() {
        checkSpecifiedProperty("givenName");
        return _givenName;
    }

    /**
     * [set] given_name: {text(2147483647)} <br>
     * @param givenName The value of the column 'given_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGivenName(String givenName) {
        registerModifiedProperty("givenName");
        _givenName = givenName;
    }

    /**
     * [get] phone1_1: {text(2147483647)} <br>
     * @return The value of the column 'phone1_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone11() {
        checkSpecifiedProperty("phone11");
        return _phone11;
    }

    /**
     * [set] phone1_1: {text(2147483647)} <br>
     * @param phone11 The value of the column 'phone1_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone11(String phone11) {
        registerModifiedProperty("phone11");
        _phone11 = phone11;
    }

    /**
     * [get] phone1_2: {text(2147483647)} <br>
     * @return The value of the column 'phone1_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone12() {
        checkSpecifiedProperty("phone12");
        return _phone12;
    }

    /**
     * [set] phone1_2: {text(2147483647)} <br>
     * @param phone12 The value of the column 'phone1_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone12(String phone12) {
        registerModifiedProperty("phone12");
        _phone12 = phone12;
    }

    /**
     * [get] phone1_3: {text(2147483647)} <br>
     * @return The value of the column 'phone1_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone13() {
        checkSpecifiedProperty("phone13");
        return _phone13;
    }

    /**
     * [set] phone1_3: {text(2147483647)} <br>
     * @param phone13 The value of the column 'phone1_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone13(String phone13) {
        registerModifiedProperty("phone13");
        _phone13 = phone13;
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
