/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers.clients;

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
 * 2018年3月12日
 */
public class ClientsManager {

	protected static Map<String, String> clients = null;
	
	static {
		try {
			clients = JSON.parseObject(new FileInputStream(new File("examples/jointware-clients.json")), null, null);
		} catch (Exception e) {
			clients = null;
		}
	}
	
	public final static String PLATFORM_TYPE = "platformType";
	
	public static AbstractClient getClient(String type) {
		try {
			return (AbstractClient) Class.forName(clients.get(type)).newInstance();
		} catch (Exception e) {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String> ();
		map.put("kubernetes", KubernetesClient.class.getName());
	}
}
