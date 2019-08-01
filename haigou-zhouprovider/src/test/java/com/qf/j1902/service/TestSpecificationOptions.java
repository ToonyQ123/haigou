package com.qf.j1902.service;

import com.qf.j1902.mapper.TbSpecificationOptionMapper;
import com.qf.j1902.pojo.TbSpecificationOption;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by zhou on 2019/7/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSpecificationOptions {
    @Autowired
    private TbSpecificationOptionService optionService;

    @Test
    public void test4(){
        optionService.addSpeOp(new TbSpecificationOption("mmmm", 26l))
    }
    public void test3(){
        int i = optionService.selectMaxOrderSpeOpBySpeId(26l);
        System.out.println(i);
    }
    public  void test2(){
        TbSpecificationOption option=new TbSpecificationOption("mm",26l,15);
    }
    public  void test1(){
        int i = optionService.deleteSpeOpById(133l);
        int ttt = optionService.deleteSpeOpByOpName("ttt");

    }
    public  void test(){
        List<TbSpecificationOption> speOpBySpecId = optionService.findSpeOpBySpecId(26l);
        System.out.println(speOpBySpecId);
    }
}
