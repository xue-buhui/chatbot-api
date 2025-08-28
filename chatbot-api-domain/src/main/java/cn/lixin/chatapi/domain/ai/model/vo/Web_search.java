package cn.lixin.chatapi.domain.ai.model.vo;

public class Web_search
{
    private String icon;

    private String title;

    private String link;

    private String media;

    private String publish_date;

    private String content;

    private String refer;

    public void setIcon(String icon){
        this.icon = icon;
    }
    public String getIcon(){
        return this.icon;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setLink(String link){
        this.link = link;
    }
    public String getLink(){
        return this.link;
    }
    public void setMedia(String media){
        this.media = media;
    }
    public String getMedia(){
        return this.media;
    }
    public void setPublish_date(String publish_date){
        this.publish_date = publish_date;
    }
    public String getPublish_date(){
        return this.publish_date;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
    public void setRefer(String refer){
        this.refer = refer;
    }
    public String getRefer(){
        return this.refer;
    }
}