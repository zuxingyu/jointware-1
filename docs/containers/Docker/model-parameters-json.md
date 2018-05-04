## Docker AttachContainer parameters:

```
{
	"main":{
		"withTimestamps":"java.lang.Boolean",
		"withStdOut":"java.lang.Boolean",
		"withStdErr":"java.lang.Boolean",
		"withLogs":"java.lang.Boolean",
		"withContainerId":"java.lang.String",
		"withFollowStream":"java.lang.Boolean"
	}
}
```
## Docker ExecCreate parameters:

```
{
	"main":{
		"withAttachStderr":"java.lang.Boolean",
		"withAttachStdin":"java.lang.Boolean",
		"withAttachStdout":"java.lang.Boolean"
	}
}
```
## Docker PauseContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String"
	}
}
```
## Docker PullImage parameters:

```
{
	"main":{
		"withRegistry":"java.lang.String",
		"withTag":"java.lang.String",
		"withAuthConfig-withRegistryAddress":"java.lang.String",
		"withAuthConfig-withUsername":"java.lang.String",
		"withAuthConfig-withPassword":"java.lang.String",
		"withAuthConfig-withEmail":"java.lang.String",
		"withAuthConfig-withAuth":"java.lang.String",
		"withAuthConfig-withRegistrytoken":"java.lang.String",
		"withRepository":"java.lang.String"
	}
}
```
## Docker KillContainer parameters:

```
{
	"main":{
		"withSignal":"java.lang.String",
		"withContainerId":"java.lang.String"
	}
}
```
## Docker SaveImage parameters:

```
{
	"main":{
		"withTag":"java.lang.String",
		"withName":"java.lang.String"
	}
}
```
## Docker ListContainers parameters:

```
{
	"main":{
		"withBefore":"java.lang.String",
		"withExitedFilter":"java.lang.Integer",
		"withLimit":"java.lang.Integer",
		"withShowAll":"java.lang.Boolean",
		"withShowSize":"java.lang.Boolean",
		"withSince":"java.lang.String"
	}
}
```
## Docker ListSwarmNodes parameters:

```
{
	"main":{
		"withRoleFilter":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withNameFilter":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withIdFilter":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withMembershipFilter":[
			"java.lang.String0",
			"java.lang.String1"
		]
	}
}
```
## Docker InspectSwarm parameters:

```
{
	
}
```
## Docker Version parameters:

```
{
	
}
```
## Docker CreateNetwork parameters:

```
{
	"main":{
		"withDriver":"java.lang.String",
		"withIpam-withDriver":"java.lang.String",
		"withIpam-withConfig-withSubnet":"java.lang.String",
		"withIpam-withConfig-withIpRange":"java.lang.String",
		"withIpam-withConfig-withGateway":"java.lang.String",
		"withIpam-withConfig-setNetworkID":"java.lang.String"
	}
}
```
## Docker UnpauseContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String"
	}
}
```
## Docker JoinSwarm parameters:

```
{
	"main":{
		"withListenAddr":"java.lang.String",
		"withRemoteAddrs":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withJoinToken":"java.lang.String",
		"withAdvertiseAddr":"java.lang.String"
	}
}
```
## Docker CopyFileFromContainer parameters:

```
{
	"main":{
		"withHostPath":"java.lang.String",
		"withResource":"java.lang.String",
		"withContainerId":"java.lang.String"
	}
}
```
## Docker TagImage parameters:

```
{
	"main":{
		"withImageId":"java.lang.String",
		"withTag":"java.lang.String",
		"withRepository":"java.lang.String",
		"withForce":"java.lang.Boolean"
	}
}
```
## Docker SearchImages parameters:

```
{
	"main":{
		"withTerm":"java.lang.String"
	}
}
```
## Docker RemoveVolume parameters:

```
{
	"main":{
		"withName":"java.lang.String"
	}
}
```
## Docker UpdateSwarm parameters:

