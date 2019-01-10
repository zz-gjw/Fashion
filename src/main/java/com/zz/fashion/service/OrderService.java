package com.zz.fashion.service;

import com.zz.fashion.pojo.Order;
import com.zz.fashion.pojo.OrderDetail;
import com.zz.fashion.vo.ResultVo;

import java.util.List;


public interface OrderService {

    //添加订单
    public ResultVo insertOrder(Order order, List<OrderDetail> orderDetailList);

    //修改订单
    public ResultVo modifyOrder(Order order);

    //查询订单
    public ResultVo selectOrder(Order order);

}
