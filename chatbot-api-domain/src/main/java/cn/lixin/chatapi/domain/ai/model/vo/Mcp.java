package cn.lixin.chatapi.domain.ai.model.vo;

import java.util.ArrayList;
import java.util.List;
public class Mcp
{
    private String id;

    private String type;

    private String server_label;

    private String error;

    private List<Tools> tools;

    private String arguments;

    private String name;

    private Output output;

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
    public void setServer_label(String server_label){
        this.server_label = server_label;
    }
    public String getServer_label(){
        return this.server_label;
    }
    public void setError(String error){
        this.error = error;
    }
    public String getError(){
        return this.error;
    }
    public void setTools(List<Tools> tools){
        this.tools = tools;
    }
    public List<Tools> getTools(){
        return this.tools;
    }
    public void setArguments(String arguments){
        this.arguments = arguments;
    }
    public String getArguments(){
        return this.arguments;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setOutput(Output output){
        this.output = output;
    }
    public Output getOutput(){
        return this.output;
    }
}
