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
 * The DB meta of m_code. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCodeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCodeDbm _instance = new MCodeDbm();
    private MCodeDbm() {}
    public static MCodeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCode)et).getCodeId(), (et, vl) -> ((MCode)et).setCodeId(cti(vl)), "codeId");
        setupEpg(_epgMap, et -> ((MCode)et).getGroupCode(), (et, vl) -> ((MCode)et).setGroupCode(cti(vl)), "groupCode");
        setupEpg(_epgMap, et -> ((MCode)et).getCode1(), (et, vl) -> ((MCode)et).setCode1(cti(vl)), "code1");
        setupEpg(_epgMap, et -> ((MCode)et).getCode2(), (et, vl) -> ((MCode)et).setCode2(cti(vl)), "code2");
        setupEpg(_epgMap, et -> ((MCode)et).getName(), (et, vl) -> ((MCode)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((MCode)et).getDeleteFlag(), (et, vl) -> ((MCode)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MCode)et).getRegisterDatetime(), (et, vl) -> ((MCode)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MCode)et).getUpdateDatetime(), (et, vl) -> ((MCode)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_code";
    protected final String _tableDispName = "m_code";
    protected final String _tablePropertyName = "MCode";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_code", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCodeId = cci("code_id", "code_id", null, null, Integer.class, "codeId", null, true, true, true, "serial", 10, 0, null, "nextval('m_code_code_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGroupCode = cci("group_code", "group_code", null, null, Integer.class, "groupCode", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCode1 = cci("code1", "code1", null, null, Integer.class, "code1", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCode2 = cci("code2", "code2", null, null, Integer.class, "code2", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * code_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodeId() { return _columnCodeId; }
    /**
     * group_code: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGroupCode() { return _columnGroupCode; }
    /**
     * code1: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCode1() { return _columnCode1; }
    /**
     * code2: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCode2() { return _columnCode2; }
    /**
     * name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
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
        ls.add(columnCodeId());
        ls.add(columnGroupCode());
        ls.add(columnCode1());
        ls.add(columnCode2());
        ls.add(columnName());
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
    protected UniqueInfo cpui() { return hpcpui(columnCodeId()); }
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
    public String getSequenceName() { return "m_code_code_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MCode"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MCodeCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MCodeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCode> getEntityType() { return MCode.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCode newEntity() { return new MCode(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCode)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCode)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
