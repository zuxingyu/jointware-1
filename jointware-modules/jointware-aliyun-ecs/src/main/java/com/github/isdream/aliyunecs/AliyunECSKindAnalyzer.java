/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.aliyunecs;

import java.lang.reflect.Method;

import com.aliyuncs.DefaultAcsClient;
import com.github.isdream.jointware.core.KindAnalyzer;

/**
 * @author wuheng{@otcaix.iscas.ac.cn}
 * 2018年3月30日
 *
 */

public class AliyunECSKindAnalyzer extends KindAnalyzer {
	private static final String PACKAGE_NAME="com.aliyuncs.ecs.model.v20140526";

	AliyunECSKindAnalyzer(){
		super(PACKAGE_NAME);
	}

	@Override
	protected boolean isKind(Method method) {

		if (method.getParameterCount()== 1) {
			System.out.print(method.getName() + ":");
			System.out.println(method.getParameterTypes()[0].getName());
		}
		return false;
	}

	@Override
	protected boolean isKind(String classname) {
		return !classname.contains("$") && !classname.contains("Response");
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	@Override
	protected String toKind(Method method) {
		return null;
	}

	@Override
	protected String toDesc(String parent, Method method) {
		return null;
	}

	@Override
	public String getClient() {
		return DefaultAcsClient.class.getName();
	}

	public static void main(String[] args) {
		AliyunECSKindAnalyzer aa = new AliyunECSKindAnalyzer();
		System.out.println(aa.getKinds());
	}
}
