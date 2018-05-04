/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.KindModelAnalyzer;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年3月3日
 */
public class KubernetesModelParameterAnalyzer extends ModelParameterAnalyzer {

	protected final static KubernetesKindModelAnalyzer 
								analyzer = new KubernetesKindModelAnalyzer();

	static {
		ignoreMethods.add("setApiVersion");
		ignoreMethods.add("setKind");
		ignoreMethods.add("setResult");
		ignoreMethods.add("setPaused");
		ignoreMethods.add("setInitContainers");
		ignoreMethods.add("setUid");
		ignoreMethods.add("setSelfLink");
		ignoreMethods.add("setFinalizers");
		ignoreMethods.add("setCreationTimestamp");
		ignoreMethods.add("setMetadatasetClasssetModifiers");
		ignoreMethods.add("setAdditionalProperties");
		ignoreMethods.add("setStatus");
		
		ignoreMethods.add("getApiVersion");
		ignoreMethods.add("getKind");
		ignoreMethods.add("getResult");
		ignoreMethods.add("getPaused");
		ignoreMethods.add("getInitContainers");
		ignoreMethods.add("getUid");
		ignoreMethods.add("getSelfLink");
		ignoreMethods.add("getFinalizers");
		ignoreMethods.add("getCreationTimestamp");
		ignoreMethods.add("getMetadatasetClasssetModifiers");
		ignoreMethods.add("getAdditionalProperties");
		ignoreMethods.add("getStatus");
	}
	
	@Override
	public KindModelAnalyzer getKindModelAnalyzer() {
		return analyzer;
	}
}
