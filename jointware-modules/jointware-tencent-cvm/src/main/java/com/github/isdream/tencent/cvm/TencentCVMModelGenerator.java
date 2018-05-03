package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

public class TencentCVMModelGenerator extends ModelGenerator {
    protected final static TencentCVMModelParameterAnalyzer analyzer = new TencentCVMModelParameterAnalyzer();

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
