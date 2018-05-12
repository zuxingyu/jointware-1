SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
I am here
## Docker AttachContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String",
		"withFollowStream":"java.lang.Boolean",
		"withTimestamps":"java.lang.Boolean",
		"withStdOut":"java.lang.Boolean",
		"withStdErr":"java.lang.Boolean",
		"withStdIn":"java.io.InputStream",
		"withLogs":"java.lang.Boolean"
	}
}
```
## Docker ExecCreate parameters:

```
{
	"main":{
		"withAttachStderr":"java.lang.Boolean",
		"withAttachStdin":"java.lang.Boolean",
		"withAttachStdout":"java.lang.Boolean",
		"withCmd":"java.lang.String[
			
		]",
		"withTty":"java.lang.Boolean",
		"withUser":"java.lang.String",
		"withContainerId":"java.lang.String"
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
		"withTag":"java.lang.String",
		"withAuthConfig":"com.github.dockerjava.api.model.AuthConfig",
		"withAuthConfig-withUsername":"java.lang.String",
		"withAuthConfig-withPassword":"java.lang.String",
		"withAuthConfig-withEmail":"java.lang.String",
		"withAuthConfig-withRegistryAddress":"java.lang.String",
		"withAuthConfig-withRegistrytoken":"java.lang.String",
		"withAuthConfig-withAuth":"java.lang.String",
		"withRepository":"java.lang.String",
		"withRegistry":"java.lang.String"
	}
}
```
## Docker KillContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String",
		"withSignal":"java.lang.String"
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
		"withAncestorFilter":"java.util.Collection<java.lang.String>",
		"withNetworkFilter":"java.util.Collection<java.lang.String>",
		"withBefore":"java.lang.String",
		"withNameFilter":"java.util.Collection<java.lang.String>",
		"withIdFilter":"java.util.Collection<java.lang.String>",
		"withVolumeFilter":"java.util.Collection<java.lang.String>",
		"withExitedFilter":"java.lang.Integer",
		"withStatusFilter":"java.util.Collection<java.lang.String>",
		"withLabelFilter":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
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
		"withMembershipFilter":[
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
		"withRoleFilter":[
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
		"withName":"java.lang.String",
		"withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withCheckDuplicate":"boolean",
		"withDriver":"java.lang.String",
		"withIpam":"com.github.dockerjava.api.model.Network$Ipam",
		"withIpam-withDriver":"java.lang.String",
		"withIpam-withConfig":"com.github.dockerjava.api.model.Network$Ipam$Config[
			
		]",
		"withIpam-withConfig-withSubnet":"java.lang.String",
		"withIpam-withConfig-withIpRange":"java.lang.String",
		"withIpam-withConfig-withGateway":"java.lang.String",
		"withIpam-withConfig-setNetworkID":"java.lang.String",
		"withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withInternal":"boolean",
		"withEnableIpv6":"boolean",
		"withAttachable":"java.lang.Boolean"
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
		"withAdvertiseAddr":"java.lang.String",
		"withListenAddr":"java.lang.String",
		"withRemoteAddrs":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withJoinToken":"java.lang.String"
	}
}
```
## Docker CopyFileFromContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String",
		"withHostPath":"java.lang.String",
		"withResource":"java.lang.String"
	}
}
```
## Docker TagImage parameters:

```
{
	"main":{
		"withTag":"java.lang.String",
		"withRepository":"java.lang.String",
		"withForce":"java.lang.Boolean",
		"withImageId":"java.lang.String"
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
		"withSwarmNodeSpec":"com.github.dockerjava.api.model.SwarmNodeSpec",
		"withSwarmNodeSpec-withName":"java.lang.String",
		"withSwarmNodeSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withSwarmNodeSpec-withRole":"com.github.dockerjava.api.model.SwarmNodeRole",
		"withSwarmNodeSpec-withAvailability":"com.github.dockerjava.api.model.SwarmNodeAvailability",
		"withSwarmNodeId":"java.lang.String",
		"withVersion":"java.lang.Long"
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
		"withTarInputStream":"java.io.InputStream",
		"withTags":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withCacheFrom":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withBaseDirectory":"java.io.File",
		"withBaseDirectory-setExecutable":"boolean",
		"withBaseDirectory-setLastModified":"long",
		"withBaseDirectory-setReadable":"boolean",
		"withBaseDirectory-setWritable":"boolean",
		"withDockerfilePath":"java.lang.String",
		"withBuildAuthConfigs":"com.github.dockerjava.api.model.AuthConfigurations",
		"withRemote":"java.net.URI",
		"withDockerfile":"java.io.File",
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
		"withForce":"java.lang.Boolean",
		"withImageId":"java.lang.String",
		"withNoPrune":"java.lang.Boolean"
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
		"withNameFilter":"java.lang.String[
			
		]",
		"withIdFilter":"java.lang.String[
			
		]",
		"withLabelFilter":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceFilter":"java.lang.String[
			
		]",
		"withNodeFilter":"java.lang.String[
			
		]",
		"withStateFilter":"com.github.dockerjava.api.model.TaskState[
			
		]"
	}
}
```
## Docker PushImage parameters:

```
{
	"main":{
		"withTag":"java.lang.String",
		"withAuthConfig":"com.github.dockerjava.api.model.AuthConfig",
		"withAuthConfig-withUsername":"java.lang.String",
		"withAuthConfig-withPassword":"java.lang.String",
		"withAuthConfig-withEmail":"java.lang.String",
		"withAuthConfig-withRegistryAddress":"java.lang.String",
		"withAuthConfig-withRegistrytoken":"java.lang.String",
		"withAuthConfig-withAuth":"java.lang.String",
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
		"withServiceSpec":"com.github.dockerjava.api.model.ServiceSpec",
		"withServiceSpec-withName":"java.lang.String",
		"withServiceSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withRollbackConfig":"com.github.dockerjava.api.model.UpdateConfig",
		"withServiceSpec-withRollbackConfig-withParallelism":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-setDelay":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withDelay":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withMonitor":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withOrder":"com.github.dockerjava.api.model.UpdateOrder",
		"withServiceSpec-withRollbackConfig-withFailureAction":"com.github.dockerjava.api.model.UpdateFailureAction",
		"withServiceSpec-withRollbackConfig-withMaxFailureRatio":"java.lang.Float",
		"withServiceSpec-withTaskTemplate":"com.github.dockerjava.api.model.TaskSpec",
		"withServiceSpec-withTaskTemplate-withRestartPolicy":"com.github.dockerjava.api.model.ServiceRestartPolicy",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withDelay":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withCondition":"com.github.dockerjava.api.model.ServiceRestartCondition",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withMaxAttempts":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withWindow":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withNetworks":[
			"ref1-com.github.dockerjava.api.model.NetworkAttachmentConfig"
		],
		"withServiceSpec-withTaskTemplate-withResources":"com.github.dockerjava.api.model.ResourceRequirements",
		"withServiceSpec-withTaskTemplate-withResources-withLimits":"com.github.dockerjava.api.model.ResourceSpecs",
		"withServiceSpec-withTaskTemplate-withResources-withLimits-withMemoryBytes":"long",
		"withServiceSpec-withTaskTemplate-withResources-withLimits-withNanoCPUs":"long",
		"withServiceSpec-withTaskTemplate-withResources-withReservations":"com.github.dockerjava.api.model.ResourceSpecs",
		"withServiceSpec-withTaskTemplate-withResources-withReservations-withMemoryBytes":"long",
		"withServiceSpec-withTaskTemplate-withResources-withReservations-withNanoCPUs":"long",
		"withServiceSpec-withTaskTemplate-withPlacement":"com.github.dockerjava.api.model.ServicePlacement",
		"withServiceSpec-withTaskTemplate-withPlacement-withConstraints":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withPlacement-setPlatforms":[
			"ref2-com.github.dockerjava.api.model.SwarmNodePlatform"
		],
		"withServiceSpec-withTaskTemplate-withRuntime":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withLogDriver":"com.github.dockerjava.api.model.Driver",
		"withServiceSpec-withTaskTemplate-withLogDriver-withName":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withLogDriver-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withTaskTemplate-withForceUpdate":"java.lang.Integer",
		"withServiceSpec-withTaskTemplate-withContainerSpec":"com.github.dockerjava.api.model.ContainerSpec",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withEnv":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withStopSignal":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withImage":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withTaskTemplate-withContainerSpec-withTty":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withUser":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHostname":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withOpenStdin":"java.lang.Boolean",
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
			"ref3-com.github.dockerjava.api.model.Mount"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDuration":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig":"com.github.dockerjava.api.model.ContainerDNSConfig",
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
			"ref4-com.github.dockerjava.api.model.ContainerSpecSecret"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck":"com.github.dockerjava.api.model.HealthCheck",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTimeout":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withInterval":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTest":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withRetries":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withStartPeriod":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges":"com.github.dockerjava.api.model.ContainerSpecPrivileges",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec":"com.github.dockerjava.api.model.ContainerSpecPrivilegesCredential",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withRegistry":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withFile":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext":"com.github.dockerjava.api.model.ContainerSpecPrivilegesSELinuxContext",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withUser":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withRole":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withType":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withDisable":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withLevel":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs":[
			"ref5-com.github.dockerjava.api.model.ContainerSpecConfig"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withStopGracePeriod":"java.lang.Long",
		"withServiceSpec-withMode":"com.github.dockerjava.api.model.ServiceModeConfig",
		"withServiceSpec-withMode-withReplicated":"com.github.dockerjava.api.model.ServiceReplicatedModeOptions",
		"withServiceSpec-withMode-withReplicated-withReplicas":"int",
		"withServiceSpec-withMode-withGlobal":"com.github.dockerjava.api.model.ServiceGlobalModeOptions",
		"withServiceSpec-withUpdateConfig":"com.github.dockerjava.api.model.UpdateConfig",
		"withServiceSpec-withUpdateConfig-withParallelism":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-setDelay":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withDelay":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withMonitor":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withOrder":"com.github.dockerjava.api.model.UpdateOrder",
		"withServiceSpec-withUpdateConfig-withFailureAction":"com.github.dockerjava.api.model.UpdateFailureAction",
		"withServiceSpec-withUpdateConfig-withMaxFailureRatio":"java.lang.Float",
		"withServiceSpec-withNetworks":[
			"ref6-com.github.dockerjava.api.model.NetworkAttachmentConfig"
		],
		"withServiceSpec-withEndpointSpec":"com.github.dockerjava.api.model.EndpointSpec",
		"withServiceSpec-withEndpointSpec-withPorts":[
			"ref7-com.github.dockerjava.api.model.PortConfig"
		],
		"withServiceSpec-withEndpointSpec-withMode":"com.github.dockerjava.api.model.EndpointResolutionMode"
	},
	"ref1-com.github.dockerjava.api.model.NetworkAttachmentConfig":{
		"withAliases":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withTarget":"java.lang.String"
	},
	"ref2-com.github.dockerjava.api.model.SwarmNodePlatform":{
		"withOs":"java.lang.String",
		"withArchitecture":"java.lang.String"
	},
	"ref3-com.github.dockerjava.api.model.Mount":{
		"withReadOnly":"java.lang.Boolean",
		"withTarget":"java.lang.String",
		"withType":"com.github.dockerjava.api.model.MountType",
		"withSource":"java.lang.String",
		"withBindOptions":"com.github.dockerjava.api.model.BindOptions",
		"withBindOptions-withPropagation":"com.github.dockerjava.api.model.BindPropagation",
		"withVolumeOptions":"com.github.dockerjava.api.model.VolumeOptions",
		"withVolumeOptions-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withVolumeOptions-withNoCopy":"java.lang.Boolean",
		"withVolumeOptions-withDriverConfig":"com.github.dockerjava.api.model.Driver",
		"withVolumeOptions-withDriverConfig-withName":"java.lang.String",
		"withVolumeOptions-withDriverConfig-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref4-com.github.dockerjava.api.model.ContainerSpecSecret":{
		"withFile":"com.github.dockerjava.api.model.ContainerSpecFile",
		"withFile-withName":"java.lang.String",
		"withFile-withMode":"java.lang.Long",
		"withFile-withUid":"java.lang.String",
		"withFile-withGid":"java.lang.String",
		"withSecretId":"java.lang.String",
		"withSecretName":"java.lang.String"
	},
	"ref5-com.github.dockerjava.api.model.ContainerSpecConfig":{
		"withFile":"com.github.dockerjava.api.model.ContainerSpecFile",
		"withFile-withName":"java.lang.String",
		"withFile-withMode":"java.lang.Long",
		"withFile-withUid":"java.lang.String",
		"withFile-withGid":"java.lang.String",
		"withConfigID":"java.lang.String",
		"withConfigName":"java.lang.String"
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
		"withProtocol":"com.github.dockerjava.api.model.PortConfigProtocol",
		"withTargetPort":"int",
		"withPublishMode":"com.github.dockerjava.api.model.PortConfig$PublishMode",
		"withPublishedPort":"int"
	}
}
```
## Docker UpdateService parameters:

```
{
	"main":{
		"withVersion":"java.lang.Long",
		"withServiceId":"java.lang.String",
		"withServiceSpec":"com.github.dockerjava.api.model.ServiceSpec",
		"withServiceSpec-withName":"java.lang.String",
		"withServiceSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withRollbackConfig":"com.github.dockerjava.api.model.UpdateConfig",
		"withServiceSpec-withRollbackConfig-withParallelism":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-setDelay":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withDelay":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withMonitor":"java.lang.Long",
		"withServiceSpec-withRollbackConfig-withOrder":"com.github.dockerjava.api.model.UpdateOrder",
		"withServiceSpec-withRollbackConfig-withFailureAction":"com.github.dockerjava.api.model.UpdateFailureAction",
		"withServiceSpec-withRollbackConfig-withMaxFailureRatio":"java.lang.Float",
		"withServiceSpec-withTaskTemplate":"com.github.dockerjava.api.model.TaskSpec",
		"withServiceSpec-withTaskTemplate-withRestartPolicy":"com.github.dockerjava.api.model.ServiceRestartPolicy",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withDelay":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withCondition":"com.github.dockerjava.api.model.ServiceRestartCondition",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withMaxAttempts":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withRestartPolicy-withWindow":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withNetworks":[
			"ref1-com.github.dockerjava.api.model.NetworkAttachmentConfig"
		],
		"withServiceSpec-withTaskTemplate-withResources":"com.github.dockerjava.api.model.ResourceRequirements",
		"withServiceSpec-withTaskTemplate-withResources-withLimits":"com.github.dockerjava.api.model.ResourceSpecs",
		"withServiceSpec-withTaskTemplate-withResources-withLimits-withMemoryBytes":"long",
		"withServiceSpec-withTaskTemplate-withResources-withLimits-withNanoCPUs":"long",
		"withServiceSpec-withTaskTemplate-withResources-withReservations":"com.github.dockerjava.api.model.ResourceSpecs",
		"withServiceSpec-withTaskTemplate-withResources-withReservations-withMemoryBytes":"long",
		"withServiceSpec-withTaskTemplate-withResources-withReservations-withNanoCPUs":"long",
		"withServiceSpec-withTaskTemplate-withPlacement":"com.github.dockerjava.api.model.ServicePlacement",
		"withServiceSpec-withTaskTemplate-withPlacement-withConstraints":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withPlacement-setPlatforms":[
			"ref2-com.github.dockerjava.api.model.SwarmNodePlatform"
		],
		"withServiceSpec-withTaskTemplate-withRuntime":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withLogDriver":"com.github.dockerjava.api.model.Driver",
		"withServiceSpec-withTaskTemplate-withLogDriver-withName":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withLogDriver-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withTaskTemplate-withForceUpdate":"java.lang.Integer",
		"withServiceSpec-withTaskTemplate-withContainerSpec":"com.github.dockerjava.api.model.ContainerSpec",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withEnv":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withStopSignal":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withImage":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withServiceSpec-withTaskTemplate-withContainerSpec-withTty":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withUser":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHostname":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withOpenStdin":"java.lang.Boolean",
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
			"ref3-com.github.dockerjava.api.model.Mount"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDuration":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig":"com.github.dockerjava.api.model.ContainerDNSConfig",
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
			"ref4-com.github.dockerjava.api.model.ContainerSpecSecret"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck":"com.github.dockerjava.api.model.HealthCheck",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTimeout":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withInterval":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTest":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withRetries":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withStartPeriod":"java.lang.Long",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges":"com.github.dockerjava.api.model.ContainerSpecPrivileges",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec":"com.github.dockerjava.api.model.ContainerSpecPrivilegesCredential",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withRegistry":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withFile":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext":"com.github.dockerjava.api.model.ContainerSpecPrivilegesSELinuxContext",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withUser":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withRole":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withType":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withDisable":"java.lang.Boolean",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withLevel":"java.lang.String",
		"withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs":[
			"ref5-com.github.dockerjava.api.model.ContainerSpecConfig"
		],
		"withServiceSpec-withTaskTemplate-withContainerSpec-withStopGracePeriod":"java.lang.Long",
		"withServiceSpec-withMode":"com.github.dockerjava.api.model.ServiceModeConfig",
		"withServiceSpec-withMode-withReplicated":"com.github.dockerjava.api.model.ServiceReplicatedModeOptions",
		"withServiceSpec-withMode-withReplicated-withReplicas":"int",
		"withServiceSpec-withMode-withGlobal":"com.github.dockerjava.api.model.ServiceGlobalModeOptions",
		"withServiceSpec-withUpdateConfig":"com.github.dockerjava.api.model.UpdateConfig",
		"withServiceSpec-withUpdateConfig-withParallelism":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-setDelay":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withDelay":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withMonitor":"java.lang.Long",
		"withServiceSpec-withUpdateConfig-withOrder":"com.github.dockerjava.api.model.UpdateOrder",
		"withServiceSpec-withUpdateConfig-withFailureAction":"com.github.dockerjava.api.model.UpdateFailureAction",
		"withServiceSpec-withUpdateConfig-withMaxFailureRatio":"java.lang.Float",
		"withServiceSpec-withNetworks":[
			"ref6-com.github.dockerjava.api.model.NetworkAttachmentConfig"
		],
		"withServiceSpec-withEndpointSpec":"com.github.dockerjava.api.model.EndpointSpec",
		"withServiceSpec-withEndpointSpec-withPorts":[
			"ref7-com.github.dockerjava.api.model.PortConfig"
		],
		"withServiceSpec-withEndpointSpec-withMode":"com.github.dockerjava.api.model.EndpointResolutionMode"
	},
	"ref1-com.github.dockerjava.api.model.NetworkAttachmentConfig":{
		"withAliases":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withTarget":"java.lang.String"
	},
	"ref2-com.github.dockerjava.api.model.SwarmNodePlatform":{
		"withOs":"java.lang.String",
		"withArchitecture":"java.lang.String"
	},
	"ref3-com.github.dockerjava.api.model.Mount":{
		"withReadOnly":"java.lang.Boolean",
		"withTarget":"java.lang.String",
		"withType":"com.github.dockerjava.api.model.MountType",
		"withSource":"java.lang.String",
		"withBindOptions":"com.github.dockerjava.api.model.BindOptions",
		"withBindOptions-withPropagation":"com.github.dockerjava.api.model.BindPropagation",
		"withVolumeOptions":"com.github.dockerjava.api.model.VolumeOptions",
		"withVolumeOptions-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withVolumeOptions-withNoCopy":"java.lang.Boolean",
		"withVolumeOptions-withDriverConfig":"com.github.dockerjava.api.model.Driver",
		"withVolumeOptions-withDriverConfig-withName":"java.lang.String",
		"withVolumeOptions-withDriverConfig-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref4-com.github.dockerjava.api.model.ContainerSpecSecret":{
		"withFile":"com.github.dockerjava.api.model.ContainerSpecFile",
		"withFile-withName":"java.lang.String",
		"withFile-withMode":"java.lang.Long",
		"withFile-withUid":"java.lang.String",
		"withFile-withGid":"java.lang.String",
		"withSecretId":"java.lang.String",
		"withSecretName":"java.lang.String"
	},
	"ref5-com.github.dockerjava.api.model.ContainerSpecConfig":{
		"withFile":"com.github.dockerjava.api.model.ContainerSpecFile",
		"withFile-withName":"java.lang.String",
		"withFile-withMode":"java.lang.Long",
		"withFile-withUid":"java.lang.String",
		"withFile-withGid":"java.lang.String",
		"withConfigID":"java.lang.String",
		"withConfigName":"java.lang.String"
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
		"withProtocol":"com.github.dockerjava.api.model.PortConfigProtocol",
		"withTargetPort":"int",
		"withPublishMode":"com.github.dockerjava.api.model.PortConfig$PublishMode",
		"withPublishedPort":"int"
	}
}
```
## Docker CopyArchiveToContainer parameters:

```
{
	"main":{
		"withTarInputStream":"java.io.InputStream",
		"withNoOverwriteDirNonDir":"boolean",
		"withDirChildrenOnly":"boolean",
		"withContainerId":"java.lang.String",
		"withHostResource":"java.lang.String",
		"withRemotePath":"java.lang.String"
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
		"withTty":"java.lang.Boolean",
		"withStdIn":"java.io.InputStream",
		"withDetach":"java.lang.Boolean",
		"withExecId":"java.lang.String"
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
		"withContainerId":"java.lang.String",
		"withPsArgs":"java.lang.String"
	}
}
```
## Docker StopContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String",
		"withTimeout":"java.lang.Integer"
	}
}
```
## Docker RemoveContainer parameters:

