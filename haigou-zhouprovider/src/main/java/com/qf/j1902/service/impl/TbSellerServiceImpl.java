package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TbSellerMapper;
import com.qf.j1902.pojo.TbSeller;
import com.qf.j1902.pojo.TbSellerExample;
import com.qf.j1902.service.TbSellerService;
import com.qf.j1902.vo.SearchVo;
import com.qf.j1902.vo.ShenHe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhou on 2019/7/25.
 */
@Service
public class TbSellerServiceImpl implements TbSellerService {
@Autowired
private TbSellerMapper sellerMapper;
    @Override

    public TbSeller findOneById(String sellerId) {
        TbSeller tbSeller = sellerMapper.selectByPrimaryKey(sellerId);
        return tbSeller;
    }

    @Override
    public List<TbSeller> findAll(SearchVo search) {
        TbSellerExample sellerExample=new TbSellerExample();
        String nickName = search.getNickName();//店铺名称
        String name = search.getName();//公司名称
        List<TbSeller> tbSellers = sellerMapper.selectByExample(sellerExample);
        List<TbSeller> list1=new ArrayList<>();
        List<TbSeller> all=new ArrayList<>();
        if(!name.equals("")){
            for(TbSeller seller:tbSellers){
                String name1 = seller.getName();
                boolean contains = name1.contains(name);
                if(contains){//判断name 不为空
                    list1.add(seller);
                }
            }
            if(!nickName.equals("")){//nickname不为空
                for(TbSeller seller:list1){
                    String nickName1 = seller.getNickName();
                    boolean contains = nickName1.contains(nickName);
                    if(contains){
                        all.add(seller);
                    }

                }
                System.out.println(all.size());
                if(all.size()<1){
                    all=list1;
                }

            }else {//nickname为空
                all=list1;
            }
        }else {
            if(!nickName.equals("")){//nickname不为空
                for(TbSeller seller:tbSellers){
                    String nickName1 = seller.getNickName();
                    boolean contains = nickName1.contains(nickName);
                    if(contains){
                        all.add(seller);
                    }

                }

            }else {//nickname为空
                all=tbSellers;
            }

        }
        return all;


    }

    @Override
    public int addTbSeller(TbSeller seller) {
        int i = sellerMapper.insertSelective(seller);
        return i;
    }

    @Override
    public int upTbSeller1(ShenHe shenHe) {

        int i = sellerMapper.updateByPrimaryKeySelective(new TbSeller(shenHe.getSellerId(), shenHe.getStatus()));
        return i;
    }

    @Override
    public List<TbSeller> findNotShenHe(SearchVo search) {
        String nickName = search.getNickName();//店铺名称
        String name = search.getName();//公司名称
        TbSellerExample sellerExample=new TbSellerExample();
        TbSellerExample.Criteria criteria = sellerExample.createCriteria();
        List<String> list=new ArrayList<>();
        list.add("0");
        list.add("2");
        criteria.andStatusIn(list);
        List<TbSeller> tbSellers = sellerMapper.selectByExample(sellerExample);
        List<TbSeller> list1=new ArrayList<>();
        List<TbSeller> all=new ArrayList<>();
        if(!name.equals("")){
            for(TbSeller seller:tbSellers){
                String name1 = seller.getName();
                boolean contains = name1.contains(name);
                if(contains){//判断name 不为空
                    list1.add(seller);
                }
            }
            if(!nickName.equals("")){//nickname不为空
                for(TbSeller seller:list1){
                    String nickName1 = seller.getNickName();
                    boolean contains = nickName1.contains(nickName);
                    if(contains){
                        all.add(seller);
                    }

                }
                System.out.println(all.size());
                if(all.size()<1){
                    all=list1;
                }

            }else {//nickname为空
                all=list1;
            }
        }else {
            if(!nickName.equals("")){//nickname不为空
                for(TbSeller seller:tbSellers){
                    String nickName1 = seller.getNickName();
                    boolean contains = nickName1.contains(nickName);
                    if(contains){
                        all.add(seller);
                    }

                }

            }else {//nickname为空
                all=tbSellers;
            }

        }
        return all;
    }
}
