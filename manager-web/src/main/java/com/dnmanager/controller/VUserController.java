package com.dnmanager.controller;


import com.dnmanager.HaltException;
import com.dnmanager.base.Result;
import com.dnmanager.bean.UserDetails;
import com.dnmanager.pojo.User;
import com.dnmanager.service.IDevService;
import com.dnmanager.service.IUserService;
import com.dnmanager.utils.CheckUtils;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/vuser", method = RequestMethod.POST)
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
        BASE64Encoder encoder = new BASE64Encoder();
        try {
            String encode = encoder.encode(vPassword.getBytes("UTF-8"));
            User insertUser = new User();
            insertUser.setvAccount(vAccount);
            insertUser.setvPassword(encode);
            insertUser.setvPhone(vPhone);
            userService.reg(insertUser);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new HaltException("密码加密失败");
        }


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

        BASE64Encoder encoder = new BASE64Encoder();
        try {
            String encode = encoder.encode(vPassword.getBytes("UTF-8"));
            insertUser.setvPassword(encode);
            insertUser.setvPhone(vPhone);
            userService.forgetPw(insertUser);
        } catch (Exception e) {
            e.printStackTrace();
            throw new HaltException("密码加密失败");
        }


        return Result.ok();
    }

    @RequestMapping("login")
    @ResponseBody
    public Object login(@RequestBody Map<String, Object> map) {
        String vAccount = (String) map.get("vAccount");
        String vPassword = (String) map.get("vPassword");
        BASE64Encoder encoder = new BASE64Encoder();
        try {
            String encode = encoder.encode(vPassword.getBytes("UTF-8"));
            User insertUser = new User();
            insertUser.setvAccount(vAccount);
            insertUser.setvPassword(encode);
            User login = userService.login(insertUser);
            Map<String, Object> re = new HashMap<>();
            re.put("userId", login.getId());
            return Result.ok(re);
        } catch (Exception e) {
            e.printStackTrace();
            throw new HaltException("密码加密失败");

        }


    }

    @RequestMapping("setUserDetails")
    @ResponseBody
    public Object setUserDetails(@RequestBody Map<String, Object> map) {
        Integer userId = (Integer) getUserId(map);
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

    private Object getUserId(@RequestBody Map<String, Object> map) {
        Object userId = map.get("userId");
        if (userId instanceof String) {
            userId = Integer.parseInt((String) userId);
        }
        return userId;
    }


    @RequestMapping("getUserDetails")
    @ResponseBody
    public Object getUserDetails(@RequestBody Map<String, Object> map) {
        User user = new User();
        user.setId((Integer) getUserId(map));
        User userDetails = userService.getUserDetails(user);
        Integer devCount = devService.getDevCountByUserId(user.getId());
        UserDetails d = new UserDetails();
        d.setRegTime(userDetails.getRegTime());
        d.setUserId(userDetails.getId());
        d.setDevCount(devCount);
        d.setNickName(userDetails.getNickname());
        return Result.ok(d);
    }

}

