/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.tencent.cvm;

import java.lang.reflect.Method;

import com.github.isdream.jointware.core.KindAnalyzer;
import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.cvm.v20170312.CvmClient;

/**
 * @author wuheng{@otcaix.iscas.ac.cn}
 * 2018年3月30日
 *
 */

public class TencentCVMKindAnalyzer extends KindAnalyzer {

	public final static String POSTFIX = "Request";
	
	@Override
	protected boolean isKind(Method method) {
		try {
			if (method.getReturnType().getSimpleName().endsWith(POSTFIX)
					&& method.getReturnType().newInstance() instanceof AbstractModel) {
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
		return CvmClient.class.getName();
	}

	public static void main(String[] args) {
		TencentCVMKindAnalyzer aa = new TencentCVMKindAnalyzer();
		System.out.println(aa.getKinds());
	}
}
