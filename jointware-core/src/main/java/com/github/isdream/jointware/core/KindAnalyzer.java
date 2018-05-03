/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.github.isdream.jointware.core.impl.DefaultClient;
import com.github.isdream.jointware.core.utils.StringUtils;


/**
 * The {@code KindAnalyzer} class represents the relationship between kind name and kind description.
 * All kind object literals in Java programs can be instantiated by kind description.
 * <p>
 * Here, kind means a executable unit of a specified cloud java client, then we can manage the VM,
 * Container, OSS life cycle.
 * <p>
 *
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public abstract class KindAnalyzer {

	/************************************************************************************
	 *
	 *                            Cores
	 *
	 ************************************************************************************/

	protected final Map<String, String> kinds = new HashMap<String, String>();

	/**
	 * default description
	 */
	protected final static String DEFAULT_DESC = "";

	/**
	 * analyseKinds 
	 */
	public KindAnalyzer() {
		analyseKinds(getClient(), DEFAULT_DESC);
	}
	
	/**
	 * @param classname  class 
	 * @param parentDesc parent node
	 */
	protected void analyseKinds(String classname, String parentDesc) {
		Class<?> clazz = loadClass(classname);
		clazz.getMethods();
		for (Method method : clazz.getMethods()) {
			if (isKind(method)) {
				kinds.put(toKind(method),
						toDesc(parentDesc, method));
			} else if (isKindGroup(method)) {
				analyseKinds(method.getReturnType().getName(),
						method.getName());
			}
		}
	}

	/**
	 * 获取指定客户端(KubernetesClient，OpenShiftClient)的所有的kind的类型
	 * kind比如Deployment，Pod等
	 *
	 * @return 获取指定客户端(KubernetesClient，OpenShiftClient)的所有的kind的类型
	 */
	public Set<String> getKinds() {
		return kinds.keySet();
	}

	/**
	 * 获取kind的描述，以便后续可以通过反射进行实例化
	 * 比如kind是Deployment，desc是extensions-deployments
	 * 表示可以通过client.extensions().deployments()进行实例化
	 *
	 * @param kind 具体kind类型
	 * @return 获取kind的描述，以便后续可以通过反射进行实例化
	 */
	public String getKindDesc(String kind) {
		return StringUtils.isNull(kind) ? null : kinds.get(kind);
	}


	/**
	 * @param classname classname
	 * @return class
	 */
	protected Class<?> loadClass(String classname) {
		try {
			return Class.forName(classname);
		} catch (Exception e) {
			return DefaultClient.class;
		}
	}
	
	/**
	 * @param parent 父节点是什么
	 * @param method 方法名
	 * @return 描述
	 */
	protected String toDesc(String parent, Method method) {
		return StringUtils.isNull(method.getName()) ? null : 
			(StringUtils.isNull(parent) ? method.getName() : parent + "-" + method.getName());
	}

	/************************************************************************************
	 *
	 *                   You should implement it by yourself
	 *
	 ************************************************************************************/

	/**
	 *
	 * @param method 方法名
	 * @return 方法名对应的kind
	 */
	protected abstract boolean isKind(Method method);

	/**
	 *
	 * @param method 方法名
	 * @return 是不是kindGroup
	 */
	protected abstract boolean isKindGroup(Method method);

	/**
	 * @param method 名字
	 * @return 转换为kind的类型
	 */
	protected abstract String toKind(Method method);

	/**
	 * @return the client for the specified cloud
	 */
	public abstract String getClient();
}
