/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.openshift;

import com.github.isdream.jointware.core.helpers.ParametersHelper;
import com.github.isdream.jointware.kubernetes.OpenshiftModelParameterAnalyzer;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月3日
 */
public class OpenshiftModelParameterAnalyzerTest extends TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OpenshiftModelParameterAnalyzer analyzer = new OpenshiftModelParameterAnalyzer();
//		showModelParametersWithKeyValueStyle(analyzer);
//		showModelParametersWithNetstedStyle(analyzer);
		showModelParametersWithJsonStyle(analyzer);
	}

	protected static void showModelParametersWithJsonStyle(OpenshiftModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersHelper.showModelParametersWithJsonStyle("Openshift", kind, analyzer.getModelParameters(kind));
		}
	}
	
	protected static void showModelParametersWithNetstedStyle(OpenshiftModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersHelper.showModelParametersWithNetstedStyle("Openshift", kind, analyzer.getModelParameters(kind));
		}
	}

	protected static void showModelParametersWithKeyValueStyle(OpenshiftModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersHelper.showModelParametersWithKeyValueStyle("Openshift", kind, analyzer.getModelParameters(kind));
		}
	}

}
