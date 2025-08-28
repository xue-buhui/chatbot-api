package cn.lixin.chatapi.domain.zsxq.model.resp;

//这里要符合JSON的结构要求，并不是多余封装一层
public class AnswerResp {
    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
