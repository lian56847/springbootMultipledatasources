package com.phan.springbootdemo.service;


import com.phan.springbootdemo.entity.UserInfo;

public interface UserService {
    UserInfo queryUserByCodeAndPass(String userName, String passWord);
}
