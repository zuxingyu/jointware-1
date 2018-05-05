/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.amazon.ec2;

import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月3日
 */
public class AmazonEC2ModelGenerator extends ModelGenerator {
	
    protected final static AmazonEC2ModelParameterAnalyzer 
    						analyzer = new AmazonEC2ModelParameterAnalyzer();

    /**
     *
     */
    public AmazonEC2ModelGenerator() {
        super();
    }

    /**
     * @param objectRef
     */
    public AmazonEC2ModelGenerator(String objectRef) {
        super(objectRef);
    }

    @Override
    public ModelParameterAnalyzer getModelParameter() {
        return analyzer;
    }
}
