package com.zz.fashion.dao;

import com.zz.fashion.pojo.PeiSongStatus;

public interface PeiSongStatusMapper {
    int deleteByPrimaryKey(Integer peisongId);

    int insert(PeiSongStatus record);

    int insertSelective(PeiSongStatus record);

    PeiSongStatus selectByPrimaryKey(Integer peisongId);

    int updateByPrimaryKeySelective(PeiSongStatus record);

    int updateByPrimaryKey(PeiSongStatus record);
}