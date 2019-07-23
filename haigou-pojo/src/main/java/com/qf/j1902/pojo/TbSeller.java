package com.qf.j1902.pojo;

import lombok.Data;

import java.util.Date;
/*
* 商家
* */
@Data
public class TbSeller {
    private String sellerId;//用户ID

    private String name;//公司名

    private String nickName;//店铺名称

    private String password;//密码

    private String email;//EMAIL

    private String mobile;//公司手机

    private String telephone;//公司电话

    private String status;//状态

    private String addressDetail;//详细地址

    private String linkmanName;//联系人姓名

    private String linkmanQq;//联系人qq

    private String linkmanMobile;//联系人电话

    private String linkmanEmail;//联系人EMAIL

    private String licenseNumber;//营业执照号

    private String taxNumber;//税务登记证号

    private String orgNumber;//组织机构代码

    private Long address;//公司地址

    private String logoPic;//公司LOGO图

    private String brief;//简介

    private Date createTime;//创建日期

    private String legalPerson;//法定代表人

    private String legalPersonCardId;//法定代表人身份证

    private String bankUser;//开户行账号名称

    private String bankName;//开户行

}