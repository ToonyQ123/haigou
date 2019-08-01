package com.qf.j1902.service;

import com.qf.j1902.pojo.TbSeller;
import com.qf.j1902.vo.SearchVo;
import com.qf.j1902.vo.ShenHe;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import sun.awt.image.BadDepthException;

import java.util.List;

/**
 * Created by zhou on 2019/7/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSellerService {
    @Autowired
    private  TbSellerService sellerService;

    @Test

    public  void test5(){
        String str="tt";
        String s="gttn";
        System.out.println(s.contains(str));
    }
    public  void test4(){
        SearchVo s=new SearchVo();
        List<TbSeller> notShenHe = sellerService.findNotShenHe( s);
        System.out.println(notShenHe.size());
    }
    public  void test3(){
        int baidu = sellerService.upTbSeller1(new ShenHe("baidu", "3"));
        System.out.println(baidu);
    }

    public  void test2(){
        int i = sellerService.addTbSeller(new TbSeller("jingran", "井然", "卖水井", "jingran", "021-87652345"));
        System.out.println(i);

    }
    public  void test1(){
        SearchVo s=new SearchVo();
        List<TbSeller> all = sellerService.findAll(s);
        System.out.println(all);

    }
    public  void test(){
        TbSeller baidu = sellerService.findOneById("baidu");
        System.out.println(baidu);

    }
}
