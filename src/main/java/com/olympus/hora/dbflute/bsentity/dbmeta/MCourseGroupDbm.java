package com.olympus.hora.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.olympus.hora.dbflute.allcommon.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The DB meta of m_course_group. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCourseGroupDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCourseGroupDbm _instance = new MCourseGroupDbm();
    private MCourseGroupDbm() {}
    public static MCourseGroupDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCourseGroup)et).getCourseGroupId(), (et, vl) -> ((MCourseGroup)et).setCourseGroupId(cti(vl)), "courseGroupId");
        setupEpg(_epgMap, et -> ((MCourseGroup)et).getShopId(), (et, vl) -> ((MCourseGroup)et).setShopId(cti(vl)), "shopId");
        setupEpg(_epgMap, et -> ((MCourseGroup)et).getGroupName(), (et, vl) -> ((MCourseGroup)et).setGroupName((String)vl), "groupName");
        setupEpg(_epgMap, et -> ((MCourseGroup)et).getRequiredFlg(), (et, vl) -> ((MCourseGroup)et).setRequiredFlg(cti(vl)), "requiredFlg");
        setupEpg(_epgMap, et -> ((MCourseGroup)et).getReamarks(), (et, vl) -> ((MCourseGroup)et).setReamarks((String)vl), "reamarks");
        setupEpg(_epgMap, et -> ((MCourseGroup)et).getDeleteFlag(), (et, vl) -> ((MCourseGroup)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MCourseGroup)et).getRegisterDatetime(), (et, vl) -> ((MCourseGroup)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MCourseGroup)et).getUpdateDatetime(), (et, vl) -> ((MCourseGroup)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCourseGroup)et).getMShop(), (et, vl) -> ((MCourseGroup)et).setMShop((OptionalEntity<MShop>)vl), "MShop");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_course_group";
    protected final String _tableDispName = "m_course_group";
    protected final String _tablePropertyName = "MCourseGroup";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_course_group", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCourseGroupId = cci("course_group_id", "course_group_id", null, null, Integer.class, "courseGroupId", null, true, true, true, "serial", 10, 0, null, "nextval('m_course_group_course_group_id_seq'::regclass)", false, null, null, null, "MCourseList", null, false);
    protected final ColumnInfo _columnShopId = cci("shop_id", "shop_id", null, null, Integer.class, "shopId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, "MShop", null, null, false);
    protected final ColumnInfo _columnGroupName = cci("group_name", "group_name", null, null, String.class, "groupName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRequiredFlg = cci("required_flg", "required_flg", null, null, Integer.class, "requiredFlg", null, false, false, false, "int2", 5, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReamarks = cci("reamarks", "reamarks", null, null, String.class, "reamarks", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * course_group_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourseGroupId() { return _columnCourseGroupId; }
    /**
     * shop_id: {int4(10), FK to m_shop}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopId() { return _columnShopId; }
    /**
     * group_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGroupName() { return _columnGroupName; }
    /**
     * required_flg: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRequiredFlg() { return _columnRequiredFlg; }
    /**
     * reamarks: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReamarks() { return _columnReamarks; }
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
        ls.add(columnCourseGroupId());
        ls.add(columnShopId());
        ls.add(columnGroupName());
        ls.add(columnRequiredFlg());
        ls.add(columnReamarks());
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
    protected UniqueInfo cpui() { return hpcpui(columnCourseGroupId()); }
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
    /**
     * m_shop by my shop_id, named 'MShop'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShop() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShopId(), MShopDbm.getInstance().columnShopId());
        return cfi("idx_m_course_group_fk0", "MShop", this, MShopDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "MCourseGroupList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * m_course by course_group_id, named 'MCourseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCourseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCourseGroupId(), MCourseDbm.getInstance().columnCourseGroupId());
        return cri("idx_m_course_fk0", "MCourseList", this, MCourseDbm.getInstance(), mp, false, "MCourseGroup");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "m_course_group_course_group_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MCourseGroup"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MCourseGroupCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MCourseGroupBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCourseGroup> getEntityType() { return MCourseGroup.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCourseGroup newEntity() { return new MCourseGroup(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCourseGroup)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCourseGroup)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
