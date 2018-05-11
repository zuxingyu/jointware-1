
## Docker AttachContainer parameters:

```
- withLogs = java.lang.Boolean
- withContainerId = java.lang.String
- withStdIn = java.io.InputStream
- withFollowStream = java.lang.Boolean
- withTimestamps = java.lang.Boolean
- withStdOut = java.lang.Boolean
- withStdErr = java.lang.Boolean
```
## Docker ExecCreate parameters:

```
- withAttachStderr = java.lang.Boolean
- withAttachStdin = java.lang.Boolean
- withAttachStdout = java.lang.Boolean
- withCmd = java.lang.String[]
- withContainerId = java.lang.String
- withTty = java.lang.Boolean
- withUser = java.lang.String
```
## Docker PauseContainer parameters:

```
- withContainerId = java.lang.String
```
## Docker PullImage parameters:

```
- withTag = java.lang.String
- withAuthConfig = com.github.dockerjava.api.model.AuthConfig
- 	withUsername = java.lang.String
- 	withPassword = java.lang.String
- 	withEmail = java.lang.String
- 	withRegistryAddress = java.lang.String
- 	withRegistrytoken = java.lang.String
- 	withAuth = java.lang.String
- withRepository = java.lang.String
- withRegistry = java.lang.String
```
## Docker KillContainer parameters:

```
- withContainerId = java.lang.String
- withSignal = java.lang.String
```
## Docker SaveImage parameters:

```
- withTag = java.lang.String
- withName = java.lang.String
```
## Docker ListContainers parameters:

```
- withAncestorFilter = java.util.Collection<java.lang.String>
- withNetworkFilter = java.util.Collection<java.lang.String>
- withLabelFilter = java.util.Map<java.lang.String, java.lang.String>
- withIdFilter = java.util.Collection<java.lang.String>
- withNameFilter = java.util.Collection<java.lang.String>
- withShowAll = java.lang.Boolean
- withSince = java.lang.String
- withBefore = java.lang.String
- withVolumeFilter = java.util.Collection<java.lang.String>
- withExitedFilter = java.lang.Integer
- withStatusFilter = java.util.Collection<java.lang.String>
- withLimit = java.lang.Integer
- withShowSize = java.lang.Boolean
```
## Docker ListSwarmNodes parameters:

```
- withMembershipFilter = java.util.List<java.lang.String>
- withRoleFilter = java.util.List<java.lang.String>
- withIdFilter = java.util.List<java.lang.String>
- withNameFilter = java.util.List<java.lang.String>
```
## Docker InspectSwarm parameters:

```
```
## Docker Version parameters:

```
```
## Docker CreateNetwork parameters:

```
- withCheckDuplicate = boolean
- withName = java.lang.String
- withLabels = java.util.Map<java.lang.String, java.lang.String>
- withDriver = java.lang.String
- withIpam = com.github.dockerjava.api.model.Network$Ipam
- 	withDriver = java.lang.String
- 	withConfig = com.github.dockerjava.api.model.Network$Ipam$Config[]
- 		withSubnet = java.lang.String
- 		withIpRange = java.lang.String
- 		withGateway = java.lang.String
- 		setNetworkID = java.lang.String
- withOptions = java.util.Map<java.lang.String, java.lang.String>
- withInternal = boolean
- withEnableIpv6 = boolean
- withAttachable = java.lang.Boolean
```
## Docker JoinSwarm parameters:

```
- withAdvertiseAddr = java.lang.String
- withListenAddr = java.lang.String
- withRemoteAddrs = java.util.List<java.lang.String>
- withJoinToken = java.lang.String
```
## Docker UnpauseContainer parameters:

```
- withContainerId = java.lang.String
```
## Docker CopyFileFromContainer parameters:

```
- withHostPath = java.lang.String
- withResource = java.lang.String
- withContainerId = java.lang.String
```
## Docker TagImage parameters:

```
- withTag = java.lang.String
- withRepository = java.lang.String
- withImageId = java.lang.String
- withForce = java.lang.Boolean
```
## Docker SearchImages parameters:

```
- withTerm = java.lang.String
```
## Docker RemoveVolume parameters:

```
- withName = java.lang.String
```
## Docker UpdateSwarm parameters:

