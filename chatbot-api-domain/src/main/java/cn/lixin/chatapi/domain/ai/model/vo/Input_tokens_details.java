package cn.lixin.chatapi.domain.ai.model.vo;

public class Input_tokens_details
{
    private int cached_tokens;

    public void setCached_tokens(int cached_tokens){
        this.cached_tokens = cached_tokens;
    }
    public int getCached_tokens(){
        return this.cached_tokens;
    }
}