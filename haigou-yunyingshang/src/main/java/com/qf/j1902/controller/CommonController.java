package com.qf.j1902.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhou on 2019/7/24.
 */
@Controller
public class CommonController {



    @RequestMapping("/seller")
    public  String seller(){
        return  "redirect:http://localhost:8085/#/seller1";
    }

}
