package com.qf.j1902.controller;

import com.qf.j1902.pojo.TbBrand;
import com.qf.j1902.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@RestController
public class TbBrandController {
    @Autowired
    private TbBrandService brandService;

    @RequestMapping(value = "/brand/list",method = RequestMethod.POST)
    public List<TbBrand> findAllBrands(){
        List<TbBrand> allBrand = brandService.findAllBrand();
        return  allBrand;
    }
}
