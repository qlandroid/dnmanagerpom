package com.dnmanager.service;

import com.dnmanager.bean.ShoppingParams;
import com.dnmanager.pojo.AppOrderInfo;
import com.dnmanager.pojo.Commodity;
import com.github.pagehelper.Page;

public interface IShoppingService {


    Page selectGoodsList(ShoppingParams params);

    Commodity selectGoodsDetailsByGoodsId(ShoppingParams params);

    void payment(AppOrderInfo info);
}
