package com.cn.dao;

import com.cn.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    //展示所有管理员
    List<User> findUsers();

    //添加
    int addUser(User user);


}