```
{
	"main":{
		"withRemoveVolumes":"java.lang.Boolean",
		"withContainerId":"java.lang.String",
		"withForce":"java.lang.Boolean"
	}
}
```
## Docker ListNetworks parameters:

```
{
	"main":{
		"withNameFilter":"java.lang.String[
			
		]",
		"withIdFilter":"java.lang.String[
			
		]"
	}
}
```
## Docker ListImages parameters:

```
{
	"main":{
		"withLabelFilter":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withShowAll":"java.lang.Boolean",
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
		"withLabelFilter":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withSince":"java.lang.String",
		"withContainerFilter":"java.lang.String[
			
		]",
		"withEventFilter":"java.lang.String[
			
		]",
		"withImageFilter":"java.lang.String[
			
		]",
		"withUntil":"java.lang.String"
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
## Docker CreateImage parameters:

```
{
	"main":{
		"withTag":"java.lang.String",
		"withRepository":"java.lang.String",
		"withImageStream":"java.io.InputStream"
	}
}
```
## Docker LogContainer parameters:

```
{
	"main":{
		"withSince":"java.lang.Integer",
		"withContainerId":"java.lang.String",
		"withFollowStream":"java.lang.Boolean",
		"withTimestamps":"java.lang.Boolean",
		"withStdOut":"java.lang.Boolean",
		"withStdErr":"java.lang.Boolean",
		"withTail":"java.lang.Integer"
	}
}
```
## Docker ConnectToNetwork parameters:

```
{
	"main":{
		"withContainerNetwork":"com.github.dockerjava.api.model.ContainerNetwork",
		"withContainerNetwork-withAliases":"java.lang.String[
			
		]",
		"withContainerNetwork-withIpv4Address":"java.lang.String",
		"withContainerNetwork-withLinks":"com.github.dockerjava.api.model.Link[
			
		]",
		"withContainerNetwork-withMacAddress":"java.lang.String",
		"withContainerNetwork-withEndpointId":"java.lang.String",
		"withContainerNetwork-withIpPrefixLen":"java.lang.Integer",
		"withContainerNetwork-withIpV6Gateway":"java.lang.String",
		"withContainerNetwork-withNetworkID":"java.lang.String",
		"withContainerNetwork-withGateway":"java.lang.String",
		"withContainerNetwork-withGlobalIPv6Address":"java.lang.String",
		"withContainerNetwork-withGlobalIPv6PrefixLen":"java.lang.Integer",
		"withContainerNetwork-withIpamConfig":"com.github.dockerjava.api.model.ContainerNetwork$Ipam",
		"withContainerNetwork-withIpamConfig-withIpv4Address":"java.lang.String",
		"withContainerNetwork-withIpamConfig-withIpv6Address":"java.lang.String",
		"withContainerId":"java.lang.String",
		"withNetworkId":"java.lang.String"
	}
}
```
## Docker DisconnectFromNetwork parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String",
		"withForce":"java.lang.Boolean",
		"withNetworkId":"java.lang.String"
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
		"withContainerId":"java.lang.String",
		"withHostPath":"java.lang.String",
		"withResource":"java.lang.String"
	}
}
```
## Docker UpdateSwarmNode parameters:

