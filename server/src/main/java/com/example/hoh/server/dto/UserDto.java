package com.example.hoh.server.dto;

import java.io.Serializable;

/**
 * @author Erzhen Zhang
 * @version 1.0
 * @date 2020-04-10 03:10
 */
public class UserDto implements Serializable {
    private Integer userId;

    private String username;

    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
