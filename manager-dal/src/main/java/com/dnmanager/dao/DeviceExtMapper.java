package com.dnmanager.dao;


import com.dnmanager.pojo.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备操作的扩展
 */
public interface DeviceExtMapper {


    /**
     * 查询设备的所有设备
     *
     * @param userId
     * @return
     */
    List<Device> selectDevListByUserId(@Param("userId") Integer userId, @Param("devId") Integer devId, @Param("devCode") String devCode);


}
