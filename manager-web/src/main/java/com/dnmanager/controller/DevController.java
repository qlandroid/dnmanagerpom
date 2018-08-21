package com.dnmanager.controller;


import com.dnmanager.HaltException;
import com.dnmanager.base.Result;
import com.dnmanager.bean.DevDetails;
import com.dnmanager.bean.WarnMain;
import com.dnmanager.pojo.Device;
import com.dnmanager.service.IDevService;
import com.github.pagehelper.Page;
import com.mysql.jdbc.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/dev")
public class DevController {
    Logger logger = Logger.getLogger(DevController.class);

    @Autowired
    IDevService devService;

    /**
     * 获得首页信息
     *
     * @return
     */
    @RequestMapping("homepage")
    @ResponseBody
    public Object homePage(@RequestBody Map<String, Object> body) {
        try {
            Object userId = body.get("userId");
            if (userId == null) {
                throw new HaltException("玩我呢，你在仔细检查一下");
            }
            logger.info("请求地址---> dev/homepage");
            WarnMain warnMain = devService.warnByMain((Integer) userId);

            return Result.ok(warnMain);
        } catch (HaltException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("系统跑偏了，请稍后访问");
        }
    }


    /**
     * 获得设备号
     *
     * @return
     */
    @RequestMapping("getDevList")
    @ResponseBody
    public Object getDevList(@RequestBody Map<String, Object> body) {
        try {
            Object us = body.get("userId");
            Object devCode = body.get("code");
            if (us == null) {
                throw new HaltException("玩我呢，你在仔细检查一下");
            }
            if (devCode == null) {
                devCode = "";
            }
            Integer userId = (Integer) us;
            List<Device> devListByUserId = devService.getDevListByUserId(userId, (java.lang.String) devCode);

            return Result.okList(devListByUserId);
        } catch (HaltException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("系统跑偏了，请稍后访问");
        }
    }

    /**
     * 设备统计，
     *
     * @return
     */
    @RequestMapping("getDevDetails")
    @ResponseBody
    public Object getDevDetails(@RequestBody Map<String, Object> body) {
        try {
            Object userId = body.get("userId");
            Object devId = body.get("devId");
            if (userId == null || devId == null) {
                throw new HaltException("玩我呢，你在仔细检查一下");

            }
            DevDetails devDetails = devService.getDevDetails((Integer) userId, (Integer) devId);
            return Result.ok(devDetails);
        } catch (HaltException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("系统跑偏了，请稍后访问");
        }
    }

    /**
     * 设置设备别名
     *
     * @return
     */
    @RequestMapping("setDevName")
    @ResponseBody
    public Object setDevName(@RequestBody Map<String, Object> map) {
        Integer devId = (Integer) map.get("devId");
        Integer userId = (Integer) map.get("userId");
        String nickName = (String) map.get("nickName");
        if (StringUtils.isNullOrEmpty(nickName)) {
            nickName = "";
        }
        devService.setDevNickName(userId, devId, nickName);
        return Result.ok();
    }

    /**
     * 获得一个设备的信息
     *
     * @return
     */
    @RequestMapping("getDevStatus")
    @ResponseBody
    public Object getDevStatus(@RequestBody Map<String, Object> map) {
        Object userId = map.get("userId");
        Object devId = map.get("devId");
        Device devByDevId = devService.getDevByDevId((Integer) userId, (Integer) devId);
        return Result.ok(devByDevId);

    }


    /**
     * 设置电表阀门开关
     *
     * @return
     * @ userId    用户ID
     * @ devId     设备唯一id
     * @ runStatus 设备运行状态 0-关闭，1-开启
     */
    @RequestMapping("setDevRunStatus")
    @ResponseBody
    public Object setDevRunStatus(@RequestBody Map<String, Object> map) {
        Integer devId = (Integer) map.get("devId");
        Integer userId = (Integer) map.get("userId");
        Integer runStatus = (Integer) map.get("runStatus");
        devService.setDevRunStatus(userId, devId, runStatus);
        return Result.ok();

    }

    @RequestMapping("getWarnMsg")
    @ResponseBody
    public Object getWarnMsg(@RequestBody Map<String, Object> map) {
        try {
            Object userId = map.get("userId");
            Object index = map.get("pageNum");
            Object pageSize = map.get("pageSize");
            if (userId == null) {
                throw new HaltException("玩我呢，你在仔细检查一下");
            }
            Page page = devService.warnListByUserId((Integer) userId, (Integer) index, (Integer) pageSize);


            return Result.okList(page.getResult(), page.getTotal(), page.getPages());
        } catch (HaltException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("系统跑偏了，请稍后访问");
        }
    }


    @RequestMapping("getTransaction")
    @ResponseBody
    public Object getTransaction(@RequestBody Map<String, Object> map) {
        try {
            Object userId = map.get("userId");
            Object index = map.get("pageNum");
            Object pageSize = map.get("pageSize");
            if (userId == null) {
                throw new HaltException("玩我呢，你在仔细检查一下");
            }
            Page page = devService.getTransaction((Integer) userId, (Integer) index, (Integer) pageSize);


            return Result.okList(page.getResult(), page.getTotal(), page.getPages());
        } catch (HaltException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("系统跑偏了，请稍后访问");
        }

    }

    @RequestMapping("getStopDev")
    @ResponseBody
    public Object getStopDev(@RequestBody Map<String, Object> map) {
        try {
            Object userId = map.get("userId");
            Object type = map.get("type");// 0-停电通知，1-低电量通知
            if (userId == null) {
                throw new HaltException("玩我呢，你在仔细检查一下");
            }

            List list = devService.selectStopDevByUserId((Integer) userId, (String) type);

            return Result.okList(list);
        } catch (HaltException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("系统跑偏了，请稍后访问");
        }

    }

    @RequestMapping("useE")
    @ResponseBody
    public Object useE(@RequestBody Map<String, Object> map) {
        Object userId = map.get("userId");
        Object devId = map.get("devId");
        Object year = map.get("year");
        Object month = map.get("month");
        Object type = map.get("type");//1- month  2- year;

        if (userId == null || devId == null) {
            throw new HaltException("玩我呢，你在仔细检查一下");
        }
        List list = null;

        if ("1".equals(type.toString())) {
            if (month == null || year == null) {
                throw new HaltException("玩我呢，你在仔细检查一下");
            }
            list = devService.selectUseEleOfMonthByDevId((Integer) userId, (Integer) devId, (Integer) year, (Integer) month);
        } else if ("2".equals(type.toString())) {
            list = devService.selectUseEleOfYearByDevId((Integer) userId, (Integer) devId);

        } else {
            throw new HaltException("你确定你还爱我吗？你在确定一下我的胸围多少!");
        }

        return Result.okList(list);

    }

    @RequestMapping("getDevDetailsByCode")
    @ResponseBody
    public Object getDevDetailsByCode(@RequestBody Map<String, Object> map) {
        String devCode = (String) map.get("devCode");

        Device device = devService.selectDevByCode(devCode);
        return Result.ok(device);
    }

}
