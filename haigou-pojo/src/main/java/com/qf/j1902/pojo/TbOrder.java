package com.qf.j1902.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
/*
* 订单
* */
@Data
public class TbOrder {
    private Long orderId;//订单id

    private BigDecimal payment;//实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分

    private String paymentType;//支付类型，1、在线支付，2、货到付款

    private String postFee;//邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分

    private String status;//状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭,7、待评价

    private Date createTime;//订单创建时间

    private Date updateTime;//订单更新时间

    private Date paymentTime;//付款时间

    private Date consignTime;//发货时间

    private Date endTime;//交易完成时间

    private Date closeTime;//交易关闭时间

    private String shippingName;//物流名称

    private String shippingCode;//物流单号

    private String userId;//用户id

    private String buyerMessage;//买家留言

    private String buyerNick;//买家昵称

    private String buyerRate;//买家是否已经评价

    private String receiverAreaName;//收货人地区名称(省，市，县)街道

    private String receiverMobile;//收货人手机

    private String receiverZipCode;//收货人邮编

    private String receiver;//收货人

    private Date expire;//过期时间，定期清理

    private String invoiceType;//发票类型(普通发票，电子发票，增值税发票)

    private String sourceType;//订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端

    private String sellerId;//商家ID

}