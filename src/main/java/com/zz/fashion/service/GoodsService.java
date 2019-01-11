package com.zz.fashion.service;

import com.zz.fashion.vo.ResultVo;

import java.util.Map;

public interface GoodsService {


    //查询女士首页的图片
    ResultVo findImg();
    //查询女士套装图片
    ResultVo findMatch();

    //展示所有
    ResultVo findAll();

    //所有佩饰
    ResultVo selectAllPeiShi();

    ResultVo sortOrSelectDetail(String price, String detailStyleId, String saleStyle, String priceStyle);
}
