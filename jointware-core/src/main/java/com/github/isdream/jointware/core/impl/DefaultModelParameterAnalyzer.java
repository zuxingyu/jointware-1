/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core.impl;

import java.lang.reflect.Method;

import com.github.isdream.jointware.core.KindModelAnalyzer;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public class DefaultModelParameterAnalyzer extends ModelParameterAnalyzer {

	protected DefaultKindModelAnalyzer analyzer = new DefaultKindModelAnalyzer();
	
	@Override
	protected boolean canReflect(Method method) {
		return false;
	}

	@Override
	protected boolean canNested(String typename) {
		return false;
	}

	@Override
	public KindModelAnalyzer getKindModelAnalyzer() {
		return analyzer;
	}

}
