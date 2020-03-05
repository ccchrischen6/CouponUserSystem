package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * <h1>Error Code</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo<T> {

    /** General Error Code */
    public static final Integer ERROR = -1;

    /** Specific Error Code */
    private Integer code;

    /** Error Message */
    private String message;

    /** Request url */
    private String url;

    /** response data */
    private T data;
}
