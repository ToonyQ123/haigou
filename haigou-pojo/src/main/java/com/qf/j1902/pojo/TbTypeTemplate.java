package com.qf.j1902.pojo;

import lombok.Data;
/*
*类型模板：用于关联品牌和规格类型模板
*
* */
@Data
public class TbTypeTemplate {
    private Long id;//主键id

    private String name;//模板名称

    private String specIds;//关联规格（json格式）

    private String brandIds;//关联品牌（json格式）

    private String customAttributeItems;//扩展属性


}