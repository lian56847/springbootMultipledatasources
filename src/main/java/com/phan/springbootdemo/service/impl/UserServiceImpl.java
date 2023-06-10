package com.phan.springbootdemo.service.impl;

import com.phan.springbootdemo.entity.UserInfo;
import com.phan.springbootdemo.mapper.mapper1.PrimaryMapper;
import com.phan.springbootdemo.mapper.mapper2.SecondaryMapper;
import com.phan.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName : UserServiceImpl
 * @Description : 用户service
 * @Author : KevenQian
 * @Date: 2021-03-23
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private PrimaryMapper primaryMapper;
    @Resource
    SecondaryMapper secondaryMapper;

    @Override
    public UserInfo queryUserByCodeAndPass(String userName, String passWord) {
        return primaryMapper.queryUserByCodeAndPass(userName,passWord);
    }
}
