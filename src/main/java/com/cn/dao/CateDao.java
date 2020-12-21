package com.cn.dao;

import com.cn.model.Cate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CateDao {
    List<Cate> findCates();

    int addCate(@Param("name") String name);

}
