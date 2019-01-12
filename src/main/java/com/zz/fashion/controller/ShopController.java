package com.zz.fashion.controller;

import com.zz.fashion.service.ShopService;
import com.zz.fashion.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "商品信息接口文档")
@RestController
@CrossOrigin
public class ShopController {

    @Autowired
    private ShopService shopService;

    @ApiOperation(notes="根据id查询商店的信息详情",value = "主要获取指定商店信息" ,tags = "根据id获取商店下的信息")
    @GetMapping("findShopById.do")
    public ResultVo findShopById(Integer id){

        return shopService.findShopById(id);
    }


}
