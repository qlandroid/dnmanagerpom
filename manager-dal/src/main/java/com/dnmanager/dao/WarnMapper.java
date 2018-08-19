package com.dnmanager.dao;

import com.dnmanager.pojo.Warn;
import com.dnmanager.pojo.WarnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WarnMapper {
    long countByExample(WarnExample example);

    int deleteByExample(WarnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Warn record);

    int insertSelective(Warn record);

    List<Warn> selectByExampleWithRowbounds(WarnExample example, RowBounds rowBounds);

    List<Warn> selectByExample(WarnExample example);

    Warn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Warn record, @Param("example") WarnExample example);

    int updateByExample(@Param("record") Warn record, @Param("example") WarnExample example);

    int updateByPrimaryKeySelective(Warn record);

    int updateByPrimaryKey(Warn record);
}