```
{
	"main":{
		"withSwarmNodeId":"java.lang.String",
		"withVersion":"java.lang.Long",
		"withSwarmNodeSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withSwarmNodeSpec-withName":"java.lang.String"
	}
}
```
## Docker BuildImage parameters:

```
{
	"main":{
		"withTag":"java.lang.String",
		"withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withMemory":"java.lang.Long",
		"withBaseDirectory-setExecutable":"boolean",
		"withBaseDirectory-setLastModified":"long",
		"withBaseDirectory-setReadable":"boolean",
		"withBaseDirectory-setWritable":"boolean",
		"withDockerfilePath":"java.lang.String",
		"withBuildAuthConfigs-addConfig-withRegistryAddress":"java.lang.String",
		"withBuildAuthConfigs-addConfig-withUsername":"java.lang.String",
		"withBuildAuthConfigs-addConfig-withPassword":"java.lang.String",
		"withBuildAuthConfigs-addConfig-withEmail":"java.lang.String",
		"withBuildAuthConfigs-addConfig-withAuth":"java.lang.String",
		"withBuildAuthConfigs-addConfig-withRegistrytoken":"java.lang.String",
		"withTags":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withCacheFrom":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withDockerfile-setExecutable":"boolean",
		"withDockerfile-setLastModified":"long",
		"withDockerfile-setReadable":"boolean",
		"withDockerfile-setWritable":"boolean",
		"withNoCache":"java.lang.Boolean",
		"withRemove":"java.lang.Boolean",
		"withForcerm":"java.lang.Boolean",
		"withQuiet":"java.lang.Boolean",
		"withPull":"java.lang.Boolean",
		"withMemswap":"java.lang.Long",
		"withCpushares":"java.lang.String",
		"withCpusetcpus":"java.lang.String",
		"withShmsize":"java.lang.Long"
	}
}
```
## Docker InspectImage parameters:

```
{
	"main":{
		"withImageId":"java.lang.String"
	}
}
```
## Docker ListServices parameters:

```
{
	"main":{
		"withNameFilter":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withIdFilter":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withLabelFilter":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	}
}
```
## Docker RemoveImage parameters:

```
{
	"main":{
		"withImageId":"java.lang.String",
		"withNoPrune":"java.lang.Boolean",
		"withForce":"java.lang.Boolean"
	}
}
```
## Docker InspectVolume parameters:

```
{
	"main":{
		"withName":"java.lang.String"
	}
}
```
## Docker RemoveNetwork parameters:

```
{
	"main":{
		"withNetworkId":"java.lang.String"
	}
}
```
## Docker ListTasks parameters:

```
{
	"main":{
		
	}
}
```
## Docker PushImage parameters:

