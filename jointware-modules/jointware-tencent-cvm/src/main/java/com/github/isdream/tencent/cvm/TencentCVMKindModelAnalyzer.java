/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.tencent.cvm;

import java.lang.reflect.Method;

import com.github.isdream.jointware.core.KindAnalyzer;
import com.github.isdream.jointware.core.KindModelAnalyzer;

/**
 * @author wuheng{@otcaix.iscas.ac.cn} 
 * 2018年5月4日
 *
 */
public class TencentCVMKindModelAnalyzer extends KindModelAnalyzer {

    protected static final TencentCVMKindAnalyzer analyzer = new TencentCVMKindAnalyzer();
    
    public TencentCVMKindModelAnalyzer() {
        super();
    }
    
    @Override
    protected Class<?> toKindModel(String kind) throws Exception {
    	Class<?> clazz = Class.forName(getKindAnalyzer().getClient());
    	for (Method method : clazz.getMethods()) {
    		if (method.getName().equals(kind)) {
    			return method.getParameterTypes()[0];
    		}
    	}
    	throw new Exception();
    }

    @Override
    protected KindAnalyzer getKindAnalyzer() {
        return analyzer;
    }
    
    public static void main(String[] args) {
    	TencentCVMKindModelAnalyzer aa = new TencentCVMKindModelAnalyzer();
    	System.out.println(aa.getKinds());
    	for (String kind : aa.getKinds()) {
			System.out.println(kind + ":" + aa.getKindModel(kind));
		}
	}
}
