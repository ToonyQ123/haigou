package com.qf.j1902.service;


import com.qf.j1902.pojo.ManagePermission;

import java.util.Set;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 15:58 2019/7/24
 */
public interface ManagePermissionService {
    public Set<ManagePermission> selectOneByUserName(String name);
}
