package cn.lixin.chatapi.domain.zsxq.model.vo;

import cn.lixin.chatapi.domain.zsxq.model.resp.Resp_data;

public class Root
{
    private boolean succeeded;

    private Resp_data resp_data;

    public void setSucceeded(boolean succeeded){
        this.succeeded = succeeded;
    }
    public boolean getSucceeded(){
        return this.succeeded;
    }
    public void setResp_data(Resp_data resp_data){
        this.resp_data = resp_data;
    }
    public Resp_data getResp_data(){
        return this.resp_data;
    }
}