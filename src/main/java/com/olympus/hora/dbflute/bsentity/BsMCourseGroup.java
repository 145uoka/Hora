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
 * The entity of m_course_group as TABLE. <br>
 * <pre>
 * [primary-key]
 *     course_group_id
 *
 * [column]
 *     course_group_id, shop_id, group_name, required_flg, reamarks, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_course_group_course_group_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_shop
 *
 * [referrer table]
 *     m_course
 *
 * [foreign property]
 *     mShop
 *
 * [referrer property]
 *     mCourseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer courseGroupId = entity.getCourseGroupId();
 * Integer shopId = entity.getShopId();
 * String groupName = entity.getGroupName();
 * Integer requiredFlg = entity.getRequiredFlg();
 * String reamarks = entity.getReamarks();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setCourseGroupId(courseGroupId);
 * entity.setShopId(shopId);
 * entity.setGroupName(groupName);
 * entity.setRequiredFlg(requiredFlg);
 * entity.setReamarks(reamarks);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCourseGroup extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** course_group_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _courseGroupId;

    /** shop_id: {int4(10), FK to m_shop} */
    protected Integer _shopId;

    /** group_name: {text(2147483647)} */
    protected String _groupName;

    /** required_flg: {int2(5)} */
    protected Integer _requiredFlg;

    /** reamarks: {text(2147483647)} */
    protected String _reamarks;

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
        return "m_course_group";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_courseGroupId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** m_shop by my shop_id, named 'MShop'. */
    protected OptionalEntity<MShop> _mShop;

    /**
     * [get] m_shop by my shop_id, named 'MShop'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'MShop'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MShop> getMShop() {
        if (_mShop == null) { _mShop = OptionalEntity.relationEmpty(this, "MShop"); }
        return _mShop;
    }

    /**
     * [set] m_shop by my shop_id, named 'MShop'.
     * @param mShop The entity of foreign property 'MShop'. (NullAllowed)
     */
    public void setMShop(OptionalEntity<MShop> mShop) {
        _mShop = mShop;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** m_course by course_group_id, named 'MCourseList'. */
    protected List<MCourse> _mCourseList;

    /**
     * [get] m_course by course_group_id, named 'MCourseList'.
     * @return The entity list of referrer property 'MCourseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCourse> getMCourseList() {
        if (_mCourseList == null) { _mCourseList = newReferrerList(); }
        return _mCourseList;
    }

    /**
     * [set] m_course by course_group_id, named 'MCourseList'.
     * @param mCourseList The entity list of referrer property 'MCourseList'. (NullAllowed)
     */
    public void setMCourseList(List<MCourse> mCourseList) {
        _mCourseList = mCourseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCourseGroup) {
            BsMCourseGroup other = (BsMCourseGroup)obj;
            if (!xSV(_courseGroupId, other._courseGroupId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _courseGroupId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mShop != null && _mShop.isPresent())
        { sb.append(li).append(xbRDS(_mShop, "mShop")); }
        if (_mCourseList != null) { for (MCourse et : _mCourseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCourseList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_courseGroupId));
        sb.append(dm).append(xfND(_shopId));
        sb.append(dm).append(xfND(_groupName));
        sb.append(dm).append(xfND(_requiredFlg));
        sb.append(dm).append(xfND(_reamarks));
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
        if (_mShop != null && _mShop.isPresent())
        { sb.append(dm).append("mShop"); }
        if (_mCourseList != null && !_mCourseList.isEmpty())
        { sb.append(dm).append("mCourseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCourseGroup clone() {
        return (MCourseGroup)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] course_group_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'course_group_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCourseGroupId() {
        checkSpecifiedProperty("courseGroupId");
        return _courseGroupId;
    }

    /**
     * [set] course_group_id: {PK, ID, NotNull, serial(10)} <br>
     * @param courseGroupId The value of the column 'course_group_id'. (basically NotNull if update: for the constraint)
     */
    public void setCourseGroupId(Integer courseGroupId) {
        registerModifiedProperty("courseGroupId");
        _courseGroupId = courseGroupId;
    }

    /**
     * [get] shop_id: {int4(10), FK to m_shop} <br>
     * @return The value of the column 'shop_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getShopId() {
        checkSpecifiedProperty("shopId");
        return _shopId;
    }

    /**
     * [set] shop_id: {int4(10), FK to m_shop} <br>
     * @param shopId The value of the column 'shop_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShopId(Integer shopId) {
        registerModifiedProperty("shopId");
        _shopId = shopId;
    }

    /**
     * [get] group_name: {text(2147483647)} <br>
     * @return The value of the column 'group_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getGroupName() {
        checkSpecifiedProperty("groupName");
        return _groupName;
    }

    /**
     * [set] group_name: {text(2147483647)} <br>
     * @param groupName The value of the column 'group_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGroupName(String groupName) {
        registerModifiedProperty("groupName");
        _groupName = groupName;
    }

    /**
     * [get] required_flg: {int2(5)} <br>
     * @return The value of the column 'required_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getRequiredFlg() {
        checkSpecifiedProperty("requiredFlg");
        return _requiredFlg;
    }

    /**
     * [set] required_flg: {int2(5)} <br>
     * @param requiredFlg The value of the column 'required_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRequiredFlg(Integer requiredFlg) {
        registerModifiedProperty("requiredFlg");
        _requiredFlg = requiredFlg;
    }

    /**
     * [get] reamarks: {text(2147483647)} <br>
     * @return The value of the column 'reamarks'. (NullAllowed even if selected: for no constraint)
     */
    public String getReamarks() {
        checkSpecifiedProperty("reamarks");
        return _reamarks;
    }

    /**
     * [set] reamarks: {text(2147483647)} <br>
     * @param reamarks The value of the column 'reamarks'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReamarks(String reamarks) {
        registerModifiedProperty("reamarks");
        _reamarks = reamarks;
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
