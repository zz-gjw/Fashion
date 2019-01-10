package com.zz.fashion.controller;


import com.zz.fashion.service.GoodsService;
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
public class GoodsController {
    @Autowired
    private GoodsService goodsService;


    @ApiOperation(notes="女装首页信息展示",value = "主要获取女装的图片",tags = "首页信息")
    @GetMapping("womensale.do")
    public ResultVo findHotSale(){
         return  goodsService.findImg();

    }

    @ApiOperation(notes="女装首页信息展示",value = "主要获取女套装的图片",tags = "首页信息")
    @GetMapping("womenMath.do")
    public ResultVo findMatch(){
        return  goodsService.findMatch();

    }



}
