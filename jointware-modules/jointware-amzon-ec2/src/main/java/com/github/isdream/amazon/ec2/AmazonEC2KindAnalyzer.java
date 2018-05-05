/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.amazon.ec2;

import java.lang.reflect.Method;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.github.isdream.jointware.core.KindAnalyzer;

/**
 * @author wuheng{@otcaix.iscas.ac.cn}
 * 2018年5月3日
 *
 */

public class AmazonEC2KindAnalyzer extends KindAnalyzer {

	public final static String SUFFIX = "Request";
	
	@Override
	protected boolean isKind(Method method) {
		try {
			if (method.getParameterCount() == 1
					&& method.getParameterTypes()[0].newInstance() instanceof AmazonWebServiceRequest) {
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
		String simpleName = method.getParameterTypes()[0].getSimpleName();
		return simpleName.substring(0, simpleName.length() - SUFFIX.length());
	}

	@Override
	protected String toDesc(String parent, Method method) {
		return null;
	}

	@Override
	public String getClient() {
		return AmazonEC2Client.class.getName();
	}

}
