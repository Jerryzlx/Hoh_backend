package com.example.hoh.server.controller;

import com.example.hoh.api.response.BaseResponse;
import com.example.hoh.api.response.StatusCode;
import com.example.hoh.server.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Erzhen Zhang
 * @version 1.0
 * @date 2020-04-10 03:34
 */

@Controller
@RequestMapping("user")
public class UserController extends AbstractContoller{

    @Autowired
    private UserService userService;

    @RequestMapping(value = "signin", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse info(@RequestBody Map<String, Object> params) {
        String username = (String) params.get("username");
        String password = (String) params.get("password");
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return new BaseResponse(StatusCode.InvalidParams);
        }
        BaseResponse response = new BaseResponse(StatusCode.Success);
        try {
            response.setData(userService.getInfo(username));
        }catch (Exception e) {
            log.error("UserController~User detail- Exception: username={}", username);
            response= new BaseResponse(StatusCode.Fail.getCode(), e.getMessage());
        }
        return response;
    }
}
