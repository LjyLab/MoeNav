package com.zking.service;

import com.zking.entity.NavCont;
import com.zking.entity.NavContExample;

import java.util.List;

public interface ContService {
    List<NavCont> selectByExample(NavContExample example);
    int insertSelective(NavCont record);
}
