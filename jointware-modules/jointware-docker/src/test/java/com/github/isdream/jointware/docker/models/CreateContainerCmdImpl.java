package com.github.isdream.jointware.docker.models;

import com.github.dockerjava.api.command.DockerCmdExecFactory;
import com.github.dockerjava.api.model.AuthConfig;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;

public class CreateContainerCmdImpl extends com.github.isdream.jointware.docker.adapter.command.CreateContainerCmdImpl {

	protected static final DockerCmdExecFactory defaultDockerCmdExecFactory = DockerClientBuilder.getDefaultDockerCmdExecFactory();
	
	static {
		defaultDockerCmdExecFactory.init(DefaultDockerClientConfig.createDefaultConfigBuilder().build());
	}
	
	public CreateContainerCmdImpl() {
		super(defaultDockerCmdExecFactory.createCreateContainerCmdExec());
	}

	public CreateContainerCmdImpl(Exec exec, AuthConfig authConfig, String image) {
		super(exec, authConfig, image);
		// TODO Auto-generated constructor stub
	}

	public CreateContainerCmdImpl(Exec exec) {
		super(exec);
		// TODO Auto-generated constructor stub
	}

}
