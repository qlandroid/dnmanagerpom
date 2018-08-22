package com.dnmanager.bean;

import com.dnmanager.pojo.User;

public class UserDetails  {

    private User user;
    private Integer devCount;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getDevCount() {
        return devCount;
    }

    public void setDevCount(Integer devCount) {
        this.devCount = devCount;
    }
}
