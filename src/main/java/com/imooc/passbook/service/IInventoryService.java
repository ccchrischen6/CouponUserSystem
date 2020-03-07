package com.imooc.passbook.service;

import com.imooc.passbook.vo.Response;

/**
 * <h1>get inventory info: only return un-received coupon</h1>
 */
public interface IInventoryService {

    /**
     * <h2>get inventory info</h2>
     * @param userId user id
     * @return {@link Response}
     * */
    Response getInventoryInfo(Long userId) throws Exception;
}
