package com.cn.service.impl;

import com.cn.dao.CateDao;
import com.cn.model.Cate;
import com.cn.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateServiceImpl implements CateService {
    @Autowired
    private CateDao cateDao;

    @Override
    public List<Cate> findCates() {
        return cateDao.findCates();
    }

    @Override
    public int addCate(String name) {
        return cateDao.addCate(name);
    }
}
