package com.qf.j1902.mapper;


import com.qf.j1902.pojo.ManagePermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Project Name: leyou
 * @Author: Kiana
 * @CreateData: 16:05 2019/7/24
 */
@Mapper
public interface ManagePermissionMapper {
    //根据用户名获取用户权限信息
    public List<ManagePermission> findOneByUserName(@Param("username") String username);

}
