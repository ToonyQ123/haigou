package com.qf.j1902.controller;


import com.qf.j1902.pojo.ManageUser;
import com.qf.j1902.pojo.UserManage;
import com.qf.j1902.service.LoginService;
import com.qf.j1902.service.ManageUserService;
import com.qf.j1902.vo.LoginInfor;
import com.qf.j1902.vo.UserManageResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Description: 对外提供登陆的方法
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 15:30 2019/7/24
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private ManageUserService manageUserService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(LoginInfor loginInfor){
        int result = loginService.findOne(loginInfor);
        return result==0?"/admin/admin":"/admin/unauth";
    }

    @RequiresPermissions(value = {"商家管理"})
    @RequestMapping("/admin/item_cat")
    public String item(){
        return "/admin/item_cat";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/index")
    public String index1(){
        return "index";
    }

    @RequestMapping("/admin/goods")
    public String goods(){
        return "/admin/goods";
    }

    @RequiresPermissions(value = {"商品管理"})
    @RequestMapping("/admin/seller")
    public String seller(){
        return "/admin/seller";
    }

    @RequiresPermissions(value = {"用户管理"})
    @RequestMapping("/admin/usermanagement")
    public ModelAndView usermanage(@RequestParam(value = "realName",required =false ,defaultValue = "") String realName,
                                   @RequestParam(value = "page", required =  false, defaultValue = "1") Integer page,
                                   @RequestParam(value = "rows", required = false, defaultValue = "20") Integer pageSize,
                                   ModelAndView modelAndView){
        UserManageResult allUser = manageUserService.findAllUser(realName, page, pageSize);
       /* List<?> data = allUser.getData();*/
        modelAndView.addObject("users",allUser);
        System.out.println(allUser);
        modelAndView.setViewName("/admin/user_management");
        return modelAndView;
    }

    @RequestMapping("/unauth")
    public String unauth(){
        return "unauth";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") List<Integer> id){
        System.out.println(id);
        int i = manageUserService.deleteOneById(id);
        return i;
    }
}
