package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TbItemCatMapper;
import com.qf.j1902.pojo.TbItemCat;
import com.qf.j1902.pojo.TbItemCatExample;
import com.qf.j1902.service.TbItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@Service
public class TbItemCatServiceImpl implements TbItemCatService {
    @Autowired
    private TbItemCatMapper itemCatMapper;
    @Override
    public List<TbItemCat> findAllItemCat() {
        TbItemCatExample itemCatExample=new TbItemCatExample();
        List<TbItemCat> tbItemCats = itemCatMapper.selectByExample(itemCatExample);
        return tbItemCats;
    }

    @Override
    public List<TbItemCat> findItemCatByParentId(Long parentId) {
        TbItemCatExample itemCatExample=new TbItemCatExample();
        TbItemCatExample.Criteria criteria = itemCatExample.createCriteria();

        criteria.andParentIdEqualTo(parentId);

        List<TbItemCat> tbItemCats = itemCatMapper.selectByExample(itemCatExample);
        return tbItemCats;
    }
}
