/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker;

import com.github.isdream.jointware.core.KindModelAnalyzer;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年3月3日
 */
public class DockerModelParameterAnalyzer extends ModelParameterAnalyzer {

	protected final static DockerKindModelAnalyzer 
								analyzer = new DockerKindModelAnalyzer();

	@Override
	public KindModelAnalyzer getKindModelAnalyzer() {
		return analyzer;
	}
	
	
}
