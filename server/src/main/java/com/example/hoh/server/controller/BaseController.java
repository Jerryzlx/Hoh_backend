package com.example.hoh.server.controller;

import com.example.hoh.api.response.BaseResponse;
import com.example.hoh.api.response.StatusCode;
import com.example.hoh.server.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Erzhen Zhang
 * @version 1.0
 * @date 2020-04-09 20:24
 */

@RestController
@RequestMapping("api")
public class BaseController extends AbstractContoller {

    @Autowired
    private BaseService baseService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public BaseResponse info() {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        try {
            response.setData("Java全程实战-SpringBoot111");
        } catch (Exception e) {
            response = new BaseResponse(StatusCode.Fail.getCode(), e.getMessage());
        }
        return response;
    }


}
