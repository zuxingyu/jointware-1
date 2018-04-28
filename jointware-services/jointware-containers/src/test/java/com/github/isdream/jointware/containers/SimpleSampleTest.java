/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.github.isdream.jointware.containers.impl.KubernetesExecutor;
import com.github.isdream.jointware.kubernetes.KubernetesModelGenerator;

import io.fabric8.kubernetes.api.model.extensions.Deployment;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月11日
 */
public class SimpleSampleTest {

	public final static String MASTER_URL = "";
	
	public final static String NAMESPACE = "{\"main\":{\"setMetadata-setName\":\"development\",\"setMetadata-setLabels\":{\"name\":\"development\",\"version\":\"1.7.1\"}}}\r\n";
	
	public final static String DEPLOYMENT = "{\"main\":{\"setSpec-setTemplate-setSpec-setTerminationGracePeriodSeconds\":30,\"setSpec-setTemplate-setSpec-setRestartPolicy\":\"Always\",\"setSpec-setTemplate-setSpec-setSchedulerName\":\"default-scheduler\",\"setSpec-setTemplate-setSpec-setVolumes\":[\"jointwareRef1-io.fabric8.kubernetes.api.model.Volume\",\"jointwareRef2-io.fabric8.kubernetes.api.model.Volume\"],\"setSpec-setTemplate-setSpec-setContainers\":[\"jointwareRef3-io.fabric8.kubernetes.api.model.Container\",\"jointwareRef13-io.fabric8.kubernetes.api.model.Container\"],\"setSpec-setTemplate-setSpec-setDnsPolicy\":\"ClusterFirst\",\"setSpec-setTemplate-setMetadata-setLabels\":{\"application-real-name\":\"tomcat-20180103115009290\",\"image-group-name\":\"tomcat-43-v1-4dc75\",\"version-id\":\"version-id-50000019\"},\"setSpec-setStrategy-setRollingUpdate-setMaxUnavailable-setStrVal\":\"1\",\"setSpec-setStrategy-setRollingUpdate-setMaxSurge-setStrVal\":\"1\",\"setSpec-setStrategy-setType\":\"RollingUpdate\",\"setSpec-setSelector-setMatchLabels\":{\"image-group-name\":\"tomcat-43-v1-4dc75\"},\"setSpec-setReplicas\":2,\"setMetadata-setName\":\"tomcat-43-v1-4dc75\",\"setMetadata-setAnnotations\":{\"platform\":\"kubernetes1.8\",\"version\":\"v1\"},\"setMetadata-setLabels\":{\"application-real-name\":\"tomcat-20180103115009290\",\"image-group-name\":\"tomcat-43-v1-4dc75\",\"version-id\":\"version-id-50000019\"},\"setMetadata-setNamespace\":\"development\"},\"jointwareRef1-io.fabric8.kubernetes.api.model.Volume\":{\"setHostPath-setPath\":\"/opt\",\"setName\":\"hostpath\"},\"jointwareRef2-io.fabric8.kubernetes.api.model.Volume\":{\"setName\":\"emptydir\"},\"jointwareRef3-io.fabric8.kubernetes.api.model.Container\":{\"setResources-setRequests\":[\"jointwareRef4-cpu-io.fabric8.kubernetes.api.model.Quantity\",\"jointwareRef5-memory-io.fabric8.kubernetes.api.model.Quantity\"],\"setResources-setLimits\":[\"jointwareRef6-cpu-io.fabric8.kubernetes.api.model.Quantity\",\"jointwareRef7-memory-io.fabric8.kubernetes.api.model.Quantity\"],\"setName\":\"tomcat1\",\"setArgs\":[],\"setImagePullPolicy\":\"IfNotPresent\",\"setCommand\":[],\"setEnv\":[\"jointwareRef8-io.fabric8.kubernetes.api.model.EnvVar\",\"jointwareRef9-io.fabric8.kubernetes.api.model.EnvVar\"],\"setImage\":\"dcr.io:5000/tomcat:latest\",\"setPorts\":[\"jointwareRef10-io.fabric8.kubernetes.api.model.ContainerPort\"],\"setVolumeMounts\":[\"jointwareRef11-io.fabric8.kubernetes.api.model.VolumeMount\",\"jointwareRef12-io.fabric8.kubernetes.api.model.VolumeMount\"]},\"jointwareRef4-cpu-io.fabric8.kubernetes.api.model.Quantity\":{\"setAmount\":\"400m\"},\"jointwareRef5-memory-io.fabric8.kubernetes.api.model.Quantity\":{\"setAmount\":\"512Mi\"},\"jointwareRef6-cpu-io.fabric8.kubernetes.api.model.Quantity\":{\"setAmount\":\"800m\"},\"jointwareRef7-memory-io.fabric8.kubernetes.api.model.Quantity\":{\"setAmount\":\"2Gi\"},\"jointwareRef8-io.fabric8.kubernetes.api.model.EnvVar\":{\"setName\":\"MESSAGE\",\"setValue\":\"“hello world”\"},\"jointwareRef9-io.fabric8.kubernetes.api.model.EnvVar\":{\"setName\":\"BAD\",\"setValue\":\"“bad world”\"},\"jointwareRef10-io.fabric8.kubernetes.api.model.ContainerPort\":{\"setContainerPort\":8080},\"jointwareRef11-io.fabric8.kubernetes.api.model.VolumeMount\":{\"setName\":\"hostpath\",\"setMountPath\":\"/opt\"},\"jointwareRef12-io.fabric8.kubernetes.api.model.VolumeMount\":{\"setName\":\"emptydir\",\"setMountPath\":\"/etc\"},\"jointwareRef13-io.fabric8.kubernetes.api.model.Container\":{\"setName\":\"busybox\",\"setArgs\":[],\"setImagePullPolicy\":\"IfNotPresent\",\"setCommand\":[\"sleep\",\"3600\"],\"setImage\":\"dci.io:5000/busybox:latest\"}}\r\n";
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ConatinerExecutor dp = new KubernetesExecutor();
//		dp.create(createClient(), Namespace.class.getSimpleName(), getParams(NAMESPACE));
//		System.out.println(dp.query(createClient(), Namespace.class.getSimpleName(), "development"));
		
//		dp.create(createClient(), Deployment.class.getSimpleName(), getParams(DEPLOYMENT));
//		System.out.println( getParams(DEPLOYMENT));
		KubernetesModelGenerator gr = new KubernetesModelGenerator();
//		System.out.println(gr.toObject(getParams(NAMESPACE), Namespace.class.getSimpleName()));
		System.out.println(gr.toObject(getParams(DEPLOYMENT), Deployment.class.getSimpleName()));
	}
	
	protected static DefaultKubernetesClient createClient() {
		Config config = new ConfigBuilder()
							.withMasterUrl(MASTER_URL)
							.build();
		return new DefaultKubernetesClient(config);
	}

	@SuppressWarnings("unchecked")
	protected static Map<String, Map<String, Object>> getParams(String text) {
		return (Map<String, Map<String, Object>>) JSON.parse(text);
	}
}
