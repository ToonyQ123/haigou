package com.qf.j1902.pojo;

import lombok.Data;

import java.util.Date;
/*
* 用户
* */

@Data
public class TbUser {
    private Long id;//

    private String username;//用户名

    private String password;//密码，加密存储

    private String phone;//注册手机号

    private String email;//注册邮箱

    private Date created;//创建时间

    private Date updated;//会员来源：1:PC，2：H5，3：Android，4：IOS，5：WeChat

    private String sourceType;//

    private String nickName;//昵称

    private String name;//真实姓名

    private String status;//使用状态（Y正常 N非正常）

    private String headPic;//头像地址

    private String qq;//QQ号码

    private Long accountBalance;//账户余额

    private String isMobileCheck;//手机是否验证 （0否  1是）

    private String isEmailCheck;//邮箱是否检测（0否  1是）

    private String sex;//性别，1男，2女

    private Integer userLevel;//会员等级

    private Integer points;//积分

    private Integer experienceValue;//经验值

    private Date birthday;//生日

    private Date lastLoginTime;//最后登录时间
}