/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import io.fabric8.kubernetes.api.model.extensions.Deployment;
import io.fabric8.kubernetes.api.model.extensions.DeploymentList;
import io.fabric8.kubernetes.api.model.extensions.DoneableDeployment;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.ScalableResource;

/**
 * This is a example to describe how to manage Kubernetes
 * with office SDK
 * 
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class KubernetesAPIExample {

	public final static String MASTER_URL = "";
	
	public final static String TOKEN = "";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultKubernetesClient client = createClient();
		
		client.pods();
		client.extensions().deployments();
		client.replicationControllers();
		client.secrets();
		
		
		MixedOperation<Deployment, 
						DeploymentList, 
						DoneableDeployment, 
						ScalableResource<
								Deployment, 
								DoneableDeployment>> 
						deployment = client.extensions().deployments();
		System.out.println(deployment.list().getItems());
	}

	/**
	 * @return client a kubernetes instance
	 */
	protected static DefaultKubernetesClient createClient() {
		Config config = new ConfigBuilder()
							.withMasterUrl(MASTER_URL)
							.withOauthToken(TOKEN)
							.build();
		return new DefaultKubernetesClient(config);
	}

}