```
- withRotateWorkerToken = java.lang.Boolean
- withRotateManagerToken = java.lang.Boolean
- withVersion = java.lang.Long
- withSwarmSpec = com.github.dockerjava.api.model.SwarmSpec
- 	withOrchestration = com.github.dockerjava.api.model.SwarmOrchestration
- 		withTaskHistoryRententionLimit = int
- 	withDispatcher = com.github.dockerjava.api.model.SwarmDispatcherConfig
- 		withHeartbeatPeriod = java.lang.Long
- 	withCaConfig = com.github.dockerjava.api.model.SwarmCAConfig
- 		withNodeCertExpiry = java.lang.Long
- 		withExternalCA = java.util.List<com.github.dockerjava.api.model.ExternalCA>
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 			withProtocol = com.github.dockerjava.api.model.ExternalCAProtocol
- 			withUrl = java.lang.String
- 	withRaft = com.github.dockerjava.api.model.SwarmRaftConfig
- 		withLogEntriesForSlowFollowers = long
- 		withHeartbeatTick = int
- 		withSnapshotInterval = long
- 		withElectionTick = int
- 	withTaskDefaults = com.github.dockerjava.api.model.TaskDefaults
- 		withLogDriver = com.github.dockerjava.api.model.Driver
- 			withName = java.lang.String
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 	withName = java.lang.String
```
## Docker InspectImage parameters:

```
- withImageId = java.lang.String
```
## Docker BuildImage parameters:

```
- withTag = java.lang.String
- withBaseDirectory = java.io.File
- 	setExecutable = boolean
- 	setLastModified = long
- 	setReadable = boolean
- 	setWritable = boolean
- withDockerfilePath = java.lang.String
- withBuildAuthConfigs = com.github.dockerjava.api.model.AuthConfigurations
- withTarInputStream = java.io.InputStream
- withLabels = java.util.Map<java.lang.String, java.lang.String>
- withMemory = java.lang.Long
- withTags = java.util.Set<java.lang.String>
- withCacheFrom = java.util.Set<java.lang.String>
- withRemote = java.net.URI
- withDockerfile = java.io.File
- 	setExecutable = boolean
- 	setLastModified = long
- 	setReadable = boolean
- 	setWritable = boolean
- withNoCache = java.lang.Boolean
- withRemove = java.lang.Boolean
- withForcerm = java.lang.Boolean
- withQuiet = java.lang.Boolean
- withPull = java.lang.Boolean
- withMemswap = java.lang.Long
- withCpushares = java.lang.String
- withCpusetcpus = java.lang.String
- withShmsize = java.lang.Long
```
## Docker ListServices parameters:

```
- withLabelFilter = java.util.Map<java.lang.String, java.lang.String>
- withIdFilter = java.util.List<java.lang.String>
- withNameFilter = java.util.List<java.lang.String>
```
## Docker RemoveImage parameters:

```
- withImageId = java.lang.String
- withForce = java.lang.Boolean
- withNoPrune = java.lang.Boolean
```
## Docker ListTasks parameters:

```
- withServiceFilter = java.lang.String[]
- withLabelFilter = java.util.Map<java.lang.String, java.lang.String>
- withIdFilter = java.lang.String[]
- withNameFilter = java.lang.String[]
- withNodeFilter = java.lang.String[]
- withStateFilter = com.github.dockerjava.api.model.TaskState[]
```
## Docker InspectVolume parameters:

```
- withName = java.lang.String
```
## Docker RemoveNetwork parameters:

```
- withNetworkId = java.lang.String
```
## Docker PushImage parameters:

```
- withTag = java.lang.String
- withAuthConfig = com.github.dockerjava.api.model.AuthConfig
- 	withUsername = java.lang.String
- 	withPassword = java.lang.String
- 	withEmail = java.lang.String
- 	withRegistryAddress = java.lang.String
- 	withRegistrytoken = java.lang.String
- 	withAuth = java.lang.String
- withName = java.lang.String
```
## Docker WaitContainer parameters:

```
- withContainerId = java.lang.String
```
## Docker CreateService parameters:

