/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年3月6日
 */
public class OpenshiftModelParameterGenerator extends KubernetesModelParameterGenerator {

	protected final static OpenshiftKindModelAnalyzer 
					analyzer = new OpenshiftKindModelAnalyzer();

	
	public OpenshiftModelParameterGenerator() {
		super();
	}
}
