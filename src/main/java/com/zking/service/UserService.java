package com.zking.service;

import com.zking.entity.NavUsers;

public interface UserService {
    int insertSelective(NavUsers record);
    NavUsers selectByUser(NavUsers record);
}
