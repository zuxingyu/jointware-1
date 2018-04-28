/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.openshift.kind;

import java.io.File;
import java.io.FileInputStream;

import org.yaml.snakeyaml.Yaml;


/**
 * @author mayunhao
 *
 * 2018年3月9日
 */
public abstract class OpenshiftObject {

	/**
	 * @return
	 */
	public Object create() {
		try {
			return new Yaml().loadAs(
					new FileInputStream(
							new File(getTargetFile())), 
							getTargetClass());
		} catch (Exception e) {
			return new Object();
		}
	}
	
	/**
	 * @return
	 */
	public abstract String getTargetFile();
	
	/**
	 * @return
	 */
	public abstract Class<?> getTargetClass();
}
