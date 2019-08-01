package com.qf.j1902.service;

import com.qf.j1902.pojo.TbSeller;
import com.qf.j1902.vo.SearchVo;
import com.qf.j1902.vo.ShenHe;

import java.util.List;

/**
 * Created by zhou on 2019/7/25.
 */
public interface TbSellerService {
    public TbSeller findOneById(String sellerId);//根据主键id查找seller
    public List<TbSeller> findAll(SearchVo search);//查询所有tbseller
    public  int addTbSeller(TbSeller seller);//添加一个seller
    public  int upTbSeller1(ShenHe shenHe);//根据sellerId 审核商家
    public  List<TbSeller> findNotShenHe(SearchVo search);//查找 staus 0,2

}
