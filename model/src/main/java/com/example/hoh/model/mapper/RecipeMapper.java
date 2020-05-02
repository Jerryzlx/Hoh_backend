package com.example.hoh.model.mapper;

import com.example.hoh.model.entity.Recipe;

import java.util.List;
import java.util.Map;

public interface RecipeMapper {
    int deleteByPrimaryKey(Integer recipeId);

    int insert(Recipe record);

    int insertSelective(Recipe record);

    Recipe selectByPrimaryKey(Integer recipeId);

    List<Recipe> selectByCalories(Integer calories);

    List<Recipe> selectByParamsMap(Map<String, Object> params);

    List<Recipe> selectByFavorite(Integer user_id);

    int updateByPrimaryKeySelective(Recipe record);

    int updateByPrimaryKey(Recipe record);
}
