package cn.lixin.chatapi.domain.ai.model.vo;

import java.util.ArrayList;
import java.util.List;
public class Input_schema
{
    private String type;

    private Properties properties;

    private List<String> required;

    private boolean additionalProperties;

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setProperties(Properties properties){
        this.properties = properties;
    }
    public Properties getProperties(){
        return this.properties;
    }
    public void setRequired(List<String> required){
        this.required = required;
    }
    public List<String> getRequired(){
        return this.required;
    }
    public void setAdditionalProperties(boolean additionalProperties){
        this.additionalProperties = additionalProperties;
    }
    public boolean getAdditionalProperties(){
        return this.additionalProperties;
    }
}