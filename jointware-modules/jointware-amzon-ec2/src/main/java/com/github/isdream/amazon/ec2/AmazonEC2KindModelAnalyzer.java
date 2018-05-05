/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.amazon.ec2;

import java.lang.reflect.Method;

import com.github.isdream.jointware.core.KindAnalyzer;
import com.github.isdream.jointware.core.KindModelAnalyzer;

/**
 * @author wuheng{@otcaix.iscas.ac.cn} 
 * 2018年5月4日
 *
 */
public class AmazonEC2KindModelAnalyzer extends KindModelAnalyzer {

	protected static final AmazonEC2KindAnalyzer analyzer = new AmazonEC2KindAnalyzer();

	protected static final String PREFIX = "create";
	
	public AmazonEC2KindModelAnalyzer() {
		super();
	}

	@Override
	protected Class<?> toKindModel(String kind) throws Exception {
		Class<?> clazz = Class.forName(getKindAnalyzer().getClient());
		for (Method method : clazz.getMethods()) {
			if (method.getParameterCount() == 1 
					&& method.getName().toLowerCase().equals(kind.toLowerCase())) {
				return method.getParameterTypes()[0];
			}
		}
		throw new Exception("Unsupported kind");
	}

	@Override
	protected KindAnalyzer getKindAnalyzer() {
		return analyzer;
	}

	public static void main(String[] args) {
		AmazonEC2KindModelAnalyzer aa = new AmazonEC2KindModelAnalyzer();
		for (String kind : aa.getKinds()) {
			System.out.println(kind + "=" + aa.getKindModel(kind));
		}
	}
}
