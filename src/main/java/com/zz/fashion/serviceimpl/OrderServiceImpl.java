package com.zz.fashion.serviceimpl;

import com.zz.fashion.dao.OrderMapper;
import com.zz.fashion.pojo.Order;
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

    @Override
    public ResultVo insertOrder(Order order) {

        int i = orderDao.insertSelective(order);
        if (i == 0) {
            return ResultVo.setERROR();
        }
        return ResultVo.setOK("null");
    }

    @Override
    public ResultVo modifyOrder(Order order) {


        return null;
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
