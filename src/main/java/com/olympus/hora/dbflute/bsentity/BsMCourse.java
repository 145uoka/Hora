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
 * The entity of m_course as TABLE. <br>
 * <pre>
 * [primary-key]
 *     course_id
 *
 * [column]
 *     course_id, course_group_id, course_name, charge, required_time, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     
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
 * Integer courseId = entity.getCourseId();
 * Integer courseGroupId = entity.getCourseGroupId();
 * String courseName = entity.getCourseName();
 * Integer charge = entity.getCharge();
 * String requiredTime = entity.getRequiredTime();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setCourseId(courseId);
 * entity.setCourseGroupId(courseGroupId);
 * entity.setCourseName(courseName);
 * entity.setCharge(charge);
 * entity.setRequiredTime(requiredTime);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCourse extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** course_id: {PK, NotNull, int4(10)} */
    protected Integer _courseId;

    /** course_group_id: {int4(10)} */
    protected Integer _courseGroupId;

    /** course_name: {text(2147483647)} */
    protected String _courseName;

    /** charge: {int4(10)} */
    protected Integer _charge;

    /** required_time: {interval(49, 6)} */
    protected String _requiredTime;

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
        return "m_course";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_courseId == null) { return false; }
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
        if (obj instanceof BsMCourse) {
            BsMCourse other = (BsMCourse)obj;
            if (!xSV(_courseId, other._courseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _courseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_courseId));
        sb.append(dm).append(xfND(_courseGroupId));
        sb.append(dm).append(xfND(_courseName));
        sb.append(dm).append(xfND(_charge));
        sb.append(dm).append(xfND(_requiredTime));
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
    public MCourse clone() {
        return (MCourse)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] course_id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'course_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCourseId() {
        checkSpecifiedProperty("courseId");
        return _courseId;
    }

    /**
     * [set] course_id: {PK, NotNull, int4(10)} <br>
     * @param courseId The value of the column 'course_id'. (basically NotNull if update: for the constraint)
     */
    public void setCourseId(Integer courseId) {
        registerModifiedProperty("courseId");
        _courseId = courseId;
    }

    /**
     * [get] course_group_id: {int4(10)} <br>
     * @return The value of the column 'course_group_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCourseGroupId() {
        checkSpecifiedProperty("courseGroupId");
        return _courseGroupId;
    }

    /**
     * [set] course_group_id: {int4(10)} <br>
     * @param courseGroupId The value of the column 'course_group_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCourseGroupId(Integer courseGroupId) {
        registerModifiedProperty("courseGroupId");
        _courseGroupId = courseGroupId;
    }

    /**
     * [get] course_name: {text(2147483647)} <br>
     * @return The value of the column 'course_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getCourseName() {
        checkSpecifiedProperty("courseName");
        return _courseName;
    }

    /**
     * [set] course_name: {text(2147483647)} <br>
     * @param courseName The value of the column 'course_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCourseName(String courseName) {
        registerModifiedProperty("courseName");
        _courseName = courseName;
    }

    /**
     * [get] charge: {int4(10)} <br>
     * @return The value of the column 'charge'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCharge() {
        checkSpecifiedProperty("charge");
        return _charge;
    }

    /**
     * [set] charge: {int4(10)} <br>
     * @param charge The value of the column 'charge'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharge(Integer charge) {
        registerModifiedProperty("charge");
        _charge = charge;
    }

    /**
     * [get] required_time: {interval(49, 6)} <br>
     * @return The value of the column 'required_time'. (NullAllowed even if selected: for no constraint)
     */
    public String getRequiredTime() {
        checkSpecifiedProperty("requiredTime");
        return _requiredTime;
    }

    /**
     * [set] required_time: {interval(49, 6)} <br>
     * @param requiredTime The value of the column 'required_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRequiredTime(String requiredTime) {
        registerModifiedProperty("requiredTime");
        _requiredTime = requiredTime;
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
