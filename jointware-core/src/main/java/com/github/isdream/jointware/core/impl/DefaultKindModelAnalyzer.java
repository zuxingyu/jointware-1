/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core.impl;

import java.util.Set;

import com.github.isdream.jointware.core.KindAnalyzer;
import com.github.isdream.jointware.core.KindModelAnalyzer;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public class DefaultKindModelAnalyzer extends KindModelAnalyzer {

	private final static DefaultKindAnalyzer analyzer = new DefaultKindAnalyzer();
	
	@Override
	protected Set<String> getKinds() {
		return analyzer.getKinds();
	}

	@Override
	protected KindAnalyzer getKindAnalyzer() {
		return analyzer;
	}

	@Override
	protected Class<?> toKindModel(String kind) throws Exception {
		return null;
	}

}
