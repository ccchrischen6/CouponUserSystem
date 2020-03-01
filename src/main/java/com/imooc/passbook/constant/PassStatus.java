package com.imooc.passbook.constant;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

/**
 *
 * <h1>the status of coupon</h1>
 */
public enum PassStatus {
    UNUSED(1, "unused"),
    USED(2, "used"),
    ALL(3, "allObtained");

    //status code
    private Integer code;

    //status description
    private String desc;

    PassStatus(Integer code, String desc){
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
