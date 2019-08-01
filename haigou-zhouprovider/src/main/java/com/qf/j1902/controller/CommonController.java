package com.qf.j1902.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2019/7/24.
 */
@RestController
public class CommonController {

    @RequestMapping("/test")
    public  String test(){
        return "test....";
    }
}