```
{
	"main":{
		"withTag":"java.lang.String",
		"withAuthConfig-withRegistryAddress":"java.lang.String",
		"withAuthConfig-withUsername":"java.lang.String",
		"withAuthConfig-withPassword":"java.lang.String",
		"withAuthConfig-withEmail":"java.lang.String",
		"withAuthConfig-withAuth":"java.lang.String",
		"withAuthConfig-withRegistrytoken":"java.lang.String",
		"withName":"java.lang.String"
	}
}
```
## Docker WaitContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String"
	}
}
```
## Docker CreateService parameters:

```
{
	"main":{
		"withServiceSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withName":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withDelay":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withMaxAttempts":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withWindow":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withNetworks":[
			"ref1-com.github.dockerjava.api.model.NetworkAttachmentConfig"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withEnv":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHostname":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withTaskTemplate-withContainerSpec-withOpenStdin":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withTty":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withUser":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withStopSignal":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withImage":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withStopGracePeriod":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withCommand":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withArgs":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDir":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withGroups":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withMounts":[
			"ref2-com.github.dockerjava.api.model.Mount"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDuration":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withOptions":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withNameservers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withSearch":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withReadOnly":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHosts":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets":[
			"ref3-com.github.dockerjava.api.model.ContainerSpecSecret"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTimeout":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withInterval":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTest":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withRetries":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withStartPeriod":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withRegistry":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withFile":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withUser":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withRole":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withType":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withDisable":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withLevel":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs":[
			"ref4-com.github.dockerjava.api.model.ContainerSpecConfig"
		],
		"withServiceSpec-withTaskTemplate-withResources-withLimits-withMemoryBytes":"long",
		"withServiceSpec-withTaskTemplate-withResources-withLimits-withNanoCPUs":"long",
		"withServiceSpec-withTaskTemplate-withResources-withReservations-withMemoryBytes":"long",
		"withServiceSpec-withTaskTemplate-withResources-withReservations-withNanoCPUs":"long",
		"withServiceSpec-withTaskTemplate-withPlacement-withConstraints":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withPlacement-setPlatforms":[
			"ref5-com.github.dockerjava.api.model.SwarmNodePlatform"
		],
		"withServiceSpec-withTaskTemplate-withRuntime":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withLogDriver-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withTaskTemplate-withLogDriver-withName":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withForceUpdate":"java.lang.Integer",
		"withServiceSpec-withMode-withReplicated-withReplicas":"int",
		"withServiceSpec-withUpdateConfig-withParallelism":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withDelay":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-setDelay":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withMonitor":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withMaxFailureRatio":"java.lang.Float",
		"withServiceSpec-withNetworks":[
			"ref6-com.github.dockerjava.api.model.NetworkAttachmentConfig"
		],
		"withServiceSpec-withEndpointSpec-withPorts":[
			"ref7-com.github.dockerjava.api.model.PortConfig"
		],
		"withServiceSpec-withRollbackConfig-withParallelism":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withDelay":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-setDelay":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withMonitor":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withMaxFailureRatio":"java.lang.Float"
	},
	"ref1-com.github.dockerjava.api.model.NetworkAttachmentConfig":{
		"withAliases":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withTarget":"java.lang.String"
	},
	"ref2-com.github.dockerjava.api.model.Mount":{
		"withVolumeOptions-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withVolumeOptions-withNoCopy":"java.lang.Boolean",
		"withVolumeOptions-withDriverConfig-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withVolumeOptions-withDriverConfig-withName":"java.lang.String",
		"withReadOnly":"java.lang.Boolean",
		"withTarget":"java.lang.String",
		"withSource":"java.lang.String"
	},
	"ref3-com.github.dockerjava.api.model.ContainerSpecSecret":{
		"withFile-withName":"java.lang.String",
		"withFile-withMode":"java.lang.Long",
		"withFile-withUid":"java.lang.String",
		"withFile-withGid":"java.lang.String",
		"withSecretId":"java.lang.String",
		"withSecretName":"java.lang.String"
	},
	"ref4-com.github.dockerjava.api.model.ContainerSpecConfig":{
		"withFile-withName":"java.lang.String",
		"withFile-withMode":"java.lang.Long",
		"withFile-withUid":"java.lang.String",
		"withFile-withGid":"java.lang.String",
		"withConfigID":"java.lang.String",
		"withConfigName":"java.lang.String"
	},
	"ref5-com.github.dockerjava.api.model.SwarmNodePlatform":{
		"withOs":"java.lang.String",
		"withArchitecture":"java.lang.String"
	},
	"ref6-com.github.dockerjava.api.model.NetworkAttachmentConfig":{
		"withAliases":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withTarget":"java.lang.String"
	},
	"ref7-com.github.dockerjava.api.model.PortConfig":{
		"withName":"java.lang.String",
		"withPublishedPort":"int",
		"withTargetPort":"int"
	}
}
```
## Docker UpdateService parameters:

```
{
	"main":{
		"withVersion":"java.lang.Long",
		"withServiceId":"java.lang.String",
		"withServiceSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withName":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withDelay":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withMaxAttempts":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withWindow":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withNetworks":[
			"ref1-com.github.dockerjava.api.model.NetworkAttachmentConfig"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withEnv":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHostname":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withTaskTemplate-withContainerSpec-withOpenStdin":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withTty":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withUser":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withStopSignal":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withImage":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withStopGracePeriod":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withCommand":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withArgs":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDir":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withGroups":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withMounts":[
			"ref2-com.github.dockerjava.api.model.Mount"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDuration":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withOptions":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withNameservers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withSearch":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withReadOnly":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHosts":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets":[
			"ref3-com.github.dockerjava.api.model.ContainerSpecSecret"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTimeout":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withInterval":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTest":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withRetries":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withStartPeriod":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withRegistry":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withFile":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withUser":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withRole":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withType":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withDisable":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withLevel":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs":[
			"ref4-com.github.dockerjava.api.model.ContainerSpecConfig"
		],
		"withServiceSpec-withTaskTemplate-withResources-withLimits-withMemoryBytes":"long",
		"withServiceSpec-withTaskTemplate-withResources-withLimits-withNanoCPUs":"long",
		"withServiceSpec-withTaskTemplate-withResources-withReservations-withMemoryBytes":"long",
		"withServiceSpec-withTaskTemplate-withResources-withReservations-withNanoCPUs":"long",
		"withServiceSpec-withTaskTemplate-withPlacement-withConstraints":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withPlacement-setPlatforms":[
			"ref5-com.github.dockerjava.api.model.SwarmNodePlatform"
		],
		"withServiceSpec-withTaskTemplate-withRuntime":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withLogDriver-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withTaskTemplate-withLogDriver-withName":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withForceUpdate":"java.lang.Integer",
		"withServiceSpec-withMode-withReplicated-withReplicas":"int",
		"withServiceSpec-withUpdateConfig-withParallelism":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withDelay":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-setDelay":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withMonitor":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withMaxFailureRatio":"java.lang.Float",
		"withServiceSpec-withNetworks":[
			"ref6-com.github.dockerjava.api.model.NetworkAttachmentConfig"
		],
		"withServiceSpec-withEndpointSpec-withPorts":[
			"ref7-com.github.dockerjava.api.model.PortConfig"
		],
		"withServiceSpec-withRollbackConfig-withParallelism":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withDelay":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-setDelay":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withMonitor":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withMaxFailureRatio":"java.lang.Float"
	},
	"ref1-com.github.dockerjava.api.model.NetworkAttachmentConfig":{
		"withAliases":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withTarget":"java.lang.String"
	},
	"ref2-com.github.dockerjava.api.model.Mount":{
		"withVolumeOptions-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withVolumeOptions-withNoCopy":"java.lang.Boolean",
		"withVolumeOptions-withDriverConfig-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withVolumeOptions-withDriverConfig-withName":"java.lang.String",
		"withReadOnly":"java.lang.Boolean",
		"withTarget":"java.lang.String",
		"withSource":"java.lang.String"
	},
	"ref3-com.github.dockerjava.api.model.ContainerSpecSecret":{
		"withFile-withName":"java.lang.String",
		"withFile-withMode":"java.lang.Long",
		"withFile-withUid":"java.lang.String",
		"withFile-withGid":"java.lang.String",
		"withSecretId":"java.lang.String",
		"withSecretName":"java.lang.String"
	},
	"ref4-com.github.dockerjava.api.model.ContainerSpecConfig":{
		"withFile-withName":"java.lang.String",
		"withFile-withMode":"java.lang.Long",
		"withFile-withUid":"java.lang.String",
		"withFile-withGid":"java.lang.String",
		"withConfigID":"java.lang.String",
		"withConfigName":"java.lang.String"
	},
	"ref5-com.github.dockerjava.api.model.SwarmNodePlatform":{
		"withOs":"java.lang.String",
		"withArchitecture":"java.lang.String"
	},
	"ref6-com.github.dockerjava.api.model.NetworkAttachmentConfig":{
		"withAliases":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withTarget":"java.lang.String"
	},
	"ref7-com.github.dockerjava.api.model.PortConfig":{
		"withName":"java.lang.String",
		"withPublishedPort":"int",
		"withTargetPort":"int"
	}
}
```
## Docker CopyArchiveToContainer parameters:

```
{
	"main":{
		"withHostResource":"java.lang.String",
		"withRemotePath":"java.lang.String",
		"withContainerId":"java.lang.String",
		"withNoOverwriteDirNonDir":"boolean",
		"withDirChildrenOnly":"boolean"
	}
}
```
## Docker Ping parameters:

```
{
	
}
```
## Docker Stats parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String"
	}
}
```
## Docker ExecStart parameters:

