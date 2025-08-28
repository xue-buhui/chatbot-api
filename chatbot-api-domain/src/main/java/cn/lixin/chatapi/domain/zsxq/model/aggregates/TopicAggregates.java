package cn.lixin.chatapi.domain.zsxq.model.aggregates;

import cn.lixin.chatapi.domain.zsxq.model.resp.Resp_data;

//向问答助手提问的话题信息
public class TopicAggregates {
    private boolean succeeded;

    private Resp_data resp_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public Resp_data getResp_data() {
        return resp_data;
    }

    public void setResp_data(Resp_data resp_data) {
        this.resp_data = resp_data;
    }
}
