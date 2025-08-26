package cn.lixin.chatapi.test;

//单元测试
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

public class ApiTest {
    @Test
    public void get_question() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        //查询all话题的1条提问
        HttpGet httpGet =new HttpGet("https://api.zsxq.com/v2/groups/28885518425541/topics?scope=all&count=1");
//        HttpGet httpGet =new HttpGet("https://api.zsxq.com/v2/topics/8852112411181512");
        httpGet.setHeader("cookie","zsxq_access_token=6159A583-DB4F-4838-9785-20220B620857_F630663093A90A4C; abtest_env=product");
        httpGet.setHeader("Content-Type","application/json; charset=UTF-8");

        //
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else{
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void post_answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        //上传回答
        HttpPost httpPost=new HttpPost("https://api.zsxq.com/v2/topics/8852112411181512/comments");
        httpPost.setHeader("cookie","zsxq_access_token=6159A583-DB4F-4838-9785-20220B620857_F630663093A90A4C; abtest_env=product; sajssdk_2015_cross_new_user=1; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22214511188154411%22%2C%22first_id%22%3A%22198e145459a80a-0cdad8bd5944328-4c657b58-2073600-198e145459b24f1%22%2C%22props%22%3A%7B%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTk4ZTE0NTQ1OWE4MGEtMGNkYWQ4YmQ1OTQ0MzI4LTRjNjU3YjU4LTIwNzM2MDAtMTk4ZTE0NTQ1OWIyNGYxIiwiJGlkZW50aXR5X2xvZ2luX2lkIjoiMjE0NTExMTg4MTU0NDExIn0%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22214511188154411%22%7D%7D");
        httpPost.setHeader("Content-Type","application/json; charset=UTF-8");

        String ans="{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"无言绝句！（2测试）\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"mentioned_user_ids\": []\n" +
                "  }\n" +
                "}";

        StringEntity strEntity = new StringEntity(ans, ContentType.APPLICATION_JSON);
        httpPost.setEntity(strEntity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else{
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
}

