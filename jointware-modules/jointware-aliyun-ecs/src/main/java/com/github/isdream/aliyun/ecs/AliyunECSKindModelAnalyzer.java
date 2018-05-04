/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.aliyun.ecs;

import com.github.isdream.jointware.core.KindAnalyzer;
import com.github.isdream.jointware.core.KindModelAnalyzer;

/**
 * @author wuheng{@otcaix.iscas.ac.cn} 2018年5月4日
 *
 */
public class AliyunECSKindModelAnalyzer extends KindModelAnalyzer {

	protected static final AliyunECSKindAnalyzer analyzer = new AliyunECSKindAnalyzer();

	protected static final String PREFIX = "create";
	
	public AliyunECSKindModelAnalyzer() {
		super();
	}

	@Override
	protected Class<?> toKindModel(String kind) throws Exception {
		Class<?> clazz = Class.forName(getKindAnalyzer().getClient());
		return clazz.getMethod(PREFIX + kind + AliyunECSKindAnalyzer.POSTFIX).getReturnType();
	}

	@Override
	protected KindAnalyzer getKindAnalyzer() {
		return analyzer;
	}

	public static void main(String[] args) {
		AliyunECSKindModelAnalyzer aa = new AliyunECSKindModelAnalyzer();
		for (String kind : aa.getKinds()) {
			System.out.println(kind + ":" + aa.getKindModel(kind));
		}
	}
}
