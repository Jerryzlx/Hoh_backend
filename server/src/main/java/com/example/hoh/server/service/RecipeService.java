package com.example.hoh.server.service;

import com.example.hoh.model.entity.FavoriteKey;
import com.example.hoh.model.entity.Recipe;
import com.example.hoh.model.mapper.FavoriteMapper;
import com.example.hoh.model.mapper.RecipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.ExportException;
import java.util.List;
import java.util.Map;

/**
 * @author Leixiong Zheng
 * @version 1.0
 * @date 2020-04-10 17:22
 */

@Service
public class RecipeService extends AbstractService {

    @Autowired
    private RecipeMapper recipeMapper;
    @Autowired
    private FavoriteMapper favoriteMapper;

    public List<Recipe> info(Integer calories) throws Exception{
        return recipeMapper.selectByCalories(calories);
    }

    public List<Recipe> search(Map<String, Object> params) throws Exception{
        return recipeMapper.selectByParamsMap(params);
    }

    public List<Recipe> getFavorite(Integer user_id) throws Exception{
        return recipeMapper.selectByFavorite(user_id);
    }

    public List<Recipe> getRandomRecipe() throws Exception{
        return recipeMapper.selectByRandom();
    }

    public int addFavorite(FavoriteKey favoriteKey) throws Exception{
        return favoriteMapper.insert(favoriteKey);
    }

    public int removeFavorite(FavoriteKey favoriteKey) throws Exception{
        return favoriteMapper.deleteByPrimaryKey(favoriteKey);
    }


    public FavoriteKey isFavorite(FavoriteKey favoriteKey) throws Exception{
        return favoriteMapper.selectByPrimaryKey(favoriteKey);
    }








}
