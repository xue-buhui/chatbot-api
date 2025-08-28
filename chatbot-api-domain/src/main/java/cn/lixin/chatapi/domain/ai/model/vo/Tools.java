package cn.lixin.chatapi.domain.ai.model.vo;

public class Tools
{
    private String name;

    private String description;

    private Annotations annotations;

    private Input_schema input_schema;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setAnnotations(Annotations annotations){
        this.annotations = annotations;
    }
    public Annotations getAnnotations(){
        return this.annotations;
    }
    public void setInput_schema(Input_schema input_schema){
        this.input_schema = input_schema;
    }
    public Input_schema getInput_schema(){
        return this.input_schema;
    }
}