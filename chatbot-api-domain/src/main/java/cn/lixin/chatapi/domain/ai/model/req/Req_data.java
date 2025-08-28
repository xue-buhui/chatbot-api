package cn.lixin.chatapi.domain.ai.model.req;

import cn.lixin.chatapi.domain.ai.model.vo.Messages;
import java.util.List;
public class Req_data
{
    private String model;

    private List<Messages> messages;

    public Req_data(String model, List<Messages> messages) {
        this.model = model;
        this.messages = messages;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setMessages(List<Messages> messages){
        this.messages = messages;
    }
    public List<Messages> getMessages(){
        return this.messages;
    }
}