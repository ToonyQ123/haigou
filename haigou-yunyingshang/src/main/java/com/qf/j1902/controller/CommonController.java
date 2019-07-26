package com.qf.j1902.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhou on 2019/7/24.
 */
@Controller
public class CommonController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable("page") String page) {
        System.out.println("pppppppppp");
        return "/admin/"+page;

    }
    @RequestMapping("/")
    public String showindex() {
        return "login";
    }

    @RequestMapping("/seller")
    public  String seller(){
        return  "redirect:http://localhost:8085/#/seller1";
    }

}
