package com.dnmanager.service;


import com.dnmanager.pojo.User;

public interface IUserService {


    boolean reg(User user);

    User login(User user);

    User forgetPw(User user);


    void resetDetails(User user);
}
