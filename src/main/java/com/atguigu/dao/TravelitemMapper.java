package com.atguigu.dao;

import com.atguigu.entity.QueryPageBean;
import com.atguigu.pojo.Travelitem;

import java.util.List;

/*************************************************
                时间: 2020-12-25
                作者: 刘  辉
                描述: 
  ************************************************/
public interface TravelitemMapper {
    void add(Travelitem travelitem);

    List<Travelitem> getTravelItemList(QueryPageBean queryString);

    void deleteById(Integer tid);

    Travelitem findById(Integer id);

    void edit(Travelitem travelitem);

    List<Travelitem> findAll();
}
