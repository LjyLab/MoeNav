package com.zking.service;

import com.zking.dao.NavContMapper;
import com.zking.entity.NavCont;
import com.zking.entity.NavContExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContServiceImpl implements ContService{
    @Autowired
    NavContMapper contMapper;

    @Override
    public List<NavCont> selectByExample(NavContExample example) {
        return contMapper.selectByExample(example);
    }

    @Override
    public int insertSelective(NavCont record) {
//        return contMapper.insertSelective(record);
        return contMapper.insert(record);
    }
}
