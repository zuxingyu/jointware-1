/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker;

import java.lang.reflect.Method;

import com.github.dockerjava.core.DockerClientImpl;
import com.github.isdream.jointware.core.KindAnalyzer;
import com.github.isdream.jointware.core.utils.ObjectUtils;

/**
 * The {@code KubernetesKindAnalyzer} class represents the relationship between kind name and kind description.
 * All kind object literals in Java programs can be instantiated by kind description.
 * <p>
 * 
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class DockerKindAnalyzer extends KindAnalyzer {

	protected final static String SUFFIX = "Cmd";
	
	/**
	 * 
	 */
	public DockerKindAnalyzer() {
		super();
	}
	
	/**
	 * 对于fabric8的DefaultKubernetesClient而言，如果返回值结果是
	 * io.fabric8.kubernetes.client.dsl.NonNamespaceOperation，或者
	 * 为io.fabric8.kubernetes.client.dsl.MixedOperation， 则说明它是一种kind的类型. <br>
	 * <br>
	 * 
	 * 更进一步，要求这些方法的没有参数，以及不是<code>Deprecated.class</code>的类型
	 */
	@Override
	protected boolean isKind(Method method) {
		return ObjectUtils.isNull(method) ? false :  (method.getParameterCount() == 0
				&& method.getReturnType().getSimpleName().endsWith(SUFFIX)) ? true : false;
	}

	/**
	 * 对于fabric8的DefaultKubernetesClient而言，如果返回值是以GroupDSL结尾的， 则说明它是一种kind的类型. <br>
	 * <br>
	 * 
	 * 更进一步，要求这些方法不是<code>Deprecated.class</code>的类型
	 */
	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	/**
	 * 根据名字方法名返回kind类型，如果不存在，返回null
	 * 
	 */
	@Override
	protected String toKind(Method method) {
		String fullname = method.getReturnType().getSimpleName();
		return fullname.substring(0, fullname.length() - SUFFIX.length());
	}


	@Override
	public String getClient() {
		return DockerClientImpl.class.getName();
	}

}
