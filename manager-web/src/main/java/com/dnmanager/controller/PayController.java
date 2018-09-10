package com.dnmanager.controller;

import com.dnmanager.base.Result;
import com.dnmanager.bean.PriceBean;
import com.dnmanager.select.VipSelect;
import com.dnmanager.service.IDevService;
import com.dnmanager.service.IPayService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/pay")
public class PayController {

    @Autowired
    IPayService payService;
    @Autowired
    IDevService devService;


    @RequestMapping("price")
    @ResponseBody
    public Object price() {
        PriceBean price = devService.getPrice();
        return Result.ok(price);
    }


    @RequestMapping("payVipRecord")
    @ResponseBody
    public Object payRecord(@RequestBody VipSelect vipSelect){

       Page allVipRecord = (Page) payService.selectVipRecord(vipSelect);

       return Result.okList(allVipRecord.getResult(),allVipRecord.getTotal(),allVipRecord.getPages());
    }


}
