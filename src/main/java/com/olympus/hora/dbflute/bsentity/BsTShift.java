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
 * The entity of t_shift as TABLE. <br>
 * <pre>
 * [primary-key]
 *     shift_id
 *
 * [column]
 *     shift_id, working_day_id, staff_id, start_time, end_time, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     t_shift_shift_id_seq
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
 * Integer shiftId = entity.getShiftId();
 * Integer workingDayId = entity.getWorkingDayId();
 * Integer staffId = entity.getStaffId();
 * java.time.LocalTime startTime = entity.getStartTime();
 * java.time.LocalTime endTime = entity.getEndTime();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setShiftId(shiftId);
 * entity.setWorkingDayId(workingDayId);
 * entity.setStaffId(staffId);
 * entity.setStartTime(startTime);
 * entity.setEndTime(endTime);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShift extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** shift_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _shiftId;

    /** working_day_id: {int4(10)} */
    protected Integer _workingDayId;

    /** staff_id: {int4(10)} */
    protected Integer _staffId;

    /** start_time: {time(15, 6)} */
    protected java.time.LocalTime _startTime;

    /** end_time: {time(15, 6)} */
    protected java.time.LocalTime _endTime;

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
        return "t_shift";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_shiftId == null) { return false; }
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
        if (obj instanceof BsTShift) {
            BsTShift other = (BsTShift)obj;
            if (!xSV(_shiftId, other._shiftId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shiftId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shiftId));
        sb.append(dm).append(xfND(_workingDayId));
        sb.append(dm).append(xfND(_staffId));
        sb.append(dm).append(xfND(_startTime));
        sb.append(dm).append(xfND(_endTime));
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
    public TShift clone() {
        return (TShift)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] shift_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'shift_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getShiftId() {
        checkSpecifiedProperty("shiftId");
        return _shiftId;
    }

    /**
     * [set] shift_id: {PK, ID, NotNull, serial(10)} <br>
     * @param shiftId The value of the column 'shift_id'. (basically NotNull if update: for the constraint)
     */
    public void setShiftId(Integer shiftId) {
        registerModifiedProperty("shiftId");
        _shiftId = shiftId;
    }

    /**
     * [get] working_day_id: {int4(10)} <br>
     * @return The value of the column 'working_day_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getWorkingDayId() {
        checkSpecifiedProperty("workingDayId");
        return _workingDayId;
    }

    /**
     * [set] working_day_id: {int4(10)} <br>
     * @param workingDayId The value of the column 'working_day_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkingDayId(Integer workingDayId) {
        registerModifiedProperty("workingDayId");
        _workingDayId = workingDayId;
    }

    /**
     * [get] staff_id: {int4(10)} <br>
     * @return The value of the column 'staff_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getStaffId() {
        checkSpecifiedProperty("staffId");
        return _staffId;
    }

    /**
     * [set] staff_id: {int4(10)} <br>
     * @param staffId The value of the column 'staff_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStaffId(Integer staffId) {
        registerModifiedProperty("staffId");
        _staffId = staffId;
    }

    /**
     * [get] start_time: {time(15, 6)} <br>
     * @return The value of the column 'start_time'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getStartTime() {
        checkSpecifiedProperty("startTime");
        return _startTime;
    }

    /**
     * [set] start_time: {time(15, 6)} <br>
     * @param startTime The value of the column 'start_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStartTime(java.time.LocalTime startTime) {
        registerModifiedProperty("startTime");
        _startTime = startTime;
    }

    /**
     * [get] end_time: {time(15, 6)} <br>
     * @return The value of the column 'end_time'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getEndTime() {
        checkSpecifiedProperty("endTime");
        return _endTime;
    }

    /**
     * [set] end_time: {time(15, 6)} <br>
     * @param endTime The value of the column 'end_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEndTime(java.time.LocalTime endTime) {
        registerModifiedProperty("endTime");
        _endTime = endTime;
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
