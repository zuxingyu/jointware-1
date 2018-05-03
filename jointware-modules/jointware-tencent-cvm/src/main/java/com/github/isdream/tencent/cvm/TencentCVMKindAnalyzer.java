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
 * 2018年5月3日
 *
 */

public class TencentCVMKindAnalyzer extends KindAnalyzer {

	
	@Override
	protected boolean isKind(Method method) {
		try {
			if (method.getParameterCount() == 1
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
		return method.getName();
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
