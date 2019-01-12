package com.zz.fashion.controller;

import com.zz.fashion.service.FashionService;
import com.zz.fashion.service.FashionUserService;
import com.zz.fashion.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //
 * //                       _oo0oo_
 * //                      o8888888o
 * //                      88" . "88
 * //                      (| -_- |)
 * //                      0\  =  /0
 * //                    ___/`---'\___
 * //                  .' \\|     |// '.
 * //                 / \\|||  :  |||// \
 * //                / _||||| -:- |||||- \
 * //               |   | \\\  -  /// |   |
 * //               | \_|  ''\---/''  |_/ |
 * //               \  .-\__  '-'  ___/-. /
 * //             ___'. .'  /--.--\  `. .'___
 * //          ."" '<  `.___\_<|>_/___.' >' "".
 * //         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 * //         \  \ `_.   \_ __\ /__ _/   .-` /  /
 * //     =====`-.____`.___ \_____/___.-`___.-'=====
 * //                       `=---='
 * //
 * //
 * //     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * //
 * //               佛祖保佑         永无BUG
 * //
 */
@Api(value = "商品信息接口文档")
@RestController
@CrossOrigin
public class FashionUserController {

    @Autowired
    private FashionUserService fashionUserService;

    @ApiOperation(notes="获取时尚的信息",value = "不同的参数可以获取不同的信息 参数：明星：1，小个子：2 网红：3，素人：4， 。。。。。90后：6" ,tags = "获取时尚的信息")
    @GetMapping("queryByCondition.do")
    public ResultVo queryByCondition(Integer id){

        return fashionUserService.queryByCondition(id);
    }
}
