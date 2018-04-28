/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.KindModelAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年3月3日
 */
public class OpenshiftModelParameterAnalyzer extends KubernetesModelParameterAnalyzer {

	protected final static OpenshiftKindModelAnalyzer analyzer = new OpenshiftKindModelAnalyzer();

	@Override
	public KindModelAnalyzer getKindModelAnalyzer() {
		return analyzer;
	}

}
