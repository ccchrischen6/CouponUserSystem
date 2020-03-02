package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <h1>user received coupon</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pass {
    //user id
    private Long userId;

    //RowKey of pass in HBase
    private String rowKey;

    //RowKey of PassTemplate in HBase
    private  String templateId;

    //token of coupon, it could be null, fill -1
    private String token;

    //the date user received coupon
    private Date assignedDate;

    //the date user consumed coupon, if not null, it means it has been used
    private Date conDate;
}
