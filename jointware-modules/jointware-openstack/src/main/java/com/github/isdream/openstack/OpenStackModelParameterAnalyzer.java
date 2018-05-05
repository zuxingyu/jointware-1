package com.github.isdream.openstack;

import com.github.isdream.jointware.core.KindModelAnalyzer;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

public class OpenStackModelParameterAnalyzer extends ModelParameterAnalyzer {

    protected final static OpenStackKindModelAnalyzer 
    						analyzer = new OpenStackKindModelAnalyzer();

    @Override
    public KindModelAnalyzer getKindModelAnalyzer() {
        return analyzer;
    }
}
