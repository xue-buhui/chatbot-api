package cn.lixin.chatapi.domain.ai.model.vo;

public class Function
{
    private String name;

    private Arguments arguments;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setArguments(Arguments arguments){
        this.arguments = arguments;
    }
    public Arguments getArguments(){
        return this.arguments;
    }
}