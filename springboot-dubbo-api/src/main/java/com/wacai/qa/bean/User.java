package com.wacai.qa.bean;

import java.io.Serializable;

public class User implements Serializable {

    Long userId;

    String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
