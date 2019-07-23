package com.qf.j1902.pojo;

import lombok.Data;
/*
* 内容（广告）
*
* */
@Data
public class TbContent {
    private Long id;

    private Long categoryId;//内容类目ID

    private String title;//内容标题

    private String url;//链接

    private String pic;//图片绝对路径

    private String status;//状态

    private Integer sortOrder;//排序


}