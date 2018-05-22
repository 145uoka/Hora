package com.olympus.hora.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.olympus.hora.dbflute.allcommon.EntityDefinedCommonColumn;
import com.olympus.hora.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The entity of t_reservation_detail as TABLE. <br>
 * <pre>
 * [primary-key]
 *     reservation_detail_id
 *
 * [column]
 *     reservation_detail_id, reservation_id, course_id, hist_course_name, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     t_reservation_detail_reservation_detail_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_course, t_reservation
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCourse, tReservation
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long reservationDetailId = entity.getReservationDetailId();
 * Long reservationId = entity.getReservationId();
 * Integer courseId = entity.getCourseId();
 * String histCourseName = entity.getHistCourseName();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setReservationDetailId(reservationDetailId);
 * entity.setReservationId(reservationId);
 * entity.setCourseId(courseId);
 * entity.setHistCourseName(histCourseName);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTReservationDetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** reservation_detail_id: {PK, ID, NotNull, bigserial(19)} */
    protected Long _reservationDetailId;

    /** reservation_id: {int8(19), FK to t_reservation} */
    protected Long _reservationId;

    /** course_id: {int4(10), FK to m_course} */
    protected Integer _courseId;

    /** hist_course_name: {text(2147483647)} */
    protected String _histCourseName;

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
        return "t_reservation_detail";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_reservationDetailId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** m_course by my course_id, named 'MCourse'. */
    protected OptionalEntity<MCourse> _mCourse;

    /**
     * [get] m_course by my course_id, named 'MCourse'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'MCourse'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MCourse> getMCourse() {
        if (_mCourse == null) { _mCourse = OptionalEntity.relationEmpty(this, "MCourse"); }
        return _mCourse;
    }

    /**
     * [set] m_course by my course_id, named 'MCourse'.
     * @param mCourse The entity of foreign property 'MCourse'. (NullAllowed)
     */
    public void setMCourse(OptionalEntity<MCourse> mCourse) {
        _mCourse = mCourse;
    }

    /** t_reservation by my reservation_id, named 'TReservation'. */
    protected OptionalEntity<TReservation> _tReservation;

    /**
     * [get] t_reservation by my reservation_id, named 'TReservation'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'TReservation'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<TReservation> getTReservation() {
        if (_tReservation == null) { _tReservation = OptionalEntity.relationEmpty(this, "TReservation"); }
        return _tReservation;
    }

    /**
     * [set] t_reservation by my reservation_id, named 'TReservation'.
     * @param tReservation The entity of foreign property 'TReservation'. (NullAllowed)
     */
    public void setTReservation(OptionalEntity<TReservation> tReservation) {
        _tReservation = tReservation;
    }

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
        if (obj instanceof BsTReservationDetail) {
            BsTReservationDetail other = (BsTReservationDetail)obj;
            if (!xSV(_reservationDetailId, other._reservationDetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _reservationDetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCourse != null && _mCourse.isPresent())
        { sb.append(li).append(xbRDS(_mCourse, "mCourse")); }
        if (_tReservation != null && _tReservation.isPresent())
        { sb.append(li).append(xbRDS(_tReservation, "tReservation")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_reservationDetailId));
        sb.append(dm).append(xfND(_reservationId));
        sb.append(dm).append(xfND(_courseId));
        sb.append(dm).append(xfND(_histCourseName));
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
        StringBuilder sb = new StringBuilder();
        if (_mCourse != null && _mCourse.isPresent())
        { sb.append(dm).append("mCourse"); }
        if (_tReservation != null && _tReservation.isPresent())
        { sb.append(dm).append("tReservation"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TReservationDetail clone() {
        return (TReservationDetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] reservation_detail_id: {PK, ID, NotNull, bigserial(19)} <br>
     * @return The value of the column 'reservation_detail_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getReservationDetailId() {
        checkSpecifiedProperty("reservationDetailId");
        return _reservationDetailId;
    }

    /**
     * [set] reservation_detail_id: {PK, ID, NotNull, bigserial(19)} <br>
     * @param reservationDetailId The value of the column 'reservation_detail_id'. (basically NotNull if update: for the constraint)
     */
    public void setReservationDetailId(Long reservationDetailId) {
        registerModifiedProperty("reservationDetailId");
        _reservationDetailId = reservationDetailId;
    }

    /**
     * [get] reservation_id: {int8(19), FK to t_reservation} <br>
     * @return The value of the column 'reservation_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReservationId() {
        checkSpecifiedProperty("reservationId");
        return _reservationId;
    }

    /**
     * [set] reservation_id: {int8(19), FK to t_reservation} <br>
     * @param reservationId The value of the column 'reservation_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReservationId(Long reservationId) {
        registerModifiedProperty("reservationId");
        _reservationId = reservationId;
    }

    /**
     * [get] course_id: {int4(10), FK to m_course} <br>
     * @return The value of the column 'course_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCourseId() {
        checkSpecifiedProperty("courseId");
        return _courseId;
    }

    /**
     * [set] course_id: {int4(10), FK to m_course} <br>
     * @param courseId The value of the column 'course_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCourseId(Integer courseId) {
        registerModifiedProperty("courseId");
        _courseId = courseId;
    }

    /**
     * [get] hist_course_name: {text(2147483647)} <br>
     * @return The value of the column 'hist_course_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getHistCourseName() {
        checkSpecifiedProperty("histCourseName");
        return _histCourseName;
    }

    /**
     * [set] hist_course_name: {text(2147483647)} <br>
     * @param histCourseName The value of the column 'hist_course_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHistCourseName(String histCourseName) {
        registerModifiedProperty("histCourseName");
        _histCourseName = histCourseName;
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
