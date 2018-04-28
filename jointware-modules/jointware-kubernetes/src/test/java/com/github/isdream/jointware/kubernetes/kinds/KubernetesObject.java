/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes.kinds;

import java.io.File;
import java.io.FileInputStream;

import org.yaml.snakeyaml.Yaml;


/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月7日
 */
public abstract class KubernetesObject {

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
			e.printStackTrace();
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
