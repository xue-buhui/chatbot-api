package cn.lixin.chatapi.domain.ai.model.vo;

public class Usage
{
    private int input_tokens;

    private Input_tokens_details input_tokens_details;

    private int output_tokens;

    private Output_tokens_details output_tokens_details;

    private int total_tokens;

    public void setInput_tokens(int input_tokens){
        this.input_tokens = input_tokens;
    }
    public int getInput_tokens(){
        return this.input_tokens;
    }
    public void setInput_tokens_details(Input_tokens_details input_tokens_details){
        this.input_tokens_details = input_tokens_details;
    }
    public Input_tokens_details getInput_tokens_details(){
        return this.input_tokens_details;
    }
    public void setOutput_tokens(int output_tokens){
        this.output_tokens = output_tokens;
    }
    public int getOutput_tokens(){
        return this.output_tokens;
    }
    public void setOutput_tokens_details(Output_tokens_details output_tokens_details){
        this.output_tokens_details = output_tokens_details;
    }
    public Output_tokens_details getOutput_tokens_details(){
        return this.output_tokens_details;
    }
    public void setTotal_tokens(int total_tokens){
        this.total_tokens = total_tokens;
    }
    public int getTotal_tokens(){
        return this.total_tokens;
    }
}