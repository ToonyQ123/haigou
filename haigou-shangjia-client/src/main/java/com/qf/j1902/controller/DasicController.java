package com.qf.j1902.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DasicController {
    @RequestMapping("/")
    public String shopLogin(){
        return "shoplogin";
    }
    @RequestMapping("index")
    public String index(){
        return "admin/index";
    }
    @RequestMapping("seller")
    public String seller(){
        return "admin/seller";
    }
    @RequestMapping("password")
    public String password(){
        return "admin/password";
    }
    @RequestMapping("goods_edit")
    public String goodsEdi(){
        return "admin/goods_edit";
    }
    @RequestMapping("goods")
    public String goods(){
        return "admin/goods";
    }
    @RequestMapping("home")
    public String home(){
        return "admin/home";
    }
}
