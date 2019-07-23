package com.qf.j1902.pojo;

import lombok.Data;
/*
* 商品详情
* */
@Data
public class TbGoodsDesc {
    private Long goodsId;//SPU_ID

    private String introduction;//描述

    private String specificationItems;//规格结果集，所有规格，包含isSelected

    private String customAttributeItems;//自定义属性（参数结果）

    private String itemImages;//

    private String packageList;//包装列表

    private String saleService;//售后服务


}