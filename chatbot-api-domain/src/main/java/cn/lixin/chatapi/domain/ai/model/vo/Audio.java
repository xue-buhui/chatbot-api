package cn.lixin.chatapi.domain.ai.model.vo;

public class Audio
{
    private String id;

    private String data;

    private String expires_at;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
    public void setExpires_at(String expires_at){
        this.expires_at = expires_at;
    }
    public String getExpires_at(){
        return this.expires_at;
    }
}
