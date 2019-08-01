package com.qf.j1902.controller;

import com.qf.j1902.mapper.TbItemCatMapper;
import com.qf.j1902.pojo.TbItemCat;
import com.qf.j1902.service.TbItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@RestController
public class TbItemCatController {
    @Autowired
    private TbItemCatService itemCatService;

    @RequestMapping(value = "/itemcat/list",method = RequestMethod.POST)
    public List<TbItemCat> findAllItemCats(){
        List<TbItemCat> allItemCat = itemCatService.findAllItemCat();
        return  allItemCat;
    }

    @RequestMapping(value = "/itemcat/parentids",method = RequestMethod.POST)
    public List<TbItemCat> findItemCatsByParentIds(@RequestBody Long parentId){
        List<TbItemCat> itemCatByParentId = itemCatService.findItemCatByParentId(parentId);
        return  itemCatByParentId;

    }

}
