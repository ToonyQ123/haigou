package com.qf.j1902.service;

import com.qf.j1902.pojo.TbSpecification;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
public interface TbSpecificationService {

    public List<TbSpecification> findAllSpecification();//查询
    public  List<TbSpecification> findSpecificationBySpecName(String specName);//根据specName查询
    public Long addSpecification(String specName);//添加 specName 得到id
    public  int deleteSpecification(List<Long> ids);//根据id 批量删除
    public  int upSpeNameSpeOp(String specName);//修改spename;
}
