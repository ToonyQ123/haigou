package haigou.haigou_solr_seach.service.Impl;

import com.qf.j1902.vo.MsgResult;
import haigou.haigou_solr_seach.service.SolrService;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

public class SolrServiceImpl implements SolrService {
    @Value(value = "${solr.baseUrl}")
    private String baseUrl;


    /**
     * @Author: Kiana on 11:21 2019/7/19
     * @param: []
     * @return: com.qf.j1902.vo.MsgResult
     **/
    @Override
    public MsgResult importSolr() {

        MsgResult msgResult = new MsgResult();
        //连接solr缓存库
        HttpSolrServer solrServer = new HttpSolrServer(baseUrl);
        //从数据库中查询出需要同步表的数据



        try {
            //遍历查询出的数据

            SolrInputDocument doc = new SolrInputDocument();
            doc.setField("",null);
            solrServer.add(doc);

            //(出循环)，提交操作到solr中
            solrServer.commit();
            //返回结果(同步状态码和信息提示)
            msgResult.setStatus(200);
            msgResult.setMaessage("数据同步成功！");
            return msgResult;
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //同步失败，返回结果
        msgResult.setStatus(-1);
        msgResult.setMaessage("数据同步失败！");

        return msgResult;
    }


}
