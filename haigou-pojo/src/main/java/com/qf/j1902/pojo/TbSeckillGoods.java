package com.qf.j1902.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class TbSeckillGoods {
    private Long id;//

    private Long goodsId;//spu ID

    private Long itemId;//sku ID

    private String title;//标题

    private String smallPic;//商品图片

    private BigDecimal price;//原价格

    private BigDecimal costPrice;//秒杀价格

    private String sellerId;//商家ID

    private Date createTime;//添加日期

    private Date checkTime;//审核日期

    private String status;//审核状态

    private Date startTime;//开始时间

    private Date endTime;//结束时间

    private Integer num;//秒杀商品数

    private Integer stockCount;//剩余库存数

    private String introduction;//描述


}