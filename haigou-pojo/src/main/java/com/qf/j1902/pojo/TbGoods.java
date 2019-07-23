package com.qf.j1902.pojo;

import lombok.Data;

import java.math.BigDecimal;
/*
*
* 商品
* */
@Data
public class TbGoods {
    private Long id;//主键

    private String sellerId;//商家ID

    private String goodsName;//SPU名

    private Long defaultItemId;//默认SKU

    private String auditStatus;//状态

    private String isMarketable;//是否上架

    private Long brandId;//品牌id

    private String caption;//副标题

    private Long category1Id;//一级类目

    private Long category2Id;//二级类目

    private Long category3Id;//三级类目

    private String smallPic;//小图

    private BigDecimal price;//商城价

    private Long typeTemplateId;//分类模板ID

    private String isEnableSpec;//是否启用规格

    private String isDelete;//是否删除

}