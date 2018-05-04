/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.ModelParameterGenerator;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月6日
 */
public class KubernetesModelParameterGenerator extends ModelParameterGenerator {

	/**
	 * 
	 */
	public KubernetesModelParameterGenerator() {
		super();
	}

	/**
	 * @param objectRef
	 */
	public KubernetesModelParameterGenerator(String objectRef) {
		super(objectRef);
	}
	
}
