package com.atguigu.dao;

import com.atguigu.pojo.Setmeal;

import java.util.List;

/*************************************************
                时间: 2020-12-28
                作者: 刘  辉
                描述: 
  ************************************************/
public interface TravelSetmealMapper {
    void add(Setmeal setmeal);

    List<Setmeal> getSetmealList();

    Setmeal findById(Integer id);
}
