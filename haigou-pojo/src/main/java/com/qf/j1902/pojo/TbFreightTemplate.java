package com.qf.j1902.pojo;

import lombok.Data;

import java.util.Date;
/*
* 运货模板
* */
@Data
public class TbFreightTemplate {
    private Long id;//主键id

    private String sellerId;//商家ID

    private String isDefault;//是否默认   （‘Y’是   'N'否）

    private String name;//模版名称

    private String sendTimeType;//发货时间（1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ）

    private Long price;//统一价格

    private Date createTime;//创建时间

}