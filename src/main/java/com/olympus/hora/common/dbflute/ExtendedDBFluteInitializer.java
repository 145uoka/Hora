package com.olympus.hora.common.dbflute;

import javax.sql.DataSource;

import com.olympus.hora.dbflute.allcommon.DBFluteConfig;
import com.olympus.hora.dbflute.allcommon.DBFluteInitializer;

public class ExtendedDBFluteInitializer extends DBFluteInitializer {
    public ExtendedDBFluteInitializer(DataSource dataSource) {
        super(dataSource);
    }
    @Override
    protected void setupDataSourceHandler(String dataSourceFqcn) {
        final DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();
        config.setDataSourceHandler(new DBFluteConfig.SpringTransactionalDataSourceHandler());
    }
}
