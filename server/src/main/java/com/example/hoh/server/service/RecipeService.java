package com.example.hoh.server.service;

import com.example.hoh.model.entity.Recipe;
import com.example.hoh.model.mapper.RecipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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




}
