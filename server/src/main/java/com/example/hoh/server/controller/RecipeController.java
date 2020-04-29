package com.example.hoh.server.controller;

import com.example.hoh.api.response.BaseResponse;
import com.example.hoh.api.response.StatusCode;
import com.example.hoh.server.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Leixiong Zheng
 * @version 1.0
 * @date 2020-04-10 17:20
 */

@Controller
@RequestMapping("recipe")
public class RecipeController extends AbstractContoller {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse info(@RequestParam Integer calories) {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        try {
            response.setData(recipeService.info(calories));
        }catch (Exception e) {
            log.error("RecipeController~ Recipe info - Exception: calories={}", calories);
            response= new BaseResponse(StatusCode.Fail.getCode(), e.getMessage());
        }
        return response;
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse search(@RequestBody Map<String, Object> params ) {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        try {
            response.setData(recipeService.search(params));
        }catch (Exception e) {
            log.error("RecipeController~ Recipe info - Exception: calories=");
            response= new BaseResponse(StatusCode.Fail.getCode(), e.getMessage());
        }
        return response;
    }

}
