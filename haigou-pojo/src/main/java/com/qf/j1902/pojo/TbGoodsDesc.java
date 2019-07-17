package com.qf.j1902.pojo;

import lombok.Data;
/*
* 商品详情
* */
@Data
public class TbGoodsDesc {
    private Long goodsId;

    private String introduction;

    private String specificationItems;

    private String customAttributeItems;

    private String itemImages;

    private String packageList;

    private String saleService;


}