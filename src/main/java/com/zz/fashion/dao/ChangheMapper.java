package com.zz.fashion.dao;

import com.zz.fashion.pojo.Changhe;

public interface ChangheMapper {
    int deleteByPrimaryKey(Integer changheId);

    int insert(Changhe record);

    int insertSelective(Changhe record);

    Changhe selectByPrimaryKey(Integer changheId);

    int updateByPrimaryKeySelective(Changhe record);

    int updateByPrimaryKey(Changhe record);
}