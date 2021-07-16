package com.zking.service;

import com.zking.entity.NavLinks;
import com.zking.entity.NavLinksExample;

import java.util.List;

public interface LinksService {
    List<NavLinks> selectByExample(NavLinksExample example);
    int insertSelective(NavLinks record);
}
