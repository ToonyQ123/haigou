package com.qf.j1902.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.qf.j1902.pojo.TbTypeTemplate;
import com.qf.j1902.service.TbTypeTemplateService;
import com.qf.j1902.vo.TypeDescText;
import com.qf.j1902.vo.TypeVo;
import org.apache.commons.lang.text.StrBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
@RestController
public class TypeTemplateController {
    @Autowired
    private TbTypeTemplateService typeTemplateService;

    @RequestMapping(value = "/typeTemplate/list",method = RequestMethod.POST)
    public List<TbTypeTemplate> findAllTypeTemplate(){
        List<TbTypeTemplate> allTypeTemplate = typeTemplateService.findAllTypeTemplate();


        for (TbTypeTemplate tbTypeTemplate:allTypeTemplate) {
            StringBuilder spe=new StringBuilder();
            StringBuilder bra=new StringBuilder();
            StrBuilder att=new StrBuilder();

            String specIds = tbTypeTemplate.getSpecIds();
            String brandIds = tbTypeTemplate.getBrandIds();
            String attributeItems = tbTypeTemplate.getCustomAttributeItems();
//            Object parse = JSON.parse(specIds);
//            System.out.println(parse);
            List<TypeVo> students = JSON.parseObject(specIds, new TypeReference<List<TypeVo>>() {
            });
            List<TypeDescText> attris = JSON.parseObject(attributeItems, new TypeReference<List<TypeDescText>>() {
            });
            List<TypeVo> brands = JSON.parseObject(brandIds, new TypeReference<List<TypeVo>>() {
            });
            for (TypeVo typeVo : students) {
                spe.append(typeVo.getText() + " ");
                // System.out.println(typeVo.getText());
            }
          //  System.out.println(spe);
            tbTypeTemplate.setSpecIds(spe+"");
            for (TypeVo typeVo : brands) {
                bra.append(typeVo.getText() + " ");
            }
            tbTypeTemplate.setBrandIds(bra+"");
            for(TypeDescText text:attris){
                att.append(text.getText());
            }
            tbTypeTemplate.setCustomAttributeItems(att+" ");
          //  System.out.println(bra);
         //   System.out.println("=========");
        }

        return  allTypeTemplate;
    }

}
