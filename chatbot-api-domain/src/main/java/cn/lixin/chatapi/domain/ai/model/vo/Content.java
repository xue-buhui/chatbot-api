package cn.lixin.chatapi.domain.ai.model.vo;

import java.util.List;
public class Content
{
    private String type;

    private String text;

    private List<String> annotations;

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public void setAnnotations(List<String> annotations){
        this.annotations = annotations;
    }
    public List<String> getAnnotations(){
        return this.annotations;
    }
}