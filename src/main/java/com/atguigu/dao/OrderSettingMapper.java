package com.atguigu.dao;

import com.atguigu.pojo.OrderSetting;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/*************************************************
                时间: 2020-12-29
                作者: 刘  辉
                描述: 
  ************************************************/
public interface OrderSettingMapper {
    void batchInsert(@Param("args") List<OrderSetting> args);

    long countByDate(Date orderdate);

    void updateNumberByDate(OrderSetting orderSetting);

    void insert(OrderSetting orderSetting);

    List<OrderSetting> getOrderSettingByMonth(String toString);

    void editNumberByDate(OrderSetting orderSetting);
}
