package com.zz.fashion.controller;


import com.zz.fashion.service.GoodsService;
import com.zz.fashion.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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

    @ApiOperation(notes="男装按照销量降序进行查询所有",value = "男装按照销量降序进行查询所有，点击‘销量’获取信息，热销榜单也可以调用")
    @GetMapping("findMenBySales.do")
    public ResultVo findMenBySales(){
        return goodsService.findMenBySales();
    }

    @ApiOperation(notes = "按照价格升降序、价格区间动态查询男装",value = "price：展示输入的价格以下的商品，传入priceStyle=1代表升序，传入priceStyle=0代表降序，不传参数为查询所有与findMenWear.do接口作用相同")
    @GetMapping("findMenByPrice.do")
    public ResultVo findMenByPrice(String price, String priceStyle){
        return goodsService.findMenByPrice(price, priceStyle);
    }

    @ApiOperation(notes="男装按照上架时间降序进行查询所有",value = "点击‘最新上架’获取信息")
    @GetMapping("findMenByTime.do")
    public ResultVo findMenByTime(){
        return goodsService.findMenByTime();
    }


    @ApiOperation(notes="女装按照销量进行查询",value = "点击销量按钮获取的信息",tags = "女装销量查询")
    @GetMapping("saleVolume.do")
    public ResultVo findSaleVolume(){
        return  goodsService.findSaleVolume();

    }
    @ApiOperation(notes="女装按照价格进行查询",value = "点击升序按钮获取的信息",tags = "女装价格升序查询")
    @GetMapping("priceAsc.do")
    public ResultVo findSortByPriceAsc(){
        return  goodsService.findSortByPriceAsc();

    }
    @ApiOperation(notes="女装按照价格进行查询",value = "点击降序按钮获取的信息",tags = "女装价格降序查询")
    @GetMapping("priceDesc.do")
    public ResultVo findSortByPriceDesc(){
        return  goodsService.findSortByPriceDesc();

    }
    @ApiOperation(notes="女装按照价格进行筛选",value = "点击筛选按钮获取的信息",tags = "女装价格区间查询")
    @GetMapping("filter.do")
    public ResultVo filterByPrice(Integer price ) {

        return goodsService.filterByPrice(price);
    }

    @ApiOperation(notes = "所有佩饰",value = "查询所有佩饰，没有参数")
    @GetMapping("selectAllBaLdric.do")
    public  ResultVo selectBaLdric(){
        return goodsService.selectAllPeiShi();
    }

    @ApiOperation(notes = "按条件查询所需佩饰",value = "price价格区间，detail佩饰类型，saleStyle销量排序方式1或0，priceStyle价格排序方式1或0，排序时1代表正序，0代表倒叙，参数个数按需求传saleStyle和priceStyle两个只能选一个")
    @GetMapping("selectOrSortBaLdric.do")
    public  ResultVo selectOrSortBaLdric(String price, String detailStyleId, String saleStyle, String priceStyle) {

        ResultVo ro = goodsService.sortOrSelectDetail(price, detailStyleId, saleStyle,priceStyle);

        return ro;
    }
    @ApiOperation(notes="女装按照最新时间进行查询",value = "获取最新上架的商品",tags = "女装最新上架查询")
    @GetMapping("clothByNew.do")
    public ResultVo clothByNew(){
        return  goodsService.clothByNew();

    }
    @ApiOperation(notes="女装按照最新上架单品进行查询",value = "获取最新上架单品的商品",tags = "女装最新上架单品查询")
    @GetMapping("clothByNewDan.do")
    public ResultVo clothByNewDan(){
        return  goodsService.colthByNewDan();

    }
    @ApiOperation(notes="女装按照最新上架套装进行查询",value = "获取最新上架套装的商品",tags = "女装最新上架套装查询")
    @GetMapping("clothByNewBoth.do")
    public ResultVo clothByNewBoth(){
        return  goodsService.colthByNewBoth();

    }
    @ApiOperation(notes="女装搭配更多进行查询",value = "获取搭配更多的商品",tags = "女装搭配更多查询")
    @GetMapping("matchMore.do")
    public ResultVo matchMore(){
        return  goodsService.matchMore();

    }

    @ApiOperation(notes="根据指定类型id查询对应类型的所有服饰",value = "主要获取指定分类的所有服饰")
    @GetMapping("dynamicQueryAll.do")
    public ResultVo DynamicQueryAll(){
        return goodsService.findAll();
    }

    @ApiOperation(notes = "穿搭手册多个界面接口", value = "两个参数goodsChuanStyle穿搭风格id 1-15 必须有一个，flag为风格内小分类id 按照里面位置flag有1、2、3、4 如果不写这个参数则为此系列所有商品")
    @GetMapping("selectGoodsByChuanDa.do")
    public ResultVo selectGoodsByChuanDa(String goodsChuandaStyle, String flag) {

        return goodsService.selectGoodsByChuanDa(goodsChuandaStyle,flag);
    }
    @ApiOperation(notes="根据id查询对应类型的服装",value = "主要获取指定分类的所有服饰" ,tags = "根据id获取详细信息")
    @GetMapping("selectByPrimaryKey.do")
    public ResultVo selectByPrimaryKey(Integer id){

        return goodsService.selectByPrimaryKey(id);
    }


}
