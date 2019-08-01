package com.qf.j1902.controller;

import com.qf.j1902.pojo.TbSeller;
import com.qf.j1902.service.TbSellerService;
import com.qf.j1902.vo.MessageResult;
import com.qf.j1902.vo.SearchVo;
import com.qf.j1902.vo.ShenHe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhou on 2019/7/25.
 */
@RestController
public class TbSellerController {
@Autowired
private TbSellerService sellerService;



    @RequestMapping(value = "/seller/shenhe",method = RequestMethod.POST)
  public List<TbSeller> getList(@RequestBody SearchVo search){
        System.out.println(search.getName()+" "+search.getNickName());
        List<TbSeller> all = sellerService.findNotShenHe(search);
        return  all;
    }
    @RequestMapping(value = "/seller/shenheAll",method = RequestMethod.POST)
    public List<TbSeller> getAllList(@RequestBody SearchVo search){
        List<TbSeller> all = sellerService.findAll(search);
        return  all;
    }
    @RequestMapping(value = "/seller1/shenhetongguo",method = RequestMethod.POST)
    public int shenhetongguo(@RequestBody ShenHe shenHe){
        int i = sellerService.upTbSeller1(shenHe);

        return  i;
    }



}
