package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TbContentMapper;
import com.qf.j1902.pojo.TbContent;
import com.qf.j1902.pojo.TbContentExample;
import com.qf.j1902.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@Service
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    private TbContentMapper contentMapper;
    @Override
    public List<TbContent> findAll() {
        TbContentExample contentExample=new TbContentExample();
        List<TbContent> tbContents = contentMapper.selectByExample(contentExample);
        return tbContents;
    }
}
