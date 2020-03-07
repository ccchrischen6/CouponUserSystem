package com.imooc.passbook.utils;

import com.imooc.passbook.vo.Feedback;
import com.imooc.passbook.vo.GainPassTemplateRequest;
import com.imooc.passbook.vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * <h1>Row Key generate util class</h1>
 */
@Slf4j
public class RowKeyGenUtil {

    /**
     * <h2>generate RowKey from PassTemplate</h2>
     * @param passTemplate {@link PassTemplate}
     * @return String RowKey
     * */
    public static String genPassTemplateRowKey(PassTemplate passTemplate) {

        String passInfo = String.valueOf(passTemplate.getId()) + "_" + passTemplate.getTitle();
        String rowKey = DigestUtils.md5Hex(passInfo);
        log.info("GenPassTemplateRowKey: {}, {}", passInfo, rowKey);

        return rowKey;
    }

    /**
     * <h2>generate RowKey when receiving a request, only used when user gain coupon</h2>
     * Pass RowKey = reversed(userId) + inverse(timestamp) + PassTemplate RowKey
     * @param request {@link GainPassTemplateRequest}
     * @return String RowKey
     * */
    public static String genPassRowKey(GainPassTemplateRequest request) {

        return new StringBuilder(String.valueOf(request.getUserId())).reverse().toString()
                + (Long.MAX_VALUE - System.currentTimeMillis())
                + genPassTemplateRowKey(request.getPassTemplate());
    }


    /**
     * <h2>Generate RowKey from Feedback</h2>
     * @param feedback {@link Feedback}
     * @return String RowKey
     * */
    public static String genFeedbackRowKey(Feedback feedback) {

        return new StringBuilder(String.valueOf(feedback.getUserId())).reverse().toString() +
                (Long.MAX_VALUE - System.currentTimeMillis());
    }
}
