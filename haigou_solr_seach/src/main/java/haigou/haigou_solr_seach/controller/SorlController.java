package haigou.haigou_solr_seach.controller;


import com.qf.j1902.vo.MsgResult;
import haigou.haigou_solr_seach.service.SolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SorlController {
    @Autowired
    private SolrService solrService;

    @RequestMapping(value = "/solr/import")
    public MsgResult impport(){
       MsgResult msgResult = solrService.importSolr();
       return msgResult;
    }
}
