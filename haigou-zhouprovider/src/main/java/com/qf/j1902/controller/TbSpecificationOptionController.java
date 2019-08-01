package com.qf.j1902.controller;

import com.qf.j1902.pojo.TbSpecificationOption;
import com.qf.j1902.service.TbSpecificationOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhou on 2019/7/31.
 */
@RestController
public class TbSpecificationOptionController {
    @Autowired
    private TbSpecificationOptionService optionService;

    @RequestMapping(value = "/sp/speOpBySpecId",method = RequestMethod.POST)
    public List<TbSpecificationOption> findSpeOpBySpecId (@RequestBody Long specId){

        List<TbSpecificationOption> speOpBySpecId = optionService.findSpeOpBySpecId(specId);
        return speOpBySpecId;
    }

    @RequestMapping(value = "/sp/deleteSpeOpById",method = RequestMethod.POST)
    public int deleteSpeOpById(@RequestBody Long id){
        int i = optionService.deleteSpeOpById(id);
        return  i;
    }
    @RequestMapping(value = "/sp/deleteSpeOpByOpName",method = RequestMethod.POST)
    public int deleteSpeOpByOpName(@RequestBody String optionName){
        int i = optionService.deleteSpeOpByOpName(optionName);
        return  i;

    }

    @RequestMapping(value = "/sp/specificationOption",method = RequestMethod.POST)
    public int add(@RequestBody TbSpecificationOption specificationOption){
        int i = optionService.addSpeOp(specificationOption);
        return  i;
    }

}
