/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import io.fabric8.openshift.client.DefaultOpenShiftClient;

/**
 * The {@code KubernetesKindAnalyzer} class represents the relationship between kind name and kind description.
 * All kind object literals in Java programs can be instantiated by kind description.
 * <p>
 * 
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class OpenshiftKindAnalyzer extends KubernetesKindAnalyzer {

	@Override
	public String getClient() {
		return DefaultOpenShiftClient.class.getName();
	}

}
