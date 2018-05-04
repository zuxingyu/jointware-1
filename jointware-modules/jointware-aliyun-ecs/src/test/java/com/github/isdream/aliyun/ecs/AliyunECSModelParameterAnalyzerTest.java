/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.aliyun.ecs;

import com.github.isdream.aliyun.ecs.AliyunECSModelParameterAnalyzer;
import com.github.isdream.jointware.core.helpers.ParametersHelper;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月4日
 */
@SuppressWarnings("deprecation")
public class AliyunECSModelParameterAnalyzerTest extends TestCase {
    /**
     * @param args
     */
    public static void main(String[] args) {
        AliyunECSModelParameterAnalyzer analyzer = new AliyunECSModelParameterAnalyzer();
//        showModelParametersWithKeyValueStyle(analyzer);
//        showModelParametersWithNetstedStyle(analyzer);
        showModelParametersWithJsonStyle(analyzer);
    }

    protected static void showModelParametersWithJsonStyle(AliyunECSModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithJsonStyle("AliyunECS", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithNetstedStyle(AliyunECSModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithNetstedStyle("AliyunECS", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithKeyValueStyle(AliyunECSModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithKeyValueStyle("AliyunECS", kind, analyzer.getModelParameters(kind));
        }
    }
}
