package com.zz.fashion.service;

import com.zz.fashion.pojo.Goods;
import com.zz.fashion.vo.ResultVo;

import java.util.List;
import java.util.Map;

//商品
public interface GoodsService {


    //查询女士首页的图片
    ResultVo findImg();
    //查询女士套装图片
    ResultVo findMatch();
    //按照销量进行查询
    ResultVo findSaleVolume();
    //女装按照价格升序排序
    ResultVo findSortByPriceAsc();
    //女装按照价格升序排序
    ResultVo findSortByPriceDesc();
    //按照价格进行筛选查询
    ResultVo filterByPrice(Integer price);

    //展示所有
    ResultVo findAll();

    //所有佩饰
    ResultVo selectAllPeiShi();

    //佩饰查询
    ResultVo sortOrSelectDetail(String price, String detailStyleId, String saleStyle, String priceStyle);
    //按照最新的上架时间进行查询
    ResultVo clothByNew();
    //按照最新的单品进行查询
    ResultVo colthByNewDan();
    //按照最新的套装进行查询
    ResultVo colthByNewBoth();
    //按照搭配更多的进行查询
    ResultVo matchMore();


    //展示所有男装
    ResultVo findMenWear();

    //根据男装类型查询该类型的所有商品
    ResultVo findMenWearById(Integer manStyleId);
    //按照销量降序进行查询男装
    ResultVo findMenBySales();
    //按照价格升降序、价格区间动态查询男装
    ResultVo findMenByPrice(String price, String priceStyle);
    //男装服饰最新上架
    ResultVo findMenByTime();
}
