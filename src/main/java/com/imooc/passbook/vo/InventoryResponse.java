package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <h1>inventory response</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponse {

    /** user id */
    private Long userId;

    /** coupon info */
    private List<PassTemplateInfo> passTemplateInfos;
}
