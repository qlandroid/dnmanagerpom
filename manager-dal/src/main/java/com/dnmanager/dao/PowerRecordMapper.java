package com.dnmanager.dao;

import com.dnmanager.pojo.PowerRecord;
import com.dnmanager.pojo.PowerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PowerRecordMapper {
    long countByExample(PowerRecordExample example);

    int deleteByExample(PowerRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PowerRecord record);

    int insertSelective(PowerRecord record);

    List<PowerRecord> selectByExampleWithRowbounds(PowerRecordExample example, RowBounds rowBounds);

    List<PowerRecord> selectByExample(PowerRecordExample example);

    PowerRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PowerRecord record, @Param("example") PowerRecordExample example);

    int updateByExample(@Param("record") PowerRecord record, @Param("example") PowerRecordExample example);

    int updateByPrimaryKeySelective(PowerRecord record);

    int updateByPrimaryKey(PowerRecord record);
}