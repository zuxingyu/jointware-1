/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月3日
 */
public class TencentCVMModelGenerator extends ModelGenerator {
    
	protected final static TencentCVMModelParameterAnalyzer 
							analyzer = new TencentCVMModelParameterAnalyzer();

    /**
     *
     */
    public TencentCVMModelGenerator() {
        super();
    }

    /**
     * @param objectRef
     */
    public TencentCVMModelGenerator(String objectRef) {
        super(objectRef);
    }

    @Override
    public ModelParameterAnalyzer getModelParameter() {
        return analyzer;
    }
}
