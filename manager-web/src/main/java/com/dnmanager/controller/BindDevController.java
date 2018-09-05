package com.dnmanager.controller;

import com.dnmanager.base.Result;
import com.dnmanager.service.IBindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("bind")
public class BindDevController {

    @Autowired
    IBindService bindService;


    @RequestMapping("bindDev")
    @ResponseBody
    public Object bindDev(@RequestBody Map<String, Object> map) {
        Object userId = map.get("userId");
        Object devCode = map.get("devCode");
        Object buyPrice = map.get("buyPrice");

        bindService.bindDev((Integer) userId, (String) devCode, (Integer) buyPrice);
        return Result.ok();

    }

    @RequestMapping("buyEle")
    @ResponseBody
    public Object buyEle(@RequestBody Map<String, Object> map) {
        Object userId = map.get("userId");
        Object devId = map.get("devId");
        Object buyPrice = map.get("buyPrice");


        bindService.buyEle((Integer) userId, (Integer) devId, (Integer) buyPrice);
        return Result.ok();
    }

    @RequestMapping("devVIP")
    @ResponseBody
    public Object devVIP(@RequestBody Map<String, Object> map) {
        Integer userId = (Integer) map.get("userId");
        Integer devId = (Integer) map.get("devId");
        Integer buyCount = (Integer) map.get("buyCount");


        bindService.buyDevVIP(userId, devId, buyCount);
        return Result.ok();

    }
}
