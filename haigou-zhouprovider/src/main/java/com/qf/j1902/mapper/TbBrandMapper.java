package com.qf.j1902.mapper;

import com.qf.j1902.pojo.TbBrand;
import com.qf.j1902.pojo.TbBrandExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbBrandMapper {
    int countByExample(TbBrandExample example);

    int deleteByExample(TbBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    List<TbBrand> selectByExample(TbBrandExample example);

    TbBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);
}