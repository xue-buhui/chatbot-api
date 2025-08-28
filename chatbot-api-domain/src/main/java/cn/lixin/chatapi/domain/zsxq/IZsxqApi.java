package cn.lixin.chatapi.domain.zsxq;

import cn.lixin.chatapi.domain.zsxq.model.aggregates.TopicAggregates;

import java.io.IOException;

//知识星球API接口  接口前要加I
public interface IZsxqApi {

    TopicAggregates queryTopicId(String groupId, String cookie) throws IOException;

    boolean answer(String groupId, String cookie, String topicId, String text) throws IOException;
}
