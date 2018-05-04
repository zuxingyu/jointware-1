/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.helpers.ParametersHelper;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月4日
 */
@SuppressWarnings("deprecation")
public class TencentCVMModelParameterAnalyzerTest extends TestCase {
    /**
     * @param args
     */
    public static void main(String[] args) {
        TencentCVMModelParameterAnalyzer analyzer = new TencentCVMModelParameterAnalyzer();
//        showModelParametersWithKeyValueStyle(analyzer);
//        showModelParametersWithNetstedStyle(analyzer);
        showModelParametersWithJsonStyle(analyzer);
    }

    protected static void showModelParametersWithJsonStyle(TencentCVMModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithJsonStyle("TencentCVM", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithNetstedStyle(TencentCVMModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithNetstedStyle("TencentCVM", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithKeyValueStyle(TencentCVMModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithKeyValueStyle("TencentCVM", kind, analyzer.getModelParameters(kind));
        }
    }
}
