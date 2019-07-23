package com.qf.j1902.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
/*
* 商品明细
* */
@Data
public class TbItem {
    private Long id;//商品id，同时也是商品编号

    private String title;//商品标题

    private String sellPoint;//商品卖点

    private BigDecimal price;//商品价格，单位为：元

    private Integer stockCount;//

    private Integer num;//库存数量

    private String barcode;//商品条形码

    private String image;//商品图片

    private Long categoryid;//所属类目，叶子类目

    private String status;//商品状态，1-正常，2-下架，3-删除

    private Date createTime;//创建时间

    private Date updateTime;//更新时间

    private String itemSn;//

    private BigDecimal costPirce;//

    private BigDecimal marketPrice;//

    private String isDefault;//

    private Long goodsId;//

    private String sellerId;//

    private String cartThumbnail;//

    private String category;//

    private String brand;//

    private String spec;//

    private String seller;//

}