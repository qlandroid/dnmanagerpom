package com.dnmanager.dao;

import com.dnmanager.pojo.Warn;
import com.dnmanager.select.WarnSelect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarnExtMapper extends WarnMapper {

    List<Warn> selectWarnAllByUserId(WarnSelect warnSelect);
}
