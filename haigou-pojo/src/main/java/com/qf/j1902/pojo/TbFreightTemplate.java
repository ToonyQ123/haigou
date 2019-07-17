package com.qf.j1902.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class TbFreightTemplate {
    private Long id;

    private String sellerId;

    private String isDefault;

    private String name;

    private String sendTimeType;

    private Long price;

    private Date createTime;

}