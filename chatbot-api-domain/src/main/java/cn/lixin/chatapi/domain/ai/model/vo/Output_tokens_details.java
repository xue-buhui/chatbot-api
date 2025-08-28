package cn.lixin.chatapi.domain.ai.model.vo;

public class Output_tokens_details
{
    private int reasoning_tokens;

    public void setReasoning_tokens(int reasoning_tokens){
        this.reasoning_tokens = reasoning_tokens;
    }
    public int getReasoning_tokens(){
        return this.reasoning_tokens;
    }
}
