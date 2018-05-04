/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker;

import com.github.isdream.jointware.core.helpers.ParametersHelper;
import com.github.isdream.jointware.docker.DockerModelParameterAnalyzer;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月3日
 */
@SuppressWarnings("deprecation")
public class DockerModelParameterAnalyzerTest extends TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DockerModelParameterAnalyzer analyzer = new DockerModelParameterAnalyzer();
//		showModelParametersWithKeyValueStyle(analyzer);
//		showModelParametersWithNetstedStyle(analyzer);
		showModelParametersWithJsonStyle(analyzer);
	}

	protected static void showModelParametersWithJsonStyle(DockerModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersHelper.showModelParametersWithJsonStyle("Docker", kind, analyzer.getModelParameters(kind));
		}
	}
	
	protected static void showModelParametersWithNetstedStyle(DockerModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersHelper.showModelParametersWithNetstedStyle("Docker", kind, analyzer.getModelParameters(kind));
		}
	}

	protected static void showModelParametersWithKeyValueStyle(DockerModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersHelper.showModelParametersWithKeyValueStyle("Docker", kind, analyzer.getModelParameters(kind));
		}
	}

}
