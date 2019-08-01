package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TbSpecificationMapper;
import com.qf.j1902.pojo.TbSpecification;
import com.qf.j1902.pojo.TbSpecificationExample;
import com.qf.j1902.service.TbSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@Service
public class TbSpecificationServiceImpl implements TbSpecificationService {

    @Autowired
    private TbSpecificationMapper specificationMapper;


    @Override
    public List<TbSpecification> findAllSpecification() {
        TbSpecificationExample specificationExample=new TbSpecificationExample();

        List<TbSpecification> list = specificationMapper.selectByExample(specificationExample);
        return list;
    }

    @Override
    public List<TbSpecification> findSpecificationBySpecName(String specName) {
        TbSpecificationExample specificationExample=new TbSpecificationExample();
        TbSpecificationExample.Criteria criteria = specificationExample.createCriteria();
       criteria.andSpecNameLike(specName);
        List<TbSpecification> tbSpecifications = specificationMapper.selectByExample(specificationExample);
        return tbSpecifications;
    }

    @Override
    public Long addSpecification(String specName) {
        int i = specificationMapper.insertSelective(new TbSpecification(specName));
        TbSpecificationExample specificationExample=new TbSpecificationExample();
        TbSpecificationExample.Criteria criteria = specificationExample.createCriteria();
        criteria.andSpecNameEqualTo(specName);
        List<TbSpecification> tbSpecifications = specificationMapper.selectByExample(specificationExample);
        Long id = tbSpecifications.get(0).getId();
        return id;
    }

    @Override
    public int deleteSpecification(List<Long> ids) {
        int i=0;
        for(Long id:ids){
            i += specificationMapper.deleteByPrimaryKey(id);
        }

        return i;
    }

    @Override
    public int upSpeNameSpeOp(String specName) {

        int i = specificationMapper.updateByPrimaryKeySelective(new TbSpecification(specName));
        return i;
    }
}