```
{
	"main":{
		"withDetach":"java.lang.Boolean",
		"withExecId":"java.lang.String",
		"withTty":"java.lang.Boolean"
	}
}
```
## Docker LeaveSwarm parameters:

```
{
	"main":{
		"withForceEnabled":"java.lang.Boolean"
	}
}
```
## Docker TopContainer parameters:

```
{
	"main":{
		"withPsArgs":"java.lang.String",
		"withContainerId":"java.lang.String"
	}
}
```
## Docker StopContainer parameters:

```
{
	"main":{
		"withTimeout":"java.lang.Integer",
		"withContainerId":"java.lang.String"
	}
}
```
## Docker RemoveContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String",
		"withRemoveVolumes":"java.lang.Boolean",
		"withForce":"java.lang.Boolean"
	}
}
```
## Docker ListNetworks parameters:

```
{
	"main":{
		
	}
}
```
## Docker ListImages parameters:

```
{
	"main":{
		"withImageNameFilter":"java.lang.String",
		"withDanglingFilter":"java.lang.Boolean"
	}
}
```
## Docker ListVolumes parameters:

```
{
	"main":{
		"withDanglingFilter":"java.lang.Boolean"
	}
}
```
## Docker ContainerDiff parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String"
	}
}
```
## Docker Events parameters:

