## Kubernetes AttachContainer parameters:

```
- withContainerId = java.lang.String
- withFollowStream = java.lang.Boolean
- withTimestamps = java.lang.Boolean
- withStdOut = java.lang.Boolean
- withStdErr = java.lang.Boolean
- withStdIn = java.io.InputStream
- withLogs = java.lang.Boolean
```
## Kubernetes ExecCreate parameters:

```
- withAttachStderr = java.lang.Boolean
- withAttachStdin = java.lang.Boolean
- withAttachStdout = java.lang.Boolean
- withCmd = java.lang.String[]
```
## Kubernetes PauseContainer parameters:

```
- withContainerId = java.lang.String
```
## Kubernetes PullImage parameters:

```
- withTag = java.lang.String
- withAuthConfig = com.github.dockerjava.api.model.AuthConfig
- withAuthConfig-withUsername = java.lang.String
- withAuthConfig-withRegistryAddress = java.lang.String
- withAuthConfig-withPassword = java.lang.String
- withAuthConfig-withEmail = java.lang.String
- withAuthConfig-withRegistrytoken = java.lang.String
- withAuthConfig-withAuth = java.lang.String
- withRepository = java.lang.String
- withRegistry = java.lang.String
```
## Kubernetes KillContainer parameters:

```
- withContainerId = java.lang.String
- withSignal = java.lang.String
```
## Kubernetes SaveImage parameters:

```
- withTag = java.lang.String
- withName = java.lang.String
```
## Kubernetes ListContainers parameters:

```
- withBefore = java.lang.String
- withNameFilter = java.util.Collection<java.lang.String>
- withIdFilter = java.util.Collection<java.lang.String>
- withVolumeFilter = java.util.Collection<java.lang.String>
- withExitedFilter = java.lang.Integer
- withStatusFilter = java.util.Collection<java.lang.String>
- withLabelFilter = java.util.Collection<java.lang.String>
- withLimit = java.lang.Integer
- withShowAll = java.lang.Boolean
- withShowSize = java.lang.Boolean
- withSince = java.lang.String
- withAncestorFilter = java.util.Collection<java.lang.String>
- withNetworkFilter = java.util.Collection<java.lang.String>
```
## Kubernetes ListSwarmNodes parameters:

```
- withNameFilter = java.util.List<java.lang.String>
- withIdFilter = java.util.List<java.lang.String>
- withRoleFilter = java.util.List<java.lang.String>
- withMembershipFilter = java.util.List<java.lang.String>
```
## Kubernetes InspectSwarm parameters:

```
```
## Kubernetes Version parameters:

```
```
## Kubernetes CreateNetwork parameters:

```
- withLabels = java.util.Map<java.lang.String, java.lang.String>
- withName = java.lang.String
- withDriver = java.lang.String
- withIpam = com.github.dockerjava.api.model.Network$Ipam
- withIpam-withDriver = java.lang.String
- withIpam-withConfig = com.github.dockerjava.api.model.Network$Ipam$Config[]
- withIpam-withConfig-withSubnet = java.lang.String
- withIpam-withConfig-withIpRange = java.lang.String
- withIpam-withConfig-withGateway = java.lang.String
- withIpam-withConfig-setNetworkID = java.lang.String
```
## Kubernetes JoinSwarm parameters:

```
- withListenAddr = java.lang.String
- withRemoteAddrs = java.util.List<java.lang.String>
- withJoinToken = java.lang.String
- withAdvertiseAddr = java.lang.String
```
## Kubernetes UnpauseContainer parameters:

```
- withContainerId = java.lang.String
```
## Kubernetes CopyFileFromContainer parameters:

```
- withContainerId = java.lang.String
- withHostPath = java.lang.String
- withResource = java.lang.String
```
## Kubernetes TagImage parameters:

```
- withTag = java.lang.String
- withForce = java.lang.Boolean
- withRepository = java.lang.String
- withImageId = java.lang.String
```
## Kubernetes SearchImages parameters:

```
- withTerm = java.lang.String
```
## Kubernetes RemoveVolume parameters:

```
- withName = java.lang.String
```
## Kubernetes UpdateSwarm parameters:

