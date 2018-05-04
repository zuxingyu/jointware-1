package com.github.isdream.aliyun.ecs;

import com.github.isdream.jointware.core.KindModelAnalyzer;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

public class AliyunECSModelParameterAnalyzer extends ModelParameterAnalyzer {

    protected final static AliyunECSKindModelAnalyzer 
    						analyzer = new AliyunECSKindModelAnalyzer();

    @Override
    public KindModelAnalyzer getKindModelAnalyzer() {
        return analyzer;
    }
}
