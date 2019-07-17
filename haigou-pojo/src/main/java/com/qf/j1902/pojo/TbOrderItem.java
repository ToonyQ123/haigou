package com.qf.j1902.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TbOrderItem {
    private Long id;

    private Long itemId;

    private Long goodsId;

    private Long orderId;

    private String title;

    private BigDecimal price;

    private Integer num;

    private BigDecimal totalFee;

    private String picPath;

    private String sellerId;


}