package com.qf.j1902.pojo;

import lombok.Data;
/*
* 内容（广告）
*
* */
@Data
public class TbContent {
    private Long id;

    private Long categoryId;

    private String title;

    private String url;

    private String pic;

    private String status;

    private Integer sortOrder;


}