```
{
	"main":{
		
	}
}
```
## Docker RemoveService parameters:

```
{
	"main":{
		"withServiceId":"java.lang.String"
	}
}
```
## Docker Auth parameters:

```
{
	"main":{
		"withRegistryAddress":"java.lang.String",
		"withUsername":"java.lang.String",
		"withPassword":"java.lang.String",
		"withEmail":"java.lang.String",
		"withAuth":"java.lang.String",
		"withRegistrytoken":"java.lang.String"
	}
}
```
## Docker CreateImage parameters:

```
{
	"main":{
		"withTag":"java.lang.String",
		"withRepository":"java.lang.String"
	}
}
```
## Docker LogContainer parameters:

```
{
	"main":{
		"withTimestamps":"java.lang.Boolean",
		"withStdOut":"java.lang.Boolean",
		"withStdErr":"java.lang.Boolean",
		"withTail":"java.lang.Integer",
		"withContainerId":"java.lang.String",
		"withSince":"java.lang.Integer",
		"withFollowStream":"java.lang.Boolean"
	}
}
```
## Docker ConnectToNetwork parameters:

```
{
	"main":{
		"withNetworkId":"java.lang.String",
		"withContainerId":"java.lang.String"
	}
}
```
## Docker InspectNetwork parameters:

```
{
	"main":{
		"withNetworkId":"java.lang.String"
	}
}
```
## Docker DisconnectFromNetwork parameters:

```
{
	"main":{
		"withNetworkId":"java.lang.String",
		"withContainerId":"java.lang.String",
		"withForce":"java.lang.Boolean"
	}
}
```
## Docker Info parameters:

```
{
	
}
```
## Docker CopyArchiveFromContainer parameters:

```
{
	"main":{
		"withHostPath":"java.lang.String",
		"withResource":"java.lang.String",
		"withContainerId":"java.lang.String"
	}
}
```
## Docker UpdateSwarmNode parameters:

