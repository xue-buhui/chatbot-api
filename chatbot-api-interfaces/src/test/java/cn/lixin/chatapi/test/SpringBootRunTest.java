package cn.lixin.chatapi.test;

import cn.lixin.chatapi.domain.ai.IOpenAI;
import cn.lixin.chatapi.domain.zsxq.IZsxqApi;
import cn.lixin.chatapi.domain.zsxq.model.aggregates.TopicAggregates;

import cn.lixin.chatapi.domain.zsxq.model.vo.Topics;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRunTest {

    private Logger logger = LoggerFactory.getLogger(SpringBootRunTest.class);

    @Value("${chatbot-api.groupID}")
    private String groupId;
    @Value("${chatbot-api.cookie}")
    private String cookie;

    @Resource
    private IZsxqApi zsxqApi;

    @Test
    public void test_zsxqApi() throws IOException {
        TopicAggregates topicAggregates = zsxqApi.queryTopicId(groupId, cookie);
        logger.info("测试结果{}", JSON.toJSONString(topicAggregates));

        List<Topics> topicsList = topicAggregates.getResp_data().getTopics();

        Topics topic = topicsList.get(0);
        String topicId = topic.getTopic_id();
        String question = topic.getTalk().getText();
        String text = "回复1";
        System.out.println(question);
        zsxqApi.answer(groupId, cookie, topicId, text);

    }

    @Value("${chatbot-api.model}")
    private String model;


    @Resource
    private IOpenAI openAI;

    @Test
    public void test_openAI() throws IOException {
        String answer = openAI.getGPTAnswer(model, "1+1=?");
        logger.info("GPT回答结果：{}", answer);
    }

    //爬取+查询+上传
    @Test
    public void run() throws IOException {
        TopicAggregates topicAggregates = zsxqApi.queryTopicId(groupId, cookie);
        logger.info("查询结果{}", JSON.toJSONString(topicAggregates));
        List<Topics> topicsList = topicAggregates.getResp_data().getTopics();
        if (topicsList == null || topicsList.isEmpty()) {
            logger.info("未查询到话题！");
            return;
        }

        Topics topic = topicsList.get(0);
        String topicId = topic.getTopic_id();
        String question = topic.getTalk().getText();
        String answer = openAI.getGPTAnswer(model, question);

        zsxqApi.answer(groupId, cookie, topicId, answer);
        logger.info("问题：{} GPT回答结果：{}", question, answer);
    }
}

