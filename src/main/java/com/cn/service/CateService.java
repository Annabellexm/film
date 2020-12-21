package com.cn.service;

import com.cn.model.Cate;

import java.util.List;

public interface CateService {
//查询所有类型
    List<Cate> findCates();

    int addCate(String name);

}
