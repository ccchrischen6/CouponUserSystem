package com.imooc.passbook.log;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * <h1>generate log </h1>
 */

@Slf4j
public class LogGenerator {
    /**
     *
     * @param request {@link HttpServletRequest}
     * @param userId
     * @param action
     * @param info
     */
    public static void genLog(HttpServletRequest request, Long userId, String action, Object info){
        log.info(
                JSON.toJSONString(
                        new LogObject(action, userId, System.currentTimeMillis(), request.getRemoteAddr(), info)
                )
        );
    }
}
