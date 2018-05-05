/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.openstack;

import com.github.isdream.jointware.core.helpers.ParametersHelper;
import com.github.isdream.openstack.OpenStackModelParameterAnalyzer;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月4日
 */
@SuppressWarnings("deprecation")
public class OpenStackModelParameterAnalyzerTest extends TestCase {
    /**
     * @param args
     */
    public static void main(String[] args) {
        OpenStackModelParameterAnalyzer analyzer = new OpenStackModelParameterAnalyzer();
//        showModelParametersWithKeyValueStyle(analyzer);
//        showModelParametersWithNetstedStyle(analyzer);
        showModelParametersWithJsonStyle(analyzer);
    }

    protected static void showModelParametersWithJsonStyle(OpenStackModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithJsonStyle("AliyunECS", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithNetstedStyle(OpenStackModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithNetstedStyle("AliyunECS", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithKeyValueStyle(OpenStackModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithKeyValueStyle("AliyunECS", kind, analyzer.getModelParameters(kind));
        }
    }
}
