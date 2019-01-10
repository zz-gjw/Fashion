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


    @ApiOperation(notes="女装首页信息展示",value = "主要获取女装的图片")
    @GetMapping("womensale.do")
    public ResultVo findHotSale(){
         return  goodsService.findImg();
    }

    @ApiOperation(notes="女装首页信息展示",value = "主要获取女套装的图片")
    @GetMapping("womenMath.do")
    public ResultVo findMatch(){
        return  goodsService.findMatch();
    }

    @ApiOperation(notes="展示男装的详细信息，包括价格，颜色，尺寸.......",value = "展示男装的接口")
    @GetMapping("findMenWear.do")
    public ResultVo findMenWear(){
        return goodsService.findMenWear();
    }

    @ApiOperation(notes="根据路径中传递的男装类型（manStyleId），查询该男装类型的所有商品",value = "根据男装类型查询该类型的所有商品的接口")
    @GetMapping("findMenWearById.do")
    public ResultVo findMenWearById(Integer manStyleId){
        return goodsService.findMenWearById(manStyleId);
    }



}