```
{
	"main":{
		"withSwarmNodeId":"java.lang.String",
		"withVersion":"java.lang.Long",
		"withSwarmNodeSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withSwarmNodeSpec-withName":"java.lang.String"
	}
}
```
## Docker RenameContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String",
		"withName":"java.lang.String"
	}
}
```
## Docker Commit parameters:

```
{
	"main":{
		"withTag":"java.lang.String",
		"withAttachStderr":"java.lang.Boolean",
		"withAttachStdin":"java.lang.Boolean",
		"withAttachStdout":"java.lang.Boolean",
		"withAuthor":"java.lang.String"
	}
}
```
## Docker InspectExec parameters:

```
{
	"main":{
		"withExecId":"java.lang.String"
	}
}
```
## Docker StartContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String"
	}
}
```
## Docker UpdateContainer parameters:

```
{
	"main":{
		"withCpuQuota":"java.lang.Integer",
		"withKernelMemory":"java.lang.Long",
		"withContainerId":"java.lang.String",
		"withMemory":"java.lang.Long",
		"withMemorySwap":"java.lang.Long",
		"withMemoryReservation":"java.lang.Long",
		"withBlkioWeight":"java.lang.Integer",
		"withCpuPeriod":"java.lang.Integer",
		"withCpusetCpus":"java.lang.String",
		"withCpusetMems":"java.lang.String",
		"withCpuShares":"java.lang.Integer"
	}
}
```
## Docker InitializeSwarm parameters:

```
{
	"main":{
		"withListenAddr":"java.lang.String",
		"withSwarmSpec-withName":"java.lang.String",
		"withSwarmSpec-withDispatcher-withHeartbeatPeriod":"java.lang.Long",
		"withSwarmSpec-withCaConfig-withExternalCA":[
			"ref1-com.github.dockerjava.api.model.ExternalCA"
		],
		"withSwarmSpec-withCaConfig-withNodeCertExpiry":"java.lang.Long",
		"withSwarmSpec-withRaft-withElectionTick":"int",
		"withSwarmSpec-withRaft-withLogEntriesForSlowFollowers":"long",
		"withSwarmSpec-withRaft-withHeartbeatTick":"int",
		"withSwarmSpec-withRaft-withSnapshotInterval":"long",
		"withSwarmSpec-withTaskDefaults-withLogDriver-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withSwarmSpec-withTaskDefaults-withLogDriver-withName":"java.lang.String",
		"withSwarmSpec-withOrchestration-withTaskHistoryRententionLimit":"int",
		"withAdvertiseAddr":"java.lang.String",
		"withForceNewCluster":"java.lang.Boolean"
	},
	"ref1-com.github.dockerjava.api.model.ExternalCA":{
		"withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withUrl":"java.lang.String"
	}
}
```
## Docker LoadImage parameters:

```
{
	"main":{
		
	}
}
```
## Docker CreateContainer parameters:

```
{
	"main":{
		"withAuthConfig-withRegistryAddress":"java.lang.String",
		"withAuthConfig-withUsername":"java.lang.String",
		"withAuthConfig-withPassword":"java.lang.String",
		"withAuthConfig-withEmail":"java.lang.String",
		"withAuthConfig-withAuth":"java.lang.String",
		"withAuthConfig-withRegistrytoken":"java.lang.String",
		"withAttachStderr":"java.lang.Boolean",
		"withAttachStdin":"java.lang.Boolean",
		"withAttachStdout":"java.lang.Boolean"
	}
}
```
## Docker InspectContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String",
		"withSize":"java.lang.Boolean"
	}
}
```
## Docker InspectService parameters:

```
{
	"main":{
		"withServiceId":"java.lang.String"
	}
}
```
## Docker CreateVolume parameters:

```
{
	"main":{
		"withDriver":"java.lang.String",
		"withDriverOpts":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withName":"java.lang.String"
	}
}
```
## Docker RestartContainer parameters:

```
{
	"main":{
		"withtTimeout":"java.lang.Integer",
		"withContainerId":"java.lang.String"
	}
}
```
