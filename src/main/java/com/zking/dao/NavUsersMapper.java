package com.zking.dao;

import com.zking.entity.NavUsers;
import com.zking.entity.NavUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface NavUsersMapper {
    long countByExample(NavUsersExample example);

    int deleteByExample(NavUsersExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(NavUsers record);

    int insertSelective(NavUsers record);

    List<NavUsers> selectByExample(NavUsersExample example);

    NavUsers selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") NavUsers record, @Param("example") NavUsersExample example);

    int updateByExample(@Param("record") NavUsers record, @Param("example") NavUsersExample example);

    int updateByPrimaryKeySelective(NavUsers record);

    int updateByPrimaryKey(NavUsers record);

    NavUsers selectByUser(NavUsers record);

    @Select("select count(*) from nav_users where account = #{account} and #{password}")
    int selectByUsers(NavUsers record);
}