```
- withServiceSpec = com.github.dockerjava.api.model.ServiceSpec
- 	withRollbackConfig = com.github.dockerjava.api.model.UpdateConfig
- 		withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- 		withMaxFailureRatio = java.lang.Float
- 		withParallelism = long
- 		setDelay = java.lang.Long
- 		withDelay = java.lang.Long
- 		withMonitor = java.lang.Long
- 		withOrder = com.github.dockerjava.api.model.UpdateOrder
- 	withTaskTemplate = com.github.dockerjava.api.model.TaskSpec
- 		withRestartPolicy = com.github.dockerjava.api.model.ServiceRestartPolicy
- 			withWindow = java.lang.Long
- 			withCondition = com.github.dockerjava.api.model.ServiceRestartCondition
- 			withMaxAttempts = java.lang.Long
- 			withDelay = java.lang.Long
- 		withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- 			withAliases = java.util.List<java.lang.String>
- 			withTarget = java.lang.String
- 		withContainerSpec = com.github.dockerjava.api.model.ContainerSpec
- 			withStopSignal = java.lang.String
- 			withImage = java.lang.String
- 			withTty = java.lang.Boolean
- 			withUser = java.lang.String
- 			withEnv = java.util.List<java.lang.String>
- 			withHostname = java.lang.String
- 			withLabels = java.util.Map<java.lang.String, java.lang.String>
- 			withOpenStdin = java.lang.Boolean
- 			withStopGracePeriod = java.lang.Long
- 			withCommand = java.util.List<java.lang.String>
- 			withArgs = java.util.List<java.lang.String>
- 			withDir = java.lang.String
- 			withGroups = java.lang.String
- 			withMounts = java.util.List<com.github.dockerjava.api.model.Mount>
- 				withVolumeOptions = com.github.dockerjava.api.model.VolumeOptions
- 					withLabels = java.util.Map<java.lang.String, java.lang.String>
- 					withNoCopy = java.lang.Boolean
- 					withDriverConfig = com.github.dockerjava.api.model.Driver
- 						withName = java.lang.String
- 						withOptions = java.util.Map<java.lang.String, java.lang.String>
- 				withReadOnly = java.lang.Boolean
- 				withTarget = java.lang.String
- 				withType = com.github.dockerjava.api.model.MountType
- 				withSource = java.lang.String
- 				withBindOptions = com.github.dockerjava.api.model.BindOptions
- 					withPropagation = com.github.dockerjava.api.model.BindPropagation
- 			withDuration = java.lang.Long
- 			withDnsConfig = com.github.dockerjava.api.model.ContainerDNSConfig
- 				withOptions = java.util.List<java.lang.String>
- 				withNameservers = java.util.List<java.lang.String>
- 				withSearch = java.util.List<java.lang.String>
- 			withReadOnly = java.lang.Boolean
- 			withHosts = java.util.List<java.lang.String>
- 			withSecrets = java.util.List<com.github.dockerjava.api.model.ContainerSpecSecret>
- 				withFile = com.github.dockerjava.api.model.ContainerSpecFile
- 					withMode = java.lang.Long
- 					withName = java.lang.String
- 					withUid = java.lang.String
- 					withGid = java.lang.String
- 				withSecretId = java.lang.String
- 				withSecretName = java.lang.String
- 			withHealthCheck = com.github.dockerjava.api.model.HealthCheck
- 				withTimeout = java.lang.Long
- 				withInterval = java.lang.Long
- 				withTest = java.util.List<java.lang.String>
- 				withRetries = java.lang.Long
- 				withStartPeriod = java.lang.Long
- 			withPrivileges = com.github.dockerjava.api.model.ContainerSpecPrivileges
- 				withCredentialSpec = com.github.dockerjava.api.model.ContainerSpecPrivilegesCredential
- 					withRegistry = java.lang.String
- 					withFile = java.lang.String
- 				withSeLinuxContext = com.github.dockerjava.api.model.ContainerSpecPrivilegesSELinuxContext
- 					withUser = java.lang.String
- 					withDisable = java.lang.Boolean
- 					withRole = java.lang.String
- 					withLevel = java.lang.String
- 					withType = java.lang.String
- 			withConfigs = java.util.List<com.github.dockerjava.api.model.ContainerSpecConfig>
- 				withFile = com.github.dockerjava.api.model.ContainerSpecFile
- 					withMode = java.lang.Long
- 					withName = java.lang.String
- 					withUid = java.lang.String
- 					withGid = java.lang.String
- 				withConfigID = java.lang.String
- 				withConfigName = java.lang.String
- 		withResources = com.github.dockerjava.api.model.ResourceRequirements
- 			withReservations = com.github.dockerjava.api.model.ResourceSpecs
- 				withMemoryBytes = long
- 				withNanoCPUs = long
- 			withLimits = com.github.dockerjava.api.model.ResourceSpecs
- 				withMemoryBytes = long
- 				withNanoCPUs = long
- 		withPlacement = com.github.dockerjava.api.model.ServicePlacement
- 			withConstraints = java.util.List<java.lang.String>
- 			setPlatforms = java.util.List<com.github.dockerjava.api.model.SwarmNodePlatform>
- 				withOs = java.lang.String
- 				withArchitecture = java.lang.String
- 		withRuntime = java.lang.String
- 		withForceUpdate = java.lang.Integer
- 		withLogDriver = com.github.dockerjava.api.model.Driver
- 			withName = java.lang.String
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 	withMode = com.github.dockerjava.api.model.ServiceModeConfig
- 		withReplicated = com.github.dockerjava.api.model.ServiceReplicatedModeOptions
- 			withReplicas = int
- 		withGlobal = com.github.dockerjava.api.model.ServiceGlobalModeOptions
- 	withUpdateConfig = com.github.dockerjava.api.model.UpdateConfig
- 		withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- 		withMaxFailureRatio = java.lang.Float
- 		withParallelism = long
- 		setDelay = java.lang.Long
- 		withDelay = java.lang.Long
- 		withMonitor = java.lang.Long
- 		withOrder = com.github.dockerjava.api.model.UpdateOrder
- 	withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- 		withAliases = java.util.List<java.lang.String>
- 		withTarget = java.lang.String
- 	withEndpointSpec = com.github.dockerjava.api.model.EndpointSpec
- 		withMode = com.github.dockerjava.api.model.EndpointResolutionMode
- 		withPorts = java.util.List<com.github.dockerjava.api.model.PortConfig>
- 			withName = java.lang.String
- 			withPublishedPort = int
- 			withTargetPort = int
- 			withPublishMode = com.github.dockerjava.api.model.PortConfig$PublishMode
- 			withProtocol = com.github.dockerjava.api.model.PortConfigProtocol
- 	withName = java.lang.String
- 	withLabels = java.util.Map<java.lang.String, java.lang.String>
```
## Docker UpdateService parameters:

