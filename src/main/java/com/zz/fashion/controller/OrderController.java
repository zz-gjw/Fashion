package com.zz.fashion.controller;

import com.zz.fashion.pojo.Order;
import com.zz.fashion.service.OrderService;
import com.zz.fashion.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api
@RestController
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation( value = "订单查询的接口，传入参数为orderId， userId 用户id， orderStatus 订单状态id， orderPeisongStyleId 配送方式id， orderLiuyan 留言 中任意0个或多个")
    @GetMapping("selectOrder.do")
    public ResultVo selectOrder(Order order) {
        ResultVo ro = orderService.selectOrder(order);

        return  ro;
    }
}
