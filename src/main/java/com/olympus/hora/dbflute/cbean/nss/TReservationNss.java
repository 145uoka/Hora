package com.olympus.hora.dbflute.cbean.nss;

import com.olympus.hora.dbflute.cbean.cq.TReservationCQ;

/**
 * The nest select set-upper of t_reservation.
 * @author DBFlute(AutoGenerator)
 */
public class TReservationNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TReservationCQ _query;
    public TReservationNss(TReservationCQ query) { _query = query; }
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
    /**
     * With nested relation columns to select clause. <br>
     * m_staff by my staff_id, named 'MStaff'.
     */
    public void withMStaff() {
        _query.xdoNss(() -> _query.queryMStaff());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_user by my user_id, named 'MUser'.
     */
    public void withMUser() {
        _query.xdoNss(() -> _query.queryMUser());
    }
}
