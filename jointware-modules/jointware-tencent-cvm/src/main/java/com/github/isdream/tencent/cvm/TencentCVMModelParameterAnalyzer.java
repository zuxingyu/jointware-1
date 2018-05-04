package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.KindModelAnalyzer;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

public class TencentCVMModelParameterAnalyzer extends ModelParameterAnalyzer {

    protected final static TencentCVMKindModelAnalyzer 
    						analyzer = new TencentCVMKindModelAnalyzer();

    @Override
    public KindModelAnalyzer getKindModelAnalyzer() {
        return analyzer;
    }
}
