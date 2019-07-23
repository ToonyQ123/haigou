package com.qf.j1902.pojo;

import lombok.Data;

import java.math.BigDecimal;
/*
* 订单明细
* */
@Data
public class TbOrderItem {
    private Long id;

    private Long itemId;//商品id

    private Long goodsId;//SPU_ID

    private Long orderId;//订单id

    private String title;//商品标题

    private BigDecimal price;//商品单价

    private Integer num;//商品购买数量

    private BigDecimal totalFee;//商品总金额

    private String picPath;//商品图片地址

    private String sellerId;//


}