package com.qf.j1902.service;

import com.qf.j1902.pojo.TbItemCat;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
public interface TbItemCatService {
    public List<TbItemCat> findAllItemCat();
    public  List<TbItemCat> findItemCatByParentId(Long parentId);//根据父id查询
}
