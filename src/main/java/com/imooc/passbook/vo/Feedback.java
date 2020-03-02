package com.imooc.passbook.vo;

import com.google.common.base.Enums;
import com.imooc.passbook.constant.FeedbackType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * user comment table
 */

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Feedback {

    private Long userId;

    //comment type
    private String type;

    //the RowKey of PassTemplate, if it is app type, no this field
    private String templateId;

    private String comment;

    public boolean validate(){
        FeedbackType feedbackType = Enums.getIfPresent(
                FeedbackType.class, this.type.toUpperCase()
        ).orNull();

        return !(null == feedbackType || null == comment);
    }
}
