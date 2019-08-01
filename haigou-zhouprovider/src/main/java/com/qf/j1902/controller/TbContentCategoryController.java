package com.qf.j1902.controller;

import com.qf.j1902.pojo.TbContentCategory;
import com.qf.j1902.service.TbContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@RestController
public class TbContentCategoryController {
    @Autowired
    private TbContentCategoryService contentCategoryService;


    @RequestMapping(value = "/contentCategories",method = RequestMethod.POST)
    public List<TbContentCategory> findAllcontentCategories(){
        List<TbContentCategory> allContentCat = contentCategoryService.findAllContentCat();
        return  allContentCat;
    }
}
