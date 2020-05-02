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
//        Map<String, Object> map = new HashMap<>();
//        map.put("calories", calories);
//        if (title != null && title.length() != 0) {
//            map.put("title", title);
//        }
//        if (category != null && category.size() != 0) {
//            map.put("category", category);
//        }
//        return recipeMapper.selectByParamsMap(map);
        return recipeMapper.selectByParamsMap(params);
    }

    public List<Recipe> getFavorite(Integer user_id) throws Exception{
        return recipeMapper.selectByFavorite(user_id);
    }

    public int addFavorite(FavoriteKey favoriteKey) throws Exception{
        return favoriteMapper.insert(favoriteKey);
    }








}
