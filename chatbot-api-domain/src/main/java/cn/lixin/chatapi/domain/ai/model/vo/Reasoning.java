package cn.lixin.chatapi.domain.ai.model.vo;

public class Reasoning
{
    private String effort;

    private String summary;

    public void setEffort(String effort){
        this.effort = effort;
    }
    public String getEffort(){
        return this.effort;
    }
    public void setSummary(String summary){
        this.summary = summary;
    }
    public String getSummary(){
        return this.summary;
    }
}