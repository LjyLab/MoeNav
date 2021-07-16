package com.zking.service;

import com.zking.dao.NavUsersMapper;
import com.zking.entity.NavUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    NavUsersMapper navUsersMapper;

    @Override
    public int insertSelective(NavUsers record) {
        int i = navUsersMapper.selectByUsers(record);
        if (i>0){
            return 5;
        }else {
            return navUsersMapper.insert(record);
        }
    }

    @Override
    public NavUsers selectByUser(NavUsers record) {
        return navUsersMapper.selectByUser(record);
    }
}
