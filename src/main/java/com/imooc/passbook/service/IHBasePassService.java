package com.imooc.passbook.service;

import com.imooc.passbook.vo.PassTemplate;

/**
 * <h1>Pass Hbase Service</h1>
 */
public interface IHBasePassService {

    /**
     * <h2>Write PassTemplate to HBase</h2>
     * @param passTemplate {@link PassTemplate}
     * @return true/false
     * */
    boolean dropPassTemplateToHBase(PassTemplate passTemplate);
}
