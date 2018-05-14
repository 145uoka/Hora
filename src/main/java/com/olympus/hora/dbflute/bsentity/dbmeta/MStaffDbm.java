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
 * The DB meta of m_staff. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MStaffDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MStaffDbm _instance = new MStaffDbm();
    private MStaffDbm() {}
    public static MStaffDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MStaff)et).getStaffId(), (et, vl) -> ((MStaff)et).setStaffId(cti(vl)), "staffId");
        setupEpg(_epgMap, et -> ((MStaff)et).getFamilyName(), (et, vl) -> ((MStaff)et).setFamilyName((String)vl), "familyName");
        setupEpg(_epgMap, et -> ((MStaff)et).getGivenName(), (et, vl) -> ((MStaff)et).setGivenName((String)vl), "givenName");
        setupEpg(_epgMap, et -> ((MStaff)et).getPhone11(), (et, vl) -> ((MStaff)et).setPhone11((String)vl), "phone11");
        setupEpg(_epgMap, et -> ((MStaff)et).getPhone12(), (et, vl) -> ((MStaff)et).setPhone12((String)vl), "phone12");
        setupEpg(_epgMap, et -> ((MStaff)et).getPhone13(), (et, vl) -> ((MStaff)et).setPhone13((String)vl), "phone13");
        setupEpg(_epgMap, et -> ((MStaff)et).getDeleteFlag(), (et, vl) -> ((MStaff)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MStaff)et).getRegisterDatetime(), (et, vl) -> ((MStaff)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MStaff)et).getUpdateDatetime(), (et, vl) -> ((MStaff)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_staff";
    protected final String _tableDispName = "m_staff";
    protected final String _tablePropertyName = "MStaff";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_staff", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStaffId = cci("staff_id", "staff_id", null, null, Integer.class, "staffId", null, true, true, true, "serial", 10, 0, null, "nextval('m_staff_staff_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFamilyName = cci("family_name", "family_name", null, null, String.class, "familyName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGivenName = cci("given_name", "given_name", null, null, String.class, "givenName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone11 = cci("phone1_1", "phone1_1", null, null, String.class, "phone11", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone12 = cci("phone1_2", "phone1_2", null, null, String.class, "phone12", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone13 = cci("phone1_3", "phone1_3", null, null, String.class, "phone13", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * staff_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStaffId() { return _columnStaffId; }
    /**
     * family_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFamilyName() { return _columnFamilyName; }
    /**
     * given_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGivenName() { return _columnGivenName; }
    /**
     * phone1_1: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone11() { return _columnPhone11; }
    /**
     * phone1_2: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone12() { return _columnPhone12; }
    /**
     * phone1_3: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone13() { return _columnPhone13; }
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
        ls.add(columnStaffId());
        ls.add(columnFamilyName());
        ls.add(columnGivenName());
        ls.add(columnPhone11());
        ls.add(columnPhone12());
        ls.add(columnPhone13());
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
    protected UniqueInfo cpui() { return hpcpui(columnStaffId()); }
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
    public String getSequenceName() { return "m_staff_staff_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MStaff"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MStaffCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MStaffBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MStaff> getEntityType() { return MStaff.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MStaff newEntity() { return new MStaff(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MStaff)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MStaff)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
