package com.dnmanager.dao;

import com.dnmanager.pojo.UserDevice;
import com.dnmanager.pojo.UserDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserDeviceMapper {
    long countByExample(UserDeviceExample example);

    int deleteByExample(UserDeviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDevice record);

    int insertSelective(UserDevice record);

    List<UserDevice> selectByExampleWithRowbounds(UserDeviceExample example, RowBounds rowBounds);

    List<UserDevice> selectByExample(UserDeviceExample example);

    UserDevice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDevice record, @Param("example") UserDeviceExample example);

    int updateByExample(@Param("record") UserDevice record, @Param("example") UserDeviceExample example);

    int updateByPrimaryKeySelective(UserDevice record);

    int updateByPrimaryKey(UserDevice record);
}