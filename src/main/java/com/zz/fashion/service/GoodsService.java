package com.zz.fashion.service;

import com.zz.fashion.vo.ResultVo;

import java.util.Map;

//商品
public interface GoodsService {


    //查询女士首页的图片
    ResultVo findImg();
    //查询女士套装图片
    ResultVo findMatch();

    //所有佩饰
    ResultVo selectAllPeiShi();

    //佩饰查询
    ResultVo sortOrSelectDetail(String price, String detailStyleId, String saleStyle, String priceStyle);

    //展示所有男装
    ResultVo findMenWear();

    //根据男装类型查询该类型的所有商品
    ResultVo findMenWearById(Integer manStyleId);
}
