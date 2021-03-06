package com.imooc.passbook.vo;

import com.imooc.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <h1>coupon sample info</h1>
 */
@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplateInfo {

    /** coupon sample */
    private PassTemplate passTemplate;

    /** merchant sample */
    private Merchants merchants;
}
