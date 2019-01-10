package com.zz.fashion.serviceimpl;

import com.zz.fashion.dao.OrderDetailMapper;
import com.zz.fashion.dao.OrderMapper;
import com.zz.fashion.pojo.Order;
import com.zz.fashion.pojo.OrderDetail;
import com.zz.fashion.service.OrderService;
import com.zz.fashion.vo.ResultVo;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderDao;

    @Autowired
    private OrderDetailMapper orderDetailDao;

    @Override
    public ResultVo insertOrder(Order order, List<OrderDetail> orderDetailList) {

        int i = orderDao.insertSelective(order);

        int orderId = order.getOrderId();
        int a = 0;
        for (OrderDetail orderDetail :
                orderDetailList) {
            orderDetail.setdOrderId(orderId);
            a = orderDetailDao.insertSelective(orderDetail);
        }

        if (i == 0 || a == 0) {
            return ResultVo.setERROR();
        }

        Order order1 = new Order();
        order1.setOrderId(orderId);
        List<Order> order2 = orderDao.selectOrder(order1);
        return ResultVo.setOK(order2);
    }

    @Override
    public ResultVo modifyOrder(Order order) {
        int i = orderDao.updateByPrimaryKeySelective(order);

        if (i == 0) {
            return ResultVo.setERROR();
        }

        return ResultVo.setOK(order);
    }

    @Override
    public ResultVo selectOrder(Order order) {

        List<Order> list = orderDao.selectOrder(order);

        if (list != null) {
            return ResultVo.setOK(list);
        }

        return ResultVo.setERROR();
    }


}
