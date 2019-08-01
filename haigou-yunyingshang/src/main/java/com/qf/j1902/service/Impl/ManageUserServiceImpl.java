package com.qf.j1902.service.Impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1902.mapper.ManageUserMapper;
import com.qf.j1902.pojo.ManageUser;
import com.qf.j1902.pojo.UserManage;
import com.qf.j1902.service.ManageUserService;
import com.qf.j1902.vo.UserManageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 15:46 2019/7/24
 */
@Service
public class ManageUserServiceImpl implements ManageUserService {

    @Autowired
    private ManageUserMapper manageUserMapper;

    /**
     *  根据用户名查询用户信息
     * @param username 用户名
     * @return ManageUser
     */
    @Override
    public ManageUser findUserByUserName(String username) {
        ManageUser manageUser = manageUserMapper.selectManageByUserName(username);
        return manageUser;
    }
    public UserManageResult findAllUser(String realName, Integer page, Integer pageSize) {
        UserManageResult result = new UserManageResult();
        PageHelper.startPage(page,pageSize);
        List<ManageUser> manageUsers = manageUserMapper.selectUserManage(realName);
        PageInfo pageInfo = new PageInfo(manageUsers);
        long total = pageInfo.getTotal();
        result.setTotal(total);
        result.setData(manageUsers);
        return result;
    }


    @Override
    public int deleteOneById(List<Integer> ids) {
        for (int id : ids){
            int i = manageUserMapper.deleteOneById(id);
        }
        return 0;
    }
}
