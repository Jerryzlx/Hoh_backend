package com.example.hoh.server.service;

import com.example.hoh.api.response.BaseResponse;
import com.example.hoh.model.entity.User;
import com.example.hoh.model.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Erzhen Zhang
 * @version 1.0
 * @date 2020-04-10 03:06
 */

@Service
public class UserService extends AbstractService{

    @Autowired
    private UserMapper userMapper;

    public User getInfo(final String username) throws Exception{
        if (StringUtils.isNotBlank(username)) {
            return userMapper.selectByUsername(username);
        }
        return null;
    }

    public User signin(final String username, String password) throws Exception{
        if (StringUtils.isNotBlank(username)) {
            return userMapper.selectByUsernamePassword(username, password);
        }
        return null;
    }

    public int signup(User user) throws Exception{

        userMapper.insertSelective(user);
        return user.getUserId();
    }



}
