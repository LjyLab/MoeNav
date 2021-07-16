package com.zking.dao;

import com.zking.entity.NavCont;
import com.zking.entity.NavContExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavContMapper {
    long countByExample(NavContExample example);

    int deleteByExample(NavContExample example);

    int deleteByPrimaryKey(Integer moeCid);

    int insert(NavCont record);

    int insertSelective(NavCont record);

    List<NavCont> selectByExample(NavContExample example);

    NavCont selectByPrimaryKey(Integer moeCid);

    int updateByExampleSelective(@Param("record") NavCont record, @Param("example") NavContExample example);

    int updateByExample(@Param("record") NavCont record, @Param("example") NavContExample example);

    int updateByPrimaryKeySelective(NavCont record);

    int updateByPrimaryKey(NavCont record);
}