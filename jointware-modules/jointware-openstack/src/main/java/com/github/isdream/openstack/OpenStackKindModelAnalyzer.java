/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.openstack;

import com.github.isdream.jointware.core.KindAnalyzer;
import com.github.isdream.jointware.core.KindModelAnalyzer;

/**
 * @author wuheng{@otcaix.iscas.ac.cn} 
 * 2018年5月4日
 *
 */
public class OpenStackKindModelAnalyzer extends KindModelAnalyzer {

	protected static final OpenStackKindAnalyzer analyzer = new OpenStackKindAnalyzer();

	protected static final String PREFIX = "create";
	
	public OpenStackKindModelAnalyzer() {
		super();
	}

	@Override
	protected Class<?> toKindModel(String kind) throws Exception {
		Class<?> clazz = Class.forName(getKindAnalyzer().getClient());
		return clazz.getMethod(PREFIX + kind + OpenStackKindAnalyzer.POSTFIX).getReturnType();
	}

	@Override
	protected KindAnalyzer getKindAnalyzer() {
		return analyzer;
	}

	public static void main(String[] args) {
		OpenStackKindModelAnalyzer aa = new OpenStackKindModelAnalyzer();
		for (String kind : aa.getKinds()) {
			System.out.println(kind + ":" + aa.getKindModel(kind));
		}
	}
}
