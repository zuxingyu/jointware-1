/**
 * 
 */
package com.github.isdream.jointware.kubernetes.kinds;

import io.fabric8.kubernetes.api.model.extensions.Deployment;

/**
 * @author Henry
 *
 */
public class EmptyDirObject extends KubernetesObject {

	public static String FILE = "examples/emptydir.yaml";

	@Override
	public String getTargetFile() {
		return FILE;
	}

	@Override
	public Class<?> getTargetClass() {
		return Deployment.class;
	}

}