```
- withVersion = java.lang.Long
- withSwarmSpec = com.github.dockerjava.api.model.SwarmSpec
- withSwarmSpec-withName = java.lang.String
- withSwarmSpec-withOrchestration = com.github.dockerjava.api.model.SwarmOrchestration
- withSwarmSpec-withOrchestration-withTaskHistoryRententionLimit = int
- withSwarmSpec-withDispatcher = com.github.dockerjava.api.model.SwarmDispatcherConfig
- withSwarmSpec-withDispatcher-withHeartbeatPeriod = java.lang.Long
- withSwarmSpec-withCaConfig = com.github.dockerjava.api.model.SwarmCAConfig
- withSwarmSpec-withCaConfig-withExternalCA = java.util.List<com.github.dockerjava.api.model.ExternalCA>
- withSwarmSpec-withCaConfig-withExternalCA-withOptions = java.util.Map<java.lang.String, java.lang.String>
- withSwarmSpec-withCaConfig-withExternalCA-withProtocol = com.github.dockerjava.api.model.ExternalCAProtocol
- withSwarmSpec-withCaConfig-withExternalCA-withUrl = java.lang.String
- withSwarmSpec-withCaConfig-withNodeCertExpiry = java.lang.Long
- withSwarmSpec-withRaft = com.github.dockerjava.api.model.SwarmRaftConfig
- withSwarmSpec-withRaft-withElectionTick = int
- withSwarmSpec-withRaft-withLogEntriesForSlowFollowers = long
- withSwarmSpec-withRaft-withHeartbeatTick = int
- withSwarmSpec-withRaft-withSnapshotInterval = long
- withSwarmSpec-withTaskDefaults = com.github.dockerjava.api.model.TaskDefaults
- withSwarmSpec-withTaskDefaults-withLogDriver = com.github.dockerjava.api.model.Driver
- withSwarmSpec-withTaskDefaults-withLogDriver-withName = java.lang.String
- withSwarmSpec-withTaskDefaults-withLogDriver-withOptions = java.util.Map<java.lang.String, java.lang.String>
- withRotateWorkerToken = java.lang.Boolean
- withRotateManagerToken = java.lang.Boolean
```
## Kubernetes InspectImage parameters:

```
- withImageId = java.lang.String
```
## Kubernetes BuildImage parameters:

```
- withTarInputStream = java.io.InputStream
- withBaseDirectory = java.io.File
- withBaseDirectory-setExecutable = boolean
- withBaseDirectory-setLastModified = long
- withBaseDirectory-setReadable = boolean
- withBaseDirectory-setWritable = boolean
- withDockerfilePath = java.lang.String
- withTag = java.lang.String
- withLabels = java.util.Map<java.lang.String, java.lang.String>
- withMemory = java.lang.Long
- withTags = java.util.Set<java.lang.String>
- withCacheFrom = java.util.Set<java.lang.String>
- withRemote = java.net.URI
- withDockerfile = java.io.File
- withDockerfile-setExecutable = boolean
- withDockerfile-setLastModified = long
- withDockerfile-setReadable = boolean
- withDockerfile-setWritable = boolean
- withNoCache = java.lang.Boolean
- withRemove = java.lang.Boolean
- withForcerm = java.lang.Boolean
- withQuiet = java.lang.Boolean
- withPull = java.lang.Boolean
- withMemswap = java.lang.Long
- withCpushares = java.lang.String
- withCpusetcpus = java.lang.String
- withShmsize = java.lang.Long
- withBuildAuthConfigs = com.github.dockerjava.api.model.AuthConfigurations
- withBuildAuthConfigs-addConfig = com.github.dockerjava.api.model.AuthConfig
- withBuildAuthConfigs-addConfig-withUsername = java.lang.String
- withBuildAuthConfigs-addConfig-withRegistryAddress = java.lang.String
- withBuildAuthConfigs-addConfig-withPassword = java.lang.String
- withBuildAuthConfigs-addConfig-withEmail = java.lang.String
- withBuildAuthConfigs-addConfig-withRegistrytoken = java.lang.String
- withBuildAuthConfigs-addConfig-withAuth = java.lang.String
```
## Kubernetes ListServices parameters:

```
- withNameFilter = java.util.List<java.lang.String>
- withIdFilter = java.util.List<java.lang.String>
- withLabelFilter = java.util.Map<java.lang.String, java.lang.String>
```
## Kubernetes RemoveImage parameters:

```
- withForce = java.lang.Boolean
- withImageId = java.lang.String
- withNoPrune = java.lang.Boolean
```
## Kubernetes InspectVolume parameters:

