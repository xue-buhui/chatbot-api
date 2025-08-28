package cn.lixin.chatapi.domain.ai.model.req;

public class Req_data
{
    private String model;

    private String input;

    public Req_data(String model, String input) {
        this.model = model;
        this.input = input;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setInput(String input){
        this.input = input;
    }
    public String getInput(){
        return this.input;
    }
}