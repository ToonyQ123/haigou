package com.qf.j1902.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 封装登陆请求参数
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 10:52 2019/7/29
 */
@Data
public class LoginVo implements Serializable {
    private String username;  //用户名
    private String password;  //密码
}
