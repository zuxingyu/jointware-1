/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月8日
 */
public class OpenshiftModelGenerator extends KubernetesModelGenerator {

	protected final static OpenshiftModelParameterAnalyzer 
						analyzer = new OpenshiftModelParameterAnalyzer();
	
	/**
	 * 
	 */
	public OpenshiftModelGenerator() {
		super();
	}

	/**
	 * @param objectRef
	 */
	public OpenshiftModelGenerator(String objectRef) {
		super(objectRef);
	}
	
	@Override
	public ModelParameterAnalyzer getModelParameter() {
		return analyzer;
	}

}
