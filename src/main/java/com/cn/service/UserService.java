package com.cn.service;


import com.cn.model.User;

import java.util.List;

public interface UserService {
    //查询所有用户
     List<User> findUsers();
     //添加
    int addUser(User user);
}
