package com.imooc.passbook.constant;

/**
 * <h1>comments types</h1>
 */
public enum FeedbackType {
    PASS(1, "coupon comments"),
    APP(2, "App comments");

    //comments type code
    private Integer code;

    //comments type description
    private String desc;

    FeedbackType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