```
{
	"main":{
		"withSwarmNodeSpec":"com.github.dockerjava.api.model.SwarmNodeSpec",
		"withSwarmNodeSpec-withName":"java.lang.String",
		"withSwarmNodeSpec-withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withSwarmNodeSpec-withRole":"com.github.dockerjava.api.model.SwarmNodeRole",
		"withSwarmNodeSpec-withAvailability":"com.github.dockerjava.api.model.SwarmNodeAvailability",
		"withSwarmNodeId":"java.lang.String",
		"withVersion":"java.lang.Long"
	}
}
```
## Docker RenameContainer parameters:

```
{
	"main":{
		"withName":"java.lang.String",
		"withContainerId":"java.lang.String"
	}
}
```
## Docker Commit parameters:

```
{
	"main":{
		"withTag":"java.lang.String",
		"withRepository":"java.lang.String",
		"withAttachStderr":"java.lang.Boolean",
		"withAttachStdin":"java.lang.Boolean",
		"withAttachStdout":"java.lang.Boolean",
		"withCmd":[
			"ref1-java.util.List"
		],
		"withEnv":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withExposedPorts":"com.github.dockerjava.api.model.ExposedPorts",
		"withExposedPorts-setExposedPorts":"com.github.dockerjava.api.model.ExposedPort[
			
		]",
		"withLabels":{
			"java.lang.String0":"ref2-java.util.Map"
		},
		"withMemory":"java.lang.Integer",
		"withMemorySwap":"java.lang.Integer",
		"withPortSpecs":[
			"ref3-java.util.List"
		],
		"withTty":"java.lang.Boolean",
		"withUser":"java.lang.String",
		"withVolumes":"com.github.dockerjava.api.model.Volumes",
		"withVolumes-setVolumes":"com.github.dockerjava.api.model.Volume[
			
		]",
		"withWorkingDir":"java.lang.String",
		"withContainerId":"java.lang.String",
		"withAuthor":"java.lang.String",
		"withHostname":"java.lang.String",
		"withMessage":"java.lang.String",
		"withOpenStdin":"java.lang.Boolean",
		"withPause":"java.lang.Boolean",
		"withStdinOnce":"java.lang.Boolean",
		"withDisableNetwork":"java.lang.Boolean"
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
		"withBlkioWeight":"java.lang.Integer",
		"withCpuPeriod":"java.lang.Integer",
		"withCpusetCpus":"java.lang.String",
		"withCpusetMems":"java.lang.String",
		"withCpuShares":"java.lang.Integer",
		"withMemory":"java.lang.Long",
		"withMemorySwap":"java.lang.Long",
		"withMemoryReservation":"java.lang.Long",
		"withContainerId":"java.lang.String",
		"withCpuQuota":"java.lang.Integer",
		"withKernelMemory":"java.lang.Long"
	}
}
```
## Docker InitializeSwarm parameters:

