package com.qf.j1902.service;

import com.qf.j1902.pojo.TbSpecification;
import com.qf.j1902.pojo.TbSpecificationOption;

import java.util.List;

/**
 * Created by zhou on 2019/7/31.
 */
public interface TbSpecificationOptionService {

    public List<TbSpecificationOption> findSpeOpBySpecId(Long specId);//根据speid查询
    public  int  deleteSpeOpById(Long id);//根据id删除
    public  int deleteSpeOpByOpName(String optionName);//根据optionName删除
    public int addSpeOp(List<TbSpecificationOption> options);//添加批量 speid  opnationname
    public int  selectMaxOrderSpeOpBySpeId(Long specId);//查询spe_id  order的最大值
    public int upSpecification(List<TbSpecificationOption> options);//根据id修改
}
