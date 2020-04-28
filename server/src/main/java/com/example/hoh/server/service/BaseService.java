package com.example.hoh.server.service;

import com.example.hoh.server.dto.BaseDto;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Erzhen Zhang
 * @version 1.0
 * @date 2020-04-10 00:44
 */

@Service
public class BaseService extends AbstractService{
//    private static final Logger log = LoggerFactory.getLogger(BaseService.class);

    public List<BaseDto> getList() throws Exception{
        List<BaseDto> dtos = Lists.newLinkedList();
        dtos.add(new BaseDto(1, "Java全程实战一"));
        dtos.add(new BaseDto(2, "Java全程实战二"));
        return dtos;
    }
}
