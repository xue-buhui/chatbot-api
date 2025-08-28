package cn.lixin.chatapi.domain.ai.service;

import cn.lixin.chatapi.domain.ai.IOpenAI;

import cn.lixin.chatapi.domain.ai.model.aggregates.AIAnswer;
import cn.lixin.chatapi.domain.ai.model.req.Req_data;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OpenAI implements IOpenAI {

    @Value("${chatbot-api.apiKey}")
    private String apiKey;

    @Override
    public String getGPTAnswer(String model, String question) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        //创建模型响应
        HttpPost httpPost = new HttpPost("https://api.openai.com/v1/responses");
        httpPost.setHeader("Content-Type", "application/json; charset=UTF-8");
        httpPost.setHeader("Authorization", apiKey);

        /*
        String ques = "'{\n" +
                "    \"model\": \"gpt-4.1\",\n" +
                "    \"input\": \"Tell me a three sentence bedtime story about a unicorn.\"\n" +
                "  }'";
        */
        Req_data req_data = new Req_data(model, question);
        //转成JSON格式再转成字符串
        String ques = JSONObject.fromObject(req_data).toString();

        StringEntity strEntity = new StringEntity(ques, ContentType.create("text/json", "UTF-8"));
        httpPost.setEntity(strEntity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            //回复字符串，包含答案
            String jsonStr = EntityUtils.toString(response.getEntity());
            AIAnswer aiAnswer = JSON.parseObject(jsonStr, AIAnswer.class);
            String res = aiAnswer.getObject();
            return res;
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
            throw new IOException(response.getStatusLine().getStatusCode() + " " + response.getStatusLine().getReasonPhrase());
        }

    }
}