```
- withServiceSpec = com.github.dockerjava.api.model.ServiceSpec
- 	withRollbackConfig = com.github.dockerjava.api.model.UpdateConfig
- 		withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- 		withMaxFailureRatio = java.lang.Float
- 		withParallelism = long
- 		setDelay = java.lang.Long
- 		withDelay = java.lang.Long
- 		withMonitor = java.lang.Long
- 		withOrder = com.github.dockerjava.api.model.UpdateOrder
- 	withTaskTemplate = com.github.dockerjava.api.model.TaskSpec
- 		withRestartPolicy = com.github.dockerjava.api.model.ServiceRestartPolicy
- 			withWindow = java.lang.Long
- 			withCondition = com.github.dockerjava.api.model.ServiceRestartCondition
- 			withMaxAttempts = java.lang.Long
- 			withDelay = java.lang.Long
- 		withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- 			withAliases = java.util.List<java.lang.String>
- 			withTarget = java.lang.String
- 		withContainerSpec = com.github.dockerjava.api.model.ContainerSpec
- 			withStopSignal = java.lang.String
- 			withImage = java.lang.String
- 			withTty = java.lang.Boolean
- 			withUser = java.lang.String
- 			withEnv = java.util.List<java.lang.String>
- 			withHostname = java.lang.String
- 			withLabels = java.util.Map<java.lang.String, java.lang.String>
- 			withOpenStdin = java.lang.Boolean
- 			withStopGracePeriod = java.lang.Long
- 			withCommand = java.util.List<java.lang.String>
- 			withArgs = java.util.List<java.lang.String>
- 			withDir = java.lang.String
- 			withGroups = java.lang.String
- 			withMounts = java.util.List<com.github.dockerjava.api.model.Mount>
- 				withVolumeOptions = com.github.dockerjava.api.model.VolumeOptions
- 					withLabels = java.util.Map<java.lang.String, java.lang.String>
- 					withNoCopy = java.lang.Boolean
- 					withDriverConfig = com.github.dockerjava.api.model.Driver
- 						withName = java.lang.String
- 						withOptions = java.util.Map<java.lang.String, java.lang.String>
- 				withReadOnly = java.lang.Boolean
- 				withTarget = java.lang.String
- 				withType = com.github.dockerjava.api.model.MountType
- 				withSource = java.lang.String
- 				withBindOptions = com.github.dockerjava.api.model.BindOptions
- 					withPropagation = com.github.dockerjava.api.model.BindPropagation
- 			withDuration = java.lang.Long
- 			withDnsConfig = com.github.dockerjava.api.model.ContainerDNSConfig
- 				withOptions = java.util.List<java.lang.String>
- 				withNameservers = java.util.List<java.lang.String>
- 				withSearch = java.util.List<java.lang.String>
- 			withReadOnly = java.lang.Boolean
- 			withHosts = java.util.List<java.lang.String>
- 			withSecrets = java.util.List<com.github.dockerjava.api.model.ContainerSpecSecret>
- 				withFile = com.github.dockerjava.api.model.ContainerSpecFile
- 					withMode = java.lang.Long
- 					withName = java.lang.String
- 					withUid = java.lang.String
- 					withGid = java.lang.String
- 				withSecretId = java.lang.String
- 				withSecretName = java.lang.String
- 			withHealthCheck = com.github.dockerjava.api.model.HealthCheck
- 				withTimeout = java.lang.Long
- 				withInterval = java.lang.Long
- 				withTest = java.util.List<java.lang.String>
- 				withRetries = java.lang.Long
- 				withStartPeriod = java.lang.Long
- 			withPrivileges = com.github.dockerjava.api.model.ContainerSpecPrivileges
- 				withCredentialSpec = com.github.dockerjava.api.model.ContainerSpecPrivilegesCredential
- 					withRegistry = java.lang.String
- 					withFile = java.lang.String
- 				withSeLinuxContext = com.github.dockerjava.api.model.ContainerSpecPrivilegesSELinuxContext
- 					withUser = java.lang.String
- 					withDisable = java.lang.Boolean
- 					withRole = java.lang.String
- 					withLevel = java.lang.String
- 					withType = java.lang.String
- 			withConfigs = java.util.List<com.github.dockerjava.api.model.ContainerSpecConfig>
- 				withFile = com.github.dockerjava.api.model.ContainerSpecFile
- 					withMode = java.lang.Long
- 					withName = java.lang.String
- 					withUid = java.lang.String
- 					withGid = java.lang.String
- 				withConfigID = java.lang.String
- 				withConfigName = java.lang.String
- 		withResources = com.github.dockerjava.api.model.ResourceRequirements
- 			withReservations = com.github.dockerjava.api.model.ResourceSpecs
- 				withMemoryBytes = long
- 				withNanoCPUs = long
- 			withLimits = com.github.dockerjava.api.model.ResourceSpecs
- 				withMemoryBytes = long
- 				withNanoCPUs = long
- 		withPlacement = com.github.dockerjava.api.model.ServicePlacement
- 			withConstraints = java.util.List<java.lang.String>
- 			setPlatforms = java.util.List<com.github.dockerjava.api.model.SwarmNodePlatform>
- 				withOs = java.lang.String
- 				withArchitecture = java.lang.String
- 		withRuntime = java.lang.String
- 		withForceUpdate = java.lang.Integer
- 		withLogDriver = com.github.dockerjava.api.model.Driver
- 			withName = java.lang.String
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 	withMode = com.github.dockerjava.api.model.ServiceModeConfig
- 		withReplicated = com.github.dockerjava.api.model.ServiceReplicatedModeOptions
- 			withReplicas = int
- 		withGlobal = com.github.dockerjava.api.model.ServiceGlobalModeOptions
- 	withUpdateConfig = com.github.dockerjava.api.model.UpdateConfig
- 		withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- 		withMaxFailureRatio = java.lang.Float
- 		withParallelism = long
- 		setDelay = java.lang.Long
- 		withDelay = java.lang.Long
- 		withMonitor = java.lang.Long
- 		withOrder = com.github.dockerjava.api.model.UpdateOrder
- 	withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- 		withAliases = java.util.List<java.lang.String>
- 		withTarget = java.lang.String
- 	withEndpointSpec = com.github.dockerjava.api.model.EndpointSpec
- 		withMode = com.github.dockerjava.api.model.EndpointResolutionMode
- 		withPorts = java.util.List<com.github.dockerjava.api.model.PortConfig>
- 			withName = java.lang.String
- 			withPublishedPort = int
- 			withTargetPort = int
- 			withPublishMode = com.github.dockerjava.api.model.PortConfig$PublishMode
- 			withProtocol = com.github.dockerjava.api.model.PortConfigProtocol
- 	withName = java.lang.String
- 	withLabels = java.util.Map<java.lang.String, java.lang.String>
- withServiceId = java.lang.String
- withVersion = java.lang.Long
```
## Docker CopyArchiveToContainer parameters:

