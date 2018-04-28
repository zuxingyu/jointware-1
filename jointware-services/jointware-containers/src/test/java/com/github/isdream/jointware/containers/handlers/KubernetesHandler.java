/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.isdream.jointware.containers.JSONToExecutorSampleTest;
import com.github.isdream.jointware.core.ModelParameterGenerator;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年3月12日
 */
public class KubernetesHandler extends AbstractHandler {

	protected final static Map<String, Map<String, Object>> DEFAULT_OBJECT = new HashMap<String, Map<String, Object>>();

	public final static Map<String, String> typesMap = new HashMap<String, String>();
	
	public final static String DEFAULT_CONFIG_TYPE = "workloads";
	
	static {
		typesMap.put("kubernetes-deployment", DEFAULT_CONFIG_TYPE);
		typesMap.put("openshift-deployment", DEFAULT_CONFIG_TYPE);
		typesMap.put("kubernetes-replicationController", DEFAULT_CONFIG_TYPE);
		typesMap.put("openshift-replicationController", DEFAULT_CONFIG_TYPE);
		typesMap.put("kubernetes-job", DEFAULT_CONFIG_TYPE);
		typesMap.put("openshift-job", DEFAULT_CONFIG_TYPE);
		typesMap.put("kubernetes-replicaSet", DEFAULT_CONFIG_TYPE);
		typesMap.put("openshift-replicaSet", DEFAULT_CONFIG_TYPE);
		typesMap.put("kubernetes-statefulSet", DEFAULT_CONFIG_TYPE);
		typesMap.put("openshift-statefulSet", DEFAULT_CONFIG_TYPE);
		typesMap.put("openshift-deploymentConfig", DEFAULT_CONFIG_TYPE);
	}
	
	public final static String KEY_RESOURCES = "resources";

	public final static String KEY_REQUEST_RESOURCES = "requestsResources";

	public final static String KEY_LIMITES_RESOURCES = "limitsResources";

	public final static String KEY_MIN_CPU = "minCpu";

	public final static String KEY_MAX_CPU = "maxCpu";

	public final static String KEY_MIN_MEM = "minMem";

	public final static String KEY_MAX_MEM = "maxMem";

	public final static String KEY_PROBES = "probes";

	public final static String KEY_VOLUMES = "volumes";

	public final static String KEY_VOLUMEMOUNTS = "volumeMounts";

	public final static String KEY_ENVS = "env";

	public final static String KEY_PORTS = "ports";

	public final static String KEY_PROBE_TYPE = "type";

	public final static String KEY_VOLUME_TYPE = "volumeType";

	public final static String KEY_PROBE_REQUEST_TYPE = "requestType";

	public final static String TYPE_ENV = "env";

	public final static String TYPE_PORT = "port";

	public final static String TYPE_PROBE = "probe";

	public final static String TYPE_RESOURCE = "resource";

	public final static String TYPE_VOLUMEMOUNT = "volumeMount";

	public final static String TYPE_VOLUME = "volume";

	protected final Map<String, String> valuesConvertor = new HashMap<String, String>();

	protected Map<String, Map<String, String>> keysConvertor;

	protected Map<String, String> typesConvertor;

	protected Map<String, Map<String, Object>> originRequest;

	protected Map<String, Map<String, Object>> newRequests = new HashMap<String, Map<String, Object>>();

	protected int n = 0;

	protected String tag;

	@Override
	public Map<String, Map<String, Object>> doHandle(Map<String, Map<String, Object>> originRequest, String tag,
			String kind) throws Exception {

		checkValid(originRequest, tag, kind);

		String originType = DEFAULT_TYPE;
		String newType = (valuesConvertor.get(DEFAULT_TYPE) == null) ? DEFAULT_TYPE : valuesConvertor.get(DEFAULT_TYPE);

		return doConvert(originType, newType);
	}

	@SuppressWarnings("unchecked")
	protected Map<String, Map<String, Object>> doConvert(String originType, String newType) {

		Map<String, Object> newMap = getMap(newRequests, newType);

		Map<String, Object> oldMap = originRequest.get(originType);

		for (String key : oldMap.keySet()) {

			Object value = oldMap.get(key);

			if (value.getClass().getName().equals(AbstractHandler.IS_LIST)) {
				List<String> list = (List<String>) value;

				if (list == null || list.size() == 0) {
					continue;
				}

				if (list.get(0).startsWith(tag)) {

					List<String> newValues = new ArrayList<String>();
					for (String thisValue : list) {
						if (TYPE_ENV.equals(getRealType(thisValue))) {
							toEnv(originType, key, newValues, thisValue);
							break;
						} else if (TYPE_RESOURCE.equals(getRealType(thisValue))) {
							toResources(newMap, thisValue);
							break;
						} else if (TYPE_PORT.equals(getRealType(thisValue))) {
							toPorts(originType, key, newValues, thisValue);
							break;
						} else if (TYPE_PROBE.equals(getRealType(thisValue))) {
							toProbes(originType, newMap);
							break;
						} else if (TYPE_VOLUME.equals(getRealType(thisValue))) {
							toMounts(originType, newType, newMap, thisValue, key);
							break;
						} else if (TYPE_VOLUMEMOUNT.equals(getRealType(thisValue))) {
							toMountVolumes(originType, newType);
							break;
						} else {
							newValues.add(ModelParameterGenerator.JOINTWARE + ++n + "-"
									+ getValue(typesConvertor, thisValue));
							valuesConvertor.put(thisValue,
									ModelParameterGenerator.JOINTWARE + n + "-" + getValue(typesConvertor, thisValue));
							doConvert(thisValue,
									ModelParameterGenerator.JOINTWARE + n + "-" + getValue(typesConvertor, thisValue));
						}
						newMap.put(keysConvertor.get(getRealType(originType)).get(key), newValues);
					}
				} else {
					newMap.put(keysConvertor.get(getRealType(originType)).get(key), oldMap.get(key));
				}

			} else {
				newMap.put(keysConvertor.get(getRealType(originType)).get(key), oldMap.get(key));
			}
		}
		return newRequests;
	}

