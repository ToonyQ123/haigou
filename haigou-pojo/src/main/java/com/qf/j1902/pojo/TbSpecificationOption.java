package com.qf.j1902.pojo;

import lombok.Data;
/*
* 规格选项
* */
@Data
public class TbSpecificationOption {
    private Long id;//主键id

    private String optionName;//规格选项名称

    private Long specId;//规格ID

    private Integer orders;//排序


}