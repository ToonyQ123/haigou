package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TbBrandMapper;
import com.qf.j1902.pojo.TbBrand;
import com.qf.j1902.pojo.TbBrandExample;
import com.qf.j1902.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@Service
public class TbBrandServiceImpl implements TbBrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> findAllBrand() {
        TbBrandExample brandExample=new TbBrandExample();

        List<TbBrand> tbBrands = brandMapper.selectByExample(brandExample);
        return tbBrands;
    }
}
