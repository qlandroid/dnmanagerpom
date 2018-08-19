package com.dnmanager.dao;

import com.dnmanager.pojo.Detailed;
import com.dnmanager.pojo.DetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DetailedMapper {
    long countByExample(DetailedExample example);

    int deleteByExample(DetailedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Detailed record);

    int insertSelective(Detailed record);

    List<Detailed> selectByExampleWithRowbounds(DetailedExample example, RowBounds rowBounds);

    List<Detailed> selectByExample(DetailedExample example);

    Detailed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Detailed record, @Param("example") DetailedExample example);

    int updateByExample(@Param("record") Detailed record, @Param("example") DetailedExample example);

    int updateByPrimaryKeySelective(Detailed record);

    int updateByPrimaryKey(Detailed record);
}