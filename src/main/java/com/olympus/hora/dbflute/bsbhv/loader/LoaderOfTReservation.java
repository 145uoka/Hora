package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of t_reservation as TABLE. <br>
 * <pre>
 * [primary key]
 *     reservation_id
 *
 * [column]
 *     reservation_id, shop_id, staff_id, hist_staff_family_name, hist_shop_name, hist_shop_abbreviated_name, hist_staff_given_name, reservation_date, reservation_time, user_id, total_amount, remarks, status, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     t_reservation_reservation_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReservation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReservation> _selectedList;
    protected BehaviorSelector _selector;
    protected TReservationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReservation ready(List<TReservation> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReservationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReservationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReservation> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
