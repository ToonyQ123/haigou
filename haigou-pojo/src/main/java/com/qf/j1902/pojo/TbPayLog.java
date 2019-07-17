package com.qf.j1902.pojo;

import lombok.Data;

import java.util.Date;
/*
* 支付日志
* */

@Data
public class TbPayLog {
    private String outTradeNo;

    private Date createTime;

    private Date payTime;

    private Long totalFee;

    private String userId;

    private String transactionId;

    private String tradeState;

    private String orderList;

    private String payType;


}