package com.qf.j1902.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 9:48 2019/8/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.mapper")
public class TestMapper {

    @Autowired
    private ManageUserMapper manageUserMapper;

    @Test
    public void test1(){
       /* String s = "张三";
        List<ManageUser> manageUsers = manageUserMapper.selectUserManage(s);
        System.out.println(manageUsers);*/
        int i = manageUserMapper.deleteOneById(15);
        System.out.println(i);
    }

}
