/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.openshift;



import com.github.isdream.jointware.core.ModelParameterGenerator;
import com.github.isdream.jointware.kubernetes.OpenshiftModelParameterGenerator;
import com.github.isdream.jointware.openshift.kind.DeploymentObject;
import com.github.isdream.jointware.openshift.kind.NamespaceObject;
import com.github.isdream.jointware.openshift.kind.UBOCObject;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月6日
 */
public class OpenshiftModelParameterGeneratorTest extends TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OpenshiftModelParameterGenerator generator = new OpenshiftModelParameterGenerator();
		System.out.println(generator.toJson(
				generator.toMap(
						new NamespaceObject().create())));
		
		System.out.println(generator.toJson(
				generator.toMap(
						new DeploymentObject().create())));
		
		System.out.println(generator.toJson(
				generator.toMap(
						new UBOCObject().create())));
	}

}
