package com.example.hoh.model.mapper;

import com.example.hoh.model.entity.RecipeCategoryKey;

public interface RecipeCategoryMapper {
    int deleteByPrimaryKey(RecipeCategoryKey key);

    int insert(RecipeCategoryKey record);

    int insertSelective(RecipeCategoryKey record);
}