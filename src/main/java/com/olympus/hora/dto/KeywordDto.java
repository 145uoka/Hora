package com.olympus.hora.dto;

public class KeywordDto {

    private String description;
    private String keyword;
    private Integer questionId;
    private Integer orderNum;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public Integer getQuestionId() {
        return questionId;
    }
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
    public Integer getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }



}
