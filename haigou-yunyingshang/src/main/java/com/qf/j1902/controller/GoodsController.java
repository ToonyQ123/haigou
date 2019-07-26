package com.qf.j1902.controller;

import com.qf.j1902.utils.ResultFactory;
import com.qf.j1902.vo.LoginInfoVo;
import com.qf.j1902.vo.MessageResult;
import com.qf.j1902.vo.MsgResult;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhou on 2019/7/24.
 */
@RestController
@RequestMapping("/api")
public class GoodsController {
    @CrossOrigin
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public MessageResult dealLogin(@RequestBody LoginInfoVo loginInfoVo, BindingResult bindingResult){
        System.out.println(loginInfoVo);

        if(bindingResult.hasErrors()){//封装过程中出错,抛异常,登录失败
            String msg="验证错误";
            return ResultFactory.buildFailResult(msg);
        }
        if(!loginInfoVo.getUsername().equals("admin")||!loginInfoVo.getPassword().equals("1234")){
            //如果用户名密码不对，登录失败
            String msg="用户名或密码错误，登录失败";
            return ResultFactory.buildFailResult(msg);

        }

        return  ResultFactory.buildSuccessResult("登录成功");

    }
}
