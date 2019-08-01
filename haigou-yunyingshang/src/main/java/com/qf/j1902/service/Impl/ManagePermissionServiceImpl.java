package com.qf.j1902.service.Impl;


import com.qf.j1902.mapper.ManagePermissionMapper;
import com.qf.j1902.pojo.ManagePermission;
import com.qf.j1902.service.ManagePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 16:05 2019/7/24
 */
@Service
public class ManagePermissionServiceImpl implements ManagePermissionService {
    @Autowired
    private ManagePermissionMapper managePermissionMapper;

    /**
     * 根据用户名获取用户权限信息
     * @param name
     * @return
     */
    @Override
    public Set<ManagePermission> selectOneByUserName(String name) {
        Set<ManagePermission> perm = new HashSet<>();
        List<ManagePermission> perminssion = managePermissionMapper.findOneByUserName(name);
        for (ManagePermission managePermission : perminssion){
            perm.add(managePermission);
        }
        return perm;
    }
}
