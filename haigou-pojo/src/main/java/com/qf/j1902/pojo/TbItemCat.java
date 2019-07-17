package com.qf.j1902.pojo;

import lombok.Data;

@Data
public class TbItemCat {
    private Long id;

    private Long parentId;

    private String name;

    private Long typeId;

}