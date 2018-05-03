/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.aliyun.ecs;

import java.lang.reflect.Method;

import com.aliyuncs.RpcAcsRequest;
import com.github.isdream.aliyun.ecs.adapter.DefaultECSClient;
import com.github.isdream.jointware.core.KindAnalyzer;

/**
 * @author wuheng{@otcaix.iscas.ac.cn}
 * 2018年5月3日
 *
 */

public class AliyunECSKindAnalyzer extends KindAnalyzer {

	public final static String POSTFIX = "Request";
	
	@Override
	protected boolean isKind(Method method) {
		try {
			if (method.getReturnType().getSimpleName().endsWith(POSTFIX)
					&& method.getReturnType().newInstance() instanceof RpcAcsRequest) {
				return true;
			}
		} catch (Exception e) {
			// ignore here
		}
		return false;
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	@Override
	protected String toKind(Method method) {
		String simpleName = method.getReturnType().getSimpleName();
		return simpleName.substring(0, simpleName.length() - POSTFIX.length());
	}

	@Override
	protected String toDesc(String parent, Method method) {
		return null;
	}

	@Override
	public String getClient() {
		return DefaultECSClient.class.getName();
	}

	public static void main(String[] args) {
		AliyunECSKindAnalyzer aa = new AliyunECSKindAnalyzer();
		System.out.println(aa.getKinds());
	}
}
