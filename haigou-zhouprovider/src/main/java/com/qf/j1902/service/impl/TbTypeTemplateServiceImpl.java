package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TbTypeTemplateMapper;
import com.qf.j1902.pojo.TbTypeTemplate;
import com.qf.j1902.pojo.TbTypeTemplateExample;
import com.qf.j1902.service.TbTypeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@Service
public class TbTypeTemplateServiceImpl implements TbTypeTemplateService {
    @Autowired
    private TbTypeTemplateMapper tbTypeTemplateMapper;
    @Override
    public List<TbTypeTemplate> findAllTypeTemplate() {
        TbTypeTemplateExample typeTemplateExample=new TbTypeTemplateExample();
        List<TbTypeTemplate> tbTypeTemplates = tbTypeTemplateMapper.selectByExample(typeTemplateExample);
        return tbTypeTemplates;
    }
}
