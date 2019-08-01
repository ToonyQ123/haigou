package com.qf.j1902;

import com.qf.j1902.mapper.ManageUserMapper;
import com.qf.j1902.service.Impl.ManageUserServiceImpl;
import com.qf.j1902.vo.UserManageResult;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 9:58 2019/8/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ManageUserServiceImpl.class)
@Configuration
public class Test {
    @Autowired
    private ManageUserServiceImpl manageUserService;

    @org.junit.Test
    public void Test(){
        UserManageResult result= manageUserService.findAllUser("张三", 1, 10);
        System.out.println(result);

    }
}
