package com.qf.j1902.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class TbAddress {
    private Long id;//主键id

    private String userId;//用户ID

    private String provinceId;//省

    private String cityId;//市

    private String townId;//镇/区

    private String mobile;//手机

    private String address;//详细地址

    private String contact;//联系人

    private String isDefault;//是否是默认 1默认 0否

    private String notes;//备注

    private Date createDate;//创建日期

    private String alias;//别名

}