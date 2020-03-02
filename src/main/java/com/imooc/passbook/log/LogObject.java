package com.imooc.passbook.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogObject {
    /** log action */
    private String action;

    /** user id */
    private Long userId;

    private Long timestamp;

    /** client ip address*/
    private String remoteIp;

    /** log info */
    private Object info = null;
}
