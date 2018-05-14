package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of m_shop as TABLE. <br>
 * <pre>
 * [primary key]
 *     shop_id
 *
 * [column]
 *     shop_id, company_id, shop_abbreviated_name, shop_name, phone1_1, phone1_2, phone1_3, phone2_1, phone2_2, phone2_3, fax_1, fax_2, fax_3, email1, email2, url, prefecture, city, address1, address2, remarks, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     m_shop_shop_id_seq
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
public class LoaderOfMShop {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MShop> _selectedList;
    protected BehaviorSelector _selector;
    protected MShopBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMShop ready(List<MShop> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MShopBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MShopBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MShop> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
