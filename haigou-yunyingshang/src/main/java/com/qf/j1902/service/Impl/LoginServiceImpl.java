package com.qf.j1902.service.Impl;

import com.qf.j1902.service.LoginService;
import com.qf.j1902.vo.LoginInfor;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 15:34 2019/7/24
 */
@Service
public class LoginServiceImpl implements LoginService {

    //对登陆信息进行判定
    public int findOne(LoginInfor loginInfor) {
        //从安全管理器获取主题对象
        Subject subject = SecurityUtils.getSubject();
        //构建令牌
        UsernamePasswordToken token = new UsernamePasswordToken(loginInfor.getUsername(), loginInfor.getPassword());
        //登陆
        subject.login(token);
        if (subject.isAuthenticated()){
            return 0;
        }
        return 1;
    }
}
