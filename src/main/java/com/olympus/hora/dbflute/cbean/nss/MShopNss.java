package com.olympus.hora.dbflute.cbean.nss;

import com.olympus.hora.dbflute.cbean.cq.MShopCQ;

/**
 * The nest select set-upper of m_shop.
 * @author DBFlute(AutoGenerator)
 */
public class MShopNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MShopCQ _query;
    public MShopNss(MShopCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_company by my company_id, named 'MCompany'.
     */
    public void withMCompany() {
        _query.xdoNss(() -> _query.queryMCompany());
    }
}
