package com.dnmanager.controller;

import com.dnmanager.base.Result;
import com.dnmanager.bean.PriceBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/price")
public class PriceController {


    /**
     * 获得 会员 单价
     *
     * @return
     */
    @RequestMapping("/vipUnit")
    @ResponseBody
    public Object getVipUnit() {

        PriceBean p = new PriceBean();

        p.setEleUnit(1.2d);
        p.setVipUnit(2.0d);
        return Result.ok(p);
    }
}
