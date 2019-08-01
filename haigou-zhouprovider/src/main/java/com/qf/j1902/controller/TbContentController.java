package com.qf.j1902.controller;

import com.qf.j1902.pojo.TbContent;
import com.qf.j1902.service.TbContentService;
import com.qf.j1902.vo.MsgResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@RestController
public class TbContentController {
    @Autowired
    private TbContentService contentService;

    @RequestMapping(value = "/contents",method = RequestMethod.POST)
    public List<TbContent> findAllContents(){
        List<TbContent> all = contentService.findAll();
        return  all;
    }
}
