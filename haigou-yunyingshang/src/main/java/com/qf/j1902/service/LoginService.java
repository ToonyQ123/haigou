package com.qf.j1902.service;


import com.qf.j1902.vo.LoginInfor;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 15:31 2019/7/24
 */
public interface LoginService {
    public int findOne(LoginInfor loginInfor);
}