```
- withName = java.lang.String
```
## Kubernetes RemoveNetwork parameters:

```
- withNetworkId = java.lang.String
```
## Kubernetes ListTasks parameters:

```
- withNameFilter = java.lang.String[]
```
## Kubernetes PushImage parameters:

```
- withTag = java.lang.String
- withAuthConfig = com.github.dockerjava.api.model.AuthConfig
- withAuthConfig-withUsername = java.lang.String
- withAuthConfig-withRegistryAddress = java.lang.String
- withAuthConfig-withPassword = java.lang.String
- withAuthConfig-withEmail = java.lang.String
- withAuthConfig-withRegistrytoken = java.lang.String
- withAuthConfig-withAuth = java.lang.String
- withName = java.lang.String
```
## Kubernetes WaitContainer parameters:

```
- withContainerId = java.lang.String
```
## Kubernetes CreateService parameters:

```
- withServiceSpec = com.github.dockerjava.api.model.ServiceSpec
- withServiceSpec-withLabels = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withName = java.lang.String
- withServiceSpec-withRollbackConfig = com.github.dockerjava.api.model.UpdateConfig
- withServiceSpec-withRollbackConfig-withParallelism = java.lang.Long
- withServiceSpec-withRollbackConfig-setDelay = java.lang.Long
- withServiceSpec-withRollbackConfig-withDelay = java.lang.Long
- withServiceSpec-withRollbackConfig-withMonitor = java.lang.Long
- withServiceSpec-withRollbackConfig-withOrder = com.github.dockerjava.api.model.UpdateOrder
- withServiceSpec-withRollbackConfig-withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- withServiceSpec-withRollbackConfig-withMaxFailureRatio = java.lang.Float
- withServiceSpec-withTaskTemplate = com.github.dockerjava.api.model.TaskSpec
- withServiceSpec-withTaskTemplate-withForceUpdate = java.lang.Integer
- withServiceSpec-withTaskTemplate-withRuntime = java.lang.String
- withServiceSpec-withTaskTemplate-withPlacement = com.github.dockerjava.api.model.ServicePlacement
- withServiceSpec-withTaskTemplate-withPlacement-withConstraints = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withPlacement-setPlatforms = java.util.List<com.github.dockerjava.api.model.SwarmNodePlatform>
- withServiceSpec-withTaskTemplate-withPlacement-setPlatforms-withOs = java.lang.String
- withServiceSpec-withTaskTemplate-withPlacement-setPlatforms-withArchitecture = java.lang.String
- withServiceSpec-withTaskTemplate-withRestartPolicy = com.github.dockerjava.api.model.ServiceRestartPolicy
- withServiceSpec-withTaskTemplate-withRestartPolicy-withDelay = java.lang.Long
- withServiceSpec-withTaskTemplate-withRestartPolicy-withCondition = com.github.dockerjava.api.model.ServiceRestartCondition
- withServiceSpec-withTaskTemplate-withRestartPolicy-withMaxAttempts = java.lang.Long
- withServiceSpec-withTaskTemplate-withRestartPolicy-withWindow = java.lang.Long
- withServiceSpec-withTaskTemplate-withLogDriver = com.github.dockerjava.api.model.Driver
- withServiceSpec-withTaskTemplate-withLogDriver-withName = java.lang.String
- withServiceSpec-withTaskTemplate-withLogDriver-withOptions = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withTaskTemplate-withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- withServiceSpec-withTaskTemplate-withNetworks-withAliases = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withNetworks-withTarget = java.lang.String
- withServiceSpec-withTaskTemplate-withResources = com.github.dockerjava.api.model.ResourceRequirements
- withServiceSpec-withTaskTemplate-withResources-withLimits = com.github.dockerjava.api.model.ResourceSpecs
- withServiceSpec-withTaskTemplate-withResources-withLimits-withMemoryBytes = long
- withServiceSpec-withTaskTemplate-withResources-withLimits-withNanoCPUs = long
- withServiceSpec-withTaskTemplate-withResources-withReservations = com.github.dockerjava.api.model.ResourceSpecs
- withServiceSpec-withTaskTemplate-withResources-withReservations-withMemoryBytes = long
- withServiceSpec-withTaskTemplate-withResources-withReservations-withNanoCPUs = long
- withServiceSpec-withTaskTemplate-withContainerSpec = com.github.dockerjava.api.model.ContainerSpec
- withServiceSpec-withTaskTemplate-withContainerSpec-withEnv = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withStopSignal = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withImage = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withLabels = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withTty = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withUser = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withHostname = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withOpenStdin = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withCommand = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withArgs = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withDir = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withGroups = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts = java.util.List<com.github.dockerjava.api.model.Mount>
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withReadOnly = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withTarget = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withType = com.github.dockerjava.api.model.MountType
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withSource = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withBindOptions = com.github.dockerjava.api.model.BindOptions
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withBindOptions-withPropagation = com.github.dockerjava.api.model.BindPropagation
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions = com.github.dockerjava.api.model.VolumeOptions
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withLabels = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withNoCopy = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withDriverConfig = com.github.dockerjava.api.model.Driver
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withDriverConfig-withName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withDriverConfig-withOptions = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withDuration = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig = com.github.dockerjava.api.model.ContainerDNSConfig
- withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withOptions = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withNameservers = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withSearch = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withReadOnly = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withHosts = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets = java.util.List<com.github.dockerjava.api.model.ContainerSpecSecret>
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile = com.github.dockerjava.api.model.ContainerSpecFile
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile-withName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile-withMode = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile-withUid = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile-withGid = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withSecretId = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withSecretName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck = com.github.dockerjava.api.model.HealthCheck
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTimeout = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withInterval = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTest = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withRetries = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withStartPeriod = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges = com.github.dockerjava.api.model.ContainerSpecPrivileges
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec = com.github.dockerjava.api.model.ContainerSpecPrivilegesCredential
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withRegistry = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withFile = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext = com.github.dockerjava.api.model.ContainerSpecPrivilegesSELinuxContext
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withUser = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withType = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withDisable = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withRole = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withLevel = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs = java.util.List<com.github.dockerjava.api.model.ContainerSpecConfig>
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile = com.github.dockerjava.api.model.ContainerSpecFile
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile-withName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile-withMode = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile-withUid = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile-withGid = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withConfigID = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withConfigName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withStopGracePeriod = java.lang.Long
- withServiceSpec-withMode = com.github.dockerjava.api.model.ServiceModeConfig
- withServiceSpec-withMode-withReplicated = com.github.dockerjava.api.model.ServiceReplicatedModeOptions
- withServiceSpec-withMode-withReplicated-withReplicas = int
- withServiceSpec-withMode-withGlobal = com.github.dockerjava.api.model.ServiceGlobalModeOptions
- withServiceSpec-withUpdateConfig = com.github.dockerjava.api.model.UpdateConfig
- withServiceSpec-withUpdateConfig-withParallelism = java.lang.Long
- withServiceSpec-withUpdateConfig-setDelay = java.lang.Long
- withServiceSpec-withUpdateConfig-withDelay = java.lang.Long
- withServiceSpec-withUpdateConfig-withMonitor = java.lang.Long
- withServiceSpec-withUpdateConfig-withOrder = com.github.dockerjava.api.model.UpdateOrder
- withServiceSpec-withUpdateConfig-withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- withServiceSpec-withUpdateConfig-withMaxFailureRatio = java.lang.Float
- withServiceSpec-withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- withServiceSpec-withNetworks-withAliases = java.util.List<java.lang.String>
- withServiceSpec-withNetworks-withTarget = java.lang.String
- withServiceSpec-withEndpointSpec = com.github.dockerjava.api.model.EndpointSpec
- withServiceSpec-withEndpointSpec-withPorts = java.util.List<com.github.dockerjava.api.model.PortConfig>
- withServiceSpec-withEndpointSpec-withPorts-withName = java.lang.String
- withServiceSpec-withEndpointSpec-withPorts-withProtocol = com.github.dockerjava.api.model.PortConfigProtocol
- withServiceSpec-withEndpointSpec-withPorts-withTargetPort = int
- withServiceSpec-withEndpointSpec-withPorts-withPublishMode = com.github.dockerjava.api.model.PortConfig$PublishMode
- withServiceSpec-withEndpointSpec-withPorts-withPublishedPort = int
- withServiceSpec-withEndpointSpec-withMode = com.github.dockerjava.api.model.EndpointResolutionMode
```
## Kubernetes UpdateService parameters:

