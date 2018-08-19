package com.dnmanager.service;

import com.dnmanager.bean.DevDetails;
import com.dnmanager.bean.WarnMain;
import com.dnmanager.pojo.Device;

import java.util.List;

public interface IDevService {


    /**
     * 通过用户id 查询 设备列表
     *
     * @param userId
     * @return
     */
    List<Device> getDevListByUserId(Integer userId);

    /**
     * 通过设备id 查询设备详情
     *
     * @param userId
     * @param devId
     * @return
     */
    Device getDevByDevId(Integer userId, Integer devId);


    /**
     * 通过设备号 统计电表信息
     * 年度 统计，月度统计，总统计
     *
     * @param userId
     * @param devId
     * @return
     */
    DevDetails getDevDetails(Integer userId, Integer devId);

    /**
     * 设置设备别名
     *
     * @param devId
     * @param devName
     */
    void setDevNickName(Integer userId, Integer devId, String devName);


    /**
     * 设置电表运行状态
     *
     * @param userId
     * @param devId
     * @param runStatus 0-关闭，1-开启
     * @return
     */
    void setDevRunStatus(Integer userId, Integer devId, Integer runStatus);

    WarnMain warnByMain(Integer userId);
}
