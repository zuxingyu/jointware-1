/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.ModelParameterGenerator;
import com.github.isdream.jointware.kubernetes.kinds.DeploymentObject;
import com.github.isdream.jointware.kubernetes.kinds.EmptyDirObject;
import com.github.isdream.jointware.kubernetes.kinds.NamespaceObject;
import com.github.isdream.jointware.kubernetes.kinds.UBOCObject;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月6日
 */
public class KubernetesModelParameterGeneratorTest extends TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KubernetesModelParameterGenerator generator = new KubernetesModelParameterGenerator(
				ModelParameterGenerator.JOINTWARE);
//		System.out.println(generator.toJson(
//				generator.toMap(
//						new NamespaceObject().create())));
//		
//		System.out.println(generator.toJson(
//				generator.toMap(
//						new DeploymentObject().create())));
//		System.out.println(generator.toJson(
//				generator.toMap(
//						new UBOCObject().create())));
		
//		System.out.println(new EmptyDirObject().create());
		
		System.out.println(generator.toJson(
				generator.toMap(
						new EmptyDirObject().create())));
	}

}
