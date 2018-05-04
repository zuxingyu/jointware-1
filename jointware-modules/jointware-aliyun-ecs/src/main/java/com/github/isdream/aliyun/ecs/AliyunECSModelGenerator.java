/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.aliyun.ecs;

import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月3日
 */
public class AliyunECSModelGenerator extends ModelGenerator {
	
    protected final static AliyunECSModelParameterAnalyzer 
    						analyzer = new AliyunECSModelParameterAnalyzer();

    /**
     *
     */
    public AliyunECSModelGenerator() {
        super();
    }

    /**
     * @param objectRef
     */
    public AliyunECSModelGenerator(String objectRef) {
        super(objectRef);
    }

    @Override
    public ModelParameterAnalyzer getModelParameter() {
        return analyzer;
    }
}
