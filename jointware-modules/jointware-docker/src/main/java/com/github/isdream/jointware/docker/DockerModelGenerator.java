/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker;

import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月8日
 */
public class DockerModelGenerator extends ModelGenerator {

	
	protected final static DockerModelParameterAnalyzer 
						analyzer = new DockerModelParameterAnalyzer();
	
	/**
	 * 
	 */
	public DockerModelGenerator() {
		super();
	}

	/**
	 * @param objectRef
	 */
	public DockerModelGenerator(String objectRef) {
		super(objectRef);
	}
	
	@Override
	public ModelParameterAnalyzer getModelParameter() {
		return analyzer;
	}

}
