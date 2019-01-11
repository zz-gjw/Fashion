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

    @ApiOperation(notes="根据路径中传递的男装类型id（manStyleId），查询该男装类型的所有商品",value = "根据男装类型查询该类型的所有商品的接口")
    @GetMapping("findMenWearById.do")
    public ResultVo findMenWearById(Integer manStyleId){
        return goodsService.findMenWearById(manStyleId);
    }

    @ApiOperation(notes = "所有佩饰",value = "查询所有佩饰，没有参数")
    @GetMapping("selectAllBaLdric.do")
    public  ResultVo selectBaLdric(){
        return goodsService.selectAllPeiShi();
    }

    @ApiOperation(notes = "按条件查询所需佩饰",value = "price价格区间，detailStyleId佩饰类型id，saleStyle销量排序方式1或0，priceStyle价格排序方式1或0，排序时1代表正序，0代表倒叙，参数个数按需求传saleStyle和priceStyle两个只能选一个")
    @GetMapping("selectOrSortBaLdric.do")
    public  ResultVo selectOrSortBaLdric(String price, String detailStyleId, String saleStyle, String priceStyle) {

        ResultVo ro = goodsService.sortOrSelectDetail(price, detailStyleId, saleStyle,priceStyle);

        return ro;
    }
}