```
- withVersion = java.lang.Long
- withServiceSpec = com.github.dockerjava.api.model.ServiceSpec
- withServiceSpec-withLabels = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withName = java.lang.String
- withServiceSpec-withRollbackConfig = com.github.dockerjava.api.model.UpdateConfig
- withServiceSpec-withRollbackConfig-withParallelism = java.lang.Long
- withServiceSpec-withRollbackConfig-setDelay = java.lang.Long
- withServiceSpec-withRollbackConfig-withDelay = java.lang.Long
- withServiceSpec-withRollbackConfig-withMonitor = java.lang.Long
- withServiceSpec-withRollbackConfig-withOrder = com.github.dockerjava.api.model.UpdateOrder
- withServiceSpec-withRollbackConfig-withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- withServiceSpec-withRollbackConfig-withMaxFailureRatio = java.lang.Float
- withServiceSpec-withTaskTemplate = com.github.dockerjava.api.model.TaskSpec
- withServiceSpec-withTaskTemplate-withForceUpdate = java.lang.Integer
- withServiceSpec-withTaskTemplate-withRuntime = java.lang.String
- withServiceSpec-withTaskTemplate-withPlacement = com.github.dockerjava.api.model.ServicePlacement
- withServiceSpec-withTaskTemplate-withPlacement-withConstraints = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withPlacement-setPlatforms = java.util.List<com.github.dockerjava.api.model.SwarmNodePlatform>
- withServiceSpec-withTaskTemplate-withPlacement-setPlatforms-withOs = java.lang.String
- withServiceSpec-withTaskTemplate-withPlacement-setPlatforms-withArchitecture = java.lang.String
- withServiceSpec-withTaskTemplate-withRestartPolicy = com.github.dockerjava.api.model.ServiceRestartPolicy
- withServiceSpec-withTaskTemplate-withRestartPolicy-withDelay = java.lang.Long
- withServiceSpec-withTaskTemplate-withRestartPolicy-withCondition = com.github.dockerjava.api.model.ServiceRestartCondition
- withServiceSpec-withTaskTemplate-withRestartPolicy-withMaxAttempts = java.lang.Long
- withServiceSpec-withTaskTemplate-withRestartPolicy-withWindow = java.lang.Long
- withServiceSpec-withTaskTemplate-withLogDriver = com.github.dockerjava.api.model.Driver
- withServiceSpec-withTaskTemplate-withLogDriver-withName = java.lang.String
- withServiceSpec-withTaskTemplate-withLogDriver-withOptions = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withTaskTemplate-withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- withServiceSpec-withTaskTemplate-withNetworks-withAliases = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withNetworks-withTarget = java.lang.String
- withServiceSpec-withTaskTemplate-withResources = com.github.dockerjava.api.model.ResourceRequirements
- withServiceSpec-withTaskTemplate-withResources-withLimits = com.github.dockerjava.api.model.ResourceSpecs
- withServiceSpec-withTaskTemplate-withResources-withLimits-withMemoryBytes = long
- withServiceSpec-withTaskTemplate-withResources-withLimits-withNanoCPUs = long
- withServiceSpec-withTaskTemplate-withResources-withReservations = com.github.dockerjava.api.model.ResourceSpecs
- withServiceSpec-withTaskTemplate-withResources-withReservations-withMemoryBytes = long
- withServiceSpec-withTaskTemplate-withResources-withReservations-withNanoCPUs = long
- withServiceSpec-withTaskTemplate-withContainerSpec = com.github.dockerjava.api.model.ContainerSpec
- withServiceSpec-withTaskTemplate-withContainerSpec-withEnv = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withStopSignal = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withImage = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withLabels = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withTty = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withUser = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withHostname = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withOpenStdin = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withCommand = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withArgs = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withDir = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withGroups = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts = java.util.List<com.github.dockerjava.api.model.Mount>
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withReadOnly = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withTarget = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withType = com.github.dockerjava.api.model.MountType
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withSource = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withBindOptions = com.github.dockerjava.api.model.BindOptions
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withBindOptions-withPropagation = com.github.dockerjava.api.model.BindPropagation
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions = com.github.dockerjava.api.model.VolumeOptions
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withLabels = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withNoCopy = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withDriverConfig = com.github.dockerjava.api.model.Driver
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withDriverConfig-withName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withMounts-withVolumeOptions-withDriverConfig-withOptions = java.util.Map<java.lang.String, java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withDuration = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig = com.github.dockerjava.api.model.ContainerDNSConfig
- withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withOptions = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withNameservers = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withDnsConfig-withSearch = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withReadOnly = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withHosts = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets = java.util.List<com.github.dockerjava.api.model.ContainerSpecSecret>
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile = com.github.dockerjava.api.model.ContainerSpecFile
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile-withName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile-withMode = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile-withUid = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withFile-withGid = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withSecretId = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withSecrets-withSecretName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck = com.github.dockerjava.api.model.HealthCheck
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTimeout = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withInterval = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withTest = java.util.List<java.lang.String>
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withRetries = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withHealthCheck-withStartPeriod = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges = com.github.dockerjava.api.model.ContainerSpecPrivileges
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec = com.github.dockerjava.api.model.ContainerSpecPrivilegesCredential
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withRegistry = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withCredentialSpec-withFile = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext = com.github.dockerjava.api.model.ContainerSpecPrivilegesSELinuxContext
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withUser = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withType = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withDisable = java.lang.Boolean
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withRole = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withPrivileges-withSeLinuxContext-withLevel = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs = java.util.List<com.github.dockerjava.api.model.ContainerSpecConfig>
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile = com.github.dockerjava.api.model.ContainerSpecFile
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile-withName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile-withMode = java.lang.Long
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile-withUid = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withFile-withGid = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withConfigID = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withConfigs-withConfigName = java.lang.String
- withServiceSpec-withTaskTemplate-withContainerSpec-withStopGracePeriod = java.lang.Long
- withServiceSpec-withMode = com.github.dockerjava.api.model.ServiceModeConfig
- withServiceSpec-withMode-withReplicated = com.github.dockerjava.api.model.ServiceReplicatedModeOptions
- withServiceSpec-withMode-withReplicated-withReplicas = int
- withServiceSpec-withMode-withGlobal = com.github.dockerjava.api.model.ServiceGlobalModeOptions
- withServiceSpec-withUpdateConfig = com.github.dockerjava.api.model.UpdateConfig
- withServiceSpec-withUpdateConfig-withParallelism = java.lang.Long
- withServiceSpec-withUpdateConfig-setDelay = java.lang.Long
- withServiceSpec-withUpdateConfig-withDelay = java.lang.Long
- withServiceSpec-withUpdateConfig-withMonitor = java.lang.Long
- withServiceSpec-withUpdateConfig-withOrder = com.github.dockerjava.api.model.UpdateOrder
- withServiceSpec-withUpdateConfig-withFailureAction = com.github.dockerjava.api.model.UpdateFailureAction
- withServiceSpec-withUpdateConfig-withMaxFailureRatio = java.lang.Float
- withServiceSpec-withNetworks = java.util.List<com.github.dockerjava.api.model.NetworkAttachmentConfig>
- withServiceSpec-withNetworks-withAliases = java.util.List<java.lang.String>
- withServiceSpec-withNetworks-withTarget = java.lang.String
- withServiceSpec-withEndpointSpec = com.github.dockerjava.api.model.EndpointSpec
- withServiceSpec-withEndpointSpec-withPorts = java.util.List<com.github.dockerjava.api.model.PortConfig>
- withServiceSpec-withEndpointSpec-withPorts-withName = java.lang.String
- withServiceSpec-withEndpointSpec-withPorts-withProtocol = com.github.dockerjava.api.model.PortConfigProtocol
- withServiceSpec-withEndpointSpec-withPorts-withTargetPort = int
- withServiceSpec-withEndpointSpec-withPorts-withPublishMode = com.github.dockerjava.api.model.PortConfig$PublishMode
- withServiceSpec-withEndpointSpec-withPorts-withPublishedPort = int
- withServiceSpec-withEndpointSpec-withMode = com.github.dockerjava.api.model.EndpointResolutionMode
- withServiceId = java.lang.String
```
## Kubernetes CopyArchiveToContainer parameters:

```
- withTarInputStream = java.io.InputStream
- withNoOverwriteDirNonDir = boolean
- withDirChildrenOnly = boolean
- withContainerId = java.lang.String
- withHostResource = java.lang.String
- withRemotePath = java.lang.String
```
## Kubernetes Ping parameters:

```
```
## Kubernetes Stats parameters:

```
- withContainerId = java.lang.String
```
## Kubernetes ExecStart parameters:

```
- withTty = java.lang.Boolean
- withStdIn = java.io.InputStream
- withDetach = java.lang.Boolean
- withExecId = java.lang.String
```
## Kubernetes LeaveSwarm parameters:

```
- withForceEnabled = java.lang.Boolean
```
## Kubernetes TopContainer parameters:

```
- withContainerId = java.lang.String
- withPsArgs = java.lang.String
```
## Kubernetes StopContainer parameters:

```
- withContainerId = java.lang.String
- withTimeout = java.lang.Integer
```
## Kubernetes RemoveContainer parameters:

```
- withRemoveVolumes = java.lang.Boolean
- withContainerId = java.lang.String
- withForce = java.lang.Boolean
```
## Kubernetes ListNetworks parameters:

```
- withNameFilter = java.lang.String[]
```
## Kubernetes ListImages parameters:

```
- withImageNameFilter = java.lang.String
- withDanglingFilter = java.lang.Boolean
- withLabelFilter = java.lang.String[]
```
## Kubernetes ListVolumes parameters:

```
- withDanglingFilter = java.lang.Boolean
```
## Kubernetes ContainerDiff parameters:

```
- withContainerId = java.lang.String
```
## Kubernetes Events parameters:

```
- withLabelFilter = java.lang.String[]
```
## Kubernetes RemoveService parameters:

```
- withServiceId = java.lang.String
```
## Kubernetes Auth parameters:

```
- withAuthConfig = com.github.dockerjava.api.model.AuthConfig
- withAuthConfig-withUsername = java.lang.String
- withAuthConfig-withRegistryAddress = java.lang.String
- withAuthConfig-withPassword = java.lang.String
- withAuthConfig-withEmail = java.lang.String
- withAuthConfig-withRegistrytoken = java.lang.String
- withAuthConfig-withAuth = java.lang.String
```
## Kubernetes CreateImage parameters:

```
- withTag = java.lang.String
- withRepository = java.lang.String
- withImageStream = java.io.InputStream
```
## Kubernetes LogContainer parameters:

```
- withSince = java.lang.Integer
- withContainerId = java.lang.String
- withFollowStream = java.lang.Boolean
- withTimestamps = java.lang.Boolean
- withStdOut = java.lang.Boolean
- withStdErr = java.lang.Boolean
- withTail = java.lang.Integer
```
## Kubernetes ConnectToNetwork parameters:

