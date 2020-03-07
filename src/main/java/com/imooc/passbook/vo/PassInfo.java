package com.imooc.passbook.vo;

import com.imooc.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>the info of coupon which user get</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassInfo {

    /** coupon */
    private Pass pass;

    /** coupon template */
    private PassTemplate passTemplate;

    /** related merchant */
    private Merchants merchants;
}