```
- withNoOverwriteDirNonDir = boolean
- withDirChildrenOnly = boolean
- withHostResource = java.lang.String
- withRemotePath = java.lang.String
- withTarInputStream = java.io.InputStream
- withContainerId = java.lang.String
```
## Docker Ping parameters:

```
```
## Docker Stats parameters:

```
- withContainerId = java.lang.String
```
## Docker ExecStart parameters:

```
- withTty = java.lang.Boolean
- withDetach = java.lang.Boolean
- withExecId = java.lang.String
- withStdIn = java.io.InputStream
```
## Docker LeaveSwarm parameters:

```
- withForceEnabled = java.lang.Boolean
```
## Docker TopContainer parameters:

```
- withContainerId = java.lang.String
- withPsArgs = java.lang.String
```
## Docker StopContainer parameters:

```
- withContainerId = java.lang.String
- withTimeout = java.lang.Integer
```
## Docker ListNetworks parameters:

```
- withIdFilter = java.lang.String[]
- withNameFilter = java.lang.String[]
```
## Docker RemoveContainer parameters:

```
- withRemoveVolumes = java.lang.Boolean
- withForce = java.lang.Boolean
- withContainerId = java.lang.String
```
## Docker ListImages parameters:

```
- withImageNameFilter = java.lang.String
- withDanglingFilter = java.lang.Boolean
- withLabelFilter = java.util.Map<java.lang.String, java.lang.String>
- withShowAll = java.lang.Boolean
```
## Docker ListVolumes parameters:

```
- withDanglingFilter = java.lang.Boolean
```
## Docker ContainerDiff parameters:

