package com.github.isdream.aliyunecs;

import com.aliyuncs.ecs.model.v20140526.DescribeImagesRequest;
import com.github.isdream.aliyunecs.maps.MapUtils;
import com.github.isdream.jointware.core.ModelParameterGenerator;
import junit.framework.TestCase;


public class AliyunECSModelGeneratorTest extends TestCase {
//
    public static void main(String[] args) throws Exception {
//		KubernetesModelParameterGenerator kmpgenerator = new KubernetesModelParameterGenerator(ModelParameterGenerator.JOINTWARE);
//		testNamespace(kmpgenerator);
        //没有tostring方法，显示不出像k8s那样的效果，但确实是一个类似的对象。
        AliyunECSModelGenerator kmgenerator = new AliyunECSModelGenerator(ModelParameterGenerator.JOINTWARE);
        System.out.println(kmgenerator.toObject(MapUtils.mockBOCOFrontend(), "DescribeImages"));
    }

//    protected static void testNamespace(KubernetesModelParameterGenerator kmpgenerator) throws Exception {
//        KubernetesModelGenerator kmgenerator = new KubernetesModelGenerator(ModelParameterGenerator.JOINTWARE);
//        System.out.println(kmgenerator.toObject(
//                kmpgenerator.toMap(
//                        new NamespaceObject().create()), "Namespace"));
//    }
}