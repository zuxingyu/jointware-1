package com.github.isdream.amazon.ec2;

import com.github.isdream.jointware.core.KindModelAnalyzer;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

public class AmazonEC2ModelParameterAnalyzer extends ModelParameterAnalyzer {

    protected final static AmazonEC2KindModelAnalyzer 
    						analyzer = new AmazonEC2KindModelAnalyzer();

    @Override
    public KindModelAnalyzer getKindModelAnalyzer() {
        return analyzer;
    }
}
