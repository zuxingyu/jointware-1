/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.KindAnalyzer;


/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class OpenshiftKindModelAnalyzer extends KubernetesKindModelAnalyzer {

	private static final OpenshiftKindAnalyzer analyzer = new OpenshiftKindAnalyzer();

	@Override
	protected KindAnalyzer getKindAnalyzer() {
		return analyzer;
	}

	
}
