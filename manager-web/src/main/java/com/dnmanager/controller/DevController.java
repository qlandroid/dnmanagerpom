package com.dnmanager.controller;


import com.dnmanager.HaltException;
import com.dnmanager.base.Result;
import com.dnmanager.bean.DevDetails;
import com.dnmanager.bean.WarnMain;
import com.dnmanager.pojo.Device;
import com.dnmanager.service.IDevService;
import com.mysql.jdbc.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/dev", method = RequestMethod.POST)
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
            if (us == null) {
                throw new HaltException("玩我呢，你在仔细检查一下");
            }
            Integer userId = (Integer) us;
            List<Device> devListByUserId = devService.getDevListByUserId(userId);

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
            //Device devByDevId = devService.getDevDetails(userId, devId);
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
     * @param userId 用户ID
     * @param devId  设备唯一id
     * @return
     */
    @RequestMapping("setDevName")
    @ResponseBody
    public Object setDevName(Integer devId, Integer userId, String nickName) {
        try {
            //Device devByDevId = devService.getDevDetails(userId, devId);
            if (StringUtils.isNullOrEmpty(nickName)) {
                nickName = "";
            }
            devService.setDevNickName(userId, devId, nickName);
            return Result.ok();
        } catch (HaltException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("系统跑偏了，请稍后访问");
        }
    }

    /**
     * 获得一个设备的信息
     *
     * @param userId 用户ID
     * @param devId  设备唯一id
     * @return
     */
    @RequestMapping("getDevStatus")
    @ResponseBody
    public Object getDevStatus(Integer devId, Integer userId) {
        try {
            Device devByDevId = devService.getDevByDevId(userId, devId);
            return Result.ok(devByDevId);
        } catch (HaltException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("系统跑偏了，请稍后访问");
        }
    }


//    setDevRunStatus

    /**
     * 设置电表阀门开关
     *
     * @param userId    用户ID
     * @param devId     设备唯一id
     * @param runStatus 设备运行状态 0-关闭，1-开启
     * @return
     */
    @RequestMapping("setDevRunStatus")
    @ResponseBody
    public Object setDevRunStatus(Integer devId, Integer userId, Integer runStatus) {
        try {
            devService.setDevRunStatus(userId, devId, runStatus);
            return Result.ok();
        } catch (HaltException e) {
            return Result.error(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("系统跑偏了，请稍后访问");
        }
    }

}
