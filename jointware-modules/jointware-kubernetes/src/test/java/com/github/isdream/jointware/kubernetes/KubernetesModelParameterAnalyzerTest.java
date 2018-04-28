/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.helpers.ParametersHelper;
import com.github.isdream.jointware.kubernetes.KubernetesModelParameterAnalyzer;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月3日
 */
public class KubernetesModelParameterAnalyzerTest extends TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KubernetesModelParameterAnalyzer analyzer = new KubernetesModelParameterAnalyzer();
		showModelParametersWithKeyValueStyle(analyzer);
		//showModelParametersWithNetstedStyle(analyzer);
		showModelParametersWithJsonStyle(analyzer);
	}

	protected static void showModelParametersWithJsonStyle(KubernetesModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersHelper.showModelParametersWithJsonStyle("Kubernetes", kind, analyzer.getModelParameters(kind));
		}
	}
	
	protected static void showModelParametersWithNetstedStyle(KubernetesModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersHelper.showModelParametersWithNetstedStyle("Kubernetes", kind, analyzer.getModelParameters(kind));
		}
	}

	protected static void showModelParametersWithKeyValueStyle(KubernetesModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersHelper.showModelParametersWithKeyValueStyle("Kubernetes", kind, analyzer.getModelParameters(kind));
		}
	}

}
