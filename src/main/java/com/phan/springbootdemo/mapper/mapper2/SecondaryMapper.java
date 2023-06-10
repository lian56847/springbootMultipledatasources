package com.phan.springbootdemo.mapper.mapper2;

import com.phan.springbootdemo.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface SecondaryMapper {
    UserInfo queryUserByCodeAndPass(@Param("userName") String userName, @Param("passWord") String passWord);

}
