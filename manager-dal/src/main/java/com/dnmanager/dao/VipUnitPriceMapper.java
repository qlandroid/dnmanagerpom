package com.dnmanager.dao;

import com.dnmanager.pojo.VipUnitPrice;
import com.dnmanager.pojo.VipUnitPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VipUnitPriceMapper {
    long countByExample(VipUnitPriceExample example);

    int deleteByExample(VipUnitPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VipUnitPrice record);

    int insertSelective(VipUnitPrice record);

    List<VipUnitPrice> selectByExampleWithRowbounds(VipUnitPriceExample example, RowBounds rowBounds);

    List<VipUnitPrice> selectByExample(VipUnitPriceExample example);

    VipUnitPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VipUnitPrice record, @Param("example") VipUnitPriceExample example);

    int updateByExample(@Param("record") VipUnitPrice record, @Param("example") VipUnitPriceExample example);

    int updateByPrimaryKeySelective(VipUnitPrice record);

    int updateByPrimaryKey(VipUnitPrice record);
}