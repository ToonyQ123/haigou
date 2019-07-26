package com.qf.j1902.utils;

/**
 * Created by zhou on 2019/7/24.
 */
public enum  ResultStatus {

    SUCCESS(200),
    FAIL(400),
    NOTFOUND(404);
    public     Integer code;

    ResultStatus(Integer code){
        this.code=code;
    }

}
