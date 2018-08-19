package com.dnmanager.dao;

import com.dnmanager.pojo.UserOpenId;
import com.dnmanager.pojo.UserOpenIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserOpenIdMapper {
    long countByExample(UserOpenIdExample example);

    int deleteByExample(UserOpenIdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserOpenId record);

    int insertSelective(UserOpenId record);

    List<UserOpenId> selectByExampleWithRowbounds(UserOpenIdExample example, RowBounds rowBounds);

    List<UserOpenId> selectByExample(UserOpenIdExample example);

    UserOpenId selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserOpenId record, @Param("example") UserOpenIdExample example);

    int updateByExample(@Param("record") UserOpenId record, @Param("example") UserOpenIdExample example);

    int updateByPrimaryKeySelective(UserOpenId record);

    int updateByPrimaryKey(UserOpenId record);
}