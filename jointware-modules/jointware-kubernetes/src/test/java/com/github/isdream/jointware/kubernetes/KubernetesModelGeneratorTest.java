/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.ModelParameterGenerator;
import com.github.isdream.jointware.kubernetes.kinds.NamespaceObject;
import com.github.isdream.jointware.kubernetes.maps.MapUtils;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月8日
 */
public class KubernetesModelGeneratorTest extends TestCase {

	public static void main(String[] args) throws Exception {
//		KubernetesModelParameterGenerator kmpgenerator = new KubernetesModelParameterGenerator(ModelParameterGenerator.JOINTWARE);
//		testNamespace(kmpgenerator);
		KubernetesModelGenerator kmgenerator = new KubernetesModelGenerator(ModelParameterGenerator.JOINTWARE);
		System.out.println(kmgenerator.toObject(MapUtils.mockBOCOFrontend(), "Deployment"));
	}

	protected static void testNamespace(KubernetesModelParameterGenerator kmpgenerator) throws Exception {
		KubernetesModelGenerator kmgenerator = new KubernetesModelGenerator(ModelParameterGenerator.JOINTWARE);
		System.out.println(kmgenerator.toObject(
				kmpgenerator.toMap(
						new NamespaceObject().create()), "Namespace"));
	}
}
