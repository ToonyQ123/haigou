package com.qf.j1902.pojo;

import lombok.Data;

import java.math.BigDecimal;
/*
*
* 商品
* */
@Data
public class TbGoods {
    private Long id;

    private String sellerId;

    private String goodsName;

    private Long defaultItemId;

    private String auditStatus;

    private String isMarketable;

    private Long brandId;

    private String caption;

    private Long category1Id;

    private Long category2Id;

    private Long category3Id;

    private String smallPic;

    private BigDecimal price;

    private Long typeTemplateId;

    private String isEnableSpec;

    private String isDelete;

}