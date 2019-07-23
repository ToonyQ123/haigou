package com.qf.j1902.pojo;

import lombok.Data;
/*
* 商品分类
* */
@Data
public class TbItemCat {
    private Long id;//类目ID

    private Long parentId;//父类目ID=0时，代表的是一级的类目

    private String name;//类目名称

    private Long typeId;//类型id

}