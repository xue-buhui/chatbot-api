package cn.lixin.chatapi.domain.ai.model.aggregates;

import cn.lixin.chatapi.domain.ai.model.vo.*;

import java.util.List;
public class AIAnswer
{
    private String id;

    private String request_id;

    private int created;

    private String model;

    private List<Choices> choices;

    private Usage usage;

    private List<Video_result> video_result;

    private List<Web_search> web_search;

    private List<Content_filter> content_filter;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setRequest_id(String request_id){
        this.request_id = request_id;
    }
    public String getRequest_id(){
        return this.request_id;
    }
    public void setCreated(int created){
        this.created = created;
    }
    public int getCreated(){
        return this.created;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setChoices(List<Choices> choices){
        this.choices = choices;
    }
    public List<Choices> getChoices(){
        return this.choices;
    }
    public void setUsage(Usage usage){
        this.usage = usage;
    }
    public Usage getUsage(){
        return this.usage;
    }
    public void setVideo_result(List<Video_result> video_result){
        this.video_result = video_result;
    }
    public List<Video_result> getVideo_result(){
        return this.video_result;
    }
    public void setWeb_search(List<Web_search> web_search){
        this.web_search = web_search;
    }
    public List<Web_search> getWeb_search(){
        return this.web_search;
    }
    public void setContent_filter(List<Content_filter> content_filter){
        this.content_filter = content_filter;
    }
    public List<Content_filter> getContent_filter(){
        return this.content_filter;
    }
}
