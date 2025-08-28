package cn.lixin.chatapi.domain.ai.model.vo;

public class Tool_calls
{
    private Function function;

    private Mcp mcp;

    private String id;

    private String type;

    public void setFunction(Function function){
        this.function = function;
    }
    public Function getFunction(){
        return this.function;
    }
    public void setMcp(Mcp mcp){
        this.mcp = mcp;
    }
    public Mcp getMcp(){
        return this.mcp;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}