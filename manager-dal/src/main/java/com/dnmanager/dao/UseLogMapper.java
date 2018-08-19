package com.dnmanager.dao;

import com.dnmanager.pojo.UseLog;
import com.dnmanager.pojo.UseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UseLogMapper {
    long countByExample(UseLogExample example);

    int deleteByExample(UseLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UseLog record);

    int insertSelective(UseLog record);

    List<UseLog> selectByExampleWithRowbounds(UseLogExample example, RowBounds rowBounds);

    List<UseLog> selectByExample(UseLogExample example);

    UseLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UseLog record, @Param("example") UseLogExample example);

    int updateByExample(@Param("record") UseLog record, @Param("example") UseLogExample example);

    int updateByPrimaryKeySelective(UseLog record);

    int updateByPrimaryKey(UseLog record);
}