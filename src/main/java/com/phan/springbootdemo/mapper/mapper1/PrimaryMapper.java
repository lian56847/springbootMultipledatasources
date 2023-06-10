package com.phan.springbootdemo.mapper.mapper1;

import com.phan.springbootdemo.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface PrimaryMapper {
    UserInfo queryUserByCodeAndPass(@Param("userName") String userName, @Param("passWord") String passWord);
}
