package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TbSpecificationOptionMapper;
import com.qf.j1902.pojo.TbSpecificationExample;
import com.qf.j1902.pojo.TbSpecificationOption;
import com.qf.j1902.pojo.TbSpecificationOptionExample;
import com.qf.j1902.service.TbSpecificationOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhou on 2019/7/31.
 */
@Service
public class TbSpecificationOptionServiceImpl implements TbSpecificationOptionService {
    @Autowired
    private TbSpecificationOptionMapper optionMapper;
    @Override
    public List<TbSpecificationOption> findSpeOpBySpecId(Long specId) {
        TbSpecificationOptionExample optionExample=new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria = optionExample.createCriteria();
        criteria.andSpecIdEqualTo(specId);

        List<TbSpecificationOption> tbSpecificationOptions = optionMapper.selectByExample(optionExample);
        return tbSpecificationOptions;
    }

    @Override
    public int deleteSpeOpById(Long id) {

        int i = optionMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int deleteSpeOpByOpName(String optionName) {
        TbSpecificationOptionExample optionExample=new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria = optionExample.createCriteria();
        criteria.andOptionNameEqualTo(optionName);

        int i = optionMapper.deleteByExample(optionExample);
        return i;
    }

    @Override
    public int addSpeOp(List<TbSpecificationOption> specificationOptions) {
        int orders = optionMapper.selectMaxOrderSpeOpBySpeId(specificationOptions.get(0).getSpecId());
        int i=0;
        //获得当前speid的最大order

        for(TbSpecificationOption specificationOption:specificationOptions) {
            Integer orders1 = specificationOption.getOrders();
            //真是oder为页面oder和最大order和
            specificationOption.setOrders(orders +orders1 );
            i+= optionMapper.insertSelective(specificationOption);
        }
        return i;
    }

    @Override
    public int selectMaxOrderSpeOpBySpeId(Long specId) {

        int i = optionMapper.selectMaxOrderSpeOpBySpeId(specId);
        return i;
    }

    @Override
    public int upSpecification(List<TbSpecificationOption> options) {

        int i=0;
        for(TbSpecificationOption option:options){
             i += optionMapper.updateByPrimaryKeySelective(option);
        }
        return i;
    }
}
