package haigou.haigou_solr_seach.mapper;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SolrMapper {

    public List<?> findAll();
}
