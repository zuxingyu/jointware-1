package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.helpers.ModelsHelper;
import com.github.isdream.tencent.cvm.TencentCVMKindAnalyzer;
import com.github.isdream.tencent.cvm.TencentCVMKindModelAnalyzer;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Map;

public class TencentCVMKindModelAnalyzerTest extends TestCase {
    Map<String, String> kindModels = null;

    @Override
    protected void setUp() throws Exception {
        kindModels = new TencentCVMKindModelAnalyzer().getKindModels();
    }

    public void testEuqalFeatures() {
        Assert.assertEquals(ModelsHelper.testGreatAndEuqalFeatures(
                new TencentCVMKindAnalyzer().getKinds(),
                kindModels.keySet()), true);
    }

    public void testModelsWithTrueResults() {
        //TODO
    }

    public void testModelsWithFalseResults() {
        //TODO

    }

    /**
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException {
        TencentCVMKindModelAnalyzer kkma = new TencentCVMKindModelAnalyzer();
        ModelsHelper.showAllModels("AliyunECS", kkma.getKindModels());
        ModelsHelper.testModelsWithTrueResults(kkma.getKindModels().values());
        ModelsHelper.testModelsWithFalseResults(kkma.getKindModels().values());
    }

}
