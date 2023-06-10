package com.phan.springbootdemo.pub.result;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final long serialVersionUID = 720995677453813774L;

    private String resultCode;
    private String resultDesc;
    private T resultData;

    public void successResult(T resultData){
        this.resultCode = "200";
        this.resultDesc = "success";
        this.resultData = resultData;
    }

    public void successResultNoData(){
        this.resultCode = "0";
        this.resultDesc = "success";
        this.resultData = null;
    }

    public void sysErrorResult(String errorDesc){
        this.resultCode = "-1";
        this.resultDesc = errorDesc;
        this.resultData = null;
    }

    public void errorResultNoData(String resultCode,String resultDesc){
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.resultData = null;
    }

    public Result(){}
    public Result(String resultCode, String resultDesc, T resultData) {
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.resultData = resultData;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public T getResultData() {
        return resultData;
    }

    public void setResultData(T resultData) {
        this.resultData = resultData;
    }
}
