package com.zking.dao;

import com.zking.entity.NavAdmin;
import com.zking.entity.NavAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavAdminMapper {
    long countByExample(NavAdminExample example);

    int deleteByExample(NavAdminExample example);

    int deleteByPrimaryKey(Integer adminUid);

    int insert(NavAdmin record);

    int insertSelective(NavAdmin record);

    List<NavAdmin> selectByExample(NavAdminExample example);

    NavAdmin selectByPrimaryKey(Integer adminUid);

    int updateByExampleSelective(@Param("record") NavAdmin record, @Param("example") NavAdminExample example);

    int updateByExample(@Param("record") NavAdmin record, @Param("example") NavAdminExample example);

    int updateByPrimaryKeySelective(NavAdmin record);

    int updateByPrimaryKey(NavAdmin record);
}