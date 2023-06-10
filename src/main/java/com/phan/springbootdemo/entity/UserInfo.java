package com.phan.springbootdemo.entity;

import java.io.Serializable;

/**
 * @ClassName : UserInfoEntity
 * @Description : 用户信息
 * @Author : KevenQian
 * @Date: 2021-03-23
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 5615239963323983062L;

    private long id;
    private String userCode;
    private String userName;
    private String passWord;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

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
