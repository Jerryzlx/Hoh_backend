package com.example.hoh.server.dto;

import java.io.Serializable;

/**
 * @author Erzhen Zhang
 * @version 1.0
 * @date 2020-04-10 00:45
 */
public class BaseDto implements Serializable {
    private Integer id;
    private String content;

    public BaseDto() {
    }

    public BaseDto(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "BaseDto{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
