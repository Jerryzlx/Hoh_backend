package com.example.hoh.model.mapper;

import com.example.hoh.model.entity.FavoriteKey;

public interface FavoriteMapper {
    int deleteByPrimaryKey(FavoriteKey key);

    int insert(FavoriteKey record);

    FavoriteKey selectByPrimaryKey(FavoriteKey record);

    int insertSelective(FavoriteKey record);
}
