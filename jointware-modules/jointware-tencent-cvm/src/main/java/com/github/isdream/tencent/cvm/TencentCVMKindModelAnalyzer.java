package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.KindAnalyzer;
import com.github.isdream.jointware.core.KindModelAnalyzer;

public class TencentCVMKindModelAnalyzer extends KindModelAnalyzer {
    private static final String PACKAGE_NAME="com.aliyuncs.ecs.model.v20140526";

    private static final TencentCVMKindAnalyzer analyzer = new TencentCVMKindAnalyzer();

    TencentCVMKindModelAnalyzer() {
        super();
    }
    @Override
    protected Class<?> toKindModel(String kind) throws Exception {
        return Class.forName(PACKAGE_NAME+"."+kind+"Request");
    }

    @Override
    protected KindAnalyzer getKindAnalyzer() {
        return analyzer;
    }
}
