package com.zz.fashion.dao;

import com.zz.fashion.pojo.Size;

public interface SizeMapper {
    int deleteByPrimaryKey(Integer sizeId);

    int insert(Size record);

    int insertSelective(Size record);

    Size selectByPrimaryKey(Integer sizeId);

    int updateByPrimaryKeySelective(Size record);

    int updateByPrimaryKey(Size record);
}