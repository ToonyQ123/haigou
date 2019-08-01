package com.qf.j1902.mapper;


import com.qf.j1902.pojo.ManageUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Project Name: leyou
 * @Author: Kiana
 * @CreateData: 15:47 2019/7/24
 */
@Mapper
public interface ManageUserMapper {
    public ManageUser selectManageByUserName(@Param("username") String username);
    public List<ManageUser> selectUserManage(@Param("realName") String realName);
    public int deleteOneById(@Param("id") Integer id);
}
