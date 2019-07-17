package com.qf.j1902.pojo;

import lombok.Data;
/*
* 商品分类
* */
@Data
public class TbItemCat {
    private Long id;

    private Long parentId;

    private String name;

    private Long typeId;

}