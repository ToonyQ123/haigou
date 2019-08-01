package com.qf.j1902.service;


import com.qf.j1902.pojo.ManageUser;
import com.qf.j1902.pojo.UserManage;
import com.qf.j1902.vo.UserManageResult;

import java.util.List;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 15:44 2019/7/24
 */
public interface ManageUserService {
    public ManageUser findUserByUserName(String username);
    public UserManageResult findAllUser(String realName, Integer page, Integer pageSize);
    public int deleteOneById(List<Integer> id);
}
