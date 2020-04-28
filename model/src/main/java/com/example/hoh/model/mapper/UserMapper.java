package com.example.hoh.model.mapper;

import com.example.hoh.model.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selectByUsername(@Param("username")String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
