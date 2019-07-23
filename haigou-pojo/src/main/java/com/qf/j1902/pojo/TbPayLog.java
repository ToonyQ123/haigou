package com.qf.j1902.pojo;

import lombok.Data;

import java.util.Date;
/*
* 支付日志
* */

@Data
public class TbPayLog {
    private String outTradeNo;//支付订单号

    private Date createTime;//创建日期

    private Date payTime;//支付完成时间

    private Long totalFee;//支付金额（分）

    private String userId;//用户ID

    private String transactionId;//交易号码

    private String tradeState;//交易状态

    private String orderList;//订单编号列表

    private String payType;//支付类型


}