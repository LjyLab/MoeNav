package com.zking.dao;

import com.zking.entity.NavLinks;
import com.zking.entity.NavLinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavLinksMapper {
    long countByExample(NavLinksExample example);

    int deleteByExample(NavLinksExample example);

    int deleteByPrimaryKey(Integer linkId);

    int insert(NavLinks record);

    int insertSelective(NavLinks record);

    List<NavLinks> selectByExample(NavLinksExample example);

    NavLinks selectByPrimaryKey(Integer linkId);

    int updateByExampleSelective(@Param("record") NavLinks record, @Param("example") NavLinksExample example);

    int updateByExample(@Param("record") NavLinks record, @Param("example") NavLinksExample example);

    int updateByPrimaryKeySelective(NavLinks record);

    int updateByPrimaryKey(NavLinks record);
}