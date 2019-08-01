package com.qf.j1902.mapper;

import com.qf.j1902.pojo.TbSeller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhou on 2019/7/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.mapper")
public class TestSellerMapper {
    @Autowired
    private  TbSellerMapper sellerMapper;

    @Test
    public  void  test(){
        TbSeller baidu = sellerMapper.selectByPrimaryKey("baidu");
        System.out.println(baidu);

    }
}
