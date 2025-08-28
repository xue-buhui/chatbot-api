package cn.lixin.chatapi.domain.zsxq.service;

import cn.lixin.chatapi.domain.zsxq.IZsxqApi;
import cn.lixin.chatapi.domain.zsxq.model.aggregates.TopicAggregates;
import cn.lixin.chatapi.domain.zsxq.model.req.AnswerReq;
import cn.lixin.chatapi.domain.zsxq.model.req.Req_data;
import cn.lixin.chatapi.domain.zsxq.model.resp.AnswerResp;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ZsxqApi implements IZsxqApi {

    //日志记录器初始化
    private Logger logger = LoggerFactory.getLogger(ZsxqApi.class);

    @Override
    public TopicAggregates queryTopicId(String groupId, String cookie) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        //查询all话题的1条提问
        HttpGet httpGet = new HttpGet("https://api.zsxq.com/v2/groups/" + groupId + "/topics?scope=all&count=5");
        // HttpGet httpGet =new HttpGet("https://api.zsxq.com/v2/topics/8852112411181512");
        httpGet.setHeader("cookie", cookie);
        httpGet.setHeader("Content-Type", "application/json; charset=UTF-8");

        //执行get请求
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            //获得字符串类型的响应实体
            String jsonStr = EntityUtils.toString(response.getEntity());
            logger.info("网页拉取到的信息：group_id:{} jsonStr:{}", groupId, jsonStr);
            //将jsonStr字符串自动映射到TopicAggregates类的实例
            return JSON.parseObject(jsonStr, TopicAggregates.class);
        } else {
            throw new RuntimeException("queryTopicId Err Code:" + response.getStatusLine().getStatusCode());
        }

    }

    @Override
    public boolean answer(String groupId, String cookie, String topicId, String text) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        //上传回答
        HttpPost httpPost = new HttpPost("https://api.zsxq.com/v2/topics/" + topicId + "/comments");
        httpPost.setHeader("cookie", cookie);
        httpPost.setHeader("Content-Type", "application/json; charset=UTF-8");
        httpPost.setHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36 Edg/139.0.0.0");

        /* 测试字符串
          String reqAnswer="{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"无言绝句！（2测试）\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"mentioned_user_ids\": []\n" +
                "  }\n" +
                "}";
        */

        Req_data req_data = new Req_data(text);
        AnswerReq answerReq = new AnswerReq(req_data);
        //转成JSON格式再转成字符串
        String reqStr = JSONObject.fromObject(answerReq).toString();

        StringEntity strEntity = new StringEntity(reqStr, ContentType.create("text/json", "UTF-8"));
        httpPost.setEntity(strEntity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String jsonStr = EntityUtils.toString(response.getEntity());
            //将jsonStr字符串自动映射到AnswerResp类的实例
            AnswerResp answerResp = JSON.parseObject(jsonStr, AnswerResp.class);
            logger.info("上传答案后回复的信息：group_id:{} topic_id:{} jsonStr:{}", groupId, topicId, jsonStr);
            return answerResp.isSuccess();
        } else {
            throw new RuntimeException("answer Err Code:" + response.getStatusLine().getStatusCode());
        }
    }
}
