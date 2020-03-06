package com.imooc.passbook.service;

import com.imooc.passbook.vo.Feedback;
import com.imooc.passbook.vo.Response;

/**
 * <h1>comment related service</h1>
 */
public interface IFeedbackService {

    /**
     * <h2>create feedback</h2>
     * @param feedback {@link Feedback}
     * @return {@link Response}
     * */
    Response createFeedback(Feedback feedback);

    /**
     * <h2>get feedback</h2>
     * @param userId user id
     * @return {@link Response}
     * */
    Response getFeedback(Long userId);
}
