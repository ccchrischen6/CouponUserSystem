package com.imooc.passbook.service;

import com.imooc.passbook.vo.Pass;
import com.imooc.passbook.vo.Response;

/**
 * <h1>get user's coupon info</h1>
 */
public interface IUserPassService {

    /**
     * <h2>get My coupon info</h2>
     * @param userId
     * @return {@link Response}
     * */
    Response getUserPassInfo(Long userId) throws Exception;

    /**
     * <h2>get used coupon info</h2>
     * @param userId
     * @return {@link Response}
     * */
    Response getUserUsedPassInfo(Long userId) throws Exception;

    /**
     * <h2>get all coupon info</h2>
     * @param userId
     * @return {@link Response}
     * */
    Response getUserAllPassInfo(Long userId) throws Exception;

    /**
     * <h2>the action when user use coupon</h2>
     * @param pass {@link Pass}
     * @return {@link Response}
     * */
    Response userUsePass(Pass pass);
}
