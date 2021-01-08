package com.atguigu.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/*************************************************
                时间: 2020-12-26
                作者: 刘  辉
                描述: 
  ************************************************/
public interface TravelgroupTravelitemMapper {
    void deleteByTravelItemId(Integer tid);

    long count(Integer tid);

    void insert(@Param("id") Integer id,@Param("tids") Integer[] tids);

    List<Integer> findTravelItemIdByTravelgroupId(Integer id);

    void deleteByTravelGroupId(Integer id);
}
