package com.atguigu.dao;

import org.apache.ibatis.annotations.Param;

/*************************************************
                时间: 2020-12-28
                作者: 刘  辉
                描述: 
  ************************************************/
public interface TravelSetmealTravelGroupMapper {
    void insert(@Param("id") Integer id,@Param("travelgroupIds") Integer[] travelgroupIds);
}
