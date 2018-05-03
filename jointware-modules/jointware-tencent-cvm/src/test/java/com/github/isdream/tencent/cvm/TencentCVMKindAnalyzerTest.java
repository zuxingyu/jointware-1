/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.helpers.FeaturesHelper;
import com.github.isdream.tencent.cvm.TencentCVMKindAnalyzer;

import junit.framework.TestCase;

import java.io.IOException;
import java.util.Set;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class TencentCVMKindAnalyzerTest extends TestCase {

    Set<String> kinds = null;

    @Override
    protected void setUp() throws Exception {
        kinds = new TencentCVMKindAnalyzer().getKinds();
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
        TencentCVMKindAnalyzer kka = new TencentCVMKindAnalyzer();
        FeaturesHelper.showAllFeatures("AliyunECS", kka.getKinds());
        FeaturesHelper.testFeaturesWithTrueResults(kka.getKinds());
        FeaturesHelper.testFeaturesWithFalseResults(kka.getKinds());

    }
}
