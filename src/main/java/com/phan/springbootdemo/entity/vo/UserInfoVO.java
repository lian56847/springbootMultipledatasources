package com.phan.springbootdemo.entity.vo;

import java.io.Serializable;

/**
 * @ClassName : UserInfoVO
 * @Description : user vo
 * @Author : KevenQian
 * @Date: 2021-03-23
 */
public class UserInfoVO implements Serializable {
    private static final long serialVersionUID = 650019606452276956L;

    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
