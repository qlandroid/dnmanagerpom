package com.dnmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/investment")
public class InvestmentController {


    @RequestMapping("/list")
    @ResponseBody
    public Object getInvestment() {
        List list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", i);
            map.put("name", "一个家公司");
            map.put("details", "一家公司的简介");
            list.add(map);

        }

        return list;

    }
}
