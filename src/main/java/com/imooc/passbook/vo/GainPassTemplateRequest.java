package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>the request object when user get coupon</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GainPassTemplateRequest {

    /** user id */
    private Long userId;

    /** PassTemplate object */
    private PassTemplate passTemplate;
}
