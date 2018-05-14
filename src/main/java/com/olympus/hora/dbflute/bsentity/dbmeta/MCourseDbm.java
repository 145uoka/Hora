package com.olympus.hora.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.olympus.hora.dbflute.allcommon.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The DB meta of m_course. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCourseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCourseDbm _instance = new MCourseDbm();
    private MCourseDbm() {}
    public static MCourseDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MCourse)et).getCourseId(), (et, vl) -> ((MCourse)et).setCourseId(cti(vl)), "courseId");
        setupEpg(_epgMap, et -> ((MCourse)et).getCourseGroupId(), (et, vl) -> ((MCourse)et).setCourseGroupId(cti(vl)), "courseGroupId");
        setupEpg(_epgMap, et -> ((MCourse)et).getCourseName(), (et, vl) -> ((MCourse)et).setCourseName((String)vl), "courseName");
        setupEpg(_epgMap, et -> ((MCourse)et).getCharge(), (et, vl) -> ((MCourse)et).setCharge(cti(vl)), "charge");
        setupEpg(_epgMap, et -> ((MCourse)et).getRequiredTime(), (et, vl) -> ((MCourse)et).setRequiredTime((String)vl), "requiredTime");
        setupEpg(_epgMap, et -> ((MCourse)et).getDeleteFlag(), (et, vl) -> ((MCourse)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MCourse)et).getRegisterDatetime(), (et, vl) -> ((MCourse)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MCourse)et).getUpdateDatetime(), (et, vl) -> ((MCourse)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_course";
    protected final String _tableDispName = "m_course";
    protected final String _tablePropertyName = "MCourse";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_course", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCourseId = cci("course_id", "course_id", null, null, Integer.class, "courseId", null, true, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCourseGroupId = cci("course_group_id", "course_group_id", null, null, Integer.class, "courseGroupId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCourseName = cci("course_name", "course_name", null, null, String.class, "courseName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharge = cci("charge", "charge", null, null, Integer.class, "charge", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRequiredTime = cci("required_time", "required_time", null, null, String.class, "requiredTime", null, false, false, false, "interval", 49, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * course_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourseId() { return _columnCourseId; }
    /**
     * course_group_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourseGroupId() { return _columnCourseGroupId; }
    /**
     * course_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourseName() { return _columnCourseName; }
    /**
     * charge: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharge() { return _columnCharge; }
    /**
     * required_time: {interval(49, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRequiredTime() { return _columnRequiredTime; }
    /**
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeleteFlag() { return _columnDeleteFlag; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * update_datetime: {timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCourseId());
        ls.add(columnCourseGroupId());
        ls.add(columnCourseName());
        ls.add(columnCharge());
        ls.add(columnRequiredTime());
        ls.add(columnDeleteFlag());
        ls.add(columnRegisterDatetime());
        ls.add(columnUpdateDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCourseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MCourse"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MCourseCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MCourseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCourse> getEntityType() { return MCourse.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCourse newEntity() { return new MCourse(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCourse)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCourse)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