```
- withContainerId = java.lang.String
- withNetworkId = java.lang.String
- withContainerNetwork = com.github.dockerjava.api.model.ContainerNetwork
- withContainerNetwork-withAliases = java.lang.String[]
```
## Kubernetes InspectNetwork parameters:

```
- withNetworkId = java.lang.String
```
## Kubernetes DisconnectFromNetwork parameters:

```
- withContainerId = java.lang.String
- withForce = java.lang.Boolean
- withNetworkId = java.lang.String
```
## Kubernetes Info parameters:

```
```
## Kubernetes CopyArchiveFromContainer parameters:

```
- withContainerId = java.lang.String
- withHostPath = java.lang.String
- withResource = java.lang.String
```
## Kubernetes UpdateSwarmNode parameters:

```
- withVersion = java.lang.Long
- withSwarmNodeId = java.lang.String
- withSwarmNodeSpec = com.github.dockerjava.api.model.SwarmNodeSpec
- withSwarmNodeSpec-withLabels = java.util.Map<java.lang.String, java.lang.String>
- withSwarmNodeSpec-withName = java.lang.String
- withSwarmNodeSpec-withRole = com.github.dockerjava.api.model.SwarmNodeRole
- withSwarmNodeSpec-withAvailability = com.github.dockerjava.api.model.SwarmNodeAvailability
```
## Kubernetes RenameContainer parameters:

```
- withName = java.lang.String
- withContainerId = java.lang.String
```
## Kubernetes Commit parameters:

```
- withDisableNetwork = java.lang.Boolean
- withTag = java.lang.String
- withAttachStderr = java.lang.Boolean
- withAttachStdin = java.lang.Boolean
- withAttachStdout = java.lang.Boolean
- withCmd = java.lang.String[]
```
## Kubernetes InspectExec parameters:

