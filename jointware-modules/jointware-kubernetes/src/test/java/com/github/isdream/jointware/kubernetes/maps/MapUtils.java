/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月9日
 */
public class MapUtils {

	public static Map<String, Map<String, Object>> mockBOCOFrontend() {
		Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();
		Map<String, Object> main = new HashMap<String, Object>();
		main.put("setMetadata-setName", "sky-3-01");
		main.put("setMetadata-setNamespace", "project01");
		Map<String, String> labels = new HashMap<String, String>();
		labels.put("projectId", "42");
		labels.put("versionName", "version1");
		labels.put("versionType", "Deployment");
		main.put("setMetadata-setLabels", labels);
		main.put("setSpec-setReplicas", "1");
		List<String> insts = new ArrayList<String>();
		insts.add("jointwareRef1-io.fabric8.kubernetes.api.model.Container");
		main.put("setSpec-setTemplate-setSpec-setContainers", insts);

		map.put("main", main);

		Map<String, Object> inst1 = new HashMap<String, Object>();
		inst1.put("setName", "cont1");
		inst1.put("setImage", "centos");
		map.put("jointwareRef1-io.fabric8.kubernetes.api.model.Container", inst1);

		return map;
	}
}
