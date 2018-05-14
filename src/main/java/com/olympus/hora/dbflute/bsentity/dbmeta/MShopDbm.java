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
 * The DB meta of m_shop. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MShopDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MShopDbm _instance = new MShopDbm();
    private MShopDbm() {}
    public static MShopDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MShop)et).getShopId(), (et, vl) -> ((MShop)et).setShopId(cti(vl)), "shopId");
        setupEpg(_epgMap, et -> ((MShop)et).getCompanyId(), (et, vl) -> ((MShop)et).setCompanyId(cti(vl)), "companyId");
        setupEpg(_epgMap, et -> ((MShop)et).getShopAbbreviatedName(), (et, vl) -> ((MShop)et).setShopAbbreviatedName((String)vl), "shopAbbreviatedName");
        setupEpg(_epgMap, et -> ((MShop)et).getShopName(), (et, vl) -> ((MShop)et).setShopName((String)vl), "shopName");
        setupEpg(_epgMap, et -> ((MShop)et).getPhone11(), (et, vl) -> ((MShop)et).setPhone11((String)vl), "phone11");
        setupEpg(_epgMap, et -> ((MShop)et).getPhone12(), (et, vl) -> ((MShop)et).setPhone12((String)vl), "phone12");
        setupEpg(_epgMap, et -> ((MShop)et).getPhone13(), (et, vl) -> ((MShop)et).setPhone13((String)vl), "phone13");
        setupEpg(_epgMap, et -> ((MShop)et).getPhone21(), (et, vl) -> ((MShop)et).setPhone21((String)vl), "phone21");
        setupEpg(_epgMap, et -> ((MShop)et).getPhone22(), (et, vl) -> ((MShop)et).setPhone22((String)vl), "phone22");
        setupEpg(_epgMap, et -> ((MShop)et).getPhone23(), (et, vl) -> ((MShop)et).setPhone23((String)vl), "phone23");
        setupEpg(_epgMap, et -> ((MShop)et).getFax1(), (et, vl) -> ((MShop)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((MShop)et).getFax2(), (et, vl) -> ((MShop)et).setFax2((String)vl), "fax2");
        setupEpg(_epgMap, et -> ((MShop)et).getFax3(), (et, vl) -> ((MShop)et).setFax3((String)vl), "fax3");
        setupEpg(_epgMap, et -> ((MShop)et).getEmail1(), (et, vl) -> ((MShop)et).setEmail1((String)vl), "email1");
        setupEpg(_epgMap, et -> ((MShop)et).getEmail2(), (et, vl) -> ((MShop)et).setEmail2((String)vl), "email2");
        setupEpg(_epgMap, et -> ((MShop)et).getUrl(), (et, vl) -> ((MShop)et).setUrl((String)vl), "url");
        setupEpg(_epgMap, et -> ((MShop)et).getPrefecture(), (et, vl) -> ((MShop)et).setPrefecture(cti(vl)), "prefecture");
        setupEpg(_epgMap, et -> ((MShop)et).getCity(), (et, vl) -> ((MShop)et).setCity((String)vl), "city");
        setupEpg(_epgMap, et -> ((MShop)et).getAddress1(), (et, vl) -> ((MShop)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((MShop)et).getAddress2(), (et, vl) -> ((MShop)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((MShop)et).getRemarks(), (et, vl) -> ((MShop)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((MShop)et).getDeleteFlag(), (et, vl) -> ((MShop)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MShop)et).getRegisterDatetime(), (et, vl) -> ((MShop)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MShop)et).getUpdateDatetime(), (et, vl) -> ((MShop)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_shop";
    protected final String _tableDispName = "m_shop";
    protected final String _tablePropertyName = "MShop";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_shop", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShopId = cci("shop_id", "shop_id", null, null, Integer.class, "shopId", null, true, true, true, "serial", 10, 0, null, "nextval('m_shop_shop_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyId = cci("company_id", "company_id", null, null, Integer.class, "companyId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShopAbbreviatedName = cci("shop_abbreviated_name", "shop_abbreviated_name", null, null, String.class, "shopAbbreviatedName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShopName = cci("shop_name", "shop_name", null, null, String.class, "shopName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone11 = cci("phone1_1", "phone1_1", null, null, String.class, "phone11", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone12 = cci("phone1_2", "phone1_2", null, null, String.class, "phone12", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone13 = cci("phone1_3", "phone1_3", null, null, String.class, "phone13", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone21 = cci("phone2_1", "phone2_1", null, null, String.class, "phone21", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone22 = cci("phone2_2", "phone2_2", null, null, String.class, "phone22", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone23 = cci("phone2_3", "phone2_3", null, null, String.class, "phone23", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax1 = cci("fax_1", "fax_1", null, null, String.class, "fax1", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax2 = cci("fax_2", "fax_2", null, null, String.class, "fax2", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax3 = cci("fax_3", "fax_3", null, null, String.class, "fax3", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail1 = cci("email1", "email1", null, null, String.class, "email1", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail2 = cci("email2", "email2", null, null, String.class, "email2", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUrl = cci("url", "url", null, null, String.class, "url", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrefecture = cci("prefecture", "prefecture", null, null, Integer.class, "prefecture", null, false, false, false, "int2", 5, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCity = cci("city", "city", null, null, String.class, "city", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("address1", "address1", null, null, String.class, "address1", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("address2", "address2", null, null, String.class, "address2", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemarks = cci("remarks", "remarks", null, null, String.class, "remarks", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * shop_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopId() { return _columnShopId; }
    /**
     * company_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyId() { return _columnCompanyId; }
    /**
     * shop_abbreviated_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopAbbreviatedName() { return _columnShopAbbreviatedName; }
    /**
     * shop_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopName() { return _columnShopName; }
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
     * phone2_1: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone21() { return _columnPhone21; }
    /**
     * phone2_2: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone22() { return _columnPhone22; }
    /**
     * phone2_3: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone23() { return _columnPhone23; }
    /**
     * fax_1: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax1() { return _columnFax1; }
    /**
     * fax_2: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax2() { return _columnFax2; }
    /**
     * fax_3: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax3() { return _columnFax3; }
    /**
     * email1: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail1() { return _columnEmail1; }
    /**
     * email2: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail2() { return _columnEmail2; }
    /**
     * url: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUrl() { return _columnUrl; }
    /**
     * prefecture: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrefecture() { return _columnPrefecture; }
    /**
     * city: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCity() { return _columnCity; }
    /**
     * address1: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * address2: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * remarks: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemarks() { return _columnRemarks; }
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
        ls.add(columnShopId());
        ls.add(columnCompanyId());
        ls.add(columnShopAbbreviatedName());
        ls.add(columnShopName());
        ls.add(columnPhone11());
        ls.add(columnPhone12());
        ls.add(columnPhone13());
        ls.add(columnPhone21());
        ls.add(columnPhone22());
        ls.add(columnPhone23());
        ls.add(columnFax1());
        ls.add(columnFax2());
        ls.add(columnFax3());
        ls.add(columnEmail1());
        ls.add(columnEmail2());
        ls.add(columnUrl());
        ls.add(columnPrefecture());
        ls.add(columnCity());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnRemarks());
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
    protected UniqueInfo cpui() { return hpcpui(columnShopId()); }
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
    public String getSequenceName() { return "m_shop_shop_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.MShop"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.MShopCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.MShopBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MShop> getEntityType() { return MShop.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MShop newEntity() { return new MShop(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MShop)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MShop)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
