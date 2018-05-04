/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.DockerCmdExecFactory;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientImpl;

/**
 * This is a example to describe how to manage Kubernetes
 * with office SDK
 * 
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class DockerAPIExample {

	public final static String MASTER_URL = "";
	
	
	public static void main(String[] args) throws Exception {
		DockerClient client = createClient();
		System.out.println(client.infoCmd().exec());
	}

	/**
	 * @return client a kubernetes instance
	 */
	protected static DockerClient createClient() {
        DockerCmdExecFactory dockerCmdExecFactory = DockerClientBuilder
        								.getDefaultDockerCmdExecFactory();
		return DockerClientImpl.getInstance(MASTER_URL)
							.withDockerCmdExecFactory(dockerCmdExecFactory );
	}

}
