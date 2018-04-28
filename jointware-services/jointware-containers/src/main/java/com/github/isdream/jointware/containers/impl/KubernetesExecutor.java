/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers.impl;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.isdream.jointware.containers.ConatinerExecutor;
import com.github.isdream.jointware.core.ModelParameterGenerator;
import com.github.isdream.jointware.core.utils.StringUtils;
import com.github.isdream.jointware.kubernetes.KubernetesKindAnalyzer;
import com.github.isdream.jointware.kubernetes.KubernetesModelGenerator;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.client.dsl.CreateOrReplaceable;
import io.fabric8.kubernetes.client.dsl.Createable;
import io.fabric8.kubernetes.client.dsl.Deletable;
import io.fabric8.kubernetes.client.dsl.Listable;
import io.fabric8.kubernetes.client.dsl.Nameable;
import io.fabric8.kubernetes.client.dsl.Namespaceable;
import io.fabric8.kubernetes.client.dsl.Scaleable;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月11日
 */
public class KubernetesExecutor extends ConatinerExecutor {


	private final static Set<String> workloadControllers = new HashSet<String>();

	static {
		workloadControllers.add("Deployment");
		workloadControllers.add("ReplicationController");
		workloadControllers.add("Job");
		workloadControllers.add("ReplicaSet");
		workloadControllers.add("StatefulSet");
		workloadControllers.add("DeploymentConfig");
	}

	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Object doCreate(Object client, String kind, Map<String, Map<String, Object>> params) throws Exception {
		Createable instance = (Createable) getKindModel(client, kind);
		KubernetesModelGenerator generator = new KubernetesModelGenerator(getObjectRef());
		Object param = generator.toObject(params, kind);
		return instance.create(param);
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Object doCreateOrReplace(Object client, String kind, Map<String, Map<String, Object>> params) throws Exception {
		CreateOrReplaceable instance = (CreateOrReplaceable) getKindModel(client, kind);
		KubernetesModelGenerator generator = new KubernetesModelGenerator(getObjectRef());
		Object param = generator.toObject(params, kind);
		return instance.createOrReplace(param);
	}

	@Override
	@SuppressWarnings({ "rawtypes" })
	protected Object doScaleTo(Object client, String kind, String namespace, String name, int numbers)
			throws Exception {
		if (!workloadControllers.contains(kind)) {
			throw new Exception("Unsupport kind, kind should be " + workloadControllers);
		}

		Namespaceable instance = (Namespaceable) getKindModel(client, kind);
		return ((Scaleable) ((Nameable) instance.inNamespace(namespace)).withName(name)).scale(numbers);
	}

	@Override
	@SuppressWarnings("rawtypes")
	protected Object doQuery(Object client, String kind, String namespace, String name) throws Exception {
		Object instance = getKindModel(client, kind);

		if (instance instanceof Namespaceable) {
			instance = ((Namespaceable) instance).inNamespace(namespace);
		} else if (!namespace.equals(IGNORE_NAMESPACE)) {
			throw new Exception("invalid namespace");
		}

		instance = ((Listable) instance).list();

		for (Object obj : ((KubernetesResourceList) instance).getItems()) {
			if (name.equals(((HasMetadata) obj).getMetadata().getName())) {
				return obj;
			}
		}
		return null;
	}

	@Override
	@SuppressWarnings("rawtypes")
	protected boolean doDelete(Object client, String kind, String namespace, String name) throws Exception {
		Object instance = getKindModel(client, kind);

		if (instance instanceof Namespaceable) {
			instance = ((Namespaceable) instance).inNamespace(namespace);
		} else if (!namespace.equals(IGNORE_NAMESPACE)) {
			throw new Exception("invalid namespace");
		}

		return (Boolean) ((Deletable) ((Nameable) instance).withName(name)).delete();
	}
	
	@Override
	public Object getKindModel(Object client, String kind) throws Exception {
		// client.extensions.depolyments()
		Object thisObject = client;
		for (String name : getDesc(kind).split("-")) {
			Method method = thisObject.getClass().getDeclaredMethod(name);
			thisObject = method.invoke(thisObject);
		}
		return thisObject;
	}
	
	/**
	 * @param kind
	 *            类型
	 * @return 描述
	 */
	protected String getDesc(String kind) {
		try {
			return StringUtils.isNull(kind) ? "" : new KubernetesKindAnalyzer().getKindDesc(kind);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public String getObjectRef() {
		return ModelParameterGenerator.JOINTWARE;
	}

}
