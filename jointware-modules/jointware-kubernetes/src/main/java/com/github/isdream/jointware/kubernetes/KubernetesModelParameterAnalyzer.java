/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.KindModelAnalyzer;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年3月3日
 */
public class KubernetesModelParameterAnalyzer extends ModelParameterAnalyzer {

	protected final static KubernetesKindModelAnalyzer 
								analyzer = new KubernetesKindModelAnalyzer();

	@Override
	public KindModelAnalyzer getKindModelAnalyzer() {
		return analyzer;
	}
}
