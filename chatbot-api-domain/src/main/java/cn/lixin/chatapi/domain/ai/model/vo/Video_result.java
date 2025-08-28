package cn.lixin.chatapi.domain.ai.model.vo;

public class Video_result
{
    private String url;

    private String cover_image_url;

    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setCover_image_url(String cover_image_url){
        this.cover_image_url = cover_image_url;
    }
    public String getCover_image_url(){
        return this.cover_image_url;
    }
}