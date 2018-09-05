package com.dnmanager.controller;


import com.dnmanager.base.Result;
import com.dnmanager.bean.ShoppingParams;
import com.dnmanager.pojo.AppOrderInfo;
import com.dnmanager.pojo.Commodity;
import com.dnmanager.service.IShoppingService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/shopping", method = RequestMethod.POST)
public class ShoppingController {

    @Autowired
    IShoppingService shoppingService;

    @RequestMapping("/getGoodsList")
    @ResponseBody
    public Object getGoodsList(@RequestBody ShoppingParams params) {
        if (params == null) {
            params = new ShoppingParams();
        }
        Page page = shoppingService.selectGoodsList(params);
        return Result.okList(page.getResult(), page.getTotal(), page.getPages());
    }

    @RequestMapping("/getGoodsDetails")
    @ResponseBody
    public Object getGoodsDetails(@RequestBody ShoppingParams params) {
        Commodity page = shoppingService.selectGoodsDetailsByGoodsId(params);
        return Result.ok(page);
    }

    @RequestMapping("/payment")
    @ResponseBody
    public Object payment(@RequestBody AppOrderInfo info) {
        shoppingService.payment(info);
        return Result.ok();
    }
}
