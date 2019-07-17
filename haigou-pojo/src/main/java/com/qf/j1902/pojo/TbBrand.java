package com.qf.j1902.pojo;

import lombok.Data;
/*
* 品牌
* */
@Data
public class TbBrand {
    private Long id;  //主键id

    private String name;  // 品牌名称

    private String firstChar;  //品牌首字母

}