```
- withExecId = java.lang.String
```
## Kubernetes StartContainer parameters:

```
- withContainerId = java.lang.String
```
## Kubernetes UpdateContainer parameters:

```
- withMemoryReservation = java.lang.Long
- withBlkioWeight = java.lang.Integer
- withCpuPeriod = java.lang.Integer
- withCpusetCpus = java.lang.String
- withCpusetMems = java.lang.String
- withCpuShares = java.lang.Integer
- withMemory = java.lang.Long
- withMemorySwap = java.lang.Long
- withContainerId = java.lang.String
- withCpuQuota = java.lang.Integer
- withKernelMemory = java.lang.Long
```
## Kubernetes InitializeSwarm parameters:

```
- withListenAddr = java.lang.String
- withSwarmSpec = com.github.dockerjava.api.model.SwarmSpec
- withSwarmSpec-withName = java.lang.String
- withSwarmSpec-withOrchestration = com.github.dockerjava.api.model.SwarmOrchestration
- withSwarmSpec-withOrchestration-withTaskHistoryRententionLimit = int
- withSwarmSpec-withDispatcher = com.github.dockerjava.api.model.SwarmDispatcherConfig
- withSwarmSpec-withDispatcher-withHeartbeatPeriod = java.lang.Long
- withSwarmSpec-withCaConfig = com.github.dockerjava.api.model.SwarmCAConfig
- withSwarmSpec-withCaConfig-withExternalCA = java.util.List<com.github.dockerjava.api.model.ExternalCA>
- withSwarmSpec-withCaConfig-withExternalCA-withOptions = java.util.Map<java.lang.String, java.lang.String>
- withSwarmSpec-withCaConfig-withExternalCA-withProtocol = com.github.dockerjava.api.model.ExternalCAProtocol
- withSwarmSpec-withCaConfig-withExternalCA-withUrl = java.lang.String
- withSwarmSpec-withCaConfig-withNodeCertExpiry = java.lang.Long
- withSwarmSpec-withRaft = com.github.dockerjava.api.model.SwarmRaftConfig
- withSwarmSpec-withRaft-withElectionTick = int
- withSwarmSpec-withRaft-withLogEntriesForSlowFollowers = long
- withSwarmSpec-withRaft-withHeartbeatTick = int
- withSwarmSpec-withRaft-withSnapshotInterval = long
- withSwarmSpec-withTaskDefaults = com.github.dockerjava.api.model.TaskDefaults
- withSwarmSpec-withTaskDefaults-withLogDriver = com.github.dockerjava.api.model.Driver
- withSwarmSpec-withTaskDefaults-withLogDriver-withName = java.lang.String
- withSwarmSpec-withTaskDefaults-withLogDriver-withOptions = java.util.Map<java.lang.String, java.lang.String>
- withAdvertiseAddr = java.lang.String
- withForceNewCluster = java.lang.Boolean
```
## Kubernetes LoadImage parameters:

```
- withImageStream = java.io.InputStream
```
## Kubernetes CreateContainer parameters:

```
- withAuthConfig = com.github.dockerjava.api.model.AuthConfig
- withAuthConfig-withUsername = java.lang.String
- withAuthConfig-withRegistryAddress = java.lang.String
- withAuthConfig-withPassword = java.lang.String
- withAuthConfig-withEmail = java.lang.String
- withAuthConfig-withRegistrytoken = java.lang.String
- withAuthConfig-withAuth = java.lang.String
- withContainerIDFile = java.lang.String
- withNetworkDisabled = java.lang.Boolean
- withOomKillDisable = java.lang.Boolean
- withPublishAllPorts = java.lang.Boolean
- withReadonlyRootfs = java.lang.Boolean
- withRestartPolicy = com.github.dockerjava.api.model.RestartPolicy
- withAliases = java.lang.String[]
```
## Kubernetes InspectContainer parameters:

```
- withContainerId = java.lang.String
- withSize = java.lang.Boolean
```
## Kubernetes CreateVolume parameters:

```
- withName = java.lang.String
- withDriver = java.lang.String
- withDriverOpts = java.util.Map<java.lang.String, java.lang.String>
```
## Kubernetes InspectService parameters:

```
- withServiceId = java.lang.String
```
## Kubernetes RestartContainer parameters:

```
- withContainerId = java.lang.String
- withtTimeout = java.lang.Integer
```
