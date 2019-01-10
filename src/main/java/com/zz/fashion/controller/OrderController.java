package com.zz.fashion.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zz.fashion.consts.SystemConst;
import com.zz.fashion.pojo.Order;
import com.zz.fashion.pojo.OrderDetail;
import com.zz.fashion.service.OrderService;
import com.zz.fashion.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

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

    @ApiOperation(value = "修改订单状态，传入orderId 和 orderStatus订单状态id")
    @GetMapping("updateOrder.do")
    public  ResultVo updateOrder(Order order) {
        ResultVo ro = orderService.modifyOrder(order);

        return ro;
    }

    @ApiOperation(value = "添加订单 参考：http://localhost:8081/fashion/insertOrder.do?userId=3&orderStatus=1&orderPeisongStyleId=1&list=[{'oGoodsId':1,'goodsNum':2},{'oGoodsId':2,'goodsNum':1}]")
    @GetMapping("insertOrder.do")
    public ResultVo insertOrder(Order order,String list) throws IOException {

        if (order.getUserId() == null) {
            order.setUserId(SystemConst.currUsers.get("user").getId());
        }

        ObjectMapper mapper = new ObjectMapper();

        List<OrderDetail> list1 = mapper.readValue(list, new TypeReference<List<OrderDetail>>(){});

        ResultVo ro = orderService.insertOrder(order,list1);
        return ro;
    }
}
