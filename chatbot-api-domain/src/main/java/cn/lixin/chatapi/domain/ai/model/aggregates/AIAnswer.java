package cn.lixin.chatapi.domain.ai.model.aggregates;

import cn.lixin.chatapi.domain.ai.model.vo.*;

import java.util.List;
public class AIAnswer
{
    private String id;

    private String object;

    private int created_at;

    private String status;

    private String error;

    private String incomplete_details;

    private String instructions;

    private String max_output_tokens;

    private String model;

    private List<Output> output;

    private boolean parallel_tool_calls;

    private String previous_response_id;

    private Reasoning reasoning;

    private boolean store;

    private int temperature;

    private Text text;

    private String tool_choice;

    private List<String> tools;

    private int top_p;

    private String truncation;

    private Usage usage;

    private String user;

    private Metadata metadata;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setObject(String object){
        this.object = object;
    }
    public String getObject(){
        return this.object;
    }
    public void setCreated_at(int created_at){
        this.created_at = created_at;
    }
    public int getCreated_at(){
        return this.created_at;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setError(String error){
        this.error = error;
    }
    public String getError(){
        return this.error;
    }
    public void setIncomplete_details(String incomplete_details){
        this.incomplete_details = incomplete_details;
    }
    public String getIncomplete_details(){
        return this.incomplete_details;
    }
    public void setInstructions(String instructions){
        this.instructions = instructions;
    }
    public String getInstructions(){
        return this.instructions;
    }
    public void setMax_output_tokens(String max_output_tokens){
        this.max_output_tokens = max_output_tokens;
    }
    public String getMax_output_tokens(){
        return this.max_output_tokens;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setOutput(List<Output> output){
        this.output = output;
    }
    public List<Output> getOutput(){
        return this.output;
    }
    public void setParallel_tool_calls(boolean parallel_tool_calls){
        this.parallel_tool_calls = parallel_tool_calls;
    }
    public boolean getParallel_tool_calls(){
        return this.parallel_tool_calls;
    }
    public void setPrevious_response_id(String previous_response_id){
        this.previous_response_id = previous_response_id;
    }
    public String getPrevious_response_id(){
        return this.previous_response_id;
    }
    public void setReasoning(Reasoning reasoning){
        this.reasoning = reasoning;
    }
    public Reasoning getReasoning(){
        return this.reasoning;
    }
    public void setStore(boolean store){
        this.store = store;
    }
    public boolean getStore(){
        return this.store;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return this.temperature;
    }
    public void setText(Text text){
        this.text = text;
    }
    public Text getText(){
        return this.text;
    }
    public void setTool_choice(String tool_choice){
        this.tool_choice = tool_choice;
    }
    public String getTool_choice(){
        return this.tool_choice;
    }
    public void setTools(List<String> tools){
        this.tools = tools;
    }
    public List<String> getTools(){
        return this.tools;
    }
    public void setTop_p(int top_p){
        this.top_p = top_p;
    }
    public int getTop_p(){
        return this.top_p;
    }
    public void setTruncation(String truncation){
        this.truncation = truncation;
    }
    public String getTruncation(){
        return this.truncation;
    }
    public void setUsage(Usage usage){
        this.usage = usage;
    }
    public Usage getUsage(){
        return this.usage;
    }
    public void setUser(String user){
        this.user = user;
    }
    public String getUser(){
        return this.user;
    }
    public void setMetadata(Metadata metadata){
        this.metadata = metadata;
    }
    public Metadata getMetadata(){
        return this.metadata;
    }
}
