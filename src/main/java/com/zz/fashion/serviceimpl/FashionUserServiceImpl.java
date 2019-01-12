package com.zz.fashion.serviceimpl;

import com.zz.fashion.dao.FashionUserMapper;
import com.zz.fashion.pojo.FashionUser;
import com.zz.fashion.service.FashionService;
import com.zz.fashion.service.FashionUserService;
import com.zz.fashion.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

@Service
public class FashionUserServiceImpl implements FashionUserService {

    @Autowired
    private FashionUserMapper fashionUserMapper;
    @Override
    public ResultVo queryByCondition(Integer id) {
        Map<String,Object> map = new HashMap<String, Object>();
        List<FashionUser> fashionUsers;
        if (id != null){
            map.put("id",id);
           fashionUsers = fashionUserMapper.queryByCondition(map);

        }else {
            fashionUsers = fashionUserMapper.queryByCondition2();
        }

        if (fashionUsers != null){
            return  ResultVo.setOK(fashionUsers);
        }
      return ResultVo.setERROR();
    }
}
