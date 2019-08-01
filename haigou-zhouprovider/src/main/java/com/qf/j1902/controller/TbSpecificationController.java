package com.qf.j1902.controller;

import com.qf.j1902.pojo.TbSpecification;
import com.qf.j1902.service.TbSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@RestController
public class TbSpecificationController {
    @Autowired
    private TbSpecificationService specificationService;

    @RequestMapping(value = "/specification/list",method = RequestMethod.POST)
    public List<TbSpecification> findAllSpecification(){
        List<TbSpecification> list = specificationService.findAllSpecification();
        return  list;
    }

}
