/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.amazon.ec2;

import com.github.isdream.amazon.ec2.AmazonEC2ModelParameterAnalyzer;
import com.github.isdream.jointware.core.helpers.ParametersHelper;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月4日
 */
@SuppressWarnings("deprecation")
public class AmazonEC2ModelParameterAnalyzerTest extends TestCase {
    /**
     * @param args
     */
    public static void main(String[] args) {
        AmazonEC2ModelParameterAnalyzer analyzer = new AmazonEC2ModelParameterAnalyzer();
//        showModelParametersWithKeyValueStyle(analyzer);
//        showModelParametersWithNetstedStyle(analyzer);
        showModelParametersWithJsonStyle(analyzer);
    }

    protected static void showModelParametersWithJsonStyle(AmazonEC2ModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithJsonStyle("AmazonEC2", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithNetstedStyle(AmazonEC2ModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithNetstedStyle("AmazonEC2", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithKeyValueStyle(AmazonEC2ModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithKeyValueStyle("AmazonEC2", kind, analyzer.getModelParameters(kind));
        }
    }
}
