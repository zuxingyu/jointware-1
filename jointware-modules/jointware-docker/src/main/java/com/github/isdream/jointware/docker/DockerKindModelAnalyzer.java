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

	protected static final DockerKindAnalyzer analyzer = new DockerKindAnalyzer();

	protected static final String OLD_PACKAGENEM = "com.github.dockerjava.core.command"; 
	
	protected static final String NEW_PACKAGENEM = "com.github.isdream.jointware.docker.adapter.command"; 
	
	/**
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
				String name = method.getReturnType().getSimpleName() + "Impl";
				try {
					return Class.forName(NEW_PACKAGENEM + "." + name);
				} catch (Exception e) {
					return Class.forName(OLD_PACKAGENEM + "." + name);
				}
			}
		}
		throw new Exception("Unsupported kind");
	}

	@Override
	protected KindAnalyzer getKindAnalyzer() {
		return analyzer;
	}

}
