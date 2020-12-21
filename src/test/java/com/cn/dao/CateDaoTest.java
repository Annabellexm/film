package com.cn.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CateDaoTest {
    @Autowired
    private CateDao cateDao;

    @Test
    public void testSelect(){
        System.out.println(this.cateDao.findCates());
    }

}
