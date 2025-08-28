package cn.lixin.chatapi.domain.ai.model.vo;

public class Content_filter
{
    private String role;

    private int level;

    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return this.level;
    }
}
