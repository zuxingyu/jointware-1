package com.github.isdream.aliyun.ecs;

import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

public class AliyunECSModelGenerator extends ModelGenerator {
	
    protected final static AliyunECSModelParameterAnalyzer analyzer = new AliyunECSModelParameterAnalyzer();

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
