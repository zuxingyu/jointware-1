/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker;

import java.lang.reflect.Method;

import com.github.isdream.jointware.core.KindAnalyzer;
import com.github.isdream.jointware.core.KindModelAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class DockerKindModelAnalyzer extends KindModelAnalyzer {

	private static final DockerKindAnalyzer analyzer = new DockerKindAnalyzer();

	/**a
	 * 
	 */
	public DockerKindModelAnalyzer() {
		super();
	}

	@Override
	protected Class<?> toKindModel(String kind) throws Exception {
		Class<?> clazz = Class.forName(getKindAnalyzer().getClient());
		for (Method method : clazz.getMethods()) {
			if (method.getName().toLowerCase().startsWith(kind.toLowerCase())) {
				return method.getReturnType();
			}
		}
		throw new Exception("Unsupported kind");
	}

	@Override
	protected KindAnalyzer getKindAnalyzer() {
		return analyzer;
	}

}