```
- withContainerId = java.lang.String
```
## Docker RemoveService parameters:

```
- withServiceId = java.lang.String
```
## Docker Events parameters:

```
- withContainerFilter = java.lang.String[]
- withLabelFilter = java.util.Map<java.lang.String, java.lang.String>
- withSince = java.lang.String
- withEventFilter = java.lang.String[]
- withImageFilter = java.lang.String[]
- withUntil = java.lang.String
```
## Docker CreateImage parameters:

```
- withTag = java.lang.String
- withImageStream = java.io.InputStream
- withRepository = java.lang.String
```
## Docker LogContainer parameters:

```
- withContainerId = java.lang.String
- withFollowStream = java.lang.Boolean
- withTimestamps = java.lang.Boolean
- withStdOut = java.lang.Boolean
- withStdErr = java.lang.Boolean
- withTail = java.lang.Integer
- withSince = java.lang.Integer
```
## Docker ConnectToNetwork parameters:

```
- withContainerNetwork = com.github.dockerjava.api.model.ContainerNetwork
- 	withAliases = java.util.List<java.lang.String>
- 	withIpv4Address = java.lang.String
- 	withLinks = com.github.dockerjava.api.model.Link[]
- 	withMacAddress = java.lang.String
- 	withIpamConfig = com.github.dockerjava.api.model.ContainerNetwork$Ipam
- 		withIpv4Address = java.lang.String
- 		withIpv6Address = java.lang.String
- 	withGlobalIPv6Address = java.lang.String
- 	withGlobalIPv6PrefixLen = java.lang.Integer
- 	withEndpointId = java.lang.String
- 	withIpPrefixLen = java.lang.Integer
- 	withIpV6Gateway = java.lang.String
- 	withNetworkID = java.lang.String
- 	withGateway = java.lang.String
- withContainerId = java.lang.String
- withNetworkId = java.lang.String
```
## Docker DisconnectFromNetwork parameters:

```
- withForce = java.lang.Boolean
- withContainerId = java.lang.String
- withNetworkId = java.lang.String
```
## Docker Info parameters:

```
```
## Docker CopyArchiveFromContainer parameters:

```
- withHostPath = java.lang.String
- withResource = java.lang.String
- withContainerId = java.lang.String
```
## Docker UpdateSwarmNode parameters:

```
- withSwarmNodeSpec = com.github.dockerjava.api.model.SwarmNodeSpec
- 	withName = java.lang.String
- 	withLabels = java.util.Map<java.lang.String, java.lang.String>
- 	withRole = com.github.dockerjava.api.model.SwarmNodeRole
- 	withAvailability = com.github.dockerjava.api.model.SwarmNodeAvailability
- withSwarmNodeId = java.lang.String
- withVersion = java.lang.Long
```
## Docker RenameContainer parameters:

```
- withName = java.lang.String
- withContainerId = java.lang.String
```
## Docker Commit parameters:

```
- withTag = java.lang.String
- withDisableNetwork = java.lang.Boolean
- withRepository = java.lang.String
- withAttachStderr = java.lang.Boolean
- withAttachStdin = java.lang.Boolean
- withAttachStdout = java.lang.Boolean
- withCmd = java.util.List<java.lang.String>
- withContainerId = java.lang.String
- withTty = java.lang.Boolean
- withUser = java.lang.String
- withAuthor = java.lang.String
- withEnv = java.util.List<java.lang.String>
- withExposedPorts = com.github.dockerjava.api.model.ExposedPorts
- 	setExposedPorts = com.github.dockerjava.api.model.ExposedPort[]
- withHostname = java.lang.String
- withLabels = java.util.Map
- withMemory = java.lang.Integer
- withMemorySwap = java.lang.Integer
- withMessage = java.lang.String
- withOpenStdin = java.lang.Boolean
- withPause = java.lang.Boolean
- withPortSpecs = java.util.List
- withStdinOnce = java.lang.Boolean
- withVolumes = com.github.dockerjava.api.model.Volumes
- 	setVolumes = com.github.dockerjava.api.model.Volume[]
- withWorkingDir = java.lang.String
```
## Docker InspectExec parameters:

```
- withExecId = java.lang.String
```
## Docker StartContainer parameters:

```
- withContainerId = java.lang.String
```
## Docker UpdateContainer parameters:

```
- withMemoryReservation = java.lang.Long
- withBlkioWeight = java.lang.Integer
- withCpuPeriod = java.lang.Integer
- withCpusetCpus = java.lang.String
- withCpusetMems = java.lang.String
- withCpuShares = java.lang.Integer
- withCpuQuota = java.lang.Integer
- withKernelMemory = java.lang.Long
- withContainerId = java.lang.String
- withMemory = java.lang.Long
- withMemorySwap = java.lang.Long
```
## Docker InitializeSwarm parameters:

