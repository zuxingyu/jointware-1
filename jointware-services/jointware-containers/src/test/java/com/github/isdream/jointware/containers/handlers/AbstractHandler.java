/**
 * Copyright (2018, ) Institute of Software, Chinese academy of Sciences
 */
package com.github.isdream.jointware.containers.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 */
public abstract class AbstractHandler {

	public final static String DEFAULT_TYPE = "main";
	
	public final static String IS_MAP = "com.alibaba.fastjson.JSONObject";
	
	public final static String IS_LIST = "com.alibaba.fastjson.JSONArray";
	
	public static Map<String, Map<String, Map<String, String>>> keyRules = null;
	
	static {
		try {
			keyRules = JSON.parseObject(
					new FileInputStream(
							new File("examples/jointware-key-rules.json")), null, null);
		} catch (Exception e) {
			keyRules = new HashMap<String, Map<String, Map<String, String>>>();
		}
	}

	public static Map<String, Map<String, String>> typeRules = null;
	
	static {
		try {
			typeRules = JSON.parseObject(
					new FileInputStream(
							new File("examples/jointware-type-rules.json")), null, null);
		} catch (Exception e) {
			typeRules = new HashMap<String, Map<String, String>>();
		}
	}
	
	public abstract Map<String, Map<String, Object>> doHandle(
											Map<String, Map<String, Object>> originRequest, 
											String tag, String kind) throws Exception;

}
