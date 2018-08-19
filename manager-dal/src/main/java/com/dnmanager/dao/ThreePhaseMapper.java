package com.dnmanager.dao;

import com.dnmanager.pojo.ThreePhase;
import com.dnmanager.pojo.ThreePhaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ThreePhaseMapper {
    long countByExample(ThreePhaseExample example);

    int deleteByExample(ThreePhaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThreePhase record);

    int insertSelective(ThreePhase record);

    List<ThreePhase> selectByExampleWithRowbounds(ThreePhaseExample example, RowBounds rowBounds);

    List<ThreePhase> selectByExample(ThreePhaseExample example);

    ThreePhase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThreePhase record, @Param("example") ThreePhaseExample example);

    int updateByExample(@Param("record") ThreePhase record, @Param("example") ThreePhaseExample example);

    int updateByPrimaryKeySelective(ThreePhase record);

    int updateByPrimaryKey(ThreePhase record);
}