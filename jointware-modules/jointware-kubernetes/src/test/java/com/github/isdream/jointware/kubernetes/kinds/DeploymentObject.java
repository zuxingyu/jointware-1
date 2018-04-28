/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes.kinds;

import io.fabric8.kubernetes.api.model.extensions.Deployment;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月6日
 */
public class DeploymentObject extends KubernetesObject {

	public static String FILE = "examples/deployment.yaml";

	@Override
	public String getTargetFile() {
		return FILE;
	}

	@Override
	public Class<?> getTargetClass() {
		return Deployment.class;
	}
	
}
