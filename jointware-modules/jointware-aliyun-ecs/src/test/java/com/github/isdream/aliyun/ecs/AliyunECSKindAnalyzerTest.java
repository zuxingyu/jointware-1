/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.aliyun.ecs;

import com.github.isdream.aliyun.ecs.AliyunECSKindAnalyzer;
import com.github.isdream.jointware.core.helpers.FeaturesHelper;
import junit.framework.TestCase;

import java.io.IOException;
import java.util.Set;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class AliyunECSKindAnalyzerTest extends TestCase {

    Set<String> kinds = null;

    @Override
    protected void setUp() throws Exception {
        kinds = new AliyunECSKindAnalyzer().getKinds();
    }

    public void testFeaturesWithTrueResults() {
        //TODO
    }

    public void testFeaturesWithFalseResults() {

        //TODO
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        AliyunECSKindAnalyzer kka = new AliyunECSKindAnalyzer();
        FeaturesHelper.showAllFeatures("AliyunECS", kka.getKinds());
        FeaturesHelper.testFeaturesWithTrueResults(kka.getKinds());
        FeaturesHelper.testFeaturesWithFalseResults(kka.getKinds());

    }
}
