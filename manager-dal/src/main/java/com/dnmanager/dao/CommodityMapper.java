package com.dnmanager.dao;

import com.dnmanager.pojo.Commodity;
import com.dnmanager.pojo.CommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CommodityMapper {
    long countByExample(CommodityExample example);

    int deleteByExample(CommodityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    List<Commodity> selectByExampleWithRowbounds(CommodityExample example, RowBounds rowBounds);

    List<Commodity> selectByExample(CommodityExample example);

    Commodity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByExample(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}