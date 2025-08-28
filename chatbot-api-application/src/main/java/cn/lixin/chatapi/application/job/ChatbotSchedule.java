package cn.lixin.chatapi.application.job;


import cn.lixin.chatapi.domain.ai.IOpenAI;
import cn.lixin.chatapi.domain.zsxq.IZsxqApi;
import cn.lixin.chatapi.domain.zsxq.model.aggregates.TopicAggregates;
import cn.lixin.chatapi.domain.zsxq.model.vo.Topics;
import com.alibaba.fastjson.JSON;
import com.google.common.annotations.VisibleForTesting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

//原本是按时间刷新，回答提出的问题，但是没有未回答模块了，所以不需要刷新
public class ChatbotSchedule {

    private Logger logger = LoggerFactory.getLogger(ChatbotSchedule.class);

    @Value("${chatbot-api.groupID}")
    private String groupId;
    @Value("${chatbot-api.cookie}")
    private String cookie;
    @Value("${chatbot-api.model}")
    private String model;

    @Resource
    private IOpenAI openAI;
    @Resource
    private IZsxqApi zsxqApi;


    public void run() {
        try {
            TopicAggregates topicAggregates = zsxqApi.queryTopicId(groupId, cookie);
            logger.info("测试结果{}", JSON.toJSONString(topicAggregates));
            List<Topics> topicsList = topicAggregates.getResp_data().getTopics();
            if (topicsList == null || topicsList.isEmpty()) {
                logger.info("未查询到话题！");
                return;
            }

            Topics topic = topicsList.get(0);
            String topicId = String.valueOf(topic.getTopic_id());
            String question = topic.getTalk().getText();
            String answer = openAI.getGPTAnswer(model, question);

            zsxqApi.answer(groupId, cookie, topicId, answer);
            logger.info("问题：{} GPT回答结果：{}", question, answer);

        } catch (IOException e) {
            throw new RuntimeException("出现异常！！！" + e);
        }
    }
}