```
{
	"main":{
		"withAdvertiseAddr":"java.lang.String",
		"withForceNewCluster":"java.lang.Boolean",
		"withListenAddr":"java.lang.String",
		"withSwarmSpec":"com.github.dockerjava.api.model.SwarmSpec",
		"withSwarmSpec-withName":"java.lang.String",
		"withSwarmSpec-withOrchestration":"com.github.dockerjava.api.model.SwarmOrchestration",
		"withSwarmSpec-withOrchestration-withTaskHistoryRententionLimit":"int",
		"withSwarmSpec-withDispatcher":"com.github.dockerjava.api.model.SwarmDispatcherConfig",
		"withSwarmSpec-withDispatcher-withHeartbeatPeriod":"java.lang.Long",
		"withSwarmSpec-withCaConfig":"com.github.dockerjava.api.model.SwarmCAConfig",
		"withSwarmSpec-withCaConfig-withExternalCA":[
			"ref1-com.github.dockerjava.api.model.ExternalCA"
		],
		"withSwarmSpec-withCaConfig-withNodeCertExpiry":"java.lang.Long",
		"withSwarmSpec-withRaft":"com.github.dockerjava.api.model.SwarmRaftConfig",
		"withSwarmSpec-withRaft-withElectionTick":"int",
		"withSwarmSpec-withRaft-withLogEntriesForSlowFollowers":"long",
		"withSwarmSpec-withRaft-withHeartbeatTick":"int",
		"withSwarmSpec-withRaft-withSnapshotInterval":"long",
		"withSwarmSpec-withTaskDefaults":"com.github.dockerjava.api.model.TaskDefaults",
		"withSwarmSpec-withTaskDefaults-withLogDriver":"com.github.dockerjava.api.model.Driver",
		"withSwarmSpec-withTaskDefaults-withLogDriver-withName":"java.lang.String",
		"withSwarmSpec-withTaskDefaults-withLogDriver-withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref1-com.github.dockerjava.api.model.ExternalCA":{
		"withProtocol":"com.github.dockerjava.api.model.ExternalCAProtocol",
		"withUrl":"java.lang.String",
		"withOptions":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	}
}
```
## Docker LoadImage parameters:

