/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.openshift;

import io.fabric8.kubernetes.api.model.extensions.Deployment;
import io.fabric8.kubernetes.api.model.extensions.DeploymentList;
import io.fabric8.kubernetes.api.model.extensions.DoneableDeployment;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.ScalableResource;
import io.fabric8.openshift.client.DefaultOpenShiftClient;

/**
 * This is a example to describe how to manage openshift
 * with office SDK
 * 
 * @author mayunhao
 *
 * 2018年3月2日
 */
public class OpenshiftAPIExample {

	public final static String MASTER_URL = "";
	
	public final static String TOKEN = "";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultOpenShiftClient client = createClient();
		
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
	protected static DefaultOpenShiftClient createClient() {
		Config config = new ConfigBuilder()
							.withMasterUrl(MASTER_URL)
							.withOauthToken(TOKEN)
							.build();
		return new DefaultOpenShiftClient(config);
	}

}
