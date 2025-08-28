package cn.lixin.chatapi.domain.ai.model.vo;

import java.util.ArrayList;
import java.util.List;
public class Message
{
    private String role;

    private String content;

    private String reasoning_content;

    private Audio audio;

    private List<Tool_calls> tool_calls;

    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
    public void setReasoning_content(String reasoning_content){
        this.reasoning_content = reasoning_content;
    }
    public String getReasoning_content(){
        return this.reasoning_content;
    }
    public void setAudio(Audio audio){
        this.audio = audio;
    }
    public Audio getAudio(){
        return this.audio;
    }
    public void setTool_calls(List<Tool_calls> tool_calls){
        this.tool_calls = tool_calls;
    }
    public List<Tool_calls> getTool_calls(){
        return this.tool_calls;
    }
}