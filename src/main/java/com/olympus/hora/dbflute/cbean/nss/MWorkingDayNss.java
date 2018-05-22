package com.olympus.hora.dbflute.cbean.nss;

import com.olympus.hora.dbflute.cbean.cq.MWorkingDayCQ;

/**
 * The nest select set-upper of m_working_day.
 * @author DBFlute(AutoGenerator)
 */
public class MWorkingDayNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MWorkingDayCQ _query;
    public MWorkingDayNss(MWorkingDayCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_shop by my shop_id, named 'MShop'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MShopNss withMShop() {
        _query.xdoNss(() -> _query.queryMShop());
        return new MShopNss(_query.queryMShop());
    }
}
