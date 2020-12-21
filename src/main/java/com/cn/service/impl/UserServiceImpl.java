package com.cn.service.impl;

import com.cn.dao.UserDao;
import com.cn.model.User;
import com.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.findUsers();
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
