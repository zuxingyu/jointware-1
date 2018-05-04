## Docker AttachContainer parameters:

```
- withContainerId = java.lang.String
- withLogs = java.lang.Boolean
- withStdIn = java.io.InputStream
- withFollowStream = java.lang.Boolean
- withTimestamps = java.lang.Boolean
- withStdOut = java.lang.Boolean
- withStdErr = java.lang.Boolean
```
## Docker ExecCreate parameters:

```
- withContainerId = java.lang.String
- withAttachStderr = java.lang.Boolean
- withAttachStdin = java.lang.Boolean
- withAttachStdout = java.lang.Boolean
- withCmd = java.lang.String[]
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
- 	withAuth = java.lang.String
- 	withRegistrytoken = java.lang.String
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
## Docker ListSwarmNodes parameters:

```
- withNameFilter = java.util.List<java.lang.String>
- withIdFilter = java.util.List<java.lang.String>
- withRoleFilter = java.util.List<java.lang.String>
- withMembershipFilter = java.util.List<java.lang.String>
```
## Docker ListContainers parameters:

```
- withLabelFilter = java.util.Collection<java.lang.String>
- withSince = java.lang.String
- withNameFilter = java.util.Collection<java.lang.String>
- withIdFilter = java.util.Collection<java.lang.String>
- withAncestorFilter = java.util.Collection<java.lang.String>
- withNetworkFilter = java.util.Collection<java.lang.String>
- withBefore = java.lang.String
- withVolumeFilter = java.util.Collection<java.lang.String>
- withExitedFilter = java.lang.Integer
- withStatusFilter = java.util.Collection<java.lang.String>
- withLimit = java.lang.Integer
- withShowSize = java.lang.Boolean
- withShowAll = java.lang.Boolean
```
## Docker InspectSwarm parameters:

```
```
## Docker CreateNetwork parameters:

```
- withName = java.lang.String
- withDriver = java.lang.String
- withIpam = com.github.dockerjava.api.model.Network$Ipam
- 	withDriver = java.lang.String
- 	withConfig = com.github.dockerjava.api.model.Network$Ipam$Config[]
- 		withSubnet = java.lang.String
- 		withIpRange = java.lang.String
- 		withGateway = java.lang.String
- 		setNetworkID = java.lang.String
```
## Docker Version parameters:

```
```
## Docker JoinSwarm parameters:

```
- withListenAddr = java.lang.String
- withRemoteAddrs = java.util.List<java.lang.String>
- withJoinToken = java.lang.String
- withAdvertiseAddr = java.lang.String
```
## Docker UnpauseContainer parameters:

```
- withContainerId = java.lang.String
```
## Docker CopyFileFromContainer parameters:

```
- withContainerId = java.lang.String
- withHostPath = java.lang.String
- withResource = java.lang.String
```
## Docker TagImage parameters:

```
- withTag = java.lang.String
- withForce = java.lang.Boolean
- withRepository = java.lang.String
- withImageId = java.lang.String
```
## Docker RemoveVolume parameters:

```
- withName = java.lang.String
```
## Docker UpdateSwarm parameters:

```
- withVersion = java.lang.Long
- withSwarmSpec = com.github.dockerjava.api.model.SwarmSpec
- 	withName = java.lang.String
- 	withDispatcher = com.github.dockerjava.api.model.SwarmDispatcherConfig
- 		withHeartbeatPeriod = java.lang.Long
- 	withCaConfig = com.github.dockerjava.api.model.SwarmCAConfig
- 		withExternalCA = java.util.List<com.github.dockerjava.api.model.ExternalCA>
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 			withProtocol = com.github.dockerjava.api.model.ExternalCAProtocol
- 			withUrl = java.lang.String
- 		withNodeCertExpiry = java.lang.Long
- 	withRaft = com.github.dockerjava.api.model.SwarmRaftConfig
- 		withElectionTick = int
- 		withLogEntriesForSlowFollowers = long
- 		withHeartbeatTick = int
- 		withSnapshotInterval = long
- 	withTaskDefaults = com.github.dockerjava.api.model.TaskDefaults
- 		withLogDriver = com.github.dockerjava.api.model.Driver
- 			withName = java.lang.String
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 	withOrchestration = com.github.dockerjava.api.model.SwarmOrchestration
- 		withTaskHistoryRententionLimit = int
- withRotateWorkerToken = java.lang.Boolean
- withRotateManagerToken = java.lang.Boolean
```
## Docker SearchImages parameters:

```
- withTerm = java.lang.String
```
## Docker InspectImage parameters:

```
- withImageId = java.lang.String
```
## Docker BuildImage parameters:

```
- withTag = java.lang.String
- withLabels = java.util.Map<java.lang.String, java.lang.String>
- withBaseDirectory = java.io.File
- 	setExecutable = boolean
- 	setLastModified = long
- 	setReadable = boolean
- 	setWritable = boolean
- withDockerfilePath = java.lang.String
- withBuildAuthConfigs = com.github.dockerjava.api.model.AuthConfigurations
- 	addConfig = com.github.dockerjava.api.model.AuthConfig
- 		withUsername = java.lang.String
- 		withPassword = java.lang.String
- 		withEmail = java.lang.String
- 		withRegistryAddress = java.lang.String
- 		withAuth = java.lang.String
- 		withRegistrytoken = java.lang.String
- withTarInputStream = java.io.InputStream
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
- withMemory = java.lang.Long
```
## Docker ListServices parameters:

```
- withLabelFilter = java.util.Map<java.lang.String, java.lang.String>
- withNameFilter = java.util.List<java.lang.String>
- withIdFilter = java.util.List<java.lang.String>
```
## Docker RemoveImage parameters:

```
- withForce = java.lang.Boolean
- withImageId = java.lang.String
- withNoPrune = java.lang.Boolean
```
## Docker InspectVolume parameters:

```
- withName = java.lang.String
```
## Docker RemoveNetwork parameters:

```
- withNetworkId = java.lang.String
```
## Docker ListTasks parameters:

```
- withLabelFilter = java.lang.String[]
```
## Docker PushImage parameters:

```
- withTag = java.lang.String
- withAuthConfig = com.github.dockerjava.api.model.AuthConfig
- 	withUsername = java.lang.String
- 	withPassword = java.lang.String
- 	withEmail = java.lang.String
- 	withRegistryAddress = java.lang.String
- 	withAuth = java.lang.String
- 	withRegistrytoken = java.lang.String
- withName = java.lang.String
```
## Docker WaitContainer parameters:

```
- withContainerId = java.lang.String
```
## Docker CreateService parameters:

```
- withServiceSpec = com.github.dockerjava.api.model.ServiceSpec
- 	withName = java.lang.String
- 	withLabels = java.util.Map<java.lang.String, java.lang.String>
- 	withRollbackConfig = com.github.dockerjava.api.model.UpdateConfig
- 		withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- 		withMaxFailureRatio = java.lang.Float
- 		withParallelism = long
- 		setDelay = java.lang.Long
- 		withDelay = java.lang.Long
- 		withMonitor = java.lang.Long
- 		withOrder = com.github.dockerjava.api.model.UpdateOrder
- 	withTaskTemplate = com.github.dockerjava.api.model.TaskSpec
- 		withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- 			withAliases = java.util.List<java.lang.String>
- 			withTarget = java.lang.String
- 		withLogDriver = com.github.dockerjava.api.model.Driver
- 			withName = java.lang.String
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 		withRestartPolicy = com.github.dockerjava.api.model.ServiceRestartPolicy
- 			withDelay = java.lang.Long
- 			withCondition = com.github.dockerjava.api.model.ServiceRestartCondition
- 			withMaxAttempts = java.lang.Long
- 			withWindow = java.lang.Long
- 		withContainerSpec = com.github.dockerjava.api.model.ContainerSpec
- 			withLabels = java.util.Map<java.lang.String, java.lang.String>
- 			withStopSignal = java.lang.String
- 			withImage = java.lang.String
- 			withTty = java.lang.Boolean
- 			withUser = java.lang.String
- 			withEnv = java.util.List<java.lang.String>
- 			withHostname = java.lang.String
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
- 					withName = java.lang.String
- 					withMode = java.lang.Long
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
- 					withName = java.lang.String
- 					withMode = java.lang.Long
- 					withUid = java.lang.String
- 					withGid = java.lang.String
- 				withConfigID = java.lang.String
- 				withConfigName = java.lang.String
- 		withResources = com.github.dockerjava.api.model.ResourceRequirements
- 			withLimits = com.github.dockerjava.api.model.ResourceSpecs
- 				withMemoryBytes = long
- 				withNanoCPUs = long
- 			withReservations = com.github.dockerjava.api.model.ResourceSpecs
- 				withMemoryBytes = long
- 				withNanoCPUs = long
- 		withPlacement = com.github.dockerjava.api.model.ServicePlacement
- 			withConstraints = java.util.List<java.lang.String>
- 			setPlatforms = java.util.List<com.github.dockerjava.api.model.SwarmNodePlatform>
- 				withOs = java.lang.String
- 				withArchitecture = java.lang.String
- 		withRuntime = java.lang.String
- 		withForceUpdate = java.lang.Integer
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
- 			withProtocol = com.github.dockerjava.api.model.PortConfigProtocol
- 			withTargetPort = int
- 			withPublishMode = com.github.dockerjava.api.model.PortConfig$PublishMode
- 			withPublishedPort = int
```
## Docker UpdateService parameters:

```
- withVersion = java.lang.Long
- withServiceSpec = com.github.dockerjava.api.model.ServiceSpec
- 	withName = java.lang.String
- 	withLabels = java.util.Map<java.lang.String, java.lang.String>
- 	withRollbackConfig = com.github.dockerjava.api.model.UpdateConfig
- 		withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- 		withMaxFailureRatio = java.lang.Float
- 		withParallelism = long
- 		setDelay = java.lang.Long
- 		withDelay = java.lang.Long
- 		withMonitor = java.lang.Long
- 		withOrder = com.github.dockerjava.api.model.UpdateOrder
- 	withTaskTemplate = com.github.dockerjava.api.model.TaskSpec
- 		withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- 			withAliases = java.util.List<java.lang.String>
- 			withTarget = java.lang.String
- 		withLogDriver = com.github.dockerjava.api.model.Driver
- 			withName = java.lang.String
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 		withRestartPolicy = com.github.dockerjava.api.model.ServiceRestartPolicy
- 			withDelay = java.lang.Long
- 			withCondition = com.github.dockerjava.api.model.ServiceRestartCondition
- 			withMaxAttempts = java.lang.Long
- 			withWindow = java.lang.Long
- 		withContainerSpec = com.github.dockerjava.api.model.ContainerSpec
- 			withLabels = java.util.Map<java.lang.String, java.lang.String>
- 			withStopSignal = java.lang.String
- 			withImage = java.lang.String
- 			withTty = java.lang.Boolean
- 			withUser = java.lang.String
- 			withEnv = java.util.List<java.lang.String>
- 			withHostname = java.lang.String
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
- 					withName = java.lang.String
- 					withMode = java.lang.Long
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
- 					withName = java.lang.String
- 					withMode = java.lang.Long
- 					withUid = java.lang.String
- 					withGid = java.lang.String
- 				withConfigID = java.lang.String
- 				withConfigName = java.lang.String
- 		withResources = com.github.dockerjava.api.model.ResourceRequirements
- 			withLimits = com.github.dockerjava.api.model.ResourceSpecs
- 				withMemoryBytes = long
- 				withNanoCPUs = long
- 			withReservations = com.github.dockerjava.api.model.ResourceSpecs
- 				withMemoryBytes = long
- 				withNanoCPUs = long
- 		withPlacement = com.github.dockerjava.api.model.ServicePlacement
- 			withConstraints = java.util.List<java.lang.String>
- 			setPlatforms = java.util.List<com.github.dockerjava.api.model.SwarmNodePlatform>
- 				withOs = java.lang.String
- 				withArchitecture = java.lang.String
- 		withRuntime = java.lang.String
- 		withForceUpdate = java.lang.Integer
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
- 			withProtocol = com.github.dockerjava.api.model.PortConfigProtocol
- 			withTargetPort = int
- 			withPublishMode = com.github.dockerjava.api.model.PortConfig$PublishMode
- 			withPublishedPort = int
- withServiceId = java.lang.String
```
## Docker CopyArchiveToContainer parameters:

```
- withContainerId = java.lang.String
- withHostResource = java.lang.String
- withRemotePath = java.lang.String
- withTarInputStream = java.io.InputStream
- withNoOverwriteDirNonDir = boolean
- withDirChildrenOnly = boolean
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
- withNameFilter = java.lang.String[]
```
## Docker RemoveContainer parameters:

```
- withContainerId = java.lang.String
- withForce = java.lang.Boolean
- withRemoveVolumes = java.lang.Boolean
```
## Docker ListVolumes parameters:

```
- withDanglingFilter = java.lang.Boolean
```
## Docker ListImages parameters:

```
- withLabelFilter = java.lang.String[]
```
## Docker ContainerDiff parameters:

```
- withContainerId = java.lang.String
```
## Docker Events parameters:

```
- withEventFilter = java.lang.String[]
```
## Docker RemoveService parameters:

```
- withServiceId = java.lang.String
```
## Docker Auth parameters:

```
- withUsername = java.lang.String
- withPassword = java.lang.String
- withEmail = java.lang.String
- withRegistryAddress = java.lang.String
- withAuth = java.lang.String
- withRegistrytoken = java.lang.String
```
## Docker CreateImage parameters:

```
- withTag = java.lang.String
- withRepository = java.lang.String
- withImageStream = java.io.InputStream
```
## Docker LogContainer parameters:

```
- withSince = java.lang.Integer
- withContainerId = java.lang.String
- withFollowStream = java.lang.Boolean
- withTimestamps = java.lang.Boolean
- withStdOut = java.lang.Boolean
- withStdErr = java.lang.Boolean
- withTail = java.lang.Integer
```
## Docker ConnectToNetwork parameters:

```
- withContainerId = java.lang.String
- withNetworkId = java.lang.String
- withContainerNetwork = com.github.dockerjava.api.model.ContainerNetwork
- 	withAliases = java.lang.String[]
```
## Docker InspectNetwork parameters:

```
- withNetworkId = java.lang.String
```
## Docker DisconnectFromNetwork parameters:

```
- withContainerId = java.lang.String
- withNetworkId = java.lang.String
- withForce = java.lang.Boolean
```
## Docker Info parameters:

```
```
## Docker CopyArchiveFromContainer parameters:

```
- withContainerId = java.lang.String
- withHostPath = java.lang.String
- withResource = java.lang.String
```
## Docker UpdateSwarmNode parameters:

```
- withVersion = java.lang.Long
- withSwarmNodeId = java.lang.String
- withSwarmNodeSpec = com.github.dockerjava.api.model.SwarmNodeSpec
- 	withName = java.lang.String
- 	withLabels = java.util.Map<java.lang.String, java.lang.String>
- 	withRole = com.github.dockerjava.api.model.SwarmNodeRole
- 	withAvailability = com.github.dockerjava.api.model.SwarmNodeAvailability
```
## Docker RenameContainer parameters:

```
- withContainerId = java.lang.String
- withName = java.lang.String
```
## Docker Commit parameters:

```
- withTag = java.lang.String
- withContainerId = java.lang.String
- withLabels = java.util.Map<java.lang.String, java.lang.String>
- withRepository = java.lang.String
- withDisableNetwork = java.lang.Boolean
- withAttachStderr = java.lang.Boolean
- withAttachStdin = java.lang.Boolean
- withAttachStdout = java.lang.Boolean
- withCmd = java.lang.String[]
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
- withContainerId = java.lang.String
- withKernelMemory = java.lang.Long
- withMemoryReservation = java.lang.Long
- withBlkioWeight = java.lang.Integer
- withCpuPeriod = java.lang.Integer
- withCpusetCpus = java.lang.String
- withCpusetMems = java.lang.String
- withCpuShares = java.lang.Integer
- withCpuQuota = java.lang.Integer
- withMemory = java.lang.Long
- withMemorySwap = java.lang.Long
```
## Docker InitializeSwarm parameters:

```
- withListenAddr = java.lang.String
- withSwarmSpec = com.github.dockerjava.api.model.SwarmSpec
- 	withName = java.lang.String
- 	withDispatcher = com.github.dockerjava.api.model.SwarmDispatcherConfig
- 		withHeartbeatPeriod = java.lang.Long
- 	withCaConfig = com.github.dockerjava.api.model.SwarmCAConfig
- 		withExternalCA = java.util.List<com.github.dockerjava.api.model.ExternalCA>
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 			withProtocol = com.github.dockerjava.api.model.ExternalCAProtocol
- 			withUrl = java.lang.String
- 		withNodeCertExpiry = java.lang.Long
- 	withRaft = com.github.dockerjava.api.model.SwarmRaftConfig
- 		withElectionTick = int
- 		withLogEntriesForSlowFollowers = long
- 		withHeartbeatTick = int
- 		withSnapshotInterval = long
- 	withTaskDefaults = com.github.dockerjava.api.model.TaskDefaults
- 		withLogDriver = com.github.dockerjava.api.model.Driver
- 			withName = java.lang.String
- 			withOptions = java.util.Map<java.lang.String, java.lang.String>
- 	withOrchestration = com.github.dockerjava.api.model.SwarmOrchestration
- 		withTaskHistoryRententionLimit = int
- withForceNewCluster = java.lang.Boolean
- withAdvertiseAddr = java.lang.String
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
- 	withAuth = java.lang.String
- 	withRegistrytoken = java.lang.String
- withName = java.lang.String
- withLabels = java.util.Map<java.lang.String, java.lang.String>
- withAliases = java.lang.String[]
```
## Docker InspectContainer parameters:

```
- withContainerId = java.lang.String
- withSize = java.lang.Boolean
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
- withContainerId = java.lang.String
- withtTimeout = java.lang.Integer
```
