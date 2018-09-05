package com.dnmanager.dao;

import com.dnmanager.pojo.AppOrderInfo;
import com.dnmanager.pojo.AppOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppOrderInfoMapper {
    long countByExample(AppOrderInfoExample example);

    int deleteByExample(AppOrderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppOrderInfo record);

    int insertSelective(AppOrderInfo record);

    List<AppOrderInfo> selectByExampleWithRowbounds(AppOrderInfoExample example, RowBounds rowBounds);

    List<AppOrderInfo> selectByExample(AppOrderInfoExample example);

    AppOrderInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppOrderInfo record, @Param("example") AppOrderInfoExample example);

    int updateByExample(@Param("record") AppOrderInfo record, @Param("example") AppOrderInfoExample example);

    int updateByPrimaryKeySelective(AppOrderInfo record);

    int updateByPrimaryKey(AppOrderInfo record);
}