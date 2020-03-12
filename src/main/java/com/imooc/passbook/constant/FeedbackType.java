package com.imooc.passbook.constant;

/**
 * <h1>comments types</h1>
 */
public enum FeedbackType {
    PASS("pass", "coupon comments"),
    APP("app", "App comments");

    //comments type code
    private String code;

    //comments type description
    private String desc;

    FeedbackType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
