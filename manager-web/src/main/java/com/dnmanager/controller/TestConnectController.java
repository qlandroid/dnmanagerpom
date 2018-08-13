package com.dnmanager.controller;


import com.dnmanager.dao.AdminMapper;
import com.dnmanager.pojo.Admin;
import com.dnmanager.pojo.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestConnectController {

    @Autowired
    AdminMapper adminMapper;

    @RequestMapping("/t")
    @ResponseBody
    public Object s() {
        AdminExample a = new AdminExample();

        List<Admin> admins = adminMapper.selectByExample(a);
        return admins;
    }

}
