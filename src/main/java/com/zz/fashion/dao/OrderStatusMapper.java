package com.zz.fashion.dao;

import com.zz.fashion.pojo.OrderStatus;

public interface OrderStatusMapper {
    int deleteByPrimaryKey(Integer orderStatusId);

    int insert(OrderStatus record);

    int insertSelective(OrderStatus record);

    OrderStatus selectByPrimaryKey(Integer orderStatusId);

    int updateByPrimaryKeySelective(OrderStatus record);

    int updateByPrimaryKey(OrderStatus record);
}