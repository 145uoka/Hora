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
 * The entity of m_holiday as TABLE. <br>
 * <pre>
 * [primary-key]
 *     holiday_id
 *
 * [column]
 *     holiday_id, holiday_name, holiday, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_holiday_holiday_id_seq
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
 * Integer holidayId = entity.getHolidayId();
 * String holidayName = entity.getHolidayName();
 * java.time.LocalDate holiday = entity.getHoliday();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setHolidayId(holidayId);
 * entity.setHolidayName(holidayName);
 * entity.setHoliday(holiday);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMHoliday extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** holiday_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _holidayId;

    /** holiday_name: {text(2147483647)} */
    protected String _holidayName;

    /** holiday: {date(13)} */
    protected java.time.LocalDate _holiday;

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
        return "m_holiday";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_holidayId == null) { return false; }
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
        if (obj instanceof BsMHoliday) {
            BsMHoliday other = (BsMHoliday)obj;
            if (!xSV(_holidayId, other._holidayId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _holidayId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_holidayId));
        sb.append(dm).append(xfND(_holidayName));
        sb.append(dm).append(xfND(_holiday));
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
    public MHoliday clone() {
        return (MHoliday)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] holiday_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'holiday_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getHolidayId() {
        checkSpecifiedProperty("holidayId");
        return _holidayId;
    }

    /**
     * [set] holiday_id: {PK, ID, NotNull, serial(10)} <br>
     * @param holidayId The value of the column 'holiday_id'. (basically NotNull if update: for the constraint)
     */
    public void setHolidayId(Integer holidayId) {
        registerModifiedProperty("holidayId");
        _holidayId = holidayId;
    }

    /**
     * [get] holiday_name: {text(2147483647)} <br>
     * @return The value of the column 'holiday_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getHolidayName() {
        checkSpecifiedProperty("holidayName");
        return _holidayName;
    }

    /**
     * [set] holiday_name: {text(2147483647)} <br>
     * @param holidayName The value of the column 'holiday_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHolidayName(String holidayName) {
        registerModifiedProperty("holidayName");
        _holidayName = holidayName;
    }

    /**
     * [get] holiday: {date(13)} <br>
     * @return The value of the column 'holiday'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getHoliday() {
        checkSpecifiedProperty("holiday");
        return _holiday;
    }

    /**
     * [set] holiday: {date(13)} <br>
     * @param holiday The value of the column 'holiday'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHoliday(java.time.LocalDate holiday) {
        registerModifiedProperty("holiday");
        _holiday = holiday;
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
