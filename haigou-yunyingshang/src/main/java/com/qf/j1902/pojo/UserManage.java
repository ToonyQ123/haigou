package com.qf.j1902.pojo;

import lombok.Data;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 15:48 2019/7/30
 */
@Data
public class UserManage {
    private int id;  //用户ID
    private String username;  //用户账户
    private String password;  //用户密码
    private String realName;  //用户真实姓名
    private String start;  //账号状态
    private String userIdentity;  //账号身份
}
