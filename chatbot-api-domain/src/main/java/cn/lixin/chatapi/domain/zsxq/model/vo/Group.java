package cn.lixin.chatapi.domain.zsxq.model.vo;

//所在分组ID=28885518425541 这个是"ChatGPT AI 问答助手", type: "free
public class Group
{
    private String group_id;

    private String name;

    private String type;

    private String background_url;

    public void setGroup_id(String group_id){
        this.group_id = group_id;
    }
    public String getGroup_id(){
        return this.group_id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setBackground_url(String background_url){
        this.background_url = background_url;
    }
    public String getBackground_url(){
        return this.background_url;
    }
}
