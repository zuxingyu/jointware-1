/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.openshift.kind;

import io.fabric8.kubernetes.api.model.Namespace;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月6日
 */
public class NamespaceObject extends KubernetesObject {

	public static String FILE = "examples/namespace.yaml";

	@Override
	public String getTargetFile() {
		return FILE;
	}

	@Override
	public Class<?> getTargetClass() {
		return Namespace.class;
	}
	
}