	@SuppressWarnings("unchecked")
	protected void toMounts(String originType, String newType, Map<String, Object> newMap, String thisValue, String tag) {
		List<String> volumeList = (List<String>) originRequest.get(originType).get(KEY_VOLUMES);
		List<String> newVolumeList = new ArrayList<String>();
		for (String volume : volumeList) {
			newVolumeList.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + getValue(typesConvertor, thisValue));
			Map<String, Object> volumeMap = originRequest.get(volume);
			String typeKey = TYPE_VOLUME + "-" + volumeMap.getOrDefault(KEY_VOLUME_TYPE, "hostPath");
			Map<String, Object> newVolumeValues = new HashMap<String, Object>();
			for (String volumeKey : volumeMap.keySet()) {

				if (keysConvertor.get(typeKey).get(volumeKey) != null) {
					newVolumeValues.put(keysConvertor.get(typeKey).get(volumeKey), volumeMap.get(volumeKey));
				}

			}
			if (!newVolumeValues.isEmpty()) {
				newRequests.put(ModelParameterGenerator.JOINTWARE + n + "-" + getValue(typesConvertor, thisValue),
						newVolumeValues);
			}
		}
		newMap.put(keysConvertor.get(originType).get(tag), newVolumeList);
	}

	@SuppressWarnings("unchecked")
	protected void toMountVolumes(String originType, String newType) {
		List<String> allVolumeList = (List<String>) originRequest.get(originType).get(KEY_VOLUMEMOUNTS);

		StringBuffer sb = new StringBuffer();

		for (String volume : allVolumeList) {

			Map<String, Object> volumeMap = (Map<String, Object>) originRequest.get(volume);

			sb.append(volumeMap.get("name")).append("=").append(volumeMap.get("type")).append(";");

			List<String> volumeMounts = new ArrayList<String>();
			Map<String, Object> volumeMountsValues = new HashMap<String, Object>();
			volumeMounts.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + getValue(typesConvertor, "volumeMount"));
			newRequests.put(ModelParameterGenerator.JOINTWARE + n + "-" + getValue(typesConvertor, "volumeMount"),
					volumeMountsValues);

			String volumeMountTypeKey = "volumeMount";
			for (String volumeMountKey : volumeMap.keySet()) {
				if (keysConvertor.get(volumeMountTypeKey).get(volumeMountKey) != null) {
					volumeMountsValues.put(keysConvertor.get(volumeMountTypeKey).get(volumeMountKey),
							volumeMap.get(volumeMountKey));
				}
			}

			if (!volumeMounts.isEmpty()) {
				newRequests.get(newType).put("setVolumeMounts", volumeMounts);
			}
		}

		if (sb.length() != 0) {
			Map<String, String> newLabels = (Map<String, String>) newRequests.get("main").get("setMetadata-setLabels");
			if (newLabels == null) {
				newLabels = new HashMap<String, String>();
				newRequests.get("main").put("setMetadata-setLabels", newLabels);
			}
			newLabels.put("volumesType", sb.toString().substring(0, sb.length() - 1));

			Map<String, String> oldLabels = (Map<String, String>) originRequest.get("main").get("labels");
			if (oldLabels == null) {
				oldLabels = new HashMap<String, String>();
				originRequest.get("main").put("labels", oldLabels);
			}
			oldLabels.put("volumesType", sb.toString().substring(0, sb.length() - 1));

		}
	}

	@SuppressWarnings("unchecked")
	protected void toProbes(String originType, Map<String, Object> newMap) {
		List<String> probeList = (List<String>) originRequest.get(originType).get(KEY_PROBES);
		for (String probe : probeList) {
			Map<String, Object> probeMap = originRequest.get(probe);
			String typeKey = probeMap.remove(KEY_PROBE_TYPE) + "-" + probeMap.remove(KEY_PROBE_REQUEST_TYPE);
			for (String probeKey : probeMap.keySet()) {
				newMap.put(keysConvertor.get(typeKey).get(probeKey), probeMap.get(probeKey));
			}
		}
	}

	@SuppressWarnings("unchecked")
	protected void toPorts(String originType, String key, List<String> newValues, String thisValue) {
		List<Map<String, String>> thisMap = (List<Map<String, String>>) originRequest.get(thisValue);

		for (int i = 0; i < thisMap.size(); i++) {
			newValues.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + getValue(typesConvertor, thisValue));
			Map<String, Object> tempMap = getMap(newRequests,
					ModelParameterGenerator.JOINTWARE + n + "-" + getValue(typesConvertor, thisValue));
			for (String thisKey : thisMap.get(i).keySet()) {
				tempMap.put(keysConvertor.get(TYPE_PORT).get(thisKey), thisMap.get(i).get(thisKey));
			}
		}

		newRequests.get(valuesConvertor.get(originType)).put(keysConvertor.get(getRealType(originType)).get(key),
				newValues);
	}

	protected void toResources(Map<String, Object> newMap, String thisValue) {
		Map<String, Object> thisMap = originRequest.get(thisValue);

		if (thisMap.containsKey(KEY_MAX_CPU) && thisMap.containsKey(KEY_MIN_MEM)) {
			List<String> listValue = new ArrayList<String>();
			listValue.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + "cpu" + "-"
					+ getValue(typesConvertor, "-resource-requests"));
			addResource(newRequests, thisMap, "cpu", KEY_MAX_CPU, "-resource-requests");
			listValue.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + "memory" + "-"
					+ getValue(typesConvertor, "-resource-requests"));
			addResource(newRequests, thisMap, "memory", KEY_MAX_MEM, "-resource-requests");
			newMap.put("setResources-setRequests", listValue);
		}

		if (thisMap.containsKey(KEY_MIN_CPU) && thisMap.containsKey(KEY_MIN_MEM)) {
			List<String> listValue = new ArrayList<String>();
			listValue.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + "cpu" + "-"
					+ getValue(typesConvertor, "-resource-limites"));
			addResource(newRequests, thisMap, "cpu", KEY_MIN_CPU, "-resource-limites");
			listValue.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + "memory" + "-"
					+ getValue(typesConvertor, "-resource-limites"));
			addResource(newRequests, thisMap, "memory", KEY_MIN_MEM, "-resource-limites");
			newMap.put("setResources-setLimits", listValue);
		}
	}

	protected void addResource(Map<String, Map<String, Object>> newMap, Map<String, Object> thisMap, String type,
			String value, String tag) {
		Map<String, Object> addMap = new HashMap<String, Object>();
		addMap.put("setAmount", (String) thisMap.get(value));
		newMap.put(ModelParameterGenerator.JOINTWARE + n + "-" + type + "-" + getValue(typesConvertor, tag), addMap);
	}

	@SuppressWarnings("unchecked")
	protected void toEnv(String originType, String key, List<String> newValues, String thisValue) {

		List<Map<String, String>> thisMap = (List<Map<String, String>>) originRequest.get(thisValue);

		for (int i = 0; i < thisMap.size(); i++) {
			newValues.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + getValue(typesConvertor, thisValue));
			Map<String, Object> tempMap = getMap(newRequests,
					ModelParameterGenerator.JOINTWARE + n + "-" + getValue(typesConvertor, thisValue));
			for (String thisKey : thisMap.get(i).keySet()) {
				tempMap.put(keysConvertor.get(TYPE_ENV).get(thisKey), thisMap.get(i).get(thisKey));
			}
		}

		newRequests.get(valuesConvertor.get(originType)).put(keysConvertor.get(getRealType(originType)).get(key),
				newValues);
	}

	protected String getRealType(String type) {
		int idx = type.indexOf("-");
		return (idx == -1) ? DEFAULT_TYPE : type.substring(idx + 1);
	}

	protected void checkValid(Map<String, Map<String, Object>> originRequest, String tag, String kind) {
		if (originRequest == null || tag == null || kind == null) {
			throw new NullPointerException();
		}

		this.tag = tag;
		this.originRequest = originRequest;
		keysConvertor = keyRules.get(typesMap.get("kubernetes-" + kind.toLowerCase()));
		typesConvertor = typeRules.get(typesMap.get("kubernetes-" + kind.toLowerCase()));

		if (keysConvertor == null || typesConvertor == null) {
			throw new NullPointerException();
		}
	}

	protected String getValue(Map<String, String> rules, String fullname) {
		int idx = fullname.indexOf("-");
		try {
			return rules.get(fullname.substring(idx + 1).trim());
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}

	}

	protected Map<String, Object> getMap(Map<String, Map<String, Object>> map, String type) {
		if (map.get(type) == null) {
			map.put(type, new HashMap<String, Object>());
		}
		return map.get(type);
	}

	public static void main(String[] args) throws Exception {
		Map<String, Map<String, Object>> originRequest = JSONToExecutorSampleTest.getClientRequest();
		System.out.println(new KubernetesHandler().doHandle(originRequest, "jointwareRef", "deployment"));
	}
}
