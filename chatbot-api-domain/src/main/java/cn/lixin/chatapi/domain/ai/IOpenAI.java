package cn.lixin.chatapi.domain.ai;

import java.io.IOException;

public interface IOpenAI {
    String getGPTAnswer(String model, String question) throws IOException;
}
