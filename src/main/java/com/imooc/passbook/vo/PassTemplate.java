package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/** coupon object definition */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassTemplate {
    /** merchants id */
    private Integer id;

    /** coupon title */
    private String title;

    /** coupon summary */
    private String summary;

    /** coupon desc */
    private String desc;

    /** max limit */
    private Long limit;

    private Boolean hasToken;

    /** background color */
    private Integer background;

    /** date it starts */
    private Date start;


    /** date it ends */
    private Date end;


}
