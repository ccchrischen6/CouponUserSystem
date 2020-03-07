package com.imooc.passbook.service;

import com.imooc.passbook.vo.GainPassTemplateRequest;
import com.imooc.passbook.vo.Response;

/**
 * <h1>the action when user gain coupon</h1>
 */
public interface IGainPassTemplateService {

    /**
     * @param request {@link GainPassTemplateRequest}
     * @return {@link Response}
     * */
    Response gainPassTemplate(GainPassTemplateRequest request) throws Exception;
}
