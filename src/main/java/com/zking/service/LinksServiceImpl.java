package com.zking.service;

import com.zking.dao.NavLinksMapper;
import com.zking.entity.NavLinks;
import com.zking.entity.NavLinksExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinksServiceImpl implements LinksService{
    @Autowired
    NavLinksMapper navLinksMapper;

    @Override
    public List<NavLinks> selectByExample(NavLinksExample example) {
        return navLinksMapper.selectByExample(example);
    }

    @Override
    public int insertSelective(NavLinks record) {
        //只能用基础的插入
        return navLinksMapper.insert(record);

        //这是MyBatis的插入
//        return navLinksMapper.insertSelective(record);
    }
}
