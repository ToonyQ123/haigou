package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TbContentCategoryMapper;
import com.qf.j1902.pojo.TbContentCategory;
import com.qf.j1902.pojo.TbContentCategoryExample;
import com.qf.j1902.service.TbContentCategoryService;
import com.qf.j1902.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@Service
public class TbContentCategoryServiceImpl  implements TbContentCategoryService{

    @Autowired
    private TbContentCategoryMapper contentCategoryMapper;
    @Override
    public List<TbContentCategory> findAllContentCat() {
        TbContentCategoryExample contentCategoryExample=new TbContentCategoryExample();
        List<TbContentCategory> tbContentCategories = contentCategoryMapper.selectByExample(contentCategoryExample);
        return tbContentCategories;
    }
}
