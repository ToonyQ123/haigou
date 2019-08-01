package com.qf.j1902.pojo;

import lombok.Data;

/**
 * @Description: 对管理用户信息的封装
 * @Project Name: leyou
 * @Author: Kiana
 * @CreateData: 15:45 2019/7/24
 */
@Data
public class ManageUser {
    private int id;  //管理id
    private String username;  //管理账户
    private String password;  //管理密码
    private String realName;  //管理真实姓名
    private int start;  //账号状态
    private String identity;  //管理身份
}
