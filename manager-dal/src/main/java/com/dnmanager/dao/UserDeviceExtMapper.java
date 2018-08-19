package com.dnmanager.dao;

import com.dnmanager.pojo.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDeviceExtMapper {


    public List<Device> selectStopDev(@Param("userId") Integer userId);
}
