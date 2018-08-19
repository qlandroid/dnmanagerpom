package com.dnmanager.dao;

import com.dnmanager.pojo.DeviceVersion;
import com.dnmanager.pojo.DeviceVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DeviceVersionMapper {
    long countByExample(DeviceVersionExample example);

    int deleteByExample(DeviceVersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceVersion record);

    int insertSelective(DeviceVersion record);

    List<DeviceVersion> selectByExampleWithRowbounds(DeviceVersionExample example, RowBounds rowBounds);

    List<DeviceVersion> selectByExample(DeviceVersionExample example);

    DeviceVersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceVersion record, @Param("example") DeviceVersionExample example);

    int updateByExample(@Param("record") DeviceVersion record, @Param("example") DeviceVersionExample example);

    int updateByPrimaryKeySelective(DeviceVersion record);

    int updateByPrimaryKey(DeviceVersion record);
}