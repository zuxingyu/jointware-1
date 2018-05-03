package com.github.isdream.aliyun.ecs;

import com.github.isdream.aliyun.ecs.AliyunECSKindAnalyzer;
import com.github.isdream.aliyun.ecs.AliyunECSKindModelAnalyzer;
import com.github.isdream.jointware.core.helpers.ModelsHelper;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Map;

public class AliyunECSKindModelAnalyzerTest extends TestCase {
    Map<String, String> kindModels = null;

    @Override
    protected void setUp() throws Exception {
        kindModels = new AliyunECSKindModelAnalyzer().getKindModels();
    }

    public void testEuqalFeatures() {
        Assert.assertEquals(ModelsHelper.testGreatAndEuqalFeatures(
                new AliyunECSKindAnalyzer().getKinds(),
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
        AliyunECSKindModelAnalyzer kkma = new AliyunECSKindModelAnalyzer();
        ModelsHelper.showAllModels("AliyunECS", kkma.getKindModels());
        ModelsHelper.testModelsWithTrueResults(kkma.getKindModels().values());
        ModelsHelper.testModelsWithFalseResults(kkma.getKindModels().values());
    }

}