```
- withForceNewCluster = java.lang.Boolean
- withAdvertiseAddr = java.lang.String
- withListenAddr = java.lang.String
- withSwarmSpec = com.github.dockerjava.api.model.SwarmSpec
- 	withOrchestration = com.github.dockerjava.api.model.SwarmOrchestration
- 		withTaskHistoryRententionLimit = int
- 	withDispatcher = com.github.dockerjava.api.model.SwarmDispatcherConfig
- 		withHeartbeatPeriod = java.lang.Long
- 	withCaConfig = com.github.dockerjava.api.model.SwarmCAConfig
- 		withNodeCertExpiry = java.lang.Long
- 		withExternalCA = java.util.List<com.github.dockerjava.api.model.ExternalCA>
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 			withProtocol = com.github.dockerjava.api.model.ExternalCAProtocol
- 			withUrl = java.lang.String
- 	withRaft = com.github.dockerjava.api.model.SwarmRaftConfig
- 		withLogEntriesForSlowFollowers = long
- 		withHeartbeatTick = int
- 		withSnapshotInterval = long
- 		withElectionTick = int
- 	withTaskDefaults = com.github.dockerjava.api.model.TaskDefaults
- 		withLogDriver = com.github.dockerjava.api.model.Driver
- 			withName = java.lang.String
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 	withName = java.lang.String
```
## Docker LoadImage parameters:

```
- withImageStream = java.io.InputStream
```
## Docker CreateContainer parameters:

