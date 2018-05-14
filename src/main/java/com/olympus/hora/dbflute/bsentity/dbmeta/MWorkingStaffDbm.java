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
 * The DB meta of m_working_staff. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MWorkingStaffDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MWorkingStaffDbm _instance = new MWorkingStaffDbm();
    private MWorkingStaffDbm() {}
    public static MWorkingStaffDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MWorkingStaff)et).getWorkingStaffId(), (et, vl) -> ((MWorkingStaff)et).setWorkingStaffId(cti(vl)), "workingStaffId");
        setupEpg(_epgMap, et -> ((MWorkingStaff)et).getShopId(), (et, vl) -> ((MWorkingStaff)et).setShopId(cti(vl)), "shopId");
        setupEpg(_epgMap, et -> ((MWorkingStaff)et).getStaffId(), (et, vl) -> ((MWorkingStaff)et).setStaffId(cti(vl)), "staffId");
        setupEpg(_epgMap, et -> ((MWorkingStaff)et).getDeleteFlag(), (et, vl) -> ((MWorkingStaff)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MWorkingStaff)et).getRegisterDatetime(), (et, vl) -> ((MWorkingStaff)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MWorkingStaff)et).getUpdateDatetime(), (et, vl) -> ((MWorkingStaff)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_working_staff";
    protected final String _tableDispName = "m_working_staff";
    protected final String _tablePropertyName = "MWorkingStaff";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_working_staff", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWorkingStaffId = cci("working_staff_id", "working_staff_id", null, null, Integer.class, "workingStaffId", null, true, true, true, "serial", 10, 0, null, "nextval('m_working_staff_working_staff_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShopId = cci("shop_id", "shop_id", null, null, Integer.class, "shopId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStaffId = cci("staff_id", "staff_id", null, null, Integer.class, "staffId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * working_staff_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkingStaffId() { return _columnWorkingStaffId; }
    /**
     * shop_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopId() { return _columnShopId; }
    /**
     * staff_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStaffId() { return _columnStaffId; }
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
        ls.add(columnWorkingStaffId());
        ls.add(columnShopId());
        ls.add(columnStaffId());
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
    protected UniqueInfo cpui() { return hpcpui(columnWorkingStaffId()); }
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
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "m_working_staff_working_staff_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MWorkingStaff"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MWorkingStaffCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MWorkingStaffBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MWorkingStaff> getEntityType() { return MWorkingStaff.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MWorkingStaff newEntity() { return new MWorkingStaff(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MWorkingStaff)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MWorkingStaff)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
