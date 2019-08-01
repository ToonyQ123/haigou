package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TbGoodsMapper;
import com.qf.j1902.pojo.TbGoods;
import com.qf.j1902.pojo.TbGoodsExample;
import com.qf.j1902.service.TbGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@Service
public class TbGoodsServiceImpl implements TbGoodsService {
    @Autowired
    private TbGoodsMapper goodsMapper;

    @Override
    public List<TbGoods> findAllGoods() {
        TbGoodsExample goodsExample=new TbGoodsExample();
        List<TbGoods> tbGoods = goodsMapper.selectByExample(goodsExample);
        return tbGoods;
    }
}
