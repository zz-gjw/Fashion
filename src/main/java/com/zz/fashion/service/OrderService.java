package com.zz.fashion.service;

import com.zz.fashion.pojo.Order;
import com.zz.fashion.vo.ResultVo;


public interface OrderService {

    //添加订单
    public ResultVo insertOrder(Order order);

    //修改订单
    public ResultVo modifyOrder(Order order);

    //查询订单
    public ResultVo selectOrder(Order order);

}
