package com.example.hoh.model.mapper;

import com.example.hoh.model.entity.Recipe;

import java.util.List;
import java.util.Map;

public interface RecipeMapper {
    int deleteByPrimaryKey(Integer recipeId);

    int insert(Recipe record);

    int insertSelective(Recipe record);

    Recipe selectByPrimaryKey(Integer recipeId);

    int updateByPrimaryKeySelective(Recipe record);

    int updateByPrimaryKey(Recipe record);
}
