package com.imooc.passbook.service;

import com.imooc.passbook.vo.Response;
import com.imooc.passbook.vo.User;

/**
 * <h1>create User service</h1>
 */
public interface IUserService {

    /**
     * <h2>create user</h2>
     * @param user {@link User}
     * @return {@link Response}
     * */
    Response createUser(User user) throws Exception;
}
