package com.qf.j1902.controller;

import com.qf.j1902.pojo.TbGoods;
import com.qf.j1902.service.TbGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@RestController
public class TbGoodsController {
    @Autowired
    private TbGoodsService goodsService;

    @RequestMapping(value = "/goods/list",method = RequestMethod.POST)
    public List<TbGoods> findAllGoods(){
        List<TbGoods> allGoods = goodsService.findAllGoods();
        return  allGoods;
    }
}