```
- withAuthConfig = com.github.dockerjava.api.model.AuthConfig
- 	withUsername = java.lang.String
- 	withPassword = java.lang.String
- 	withEmail = java.lang.String
- 	withRegistryAddress = java.lang.String
- 	withRegistrytoken = java.lang.String
- 	withAuth = java.lang.String
- withContainerIDFile = java.lang.String
- withNetworkDisabled = java.lang.Boolean
- withOomKillDisable = java.lang.Boolean
- withPublishAllPorts = java.lang.Boolean
- withReadonlyRootfs = java.lang.Boolean
- withRestartPolicy = com.github.dockerjava.api.model.RestartPolicy
- withAliases = java.util.List<java.lang.String>
- withBinds = java.util.List<com.github.dockerjava.api.model.Bind>
- withBlkioWeight = java.lang.Integer
- withCapAdd = java.util.List<com.github.dockerjava.api.model.Capability>
- withCapDrop = java.util.List<com.github.dockerjava.api.model.Capability>
- withCpuPeriod = java.lang.Integer
- withCpusetCpus = java.lang.String
- withCpusetMems = java.lang.String
- withCpuShares = java.lang.Integer
- withDevices = java.util.List<com.github.dockerjava.api.model.Device>
- 	setPathOnHost = java.lang.String
- 	setcGroupPermissions = java.lang.String
- 	setPathInContainer = java.lang.String
- withDns = java.util.List<java.lang.String>
- withDnsSearch = java.util.List<java.lang.String>
- withDomainName = java.lang.String
- withEntrypoint = java.util.List<java.lang.String>
- withStopSignal = java.lang.String
- withExtraHosts = java.util.List<java.lang.String>
- withHostName = java.lang.String
- withImage = java.lang.String
- withIpv4Address = java.lang.String
- withIpv6Address = java.lang.String
- withLinks = java.util.List<com.github.dockerjava.api.model.Link>
- withLogConfig = com.github.dockerjava.api.model.LogConfig
- 	setType = com.github.dockerjava.api.model.LogConfig$LoggingType
- 	setConfig = java.util.Map<java.lang.String, java.lang.String>
- withLxcConf = java.util.List<com.github.dockerjava.api.model.LxcConf>
- 	setValue = java.lang.String
- 	setKey = java.lang.String
- withMacAddress = java.lang.String
- withNetworkMode = java.lang.String
- withPortBindings = java.util.List<com.github.dockerjava.api.model.PortBinding>
- 	setPorts = java.util.Map<com.github.dockerjava.api.model.ExposedPort, com.github.dockerjava.api.model.Ports$Binding[]>
- 	setBinding = com.github.dockerjava.api.model.Ports$Binding
- 		setHostIp = java.lang.String
- 		setHostPortSpec = java.lang.String
- 	setExposedPort = com.github.dockerjava.api.model.ExposedPort
- 		setProtocol = com.github.dockerjava.api.model.InternetProtocol
- 		setPort = int
- withPrivileged = java.lang.Boolean
- withStdInOnce = java.lang.Boolean
- withStdinOpen = java.lang.Boolean
- withUlimits = java.util.List<com.github.dockerjava.api.model.Ulimit>
- withVolumesFrom = java.util.List<com.github.dockerjava.api.model.VolumesFrom>
- 	setContainer = java.lang.String
- 	setAccessMode = com.github.dockerjava.api.model.AccessMode
- withCgroupParent = java.lang.String
- withPidMode = java.lang.String
- withHostConfig = com.github.dockerjava.api.model.HostConfig
- 	withContainerIDFile = java.lang.String
- 	withOomKillDisable = java.lang.Boolean
- 	withPublishAllPorts = java.lang.Boolean
- 	withReadonlyRootfs = java.lang.Boolean
- 	withRestartPolicy = com.github.dockerjava.api.model.RestartPolicy
- 	withMemoryReservation = java.lang.Long
- 	withBinds = com.github.dockerjava.api.model.Binds
- 	withBlkioWeight = java.lang.Integer
- 	withCapAdd = com.github.dockerjava.api.model.Capability[]
- 	withCapDrop = com.github.dockerjava.api.model.Capability[]
- 	withCpuPeriod = java.lang.Integer
- 	withCpusetCpus = java.lang.String
- 	withCpusetMems = java.lang.String
- 	withCpuShares = java.lang.Integer
- 	withDevices = com.github.dockerjava.api.model.Device[]
- 	withDns = java.lang.String[]
- 	withDnsSearch = java.lang.String[]
- 	withExtraHosts = java.lang.String[]
- 	withLinks = com.github.dockerjava.api.model.Links
- 	withLogConfig = com.github.dockerjava.api.model.LogConfig
- 		setType = com.github.dockerjava.api.model.LogConfig$LoggingType
- 		setConfig = java.util.Map<java.lang.String, java.lang.String>
- 	withLxcConf = com.github.dockerjava.api.model.LxcConf[]
- 	withNetworkMode = java.lang.String
- 	withPortBindings = com.github.dockerjava.api.model.Ports
- 		setPorts = java.util.Map<com.github.dockerjava.api.model.ExposedPort, com.github.dockerjava.api.model.Ports$Binding[]>
- 	withPrivileged = java.lang.Boolean
- 	withUlimits = com.github.dockerjava.api.model.Ulimit[]
- 	withVolumesFrom = com.github.dockerjava.api.model.VolumesFrom[]
- 	withCgroupParent = java.lang.String
- 	withPidMode = java.lang.String
- 	withCpuQuota = java.lang.Integer
- 	withKernelMemory = java.lang.Long
- 	withMemory = java.lang.Long
- 	withMemorySwap = java.lang.Long
- 	withRuntime = java.lang.String
- 	withOomScoreAdj = java.lang.Boolean
- 	withSecurityOpts = java.util.List<java.lang.String>
- 	withShmSize = java.lang.Long
- 	withVolumeDriver = java.lang.String
- 	withPidsLimit = java.lang.Long
- 	withTmpFs = java.util.Map<java.lang.String, java.lang.String>
- 	setBinds = com.github.dockerjava.api.model.Bind[]
- 	setLinks = com.github.dockerjava.api.model.Link[]
- 	withBlkioDeviceReadBps = java.util.List<java.lang.Object>
- 	withBlkioDeviceReadIOps = java.util.List<java.lang.Object>
- 	withBlkioDeviceWriteBps = java.util.List<java.lang.Object>
- 	withBlkioDeviceWriteIOps = java.util.List<java.lang.Object>
- 	withBlkioWeightDevice = java.util.List<java.lang.Object>
- 	withMemorySwappiness = java.lang.Integer
- withName = java.lang.String
- withAttachStderr = java.lang.Boolean
- withAttachStdin = java.lang.Boolean
- withAttachStdout = java.lang.Boolean
- withCmd = java.util.List<java.lang.String>
- withTty = java.lang.Boolean
- withUser = java.lang.String
- withEnv = java.util.List<java.lang.String>
- withExposedPorts = java.util.List<com.github.dockerjava.api.model.ExposedPort>
- 	setProtocol = com.github.dockerjava.api.model.InternetProtocol
- 	setPort = int
- withLabels = java.util.Map<java.lang.String, java.lang.String>
- withMemory = java.lang.Long
- withMemorySwap = java.lang.Long
- withPortSpecs = java.util.List<java.lang.String>
- withVolumes = java.util.List<com.github.dockerjava.api.model.Volume>
- withWorkingDir = java.lang.String
```
## Docker InspectContainer parameters:

```
- withSize = java.lang.Boolean
- withContainerId = java.lang.String
```
## Docker CreateVolume parameters:

```
- withName = java.lang.String
- withDriver = java.lang.String
- withDriverOpts = java.util.Map<java.lang.String, java.lang.String>
```
## Docker InspectService parameters:

```
- withServiceId = java.lang.String
```
## Docker RestartContainer parameters:

```
- withtTimeout = java.lang.Integer
- withContainerId = java.lang.String
```
