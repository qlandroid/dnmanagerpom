package com.dnmanager.dao;

import com.dnmanager.pojo.EleUnitPrice;
import com.dnmanager.pojo.EleUnitPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EleUnitPriceMapper {
    long countByExample(EleUnitPriceExample example);

    int deleteByExample(EleUnitPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EleUnitPrice record);

    int insertSelective(EleUnitPrice record);

    List<EleUnitPrice> selectByExampleWithRowbounds(EleUnitPriceExample example, RowBounds rowBounds);

    List<EleUnitPrice> selectByExample(EleUnitPriceExample example);

    EleUnitPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EleUnitPrice record, @Param("example") EleUnitPriceExample example);

    int updateByExample(@Param("record") EleUnitPrice record, @Param("example") EleUnitPriceExample example);

    int updateByPrimaryKeySelective(EleUnitPrice record);

    int updateByPrimaryKey(EleUnitPrice record);
}