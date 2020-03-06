package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>Controller general response</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    /** Error Code: return 0 if true */
    private Integer errorCode = 0;

    /** Error Message，if no error return empty */
    private String errorMsg = "";

    /** return object */
    private Object data;

    /**
     * <h2>if no error return object </h2>
     * */
    public Response(Object data) {
        this.data = data;
    }

    /**
     * <h2>empty response</h2>
     * */
    public static Response success() {
        return new Response();
    }

    /**
     * <h2>error response</h2>
     * */
    public static Response failure(String errorMsg) {
        return new Response(-1, errorMsg, null);
    }
}
