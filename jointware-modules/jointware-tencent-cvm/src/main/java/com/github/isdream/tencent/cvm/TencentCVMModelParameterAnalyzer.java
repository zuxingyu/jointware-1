/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.KindModelAnalyzer;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月3日
 */
public class TencentCVMModelParameterAnalyzer extends ModelParameterAnalyzer {

    protected final static TencentCVMKindModelAnalyzer 
    						analyzer = new TencentCVMKindModelAnalyzer();

    @Override
    public KindModelAnalyzer getKindModelAnalyzer() {
        return analyzer;
    }
}
