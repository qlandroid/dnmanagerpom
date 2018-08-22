package com.dnmanager.controller;


import com.dnmanager.HaltException;
import com.dnmanager.base.Result;
import com.dnmanager.bean.UserDetails;
import com.dnmanager.pojo.User;
import com.dnmanager.service.IDevService;
import com.dnmanager.service.IUserService;
import com.dnmanager.utils.CheckUtils;
import com.mysql.jdbc.StringUtils;
import jodd.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/vuser")
public class VUserController {


    @Autowired
    IUserService userService;
    @Autowired
    IDevService devService;


    @RequestMapping("reg")
    @ResponseBody
    public Object reg(@RequestBody Map<String, Object> map) {
        String vAccount = (String) map.get("vAccount");
        String vPassword = (String) map.get("vPassword");
        String vPhone = (String) map.get("vPhone");

        if (StringUtils.isNullOrEmpty(vAccount) || vAccount.length() < 6) {
            throw new HaltException("账号长度不能小于6");
        }
        if (StringUtils.isNullOrEmpty(vPassword) || vPassword.length() < 6) {
            throw new HaltException("密码长度不能小于6");
        }


        if (StringUtils.isNullOrEmpty(vPhone) || vPhone.length() < 11 || !CheckUtils.isMobileNO(vPhone)) {
            throw new HaltException("请输入正确手机号");
        }

        User insertUser = new User();
        insertUser.setvAccount(vAccount);
        insertUser.setvPassword(vPassword);
        insertUser.setvPhone(vPhone);
        userService.reg(insertUser);

        return Result.ok();
    }

    @RequestMapping("forgetPassword")
    @ResponseBody
    public Object forgetPassword(@RequestBody Map<String, Object> map) {
        String vPassword = (String) map.get("vPassword");
        String vPhone = (String) map.get("vPhone");

        if (StringUtils.isNullOrEmpty(vPhone) || vPhone.length() < 11 || !CheckUtils.isMobileNO(vPhone)) {
            throw new HaltException("请输入正确手机号");
        }

        if (StringUtils.isNullOrEmpty(vPassword) || vPassword.length() < 6) {
            throw new HaltException("密码长度不能小于6");
        }
        User insertUser = new User();
        insertUser.setvPassword(vPassword);
        insertUser.setvPhone(vPhone);
        userService.forgetPw(insertUser);

        return Result.ok();
    }

    @RequestMapping("login")
    @ResponseBody
    public Object login(@RequestBody Map<String, Object> map) {
        String vAccount = (String) map.get("vAccount");
        String vPassword = (String) map.get("vPassword");


        User insertUser = new User();
        insertUser.setvAccount(vAccount);
        insertUser.setvPassword(vPassword);
        User login = userService.login(insertUser);
        Map<String, Object> re = new HashMap<>();
        re.put("userId", login.getId());
        return Result.ok(re);
    }

    @RequestMapping("setUserDetails")
    @ResponseBody
    public Object setUserDetails(@RequestBody Map<String, Object> map) {
        Integer userId = (Integer) map.get("userId");
        Object vNickName = map.get("vNickName");

        if (vNickName == null) {
            return Result.ok();
        }
        User user = new User();
        user.setId(userId);
        if (vNickName != null) {
            user.setNickname((String) vNickName);
        }
        userService.resetDetails(user);

        return Result.ok();
    }


    @RequestMapping("getUserDetails")
    @ResponseBody
    public Object getUserDetails(@RequestBody Map<String, Object> map) {
        User user = new User();
        User userDetails = userService.getUserDetails(user);
        Integer devCount = devService.getDevCountByUserId(user.getId());
        UserDetails d = new UserDetails();
        d.setUser(userDetails);
        d.setDevCount(devCount);
        return Result.ok(d);
    }

}

