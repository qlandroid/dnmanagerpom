package com.dnmanager.service;

public interface IBindService {
    void bindDev(Integer userId, String devCode, Integer buyPrice);

    void buyEle(Integer userId, Integer devId, Integer buyPrice);

    void buyDevVIP(Integer userId, Integer devId, Integer buyCount);
}
