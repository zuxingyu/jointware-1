/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.openstack;

import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月3日
 */
public class OpenStackModelGenerator extends ModelGenerator {
	
    protected final static OpenStackModelParameterAnalyzer 
    						analyzer = new OpenStackModelParameterAnalyzer();

    /**
     *
     */
    public OpenStackModelGenerator() {
        super();
    }

    /**
     * @param objectRef
     */
    public OpenStackModelGenerator(String objectRef) {
        super(objectRef);
    }

    @Override
    public ModelParameterAnalyzer getModelParameter() {
        return analyzer;
    }
}