```
{
	"main":{
		"withImageStream":"java.io.InputStream"
	}
}
```
## Docker CreateContainer parameters:

```
{
	"main":{
		"withAuthConfig":"com.github.dockerjava.api.model.AuthConfig",
		"withAuthConfig-withUsername":"java.lang.String",
		"withAuthConfig-withPassword":"java.lang.String",
		"withAuthConfig-withEmail":"java.lang.String",
		"withAuthConfig-withRegistryAddress":"java.lang.String",
		"withAuthConfig-withRegistrytoken":"java.lang.String",
		"withAuthConfig-withAuth":"java.lang.String",
		"withName":"java.lang.String",
		"withAliases":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withAttachStderr":"java.lang.Boolean",
		"withAttachStdin":"java.lang.Boolean",
		"withAttachStdout":"java.lang.Boolean",
		"withBinds":[
			"ref1-com.github.dockerjava.api.model.Bind"
		],
		"withBlkioWeight":"java.lang.Integer",
		"withCapAdd":[
			"ref2-com.github.dockerjava.api.model.Capability"
		],
		"withCapDrop":[
			"ref3-com.github.dockerjava.api.model.Capability"
		],
		"withCmd":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withCpuPeriod":"java.lang.Integer",
		"withCpusetCpus":"java.lang.String",
		"withCpusetMems":"java.lang.String",
		"withCpuShares":"java.lang.Integer",
		"withDevices":[
			"ref4-com.github.dockerjava.api.model.Device"
		],
		"withDns":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withDnsSearch":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withDomainName":"java.lang.String",
		"withEntrypoint":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withEnv":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withStopSignal":"java.lang.String",
		"withExposedPorts":[
			"ref5-com.github.dockerjava.api.model.ExposedPort"
		],
		"withExtraHosts":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withHostName":"java.lang.String",
		"withImage":"java.lang.String",
		"withIpv4Address":"java.lang.String",
		"withIpv6Address":"java.lang.String",
		"withLabels":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withLinks":[
			"ref6-com.github.dockerjava.api.model.Link"
		],
		"withLogConfig":"com.github.dockerjava.api.model.LogConfig",
		"withLogConfig-setType":"com.github.dockerjava.api.model.LogConfig$LoggingType",
		"withLogConfig-setConfig":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withLxcConf":[
			"ref7-com.github.dockerjava.api.model.LxcConf"
		],
		"withMacAddress":"java.lang.String",
		"withMemory":"java.lang.Long",
		"withMemorySwap":"java.lang.Long",
		"withNetworkMode":"java.lang.String",
		"withPortBindings":[
			"ref8-com.github.dockerjava.api.model.PortBinding"
		],
		"withPortSpecs":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withPrivileged":"java.lang.Boolean",
		"withStdInOnce":"java.lang.Boolean",
		"withStdinOpen":"java.lang.Boolean",
		"withTty":"java.lang.Boolean",
		"withUlimits":[
			"ref9-com.github.dockerjava.api.model.Ulimit"
		],
		"withContainerIDFile":"java.lang.String",
		"withNetworkDisabled":"java.lang.Boolean",
		"withOomKillDisable":"java.lang.Boolean",
		"withPublishAllPorts":"java.lang.Boolean",
		"withReadonlyRootfs":"java.lang.Boolean",
		"withRestartPolicy":"com.github.dockerjava.api.model.RestartPolicy",
		"withUser":"java.lang.String",
		"withVolumes":[
			"ref10-com.github.dockerjava.api.model.Volume"
		],
		"withWorkingDir":"java.lang.String",
		"withCgroupParent":"java.lang.String",
		"withPidMode":"java.lang.String",
		"withHostConfig":"com.github.dockerjava.api.model.HostConfig",
		"withHostConfig-withBinds":"com.github.dockerjava.api.model.Binds",
		"withHostConfig-withBlkioWeight":"java.lang.Integer",
		"withHostConfig-withCapAdd":"com.github.dockerjava.api.model.Capability[
			
		]",
		"withHostConfig-withCapDrop":"com.github.dockerjava.api.model.Capability[
			
		]",
		"withHostConfig-withCpuPeriod":"java.lang.Integer",
		"withHostConfig-withCpusetCpus":"java.lang.String",
		"withHostConfig-withCpusetMems":"java.lang.String",
		"withHostConfig-withCpuShares":"java.lang.Integer",
		"withHostConfig-withDevices":"com.github.dockerjava.api.model.Device[
			
		]",
		"withHostConfig-withDns":"java.lang.String[
			
		]",
		"withHostConfig-withDnsSearch":"java.lang.String[
			
		]",
		"withHostConfig-withExtraHosts":"java.lang.String[
			
		]",
		"withHostConfig-withLinks":"com.github.dockerjava.api.model.Links",
		"withHostConfig-withLogConfig":"com.github.dockerjava.api.model.LogConfig",
		"withHostConfig-withLogConfig-setType":"com.github.dockerjava.api.model.LogConfig$LoggingType",
		"withHostConfig-withLogConfig-setConfig":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withHostConfig-withLxcConf":"com.github.dockerjava.api.model.LxcConf[
			
		]",
		"withHostConfig-withMemory":"java.lang.Long",
		"withHostConfig-withMemorySwap":"java.lang.Long",
		"withHostConfig-withNetworkMode":"java.lang.String",
		"withHostConfig-withPortBindings":"com.github.dockerjava.api.model.Ports",
		"withHostConfig-withPrivileged":"java.lang.Boolean",
		"withHostConfig-withUlimits":"com.github.dockerjava.api.model.Ulimit[
			
		]",
		"withHostConfig-withContainerIDFile":"java.lang.String",
		"withHostConfig-withOomKillDisable":"java.lang.Boolean",
		"withHostConfig-withPublishAllPorts":"java.lang.Boolean",
		"withHostConfig-withReadonlyRootfs":"java.lang.Boolean",
		"withHostConfig-withRestartPolicy":"com.github.dockerjava.api.model.RestartPolicy",
		"withHostConfig-withMemoryReservation":"java.lang.Long",
		"withHostConfig-withVolumesFrom":"com.github.dockerjava.api.model.VolumesFrom[
			
		]",
		"withHostConfig-withCgroupParent":"java.lang.String",
		"withHostConfig-withPidMode":"java.lang.String",
		"withHostConfig-withCpuQuota":"java.lang.Integer",
		"withHostConfig-withKernelMemory":"java.lang.Long",
		"withHostConfig-withRuntime":"java.lang.String",
		"withHostConfig-withOomScoreAdj":"java.lang.Boolean",
		"withHostConfig-withSecurityOpts":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"withHostConfig-withShmSize":"java.lang.Long",
		"withHostConfig-withVolumeDriver":"java.lang.String",
		"withHostConfig-withPidsLimit":"java.lang.Long",
		"withHostConfig-withTmpFs":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"withHostConfig-setBinds":"com.github.dockerjava.api.model.Bind[
			
		]",
		"withHostConfig-setLinks":"com.github.dockerjava.api.model.Link[
			
		]",
		"withHostConfig-withBlkioDeviceReadBps":[
			"ref11-java.lang.Object"
		],
		"withHostConfig-withBlkioDeviceReadIOps":[
			"ref12-java.lang.Object"
		],
		"withHostConfig-withBlkioDeviceWriteBps":[
			"ref13-java.lang.Object"
		],
		"withHostConfig-withBlkioDeviceWriteIOps":[
			"ref14-java.lang.Object"
		],
		"withHostConfig-withBlkioWeightDevice":[
			"ref15-java.lang.Object"
		],
		"withHostConfig-withMemorySwappiness":"java.lang.Integer"
	},
	"ref4-com.github.dockerjava.api.model.Device":{
		"setPathOnHost":"java.lang.String",
		"setcGroupPermissions":"java.lang.String",
		"setPathInContainer":"java.lang.String"
	},
	"ref5-com.github.dockerjava.api.model.ExposedPort":{
		"setProtocol":"com.github.dockerjava.api.model.InternetProtocol",
		"setPort":"int"
	},
	"ref7-com.github.dockerjava.api.model.LxcConf":{
		"setValue":"java.lang.String",
		"setKey":"java.lang.String"
	},
	"ref8-com.github.dockerjava.api.model.PortBinding":{
		"setBinding":"com.github.dockerjava.api.model.Ports$Binding",
		"setBinding-setHostIp":"java.lang.String",
		"setBinding-setHostPortSpec":"java.lang.String",
		"setExposedPort":"com.github.dockerjava.api.model.ExposedPort",
		"setExposedPort-setProtocol":"com.github.dockerjava.api.model.InternetProtocol",
		"setExposedPort-setPort":"int"
	},
	"ref10-com.github.dockerjava.api.model.Volume":{
		"rom-setContainer":"java.lang.String",
		"rom-setAccessMode":"com.github.dockerjava.api.model.AccessMode"
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
		"withName":"java.lang.String",
		"withDriver":"java.lang.String",
		"withDriverOpts":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	}
}
```
## Docker RestartContainer parameters:

```
{
	"main":{
		"withContainerId":"java.lang.String",
		"withtTimeout":"java.lang.Integer"
	}
}
```
