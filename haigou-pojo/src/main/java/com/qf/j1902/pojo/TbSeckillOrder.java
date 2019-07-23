package com.qf.j1902.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class TbSeckillOrder {
    private Long id;//主键

    private Long seckillId;//秒杀商品ID

    private BigDecimal money;//支付金额

    private String userId;//用户

    private String sellerId;//商家

    private Date createTime;//创建时间

    private Date payTime;//支付时间

    private String status;//状态

    private String receiverAddress;//收货人地址

    private String receiverMobile;//收货人电话

    private String receiver;//收货人

    private String transactionId;//交易流水


}