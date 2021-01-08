package com.atguigu.dao;

import com.atguigu.entity.QueryPageBean;
import com.atguigu.pojo.Travelgroup;

import java.util.List;

/*************************************************
                时间: 2020-12-26
                作者: 刘  辉
                描述: 
  ************************************************/
public interface TravelgroupMapper {
    void save(Travelgroup travelgroup);

    List<Travelgroup> selectList(QueryPageBean queryPageBean);

    void delete(Integer id);

    Travelgroup findById(Integer id);

    void edit(Travelgroup travelgroup);

    List<Travelgroup> findAll();
}
