package com.phan.springbootdemo.controller;

import com.phan.springbootdemo.entity.UserInfo;
import com.phan.springbootdemo.entity.vo.UserInfoVO;
import com.phan.springbootdemo.pub.result.Result;
import com.phan.springbootdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "UserServer",tags = {"用户服务"})
@RestController
@RequestMapping("/user")
public class UserInfoController {
    Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserService userService;

    @ApiOperation("用户登录")
    @PostMapping("/login")
    public Result userLogin(UserInfoVO user){
        Result result = new Result();
        if (!StringUtils.isEmpty(user.getUserName()) && !StringUtils.isEmpty(user.getPassWord())){
            //不为空，到userInfo表查找user
            UserInfo userInfo = null;
            try {
                userInfo  = userService.queryUserByCodeAndPass(user.getUserName(),user.getPassWord());
            } catch (Exception e) {
                logger.error("登录出问题了！errorMsg: {}",e);
                result.errorResultNoData("400","登录系统故障了！请稍后再试！");
            }
            if (userInfo != null){
                logger.info("用户 {} 登录成功！",userInfo.getUserName());
                result.successResult("登录成功！");
            }else {
                logger.error("账号或密码不正确！请确认后再登录！");
                result.errorResultNoData("404","账号或密码不正确！");
            }
        }else {
            logger.error("账号和密码不饿能为空！");
            result.errorResultNoData("400","账号和密码不能为空！");
        }
        return result;
    }

}
