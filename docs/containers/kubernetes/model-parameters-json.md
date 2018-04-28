## Kubernetes ServiceAccount parameterss:

```
{
	"main": {
		"setAutomountServiceAccountToken": "java.lang.Boolean",
		"setImagePullSecrets": ["ref1-io.fabric8.kubernetes.api.model.LocalObjectReference"],
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref2-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref3-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setSecrets": ["ref4-io.fabric8.kubernetes.api.model.ObjectReference"]
	},
	"ref1-io.fabric8.kubernetes.api.model.LocalObjectReference": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref3-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref4-io.fabric8.kubernetes.api.model.ObjectReference": {
		"setName": "java.lang.String",
		"setNamespace": "java.lang.String",
		"setFieldPath": "java.lang.String",
		"setResourceVersion": "java.lang.String"
	}
}
```
## Kubernetes ThirdPartyResource parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setDescription": "java.lang.String",
		"setVersions": ["ref3-io.fabric8.kubernetes.api.model.extensions.APIVersion"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.extensions.APIVersion": {
		"setName": "java.lang.String"
	}
}
```
## Kubernetes Node parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setConditions": ["ref3-io.fabric8.kubernetes.api.model.NodeCondition"],
		"setStatus-setAddresses": ["ref4-io.fabric8.kubernetes.api.model.NodeAddress"],
		"setStatus-setAllocatable": {
			"java.lang.String0": "ref5-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setStatus-setCapacity": {
			"java.lang.String0": "ref6-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setStatus-setImages": ["ref7-io.fabric8.kubernetes.api.model.ContainerImage"],
		"setStatus-setNodeInfo-setArchitecture": "java.lang.String",
		"setStatus-setNodeInfo-setBootID": "java.lang.String",
		"setStatus-setNodeInfo-setKernelVersion": "java.lang.String",
		"setStatus-setNodeInfo-setMachineID": "java.lang.String",
		"setStatus-setNodeInfo-setOsImage": "java.lang.String",
		"setStatus-setNodeInfo-setSystemUUID": "java.lang.String",
		"setStatus-setNodeInfo-setContainerRuntimeVersion": "java.lang.String",
		"setStatus-setNodeInfo-setKubeProxyVersion": "java.lang.String",
		"setStatus-setNodeInfo-setKubeletVersion": "java.lang.String",
		"setStatus-setNodeInfo-setOperatingSystem": "java.lang.String",
		"setStatus-setPhase": "java.lang.String",
		"setStatus-setVolumesInUse": ["java.lang.String0", "java.lang.String1"],
		"setStatus-setDaemonEndpoints-setKubeletEndpoint-setPort": "java.lang.Integer",
		"setStatus-setVolumesAttached": ["ref8-io.fabric8.kubernetes.api.model.AttachedVolume"],
		"setSpec-setProviderID": "java.lang.String",
		"setSpec-setExternalID": "java.lang.String",
		"setSpec-setUnschedulable": "java.lang.Boolean",
		"setSpec-setPodCIDR": "java.lang.String",
		"setSpec-setTaints": ["ref9-io.fabric8.kubernetes.api.model.Taint"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.NodeCondition": {
		"setStatus": "java.lang.String",
		"setLastHeartbeatTime": "java.lang.String",
		"setLastTransitionTime": "java.lang.String",
		"setType": "java.lang.String",
		"setMessage": "java.lang.String",
		"setReason": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.NodeAddress": {
		"setAddress": "java.lang.String",
		"setType": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref6-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref7-io.fabric8.kubernetes.api.model.ContainerImage": {
		"setNames": ["java.lang.String0", "java.lang.String1"],
		"setSizeBytes": "java.lang.Long"
	},
	"ref8-io.fabric8.kubernetes.api.model.AttachedVolume": {
		"setName": "java.lang.String",
		"setDevicePath": "java.lang.String"
	},
	"ref9-io.fabric8.kubernetes.api.model.Taint": {
		"setValue": "java.lang.String",
		"setEffect": "java.lang.String",
		"setKey": "java.lang.String",
		"setTimeAdded": "java.lang.String"
	}
}
```
## Kubernetes Deployment parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setAvailableReplicas": "java.lang.Integer",
		"setStatus-setCollisionCount": "java.lang.Long",
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setStatus-setUnavailableReplicas": "java.lang.Integer",
		"setStatus-setUpdatedReplicas": "java.lang.Integer",
		"setStatus-setReplicas": "java.lang.Integer",
		"setStatus-setReadyReplicas": "java.lang.Integer",
		"setStatus-setConditions": ["ref3-io.fabric8.kubernetes.api.model.extensions.DeploymentCondition"],
		"setSpec-setMinReadySeconds": "java.lang.Integer",
		"setSpec-setProgressDeadlineSeconds": "java.lang.Integer",
		"setSpec-setRevisionHistoryLimit": "java.lang.Integer",
		"setSpec-setReplicas": "java.lang.Integer",
		"setSpec-setRollbackTo-setRevision": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setNamespace": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setClusterName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setGeneration": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setInitializers-setPending": ["ref4-io.fabric8.kubernetes.api.model.Initializer"],
		"setSpec-setTemplate-setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setDeletionTimestamp": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setOwnerReferences": ["ref5-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setSpec-setTemplate-setMetadata-setResourceVersion": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setImagePullSecrets": ["ref6-io.fabric8.kubernetes.api.model.LocalObjectReference"],
		"setSpec-setTemplate-setSpec-setVolumes": ["ref7-io.fabric8.kubernetes.api.model.Volume"],
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setItems": ["ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setMedium": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setAmount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setFormat": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setTargetWWNs": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setDriver": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setOptions": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetUUID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRevision": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setDirectory": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRepository": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setEndpoints": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setHostPath-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIqn": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setTargetPortal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setPortals": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIscsiInterface": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setServer": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources": ["ref10-io.fabric8.kubernetes.api.model.VolumeProjection"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setDownwardAPI-setItems": ["ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setItems": ["ref13-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setRegistry": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setGroup": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setVolume": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setImage": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setPool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setKeyring": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStorageMode": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStoragePool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setGateway": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSystem": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setProtectionDomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setItems": ["ref14-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setSecretName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeNamespace": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setVolumePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPdName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setWeight": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setContainers": ["ref27-io.fabric8.kubernetes.api.model.Container"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHttpHeaders": ["ref30-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHttpHeaders": ["ref31-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHttpHeaders": ["ref32-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setPorts": ["ref33-io.fabric8.kubernetes.api.model.ContainerPort"],
		"setSpec-setTemplate-setSpec-setContainers-setResources-setRequests": {
			"java.lang.String0": "ref34-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setResources-setLimits": {
			"java.lang.String0": "ref35-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setStdin": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setStdinOnce": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setTty": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setVolumeMounts": ["ref36-io.fabric8.kubernetes.api.model.VolumeMount"],
		"setSpec-setTemplate-setSpec-setContainers-setWorkingDir": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setImagePullPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHttpHeaders": ["ref37-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setAdd": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setDrop": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setDnsPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setHostAliases": ["ref38-io.fabric8.kubernetes.api.model.HostAlias"],
		"setSpec-setTemplate-setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostNetwork": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostPID": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostname": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeSelector": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setRestartPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSubdomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTolerations": ["ref39-io.fabric8.kubernetes.api.model.Toleration"],
		"setSpec-setTemplate-setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setFsGroup": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSupplementalGroups": ["ref40-java.lang.Long"],
		"setSpec-setTemplate-setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setServiceAccountName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setStrategy-setRollingUpdate-setMaxUnavailable-setIntVal": "java.lang.Integer",
		"setSpec-setStrategy-setRollingUpdate-setMaxUnavailable-setStrVal": "java.lang.String",
		"setSpec-setStrategy-setRollingUpdate-setMaxSurge-setIntVal": "java.lang.Integer",
		"setSpec-setStrategy-setRollingUpdate-setMaxSurge-setStrVal": "java.lang.String",
		"setSpec-setStrategy-setType": "java.lang.String",
		"setSpec-setSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setSelector-setMatchExpressions": ["ref41-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.extensions.DeploymentCondition": {
		"setStatus": "java.lang.String",
		"setLastTransitionTime": "java.lang.String",
		"setLastUpdateTime": "java.lang.String",
		"setType": "java.lang.String",
		"setMessage": "java.lang.String",
		"setReason": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref6-io.fabric8.kubernetes.api.model.LocalObjectReference": {
		"setName": "java.lang.String"
	},
	"ref7-io.fabric8.kubernetes.api.model.Volume": {
		"setName": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setAzureDisk-setFsType": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setAzureFile-setShareName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setCephfs-setPath": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setCephfs-setSecretRef-setName": "java.lang.String",
		"setCephfs-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setCephfs-setSecretFile": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setCinder-setFsType": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setItems": ["ref8-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref8-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref10-io.fabric8.kubernetes.api.model.VolumeProjection": {
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setItems": ["ref11-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref11-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref13-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref14-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPreference-setMatchExpressions": ["ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms-setMatchExpressions": ["ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref27-io.fabric8.kubernetes.api.model.Container": {
		"setName": "java.lang.String",
		"setImage": "java.lang.String",
		"setArgs": ["java.lang.String0", "java.lang.String1"],
		"setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setEnv": ["ref28-io.fabric8.kubernetes.api.model.EnvVar"]
	},
	"ref28-io.fabric8.kubernetes.api.model.EnvVar": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String",
		"setValueFrom-setFieldRef-setFieldPath": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setResource": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setContainerName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setKey": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setValueFrom-setSecretKeyRef-setName": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setKey": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setEnvFrom": ["ref29-io.fabric8.kubernetes.api.model.EnvFromSource"]
	},
	"ref29-io.fabric8.kubernetes.api.model.EnvFromSource": {
		"setSecretRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref30-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref31-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref32-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref33-io.fabric8.kubernetes.api.model.ContainerPort": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer",
		"setProtocol": "java.lang.String"
	},
	"ref34-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref35-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref36-io.fabric8.kubernetes.api.model.VolumeMount": {
		"setReadOnly": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setSubPath": "java.lang.String",
		"setMountPath": "java.lang.String"
	},
	"ref37-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref38-io.fabric8.kubernetes.api.model.HostAlias": {
		"setHostnames": ["java.lang.String0", "java.lang.String1"],
		"setIp": "java.lang.String"
	},
	"ref39-io.fabric8.kubernetes.api.model.Toleration": {
		"setValue": "java.lang.String",
		"setEffect": "java.lang.String",
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long"
	},
	"ref41-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	}
}
```
## Kubernetes Endpoint parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setSubsets": ["ref3-io.fabric8.kubernetes.api.model.EndpointSubset"],
		"setSubsets-setAddresses": ["ref5-io.fabric8.kubernetes.api.model.EndpointAddress"],
		"setSubsets-setNotReadyAddresses": ["ref6-io.fabric8.kubernetes.api.model.EndpointAddress"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.EndpointSubset": {
		"setSubsets-setPorts": ["ref4-io.fabric8.kubernetes.api.model.EndpointPort"]
	},
	"ref4-io.fabric8.kubernetes.api.model.EndpointPort": {
		"setName": "java.lang.String",
		"setPort": "java.lang.Integer",
		"setProtocol": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.EndpointAddress": {
		"setHostname": "java.lang.String",
		"setNodeName": "java.lang.String",
		"setIp": "java.lang.String",
		"setTargetRef-setName": "java.lang.String",
		"setTargetRef-setNamespace": "java.lang.String",
		"setTargetRef-setFieldPath": "java.lang.String",
		"setTargetRef-setResourceVersion": "java.lang.String"
	},
	"ref6-io.fabric8.kubernetes.api.model.EndpointAddress": {
		"setHostname": "java.lang.String",
		"setNodeName": "java.lang.String",
		"setIp": "java.lang.String",
		"setTargetRef-setName": "java.lang.String",
		"setTargetRef-setNamespace": "java.lang.String",
		"setTargetRef-setFieldPath": "java.lang.String",
		"setTargetRef-setResourceVersion": "java.lang.String"
	}
}
```
## Kubernetes ResourceQuota parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setHard": {
			"java.lang.String0": "ref3-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setStatus-setUsed": {
			"java.lang.String0": "ref4-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setHard": {
			"java.lang.String0": "ref5-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setScopes": ["java.lang.String0", "java.lang.String1"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	}
}
```
## Kubernetes ReplicationController parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setAvailableReplicas": "java.lang.Integer",
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setStatus-setReplicas": "java.lang.Integer",
		"setStatus-setReadyReplicas": "java.lang.Integer",
		"setStatus-setConditions": ["ref3-io.fabric8.kubernetes.api.model.ReplicationControllerCondition"],
		"setStatus-setFullyLabeledReplicas": "java.lang.Integer",
		"setSpec-setMinReadySeconds": "java.lang.Integer",
		"setSpec-setReplicas": "java.lang.Integer",
		"setSpec-setTemplate-setMetadata-setName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setNamespace": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setClusterName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setGeneration": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setInitializers-setPending": ["ref4-io.fabric8.kubernetes.api.model.Initializer"],
		"setSpec-setTemplate-setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setDeletionTimestamp": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setOwnerReferences": ["ref5-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setSpec-setTemplate-setMetadata-setResourceVersion": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setImagePullSecrets": ["ref6-io.fabric8.kubernetes.api.model.LocalObjectReference"],
		"setSpec-setTemplate-setSpec-setVolumes": ["ref7-io.fabric8.kubernetes.api.model.Volume"],
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setItems": ["ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setMedium": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setAmount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setFormat": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setTargetWWNs": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setDriver": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setOptions": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetUUID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRevision": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setDirectory": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRepository": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setEndpoints": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setHostPath-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIqn": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setTargetPortal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setPortals": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIscsiInterface": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setServer": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources": ["ref10-io.fabric8.kubernetes.api.model.VolumeProjection"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setDownwardAPI-setItems": ["ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setItems": ["ref13-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setRegistry": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setGroup": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setVolume": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setImage": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setPool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setKeyring": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStorageMode": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStoragePool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setGateway": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSystem": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setProtectionDomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setItems": ["ref14-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setSecretName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeNamespace": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setVolumePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPdName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setWeight": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setContainers": ["ref27-io.fabric8.kubernetes.api.model.Container"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHttpHeaders": ["ref30-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHttpHeaders": ["ref31-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHttpHeaders": ["ref32-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setPorts": ["ref33-io.fabric8.kubernetes.api.model.ContainerPort"],
		"setSpec-setTemplate-setSpec-setContainers-setResources-setRequests": {
			"java.lang.String0": "ref34-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setResources-setLimits": {
			"java.lang.String0": "ref35-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setStdin": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setStdinOnce": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setTty": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setVolumeMounts": ["ref36-io.fabric8.kubernetes.api.model.VolumeMount"],
		"setSpec-setTemplate-setSpec-setContainers-setWorkingDir": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setImagePullPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHttpHeaders": ["ref37-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setAdd": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setDrop": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setDnsPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setHostAliases": ["ref38-io.fabric8.kubernetes.api.model.HostAlias"],
		"setSpec-setTemplate-setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostNetwork": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostPID": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostname": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeSelector": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setRestartPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSubdomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTolerations": ["ref39-io.fabric8.kubernetes.api.model.Toleration"],
		"setSpec-setTemplate-setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setFsGroup": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSupplementalGroups": ["ref40-java.lang.Long"],
		"setSpec-setTemplate-setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setServiceAccountName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setSelector": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		}
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.ReplicationControllerCondition": {
		"setStatus": "java.lang.String",
		"setLastTransitionTime": "java.lang.String",
		"setType": "java.lang.String",
		"setMessage": "java.lang.String",
		"setReason": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref6-io.fabric8.kubernetes.api.model.LocalObjectReference": {
		"setName": "java.lang.String"
	},
	"ref7-io.fabric8.kubernetes.api.model.Volume": {
		"setName": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setAzureDisk-setFsType": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setAzureFile-setShareName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setCephfs-setPath": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setCephfs-setSecretRef-setName": "java.lang.String",
		"setCephfs-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setCephfs-setSecretFile": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setCinder-setFsType": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setItems": ["ref8-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref8-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref10-io.fabric8.kubernetes.api.model.VolumeProjection": {
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setItems": ["ref11-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref11-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref13-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref14-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPreference-setMatchExpressions": ["ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms-setMatchExpressions": ["ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref27-io.fabric8.kubernetes.api.model.Container": {
		"setName": "java.lang.String",
		"setImage": "java.lang.String",
		"setArgs": ["java.lang.String0", "java.lang.String1"],
		"setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setEnv": ["ref28-io.fabric8.kubernetes.api.model.EnvVar"]
	},
	"ref28-io.fabric8.kubernetes.api.model.EnvVar": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String",
		"setValueFrom-setFieldRef-setFieldPath": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setResource": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setContainerName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setKey": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setValueFrom-setSecretKeyRef-setName": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setKey": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setEnvFrom": ["ref29-io.fabric8.kubernetes.api.model.EnvFromSource"]
	},
	"ref29-io.fabric8.kubernetes.api.model.EnvFromSource": {
		"setSecretRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref30-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref31-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref32-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref33-io.fabric8.kubernetes.api.model.ContainerPort": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer",
		"setProtocol": "java.lang.String"
	},
	"ref34-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref35-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref36-io.fabric8.kubernetes.api.model.VolumeMount": {
		"setReadOnly": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setSubPath": "java.lang.String",
		"setMountPath": "java.lang.String"
	},
	"ref37-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref38-io.fabric8.kubernetes.api.model.HostAlias": {
		"setHostnames": ["java.lang.String0", "java.lang.String1"],
		"setIp": "java.lang.String"
	},
	"ref39-io.fabric8.kubernetes.api.model.Toleration": {
		"setValue": "java.lang.String",
		"setEffect": "java.lang.String",
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long"
	}
}
```
## Kubernetes Job parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setConditions": ["ref3-io.fabric8.kubernetes.api.model.JobCondition"],
		"setStatus-setCompletionTime": "java.lang.String",
		"setStatus-setActive": "java.lang.Integer",
		"setStatus-setFailed": "java.lang.Integer",
		"setStatus-setStartTime": "java.lang.String",
		"setStatus-setSucceeded": "java.lang.Integer",
		"setSpec-setTemplate-setMetadata-setName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setNamespace": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setClusterName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setGeneration": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setInitializers-setPending": ["ref4-io.fabric8.kubernetes.api.model.Initializer"],
		"setSpec-setTemplate-setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setDeletionTimestamp": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setOwnerReferences": ["ref5-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setSpec-setTemplate-setMetadata-setResourceVersion": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setImagePullSecrets": ["ref6-io.fabric8.kubernetes.api.model.LocalObjectReference"],
		"setSpec-setTemplate-setSpec-setVolumes": ["ref7-io.fabric8.kubernetes.api.model.Volume"],
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setItems": ["ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setMedium": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setAmount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setFormat": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setTargetWWNs": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setDriver": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setOptions": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetUUID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRevision": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setDirectory": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRepository": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setEndpoints": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setHostPath-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIqn": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setTargetPortal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setPortals": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIscsiInterface": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setServer": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources": ["ref10-io.fabric8.kubernetes.api.model.VolumeProjection"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setDownwardAPI-setItems": ["ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setItems": ["ref13-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setRegistry": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setGroup": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setVolume": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setImage": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setPool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setKeyring": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStorageMode": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStoragePool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setGateway": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSystem": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setProtectionDomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setItems": ["ref14-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setSecretName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeNamespace": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setVolumePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPdName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setWeight": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setContainers": ["ref27-io.fabric8.kubernetes.api.model.Container"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHttpHeaders": ["ref30-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHttpHeaders": ["ref31-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHttpHeaders": ["ref32-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setPorts": ["ref33-io.fabric8.kubernetes.api.model.ContainerPort"],
		"setSpec-setTemplate-setSpec-setContainers-setResources-setRequests": {
			"java.lang.String0": "ref34-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setResources-setLimits": {
			"java.lang.String0": "ref35-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setStdin": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setStdinOnce": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setTty": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setVolumeMounts": ["ref36-io.fabric8.kubernetes.api.model.VolumeMount"],
		"setSpec-setTemplate-setSpec-setContainers-setWorkingDir": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setImagePullPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHttpHeaders": ["ref37-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setAdd": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setDrop": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setDnsPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setHostAliases": ["ref38-io.fabric8.kubernetes.api.model.HostAlias"],
		"setSpec-setTemplate-setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostNetwork": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostPID": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostname": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeSelector": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setRestartPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSubdomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTolerations": ["ref39-io.fabric8.kubernetes.api.model.Toleration"],
		"setSpec-setTemplate-setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setFsGroup": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSupplementalGroups": ["ref40-java.lang.Long"],
		"setSpec-setTemplate-setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setServiceAccountName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setSelector-setMatchExpressions": ["ref41-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"],
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setManualSelector": "java.lang.Boolean",
		"setSpec-setCompletions": "java.lang.Integer",
		"setSpec-setParallelism": "java.lang.Integer"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.JobCondition": {
		"setStatus": "java.lang.String",
		"setLastTransitionTime": "java.lang.String",
		"setType": "java.lang.String",
		"setMessage": "java.lang.String",
		"setReason": "java.lang.String",
		"setLastProbeTime": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref6-io.fabric8.kubernetes.api.model.LocalObjectReference": {
		"setName": "java.lang.String"
	},
	"ref7-io.fabric8.kubernetes.api.model.Volume": {
		"setName": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setAzureDisk-setFsType": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setAzureFile-setShareName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setCephfs-setPath": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setCephfs-setSecretRef-setName": "java.lang.String",
		"setCephfs-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setCephfs-setSecretFile": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setCinder-setFsType": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setItems": ["ref8-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref8-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref10-io.fabric8.kubernetes.api.model.VolumeProjection": {
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setItems": ["ref11-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref11-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref13-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref14-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPreference-setMatchExpressions": ["ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms-setMatchExpressions": ["ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref27-io.fabric8.kubernetes.api.model.Container": {
		"setName": "java.lang.String",
		"setImage": "java.lang.String",
		"setArgs": ["java.lang.String0", "java.lang.String1"],
		"setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setEnv": ["ref28-io.fabric8.kubernetes.api.model.EnvVar"]
	},
	"ref28-io.fabric8.kubernetes.api.model.EnvVar": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String",
		"setValueFrom-setFieldRef-setFieldPath": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setResource": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setContainerName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setKey": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setValueFrom-setSecretKeyRef-setName": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setKey": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setEnvFrom": ["ref29-io.fabric8.kubernetes.api.model.EnvFromSource"]
	},
	"ref29-io.fabric8.kubernetes.api.model.EnvFromSource": {
		"setSecretRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref30-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref31-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref32-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref33-io.fabric8.kubernetes.api.model.ContainerPort": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer",
		"setProtocol": "java.lang.String"
	},
	"ref34-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref35-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref36-io.fabric8.kubernetes.api.model.VolumeMount": {
		"setReadOnly": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setSubPath": "java.lang.String",
		"setMountPath": "java.lang.String"
	},
	"ref37-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref38-io.fabric8.kubernetes.api.model.HostAlias": {
		"setHostnames": ["java.lang.String0", "java.lang.String1"],
		"setIp": "java.lang.String"
	},
	"ref39-io.fabric8.kubernetes.api.model.Toleration": {
		"setValue": "java.lang.String",
		"setEffect": "java.lang.String",
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long"
	},
	"ref41-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	}
}
```
## Kubernetes ReplicaSet parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setAvailableReplicas": "java.lang.Integer",
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setStatus-setReplicas": "java.lang.Integer",
		"setStatus-setReadyReplicas": "java.lang.Integer",
		"setStatus-setConditions": ["ref3-io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition"],
		"setStatus-setFullyLabeledReplicas": "java.lang.Integer",
		"setSpec-setMinReadySeconds": "java.lang.Integer",
		"setSpec-setReplicas": "java.lang.Integer",
		"setSpec-setTemplate-setMetadata-setName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setNamespace": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setClusterName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setGeneration": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setInitializers-setPending": ["ref4-io.fabric8.kubernetes.api.model.Initializer"],
		"setSpec-setTemplate-setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setDeletionTimestamp": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setOwnerReferences": ["ref5-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setSpec-setTemplate-setMetadata-setResourceVersion": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setImagePullSecrets": ["ref6-io.fabric8.kubernetes.api.model.LocalObjectReference"],
		"setSpec-setTemplate-setSpec-setVolumes": ["ref7-io.fabric8.kubernetes.api.model.Volume"],
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setItems": ["ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setMedium": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setAmount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setFormat": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setTargetWWNs": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setDriver": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setOptions": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetUUID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRevision": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setDirectory": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRepository": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setEndpoints": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setHostPath-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIqn": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setTargetPortal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setPortals": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIscsiInterface": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setServer": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources": ["ref10-io.fabric8.kubernetes.api.model.VolumeProjection"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setDownwardAPI-setItems": ["ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setItems": ["ref13-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setRegistry": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setGroup": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setVolume": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setImage": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setPool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setKeyring": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStorageMode": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStoragePool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setGateway": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSystem": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setProtectionDomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setItems": ["ref14-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setSecretName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeNamespace": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setVolumePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPdName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setWeight": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setContainers": ["ref27-io.fabric8.kubernetes.api.model.Container"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHttpHeaders": ["ref30-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHttpHeaders": ["ref31-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHttpHeaders": ["ref32-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setPorts": ["ref33-io.fabric8.kubernetes.api.model.ContainerPort"],
		"setSpec-setTemplate-setSpec-setContainers-setResources-setRequests": {
			"java.lang.String0": "ref34-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setResources-setLimits": {
			"java.lang.String0": "ref35-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setStdin": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setStdinOnce": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setTty": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setVolumeMounts": ["ref36-io.fabric8.kubernetes.api.model.VolumeMount"],
		"setSpec-setTemplate-setSpec-setContainers-setWorkingDir": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setImagePullPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHttpHeaders": ["ref37-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setAdd": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setDrop": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setDnsPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setHostAliases": ["ref38-io.fabric8.kubernetes.api.model.HostAlias"],
		"setSpec-setTemplate-setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostNetwork": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostPID": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostname": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeSelector": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setRestartPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSubdomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTolerations": ["ref39-io.fabric8.kubernetes.api.model.Toleration"],
		"setSpec-setTemplate-setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setFsGroup": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSupplementalGroups": ["ref40-java.lang.Long"],
		"setSpec-setTemplate-setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setServiceAccountName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setSelector-setMatchExpressions": ["ref41-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition": {
		"setStatus": "java.lang.String",
		"setLastTransitionTime": "java.lang.String",
		"setType": "java.lang.String",
		"setMessage": "java.lang.String",
		"setReason": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref6-io.fabric8.kubernetes.api.model.LocalObjectReference": {
		"setName": "java.lang.String"
	},
	"ref7-io.fabric8.kubernetes.api.model.Volume": {
		"setName": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setAzureDisk-setFsType": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setAzureFile-setShareName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setCephfs-setPath": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setCephfs-setSecretRef-setName": "java.lang.String",
		"setCephfs-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setCephfs-setSecretFile": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setCinder-setFsType": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setItems": ["ref8-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref8-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref10-io.fabric8.kubernetes.api.model.VolumeProjection": {
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setItems": ["ref11-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref11-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref13-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref14-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPreference-setMatchExpressions": ["ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms-setMatchExpressions": ["ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref27-io.fabric8.kubernetes.api.model.Container": {
		"setName": "java.lang.String",
		"setImage": "java.lang.String",
		"setArgs": ["java.lang.String0", "java.lang.String1"],
		"setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setEnv": ["ref28-io.fabric8.kubernetes.api.model.EnvVar"]
	},
	"ref28-io.fabric8.kubernetes.api.model.EnvVar": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String",
		"setValueFrom-setFieldRef-setFieldPath": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setResource": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setContainerName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setKey": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setValueFrom-setSecretKeyRef-setName": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setKey": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setEnvFrom": ["ref29-io.fabric8.kubernetes.api.model.EnvFromSource"]
	},
	"ref29-io.fabric8.kubernetes.api.model.EnvFromSource": {
		"setSecretRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref30-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref31-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref32-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref33-io.fabric8.kubernetes.api.model.ContainerPort": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer",
		"setProtocol": "java.lang.String"
	},
	"ref34-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref35-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref36-io.fabric8.kubernetes.api.model.VolumeMount": {
		"setReadOnly": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setSubPath": "java.lang.String",
		"setMountPath": "java.lang.String"
	},
	"ref37-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref38-io.fabric8.kubernetes.api.model.HostAlias": {
		"setHostnames": ["java.lang.String0", "java.lang.String1"],
		"setIp": "java.lang.String"
	},
	"ref39-io.fabric8.kubernetes.api.model.Toleration": {
		"setValue": "java.lang.String",
		"setEffect": "java.lang.String",
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long"
	},
	"ref41-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	}
}
```
## Kubernetes Pod parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setMessage": "java.lang.String",
		"setStatus-setReason": "java.lang.String",
		"setStatus-setConditions": ["ref3-io.fabric8.kubernetes.api.model.PodCondition"],
		"setStatus-setPhase": "java.lang.String",
		"setStatus-setContainerStatuses": ["ref4-io.fabric8.kubernetes.api.model.ContainerStatus"],
		"setStatus-setInitContainerStatuses": ["ref5-io.fabric8.kubernetes.api.model.ContainerStatus"],
		"setStatus-setHostIP": "java.lang.String",
		"setStatus-setStartTime": "java.lang.String",
		"setStatus-setPodIP": "java.lang.String",
		"setStatus-setQosClass": "java.lang.String",
		"setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setImagePullSecrets": ["ref6-io.fabric8.kubernetes.api.model.LocalObjectReference"],
		"setSpec-setVolumes": ["ref7-io.fabric8.kubernetes.api.model.Volume"],
		"setSpec-setVolumes-setConfigMap-setDefaultMode": "java.lang.Integer",
		"setSpec-setVolumes-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setVolumes-setDownwardAPI-setItems": ["ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setVolumes-setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setSpec-setVolumes-setEmptyDir-setMedium": "java.lang.String",
		"setSpec-setVolumes-setEmptyDir-setSizeLimit-setAmount": "java.lang.String",
		"setSpec-setVolumes-setEmptyDir-setSizeLimit-setFormat": "java.lang.String",
		"setSpec-setVolumes-setFc-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setFc-setFsType": "java.lang.String",
		"setSpec-setVolumes-setFc-setTargetWWNs": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setVolumes-setFc-setLun": "java.lang.Integer",
		"setSpec-setVolumes-setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setFlexVolume-setFsType": "java.lang.String",
		"setSpec-setVolumes-setFlexVolume-setSecretRef-setName": "java.lang.String",
		"setSpec-setVolumes-setFlexVolume-setDriver": "java.lang.String",
		"setSpec-setVolumes-setFlexVolume-setOptions": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setVolumes-setFlocker-setDatasetUUID": "java.lang.String",
		"setSpec-setVolumes-setFlocker-setDatasetName": "java.lang.String",
		"setSpec-setVolumes-setGitRepo-setRevision": "java.lang.String",
		"setSpec-setVolumes-setGitRepo-setDirectory": "java.lang.String",
		"setSpec-setVolumes-setGitRepo-setRepository": "java.lang.String",
		"setSpec-setVolumes-setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setGlusterfs-setPath": "java.lang.String",
		"setSpec-setVolumes-setGlusterfs-setEndpoints": "java.lang.String",
		"setSpec-setVolumes-setHostPath-setPath": "java.lang.String",
		"setSpec-setVolumes-setIscsi-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setIscsi-setFsType": "java.lang.String",
		"setSpec-setVolumes-setIscsi-setSecretRef-setName": "java.lang.String",
		"setSpec-setVolumes-setIscsi-setLun": "java.lang.Integer",
		"setSpec-setVolumes-setIscsi-setIqn": "java.lang.String",
		"setSpec-setVolumes-setIscsi-setTargetPortal": "java.lang.String",
		"setSpec-setVolumes-setIscsi-setPortals": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setVolumes-setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setSpec-setVolumes-setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setSpec-setVolumes-setIscsi-setIscsiInterface": "java.lang.String",
		"setSpec-setVolumes-setNfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setNfs-setPath": "java.lang.String",
		"setSpec-setVolumes-setNfs-setServer": "java.lang.String",
		"setSpec-setVolumes-setProjected-setDefaultMode": "java.lang.Integer",
		"setSpec-setVolumes-setProjected-setSources": ["ref10-io.fabric8.kubernetes.api.model.VolumeProjection"],
		"setSpec-setVolumes-setProjected-setSources-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setVolumes-setProjected-setSources-setDownwardAPI-setItems": ["ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setVolumes-setProjected-setSources-setSecret-setName": "java.lang.String",
		"setSpec-setVolumes-setProjected-setSources-setSecret-setItems": ["ref13-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setVolumes-setProjected-setSources-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setVolumes-setQuobyte-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setQuobyte-setUser": "java.lang.String",
		"setSpec-setVolumes-setQuobyte-setRegistry": "java.lang.String",
		"setSpec-setVolumes-setQuobyte-setGroup": "java.lang.String",
		"setSpec-setVolumes-setQuobyte-setVolume": "java.lang.String",
		"setSpec-setVolumes-setRbd-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setRbd-setFsType": "java.lang.String",
		"setSpec-setVolumes-setRbd-setUser": "java.lang.String",
		"setSpec-setVolumes-setRbd-setSecretRef-setName": "java.lang.String",
		"setSpec-setVolumes-setRbd-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setVolumes-setRbd-setImage": "java.lang.String",
		"setSpec-setVolumes-setRbd-setPool": "java.lang.String",
		"setSpec-setVolumes-setRbd-setKeyring": "java.lang.String",
		"setSpec-setVolumes-setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setScaleIO-setFsType": "java.lang.String",
		"setSpec-setVolumes-setScaleIO-setSecretRef-setName": "java.lang.String",
		"setSpec-setVolumes-setScaleIO-setStorageMode": "java.lang.String",
		"setSpec-setVolumes-setScaleIO-setStoragePool": "java.lang.String",
		"setSpec-setVolumes-setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setSpec-setVolumes-setScaleIO-setGateway": "java.lang.String",
		"setSpec-setVolumes-setScaleIO-setVolumeName": "java.lang.String",
		"setSpec-setVolumes-setScaleIO-setSystem": "java.lang.String",
		"setSpec-setVolumes-setScaleIO-setProtectionDomain": "java.lang.String",
		"setSpec-setVolumes-setSecret-setItems": ["ref14-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setVolumes-setSecret-setSecretName": "java.lang.String",
		"setSpec-setVolumes-setSecret-setDefaultMode": "java.lang.Integer",
		"setSpec-setVolumes-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setVolumes-setStorageos-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setStorageos-setFsType": "java.lang.String",
		"setSpec-setVolumes-setStorageos-setSecretRef-setName": "java.lang.String",
		"setSpec-setVolumes-setStorageos-setVolumeName": "java.lang.String",
		"setSpec-setVolumes-setStorageos-setVolumeNamespace": "java.lang.String",
		"setSpec-setVolumes-setVsphereVolume-setFsType": "java.lang.String",
		"setSpec-setVolumes-setVsphereVolume-setVolumePath": "java.lang.String",
		"setSpec-setVolumes-setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setSpec-setVolumes-setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setSpec-setVolumes-setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setSpec-setVolumes-setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSpec-setVolumes-setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSpec-setVolumes-setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setGcePersistentDisk-setFsType": "java.lang.String",
		"setSpec-setVolumes-setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setSpec-setVolumes-setGcePersistentDisk-setPdName": "java.lang.String",
		"setSpec-setVolumes-setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setSpec-setVolumes-setPhotonPersistentDisk-setFsType": "java.lang.String",
		"setSpec-setVolumes-setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setSpec-setVolumes-setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setVolumes-setPortworxVolume-setFsType": "java.lang.String",
		"setSpec-setVolumes-setPortworxVolume-setVolumeID": "java.lang.String",
		"setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm"],
		"setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setWeight": "java.lang.Integer",
		"setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm"],
		"setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setContainers": ["ref27-io.fabric8.kubernetes.api.model.Container"],
		"setSpec-setContainers-setLifecycle-setPreStop-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPath": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHost": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHttpHeaders": ["ref30-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPostStart-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPath": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHost": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHttpHeaders": ["ref31-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setContainers-setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setContainers-setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setContainers-setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setContainers-setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setContainers-setLivenessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setContainers-setLivenessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setContainers-setLivenessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setContainers-setLivenessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setContainers-setLivenessProbe-setHttpGet-setHttpHeaders": ["ref32-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setContainers-setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setContainers-setLivenessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setContainers-setPorts": ["ref33-io.fabric8.kubernetes.api.model.ContainerPort"],
		"setSpec-setContainers-setResources-setRequests": {
			"java.lang.String0": "ref34-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setContainers-setResources-setLimits": {
			"java.lang.String0": "ref35-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setContainers-setStdin": "java.lang.Boolean",
		"setSpec-setContainers-setStdinOnce": "java.lang.Boolean",
		"setSpec-setContainers-setTty": "java.lang.Boolean",
		"setSpec-setContainers-setVolumeMounts": ["ref36-io.fabric8.kubernetes.api.model.VolumeMount"],
		"setSpec-setContainers-setWorkingDir": "java.lang.String",
		"setSpec-setContainers-setImagePullPolicy": "java.lang.String",
		"setSpec-setContainers-setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setContainers-setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setContainers-setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setContainers-setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setContainers-setReadinessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setContainers-setReadinessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setContainers-setReadinessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setContainers-setReadinessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setContainers-setReadinessProbe-setHttpGet-setHttpHeaders": ["ref37-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setContainers-setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setContainers-setReadinessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setContainers-setTerminationMessagePath": "java.lang.String",
		"setSpec-setContainers-setTerminationMessagePolicy": "java.lang.String",
		"setSpec-setContainers-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setContainers-setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSpec-setContainers-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setContainers-setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setSpec-setContainers-setSecurityContext-setCapabilities-setAdd": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setContainers-setSecurityContext-setCapabilities-setDrop": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setDnsPolicy": "java.lang.String",
		"setSpec-setHostAliases": ["ref38-io.fabric8.kubernetes.api.model.HostAlias"],
		"setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setHostNetwork": "java.lang.Boolean",
		"setSpec-setHostPID": "java.lang.Boolean",
		"setSpec-setHostname": "java.lang.String",
		"setSpec-setNodeName": "java.lang.String",
		"setSpec-setNodeSelector": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setRestartPolicy": "java.lang.String",
		"setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setSubdomain": "java.lang.String",
		"setSpec-setTolerations": ["ref39-io.fabric8.kubernetes.api.model.Toleration"],
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setSecurityContext-setFsGroup": "java.lang.Long",
		"setSpec-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setSecurityContext-setSupplementalGroups": ["ref40-java.lang.Long"],
		"setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setServiceAccountName": "java.lang.String",
		"setSpec-setTerminationGracePeriodSeconds": "java.lang.Long"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.PodCondition": {
		"setStatus": "java.lang.String",
		"setLastTransitionTime": "java.lang.String",
		"setType": "java.lang.String",
		"setMessage": "java.lang.String",
		"setReason": "java.lang.String",
		"setLastProbeTime": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.ContainerStatus": {
		"setName": "java.lang.String",
		"setImage": "java.lang.String",
		"setContainerID": "java.lang.String",
		"setLastState-setWaiting-setMessage": "java.lang.String",
		"setLastState-setWaiting-setReason": "java.lang.String",
		"setLastState-setTerminated-setMessage": "java.lang.String",
		"setLastState-setTerminated-setReason": "java.lang.String",
		"setLastState-setTerminated-setContainerID": "java.lang.String",
		"setLastState-setTerminated-setSignal": "java.lang.Integer",
		"setLastState-setTerminated-setExitCode": "java.lang.Integer",
		"setLastState-setTerminated-setFinishedAt": "java.lang.String",
		"setLastState-setTerminated-setStartedAt": "java.lang.String",
		"setLastState-setRunning-setStartedAt": "java.lang.String",
		"setImageID": "java.lang.String",
		"setReady": "java.lang.Boolean",
		"setRestartCount": "java.lang.Integer",
		"setState-setWaiting-setMessage": "java.lang.String",
		"setState-setWaiting-setReason": "java.lang.String",
		"setState-setTerminated-setMessage": "java.lang.String",
		"setState-setTerminated-setReason": "java.lang.String",
		"setState-setTerminated-setContainerID": "java.lang.String",
		"setState-setTerminated-setSignal": "java.lang.Integer",
		"setState-setTerminated-setExitCode": "java.lang.Integer",
		"setState-setTerminated-setFinishedAt": "java.lang.String",
		"setState-setTerminated-setStartedAt": "java.lang.String",
		"setState-setRunning-setStartedAt": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.ContainerStatus": {
		"setName": "java.lang.String",
		"setImage": "java.lang.String",
		"setContainerID": "java.lang.String",
		"setLastState-setWaiting-setMessage": "java.lang.String",
		"setLastState-setWaiting-setReason": "java.lang.String",
		"setLastState-setTerminated-setMessage": "java.lang.String",
		"setLastState-setTerminated-setReason": "java.lang.String",
		"setLastState-setTerminated-setContainerID": "java.lang.String",
		"setLastState-setTerminated-setSignal": "java.lang.Integer",
		"setLastState-setTerminated-setExitCode": "java.lang.Integer",
		"setLastState-setTerminated-setFinishedAt": "java.lang.String",
		"setLastState-setTerminated-setStartedAt": "java.lang.String",
		"setLastState-setRunning-setStartedAt": "java.lang.String",
		"setImageID": "java.lang.String",
		"setReady": "java.lang.Boolean",
		"setRestartCount": "java.lang.Integer",
		"setState-setWaiting-setMessage": "java.lang.String",
		"setState-setWaiting-setReason": "java.lang.String",
		"setState-setTerminated-setMessage": "java.lang.String",
		"setState-setTerminated-setReason": "java.lang.String",
		"setState-setTerminated-setContainerID": "java.lang.String",
		"setState-setTerminated-setSignal": "java.lang.Integer",
		"setState-setTerminated-setExitCode": "java.lang.Integer",
		"setState-setTerminated-setFinishedAt": "java.lang.String",
		"setState-setTerminated-setStartedAt": "java.lang.String",
		"setState-setRunning-setStartedAt": "java.lang.String"
	},
	"ref6-io.fabric8.kubernetes.api.model.LocalObjectReference": {
		"setName": "java.lang.String"
	},
	"ref7-io.fabric8.kubernetes.api.model.Volume": {
		"setName": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setAzureDisk-setFsType": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setAzureFile-setShareName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setCephfs-setPath": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setCephfs-setSecretRef-setName": "java.lang.String",
		"setCephfs-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setCephfs-setSecretFile": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setCinder-setFsType": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setVolumes-setConfigMap-setItems": ["ref8-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref8-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref9-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref10-io.fabric8.kubernetes.api.model.VolumeProjection": {
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setVolumes-setProjected-setSources-setConfigMap-setItems": ["ref11-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref11-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref12-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref13-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref14-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref15-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm": {
		"setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPreference-setMatchExpressions": ["ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref16-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref17-io.fabric8.kubernetes.api.model.NodeSelectorTerm": {
		"setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms-setMatchExpressions": ["ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref18-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref19-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref20-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref21-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref22-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref23-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref24-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref25-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref26-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref27-io.fabric8.kubernetes.api.model.Container": {
		"setName": "java.lang.String",
		"setImage": "java.lang.String",
		"setArgs": ["java.lang.String0", "java.lang.String1"],
		"setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setContainers-setEnv": ["ref28-io.fabric8.kubernetes.api.model.EnvVar"]
	},
	"ref28-io.fabric8.kubernetes.api.model.EnvVar": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String",
		"setValueFrom-setFieldRef-setFieldPath": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setResource": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setContainerName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setKey": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setValueFrom-setSecretKeyRef-setName": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setKey": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setSpec-setContainers-setEnvFrom": ["ref29-io.fabric8.kubernetes.api.model.EnvFromSource"]
	},
	"ref29-io.fabric8.kubernetes.api.model.EnvFromSource": {
		"setSecretRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref30-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref31-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref32-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref33-io.fabric8.kubernetes.api.model.ContainerPort": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer",
		"setProtocol": "java.lang.String"
	},
	"ref34-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref35-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref36-io.fabric8.kubernetes.api.model.VolumeMount": {
		"setReadOnly": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setSubPath": "java.lang.String",
		"setMountPath": "java.lang.String"
	},
	"ref37-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref38-io.fabric8.kubernetes.api.model.HostAlias": {
		"setHostnames": ["java.lang.String0", "java.lang.String1"],
		"setIp": "java.lang.String"
	},
	"ref39-io.fabric8.kubernetes.api.model.Toleration": {
		"setValue": "java.lang.String",
		"setEffect": "java.lang.String",
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long"
	}
}
```
## Kubernetes ConfigMap parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setData": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		}
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	}
}
```
## Kubernetes NetworkPolicy parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setSpec-setIngress": ["ref3-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule"],
		"setSpec-setIngress-setFrom": ["ref5-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer"],
		"setSpec-setIngress-setFrom-setPodSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setIngress-setFrom-setPodSelector-setMatchExpressions": ["ref7-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"],
		"setSpec-setPodSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setPodSelector-setMatchExpressions": ["ref8-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule": {
		"setSpec-setIngress-setPorts": ["ref4-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort"]
	},
	"ref4-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort": {
		"setPort-setIntVal": "java.lang.Integer",
		"setPort-setStrVal": "java.lang.String",
		"setProtocol": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer": {
		"setNamespaceSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setIngress-setFrom-setNamespaceSelector-setMatchExpressions": ["ref6-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref6-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref7-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref8-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	}
}
```
## Kubernetes CustomResourceDefinition parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setConditions": ["ref3-io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition"],
		"setStatus-setAcceptedNames-setPlural": "java.lang.String",
		"setStatus-setAcceptedNames-setShortNames": ["java.lang.String0", "java.lang.String1"],
		"setStatus-setAcceptedNames-setSingular": "java.lang.String",
		"setStatus-setAcceptedNames-setListKind": "java.lang.String",
		"setSpec-setNames-setPlural": "java.lang.String",
		"setSpec-setNames-setShortNames": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setNames-setSingular": "java.lang.String",
		"setSpec-setNames-setListKind": "java.lang.String",
		"setSpec-setGroup": "java.lang.String",
		"setSpec-setVersion": "java.lang.String",
		"setSpec-setScope": "java.lang.String"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition": {
		"setStatus": "java.lang.String",
		"setLastTransitionTime": "java.lang.String",
		"setType": "java.lang.String",
		"setMessage": "java.lang.String",
		"setReason": "java.lang.String"
	}
}
```
## Kubernetes Ingress parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setLoadBalancer-setIngress": ["ref3-io.fabric8.kubernetes.api.model.LoadBalancerIngress"],
		"setSpec-setBackend-setServiceName": "java.lang.String",
		"setSpec-setBackend-setServicePort-setIntVal": "java.lang.Integer",
		"setSpec-setBackend-setServicePort-setStrVal": "java.lang.String",
		"setSpec-setRules": ["ref4-io.fabric8.kubernetes.api.model.extensions.IngressRule"],
		"setSpec-setTls": ["ref6-io.fabric8.kubernetes.api.model.extensions.IngressTLS"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.LoadBalancerIngress": {
		"setHostname": "java.lang.String",
		"setIp": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.extensions.IngressRule": {
		"setHost": "java.lang.String",
		"setSpec-setRules-setHttp-setPaths": ["ref5-io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath"]
	},
	"ref5-io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath": {
		"setPath": "java.lang.String",
		"setBackend-setServiceName": "java.lang.String",
		"setBackend-setServicePort-setIntVal": "java.lang.Integer",
		"setBackend-setServicePort-setStrVal": "java.lang.String"
	},
	"ref6-io.fabric8.kubernetes.api.model.extensions.IngressTLS": {
		"setSecretName": "java.lang.String",
		"setHosts": ["java.lang.String0", "java.lang.String1"]
	}
}
```
## Kubernetes Service parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setLoadBalancer-setIngress": ["ref3-io.fabric8.kubernetes.api.model.LoadBalancerIngress"],
		"setSpec-setSelector": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setPorts": ["ref4-io.fabric8.kubernetes.api.model.ServicePort"],
		"setSpec-setType": "java.lang.String",
		"setSpec-setExternalTrafficPolicy": "java.lang.String",
		"setSpec-setHealthCheckNodePort": "java.lang.Integer",
		"setSpec-setLoadBalancerIP": "java.lang.String",
		"setSpec-setLoadBalancerSourceRanges": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setClusterIP": "java.lang.String",
		"setSpec-setExternalIPs": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setExternalName": "java.lang.String",
		"setSpec-setSessionAffinity": "java.lang.String"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.LoadBalancerIngress": {
		"setHostname": "java.lang.String",
		"setIp": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.ServicePort": {
		"setName": "java.lang.String",
		"setPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setNodePort": "java.lang.Integer",
		"setTargetPort-setIntVal": "java.lang.Integer",
		"setTargetPort-setStrVal": "java.lang.String"
	}
}
```
## Kubernetes SecurityContextConstraint parameterss:

```
{
	"main": {
		"setPriority": "java.lang.Integer",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setAllowHostIPC": "java.lang.Boolean",
		"setAllowHostPID": "java.lang.Boolean",
		"setFsGroup-setType": "java.lang.String",
		"setFsGroup-setRanges": ["ref3-io.fabric8.openshift.api.model.IDRange"],
		"setGroups": ["java.lang.String0", "java.lang.String1"],
		"setRunAsUser-setType": "java.lang.String",
		"setRunAsUser-setUidRangeMin": "java.lang.Long",
		"setRunAsUser-setUidRangeMax": "java.lang.Long",
		"setUsers": ["java.lang.String0", "java.lang.String1"],
		"setVolumes": ["java.lang.String0", "java.lang.String1"],
		"setAllowHostDirVolumePlugin": "java.lang.Boolean",
		"setAllowHostNetwork": "java.lang.Boolean",
		"setAllowHostPorts": "java.lang.Boolean",
		"setAllowPrivilegedContainer": "java.lang.Boolean",
		"setAllowedCapabilities": ["java.lang.String0", "java.lang.String1"],
		"setDefaultAddCapabilities": ["java.lang.String0", "java.lang.String1"],
		"setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setRequiredDropCapabilities": ["java.lang.String0", "java.lang.String1"],
		"setSeLinuxContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSeLinuxContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSeLinuxContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSeLinuxContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSeLinuxContext-setType": "java.lang.String",
		"setSeccompProfiles": ["java.lang.String0", "java.lang.String1"],
		"setSupplementalGroups-setType": "java.lang.String",
		"setSupplementalGroups-setRanges": ["ref4-io.fabric8.openshift.api.model.IDRange"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.openshift.api.model.IDRange": {
		"setMin": "java.lang.Long",
		"setMax": "java.lang.Long"
	},
	"ref4-io.fabric8.openshift.api.model.IDRange": {
		"setMin": "java.lang.Long",
		"setMax": "java.lang.Long"
	}
}
```
## Kubernetes Namespace parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setPhase": "java.lang.String",
		"setSpec-setFinalizers": ["java.lang.String0", "java.lang.String1"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	}
}
```
## Kubernetes Secret parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setData": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setType": "java.lang.String",
		"setStringData": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		}
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	}
}
```
## Kubernetes LimitRange parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setSpec-setLimits": ["ref3-io.fabric8.kubernetes.api.model.LimitRangeItem"],
		"setSpec-setLimits-setType": "java.lang.String",
		"setSpec-setLimits-setDefaultRequest": {
			"java.lang.String0": "ref5-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setLimits-setMaxLimitRequestRatio": {
			"java.lang.String0": "ref6-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setLimits-setMin": {
			"java.lang.String0": "ref7-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setLimits-setMax": {
			"java.lang.String0": "ref8-io.fabric8.kubernetes.api.model.Quantity"
		}
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.LimitRangeItem": {
		"setSpec-setLimits-setDefault": {
			"java.lang.String0": "ref4-io.fabric8.kubernetes.api.model.Quantity"
		}
	},
	"ref4-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref5-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref6-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref7-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref8-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	}
}
```

## Kubernetes HorizontalPodAutoscaler parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setStatus-setCurrentCPUUtilizationPercentage": "java.lang.Integer",
		"setStatus-setLastScaleTime": "java.lang.String",
		"setStatus-setCurrentReplicas": "java.lang.Integer",
		"setStatus-setDesiredReplicas": "java.lang.Integer",
		"setSpec-setTargetCPUUtilizationPercentage": "java.lang.Integer",
		"setSpec-setMaxReplicas": "java.lang.Integer",
		"setSpec-setMinReplicas": "java.lang.Integer",
		"setSpec-setScaleTargetRef-setName": "java.lang.String"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	}
}
```
## Kubernetes Event parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setType": "java.lang.String",
		"setCount": "java.lang.Integer",
		"setLastTimestamp": "java.lang.String",
		"setMessage": "java.lang.String",
		"setReason": "java.lang.String",
		"setSource-setHost": "java.lang.String",
		"setSource-setComponent": "java.lang.String",
		"setFirstTimestamp": "java.lang.String",
		"setInvolvedObject-setName": "java.lang.String",
		"setInvolvedObject-setNamespace": "java.lang.String",
		"setInvolvedObject-setFieldPath": "java.lang.String",
		"setInvolvedObject-setResourceVersion": "java.lang.String"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	}
}
```
## Kubernetes DaemonSet parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setCollisionCount": "java.lang.Long",
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setStatus-setNumberReady": "java.lang.Integer",
		"setStatus-setCurrentNumberScheduled": "java.lang.Integer",
		"setStatus-setDesiredNumberScheduled": "java.lang.Integer",
		"setStatus-setNumberAvailable": "java.lang.Integer",
		"setStatus-setNumberMisscheduled": "java.lang.Integer",
		"setStatus-setNumberUnavailable": "java.lang.Integer",
		"setStatus-setUpdatedNumberScheduled": "java.lang.Integer",
		"setSpec-setMinReadySeconds": "java.lang.Integer",
		"setSpec-setRevisionHistoryLimit": "java.lang.Integer",
		"setSpec-setTemplate-setMetadata-setName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setNamespace": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setClusterName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setGeneration": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setInitializers-setPending": ["ref3-io.fabric8.kubernetes.api.model.Initializer"],
		"setSpec-setTemplate-setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setDeletionTimestamp": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setOwnerReferences": ["ref4-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setSpec-setTemplate-setMetadata-setResourceVersion": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setImagePullSecrets": ["ref5-io.fabric8.kubernetes.api.model.LocalObjectReference"],
		"setSpec-setTemplate-setSpec-setVolumes": ["ref6-io.fabric8.kubernetes.api.model.Volume"],
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setItems": ["ref8-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setMedium": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setAmount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setFormat": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setTargetWWNs": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setDriver": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setOptions": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetUUID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRevision": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setDirectory": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRepository": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setEndpoints": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setHostPath-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIqn": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setTargetPortal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setPortals": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIscsiInterface": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setServer": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources": ["ref9-io.fabric8.kubernetes.api.model.VolumeProjection"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setDownwardAPI-setItems": ["ref11-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setItems": ["ref12-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setRegistry": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setGroup": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setVolume": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setImage": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setPool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setKeyring": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStorageMode": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStoragePool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setGateway": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSystem": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setProtectionDomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setItems": ["ref13-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setSecretName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeNamespace": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setVolumePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPdName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref14-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setWeight": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref16-io.fabric8.kubernetes.api.model.NodeSelectorTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref18-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref20-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref22-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref24-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setContainers": ["ref26-io.fabric8.kubernetes.api.model.Container"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHttpHeaders": ["ref29-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHttpHeaders": ["ref30-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHttpHeaders": ["ref31-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setPorts": ["ref32-io.fabric8.kubernetes.api.model.ContainerPort"],
		"setSpec-setTemplate-setSpec-setContainers-setResources-setRequests": {
			"java.lang.String0": "ref33-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setResources-setLimits": {
			"java.lang.String0": "ref34-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setStdin": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setStdinOnce": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setTty": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setVolumeMounts": ["ref35-io.fabric8.kubernetes.api.model.VolumeMount"],
		"setSpec-setTemplate-setSpec-setContainers-setWorkingDir": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setImagePullPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHttpHeaders": ["ref36-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setAdd": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setDrop": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setDnsPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setHostAliases": ["ref37-io.fabric8.kubernetes.api.model.HostAlias"],
		"setSpec-setTemplate-setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostNetwork": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostPID": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostname": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeSelector": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setRestartPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSubdomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTolerations": ["ref38-io.fabric8.kubernetes.api.model.Toleration"],
		"setSpec-setTemplate-setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setFsGroup": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSupplementalGroups": ["ref39-java.lang.Long"],
		"setSpec-setTemplate-setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setServiceAccountName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setSelector-setMatchExpressions": ["ref40-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"],
		"setSpec-setTemplateGeneration": "java.lang.Long",
		"setSpec-setUpdateStrategy-setRollingUpdate-setMaxUnavailable-setIntVal": "java.lang.Integer",
		"setSpec-setUpdateStrategy-setRollingUpdate-setMaxUnavailable-setStrVal": "java.lang.String",
		"setSpec-setUpdateStrategy-setType": "java.lang.String"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref5-io.fabric8.kubernetes.api.model.LocalObjectReference": {
		"setName": "java.lang.String"
	},
	"ref6-io.fabric8.kubernetes.api.model.Volume": {
		"setName": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setAzureDisk-setFsType": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setAzureFile-setShareName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setCephfs-setPath": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setCephfs-setSecretRef-setName": "java.lang.String",
		"setCephfs-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setCephfs-setSecretFile": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setCinder-setFsType": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setItems": ["ref7-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref7-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref8-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref9-io.fabric8.kubernetes.api.model.VolumeProjection": {
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setItems": ["ref10-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref10-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref11-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref12-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref13-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref14-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPreference-setMatchExpressions": ["ref15-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref15-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref16-io.fabric8.kubernetes.api.model.NodeSelectorTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms-setMatchExpressions": ["ref17-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref17-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref18-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref19-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref19-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref20-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref21-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref21-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref22-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref23-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref23-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref24-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref25-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref25-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref26-io.fabric8.kubernetes.api.model.Container": {
		"setName": "java.lang.String",
		"setImage": "java.lang.String",
		"setArgs": ["java.lang.String0", "java.lang.String1"],
		"setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setEnv": ["ref27-io.fabric8.kubernetes.api.model.EnvVar"]
	},
	"ref27-io.fabric8.kubernetes.api.model.EnvVar": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String",
		"setValueFrom-setFieldRef-setFieldPath": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setResource": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setContainerName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setKey": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setValueFrom-setSecretKeyRef-setName": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setKey": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setEnvFrom": ["ref28-io.fabric8.kubernetes.api.model.EnvFromSource"]
	},
	"ref28-io.fabric8.kubernetes.api.model.EnvFromSource": {
		"setSecretRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref29-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref30-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref31-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref32-io.fabric8.kubernetes.api.model.ContainerPort": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer",
		"setProtocol": "java.lang.String"
	},
	"ref33-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref34-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref35-io.fabric8.kubernetes.api.model.VolumeMount": {
		"setReadOnly": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setSubPath": "java.lang.String",
		"setMountPath": "java.lang.String"
	},
	"ref36-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref37-io.fabric8.kubernetes.api.model.HostAlias": {
		"setHostnames": ["java.lang.String0", "java.lang.String1"],
		"setIp": "java.lang.String"
	},
	"ref38-io.fabric8.kubernetes.api.model.Toleration": {
		"setValue": "java.lang.String",
		"setEffect": "java.lang.String",
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long"
	},
	"ref40-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	}
}
```
## Kubernetes PersistentVolumeClaim parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setCapacity": {
			"java.lang.String0": "ref3-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setStatus-setPhase": "java.lang.String",
		"setStatus-setAccessModes": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setSelector-setMatchExpressions": ["ref4-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"],
		"setSpec-setVolumeName": "java.lang.String",
		"setSpec-setResources-setRequests": {
			"java.lang.String0": "ref5-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setResources-setLimits": {
			"java.lang.String0": "ref6-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setAccessModes": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setStorageClassName": "java.lang.String"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref5-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref6-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	}
}
```
## Kubernetes PersistentVolume parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setMessage": "java.lang.String",
		"setStatus-setReason": "java.lang.String",
		"setStatus-setPhase": "java.lang.String",
		"setSpec-setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setSpec-setAzureDisk-setFsType": "java.lang.String",
		"setSpec-setAzureDisk-setCachingMode": "java.lang.String",
		"setSpec-setAzureDisk-setDiskName": "java.lang.String",
		"setSpec-setAzureDisk-setDiskURI": "java.lang.String",
		"setSpec-setAzureFile-setReadOnly": "java.lang.Boolean",
		"setSpec-setAzureFile-setShareName": "java.lang.String",
		"setSpec-setAzureFile-setSecretName": "java.lang.String",
		"setSpec-setCephfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setCephfs-setPath": "java.lang.String",
		"setSpec-setCephfs-setUser": "java.lang.String",
		"setSpec-setCephfs-setSecretRef-setName": "java.lang.String",
		"setSpec-setCephfs-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setCephfs-setSecretFile": "java.lang.String",
		"setSpec-setCinder-setReadOnly": "java.lang.Boolean",
		"setSpec-setCinder-setFsType": "java.lang.String",
		"setSpec-setCinder-setVolumeID": "java.lang.String",
		"setSpec-setFc-setReadOnly": "java.lang.Boolean",
		"setSpec-setFc-setFsType": "java.lang.String",
		"setSpec-setFc-setTargetWWNs": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setFc-setLun": "java.lang.Integer",
		"setSpec-setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setFlexVolume-setFsType": "java.lang.String",
		"setSpec-setFlexVolume-setSecretRef-setName": "java.lang.String",
		"setSpec-setFlexVolume-setDriver": "java.lang.String",
		"setSpec-setFlexVolume-setOptions": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setFlocker-setDatasetUUID": "java.lang.String",
		"setSpec-setFlocker-setDatasetName": "java.lang.String",
		"setSpec-setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setGlusterfs-setPath": "java.lang.String",
		"setSpec-setGlusterfs-setEndpoints": "java.lang.String",
		"setSpec-setHostPath-setPath": "java.lang.String",
		"setSpec-setIscsi-setReadOnly": "java.lang.Boolean",
		"setSpec-setIscsi-setFsType": "java.lang.String",
		"setSpec-setIscsi-setSecretRef-setName": "java.lang.String",
		"setSpec-setIscsi-setLun": "java.lang.Integer",
		"setSpec-setIscsi-setIqn": "java.lang.String",
		"setSpec-setIscsi-setTargetPortal": "java.lang.String",
		"setSpec-setIscsi-setPortals": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setSpec-setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setSpec-setIscsi-setIscsiInterface": "java.lang.String",
		"setSpec-setNfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setNfs-setPath": "java.lang.String",
		"setSpec-setNfs-setServer": "java.lang.String",
		"setSpec-setQuobyte-setReadOnly": "java.lang.Boolean",
		"setSpec-setQuobyte-setUser": "java.lang.String",
		"setSpec-setQuobyte-setRegistry": "java.lang.String",
		"setSpec-setQuobyte-setGroup": "java.lang.String",
		"setSpec-setQuobyte-setVolume": "java.lang.String",
		"setSpec-setRbd-setReadOnly": "java.lang.Boolean",
		"setSpec-setRbd-setFsType": "java.lang.String",
		"setSpec-setRbd-setUser": "java.lang.String",
		"setSpec-setRbd-setSecretRef-setName": "java.lang.String",
		"setSpec-setRbd-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setRbd-setImage": "java.lang.String",
		"setSpec-setRbd-setPool": "java.lang.String",
		"setSpec-setRbd-setKeyring": "java.lang.String",
		"setSpec-setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSpec-setScaleIO-setFsType": "java.lang.String",
		"setSpec-setScaleIO-setSecretRef-setName": "java.lang.String",
		"setSpec-setScaleIO-setStorageMode": "java.lang.String",
		"setSpec-setScaleIO-setStoragePool": "java.lang.String",
		"setSpec-setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setSpec-setScaleIO-setGateway": "java.lang.String",
		"setSpec-setScaleIO-setVolumeName": "java.lang.String",
		"setSpec-setScaleIO-setSystem": "java.lang.String",
		"setSpec-setScaleIO-setProtectionDomain": "java.lang.String",
		"setSpec-setStorageos-setReadOnly": "java.lang.Boolean",
		"setSpec-setStorageos-setFsType": "java.lang.String",
		"setSpec-setStorageos-setSecretRef-setName": "java.lang.String",
		"setSpec-setStorageos-setSecretRef-setNamespace": "java.lang.String",
		"setSpec-setStorageos-setSecretRef-setFieldPath": "java.lang.String",
		"setSpec-setStorageos-setSecretRef-setResourceVersion": "java.lang.String",
		"setSpec-setStorageos-setVolumeName": "java.lang.String",
		"setSpec-setStorageos-setVolumeNamespace": "java.lang.String",
		"setSpec-setVsphereVolume-setFsType": "java.lang.String",
		"setSpec-setVsphereVolume-setVolumePath": "java.lang.String",
		"setSpec-setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setSpec-setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setSpec-setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setSpec-setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setSpec-setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSpec-setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSpec-setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setSpec-setGcePersistentDisk-setFsType": "java.lang.String",
		"setSpec-setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setSpec-setGcePersistentDisk-setPdName": "java.lang.String",
		"setSpec-setPhotonPersistentDisk-setFsType": "java.lang.String",
		"setSpec-setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setSpec-setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setPortworxVolume-setFsType": "java.lang.String",
		"setSpec-setPortworxVolume-setVolumeID": "java.lang.String",
		"setSpec-setCapacity": {
			"java.lang.String0": "ref3-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setClaimRef-setName": "java.lang.String",
		"setSpec-setClaimRef-setNamespace": "java.lang.String",
		"setSpec-setClaimRef-setFieldPath": "java.lang.String",
		"setSpec-setClaimRef-setResourceVersion": "java.lang.String",
		"setSpec-setLocal-setPath": "java.lang.String",
		"setSpec-setAccessModes": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setStorageClassName": "java.lang.String",
		"setSpec-setPersistentVolumeReclaimPolicy": "java.lang.String"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	}
}
```
## Kubernetes Componentstatus parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setConditions": ["ref3-io.fabric8.kubernetes.api.model.ComponentCondition"]
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.ComponentCondition": {
		"setError": "java.lang.String",
		"setStatus": "java.lang.String",
		"setType": "java.lang.String",
		"setMessage": "java.lang.String"
	}
}
```
## Kubernetes StatefulSet parameterss:

```
{
	"main": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setInitializers-setPending": ["ref1-io.fabric8.kubernetes.api.model.Initializer"],
		"setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setDeletionTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref2-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setMetadata-setResourceVersion": "java.lang.String",
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setStatus-setUpdatedReplicas": "java.lang.Integer",
		"setStatus-setReplicas": "java.lang.Integer",
		"setStatus-setReadyReplicas": "java.lang.Integer",
		"setStatus-setCurrentReplicas": "java.lang.Integer",
		"setStatus-setCurrentRevision": "java.lang.String",
		"setStatus-setUpdateRevision": "java.lang.String",
		"setSpec-setRevisionHistoryLimit": "java.lang.Integer",
		"setSpec-setReplicas": "java.lang.Integer",
		"setSpec-setTemplate-setMetadata-setName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setNamespace": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setClusterName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setGeneration": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setInitializers-setPending": ["ref3-io.fabric8.kubernetes.api.model.Initializer"],
		"setSpec-setTemplate-setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setTemplate-setMetadata-setDeletionTimestamp": "java.lang.String",
		"setSpec-setTemplate-setMetadata-setOwnerReferences": ["ref4-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setSpec-setTemplate-setMetadata-setResourceVersion": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setImagePullSecrets": ["ref5-io.fabric8.kubernetes.api.model.LocalObjectReference"],
		"setSpec-setTemplate-setSpec-setVolumes": ["ref6-io.fabric8.kubernetes.api.model.Volume"],
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setItems": ["ref8-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setMedium": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setAmount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setEmptyDir-setSizeLimit-setFormat": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setTargetWWNs": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setFc-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setDriver": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlexVolume-setOptions": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetUUID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setFlocker-setDatasetName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRevision": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setDirectory": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGitRepo-setRepository": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGlusterfs-setEndpoints": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setHostPath-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setLun": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIqn": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setTargetPortal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setPortals": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setIscsi-setIscsiInterface": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setNfs-setServer": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources": ["ref9-io.fabric8.kubernetes.api.model.VolumeProjection"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setDownwardAPI-setItems": ["ref11-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setItems": ["ref12-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setRegistry": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setGroup": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setQuobyte-setVolume": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setImage": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setPool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setRbd-setKeyring": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStorageMode": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setStoragePool": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setGateway": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setSystem": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setScaleIO-setProtectionDomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setItems": ["ref13-io.fabric8.kubernetes.api.model.KeyToPath"],
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setSecretName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setDefaultMode": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setSecret-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setSecretRef-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setStorageos-setVolumeNamespace": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setVolumePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setVolumes-setGcePersistentDisk-setPdName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setFsType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setPortworxVolume-setVolumeID": "java.lang.String",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref14-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setWeight": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref16-io.fabric8.kubernetes.api.model.NodeSelectorTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref18-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref20-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref22-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref24-io.fabric8.kubernetes.api.model.PodAffinityTerm"],
		"setSpec-setTemplate-setSpec-setContainers": ["ref26-io.fabric8.kubernetes.api.model.Container"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setHttpGet-setHttpHeaders": ["ref29-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPreStop-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setHttpGet-setHttpHeaders": ["ref30-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLifecycle-setPostStart-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setHttpGet-setHttpHeaders": ["ref31-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setLivenessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setPorts": ["ref32-io.fabric8.kubernetes.api.model.ContainerPort"],
		"setSpec-setTemplate-setSpec-setContainers-setResources-setRequests": {
			"java.lang.String0": "ref33-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setResources-setLimits": {
			"java.lang.String0": "ref34-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setTemplate-setSpec-setContainers-setStdin": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setStdinOnce": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setTty": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setVolumeMounts": ["ref35-io.fabric8.kubernetes.api.model.VolumeMount"],
		"setSpec-setTemplate-setSpec-setContainers-setWorkingDir": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setImagePullPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setExec-setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setPath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setScheme": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setHttpGet-setHttpHeaders": ["ref36-io.fabric8.kubernetes.api.model.HTTPHeader"],
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setIntVal": "java.lang.Integer",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setPort-setStrVal": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setReadinessProbe-setTcpSocket-setHost": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePath": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setTerminationMessagePolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setAdd": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setCapabilities-setDrop": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setContainers-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setDnsPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setHostAliases": ["ref37-io.fabric8.kubernetes.api.model.HostAlias"],
		"setSpec-setTemplate-setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostNetwork": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostPID": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setHostname": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setNodeSelector": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setRestartPolicy": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSubdomain": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTolerations": ["ref38-io.fabric8.kubernetes.api.model.Toleration"],
		"setSpec-setTemplate-setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setFsGroup": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsUser": "java.lang.Long",
		"setSpec-setTemplate-setSpec-setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setUser": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setType": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setRole": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setTemplate-setSpec-setSecurityContext-setSupplementalGroups": ["ref39-java.lang.Long"],
		"setSpec-setTemplate-setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setTemplate-setSpec-setServiceAccountName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setSelector-setMatchExpressions": ["ref40-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"],
		"setSpec-setServiceName": "java.lang.String",
		"setSpec-setPodManagementPolicy": "java.lang.String",
		"setSpec-setVolumeClaimTemplates": ["ref41-io.fabric8.kubernetes.api.model.PersistentVolumeClaim"],
		"setSpec-setVolumeClaimTemplates-setMetadata-setLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setVolumeClaimTemplates-setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setVolumeClaimTemplates-setMetadata-setDeletionTimestamp": "java.lang.String",
		"setSpec-setVolumeClaimTemplates-setMetadata-setOwnerReferences": ["ref43-io.fabric8.kubernetes.api.model.OwnerReference"],
		"setSpec-setVolumeClaimTemplates-setMetadata-setResourceVersion": "java.lang.String",
		"setSpec-setVolumeClaimTemplates-setStatus-setCapacity": {
			"java.lang.String0": "ref44-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setVolumeClaimTemplates-setStatus-setPhase": "java.lang.String",
		"setSpec-setVolumeClaimTemplates-setStatus-setAccessModes": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setVolumeClaimTemplates-setSpec-setSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setVolumeClaimTemplates-setSpec-setSelector-setMatchExpressions": ["ref45-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"],
		"setSpec-setVolumeClaimTemplates-setSpec-setVolumeName": "java.lang.String",
		"setSpec-setVolumeClaimTemplates-setSpec-setResources-setRequests": {
			"java.lang.String0": "ref46-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setVolumeClaimTemplates-setSpec-setResources-setLimits": {
			"java.lang.String0": "ref47-io.fabric8.kubernetes.api.model.Quantity"
		},
		"setSpec-setVolumeClaimTemplates-setSpec-setAccessModes": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setVolumeClaimTemplates-setSpec-setStorageClassName": "java.lang.String",
		"setSpec-setUpdateStrategy-setRollingUpdate-setPartition": "java.lang.Integer",
		"setSpec-setUpdateStrategy-setType": "java.lang.String"
	},
	"ref1-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref2-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref3-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref4-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref5-io.fabric8.kubernetes.api.model.LocalObjectReference": {
		"setName": "java.lang.String"
	},
	"ref6-io.fabric8.kubernetes.api.model.Volume": {
		"setName": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setAzureDisk-setFsType": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setAzureFile-setShareName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setCephfs-setPath": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setCephfs-setSecretRef-setName": "java.lang.String",
		"setCephfs-setMonitors": ["java.lang.String0", "java.lang.String1"],
		"setCephfs-setSecretFile": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setCinder-setFsType": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setConfigMap-setItems": ["ref7-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref7-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref8-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref9-io.fabric8.kubernetes.api.model.VolumeProjection": {
		"setConfigMap-setName": "java.lang.String",
		"setSpec-setTemplate-setSpec-setVolumes-setProjected-setSources-setConfigMap-setItems": ["ref10-io.fabric8.kubernetes.api.model.KeyToPath"]
	},
	"ref10-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref11-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile": {
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref12-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref13-io.fabric8.kubernetes.api.model.KeyToPath": {
		"setKey": "java.lang.String",
		"setPath": "java.lang.String",
		"setMode": "java.lang.Integer"
	},
	"ref14-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPreference-setMatchExpressions": ["ref15-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref15-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref16-io.fabric8.kubernetes.api.model.NodeSelectorTerm": {
		"setSpec-setTemplate-setSpec-setAffinity-setNodeAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms-setMatchExpressions": ["ref17-io.fabric8.kubernetes.api.model.NodeSelectorRequirement"]
	},
	"ref17-io.fabric8.kubernetes.api.model.NodeSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref18-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref19-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref19-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref20-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref21-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref21-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref22-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm": {
		"setWeight": "java.lang.Integer",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setPodAffinityTerm-setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setPodAffinityTerm-setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution-setPodAffinityTerm-setLabelSelector-setMatchExpressions": ["ref23-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref23-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref24-io.fabric8.kubernetes.api.model.PodAffinityTerm": {
		"setTopologyKey": "java.lang.String",
		"setNamespaces": ["java.lang.String0", "java.lang.String1"],
		"setLabelSelector-setMatchLabels": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setSpec-setTemplate-setSpec-setAffinity-setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution-setLabelSelector-setMatchExpressions": ["ref25-io.fabric8.kubernetes.api.model.LabelSelectorRequirement"]
	},
	"ref25-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref26-io.fabric8.kubernetes.api.model.Container": {
		"setName": "java.lang.String",
		"setImage": "java.lang.String",
		"setArgs": ["java.lang.String0", "java.lang.String1"],
		"setCommand": ["java.lang.String0", "java.lang.String1"],
		"setSpec-setTemplate-setSpec-setContainers-setEnv": ["ref27-io.fabric8.kubernetes.api.model.EnvVar"]
	},
	"ref27-io.fabric8.kubernetes.api.model.EnvVar": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String",
		"setValueFrom-setFieldRef-setFieldPath": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setAmount": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setDivisor-setFormat": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setResource": "java.lang.String",
		"setValueFrom-setResourceFieldRef-setContainerName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setName": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setKey": "java.lang.String",
		"setValueFrom-setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setValueFrom-setSecretKeyRef-setName": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setKey": "java.lang.String",
		"setValueFrom-setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setSpec-setTemplate-setSpec-setContainers-setEnvFrom": ["ref28-io.fabric8.kubernetes.api.model.EnvFromSource"]
	},
	"ref28-io.fabric8.kubernetes.api.model.EnvFromSource": {
		"setSecretRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref29-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref30-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref31-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref32-io.fabric8.kubernetes.api.model.ContainerPort": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer",
		"setProtocol": "java.lang.String"
	},
	"ref33-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref34-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref35-io.fabric8.kubernetes.api.model.VolumeMount": {
		"setReadOnly": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setSubPath": "java.lang.String",
		"setMountPath": "java.lang.String"
	},
	"ref36-io.fabric8.kubernetes.api.model.HTTPHeader": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref37-io.fabric8.kubernetes.api.model.HostAlias": {
		"setHostnames": ["java.lang.String0", "java.lang.String1"],
		"setIp": "java.lang.String"
	},
	"ref38-io.fabric8.kubernetes.api.model.Toleration": {
		"setValue": "java.lang.String",
		"setEffect": "java.lang.String",
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long"
	},
	"ref40-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref41-io.fabric8.kubernetes.api.model.PersistentVolumeClaim": {
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setAnnotations": {
			"java.lang.String0": "java.lang.String0",
			"java.lang.String1": "java.lang.String1"
		},
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setFinalizers": ["java.lang.String0", "java.lang.String1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setSpec-setVolumeClaimTemplates-setMetadata-setInitializers-setPending": ["ref42-io.fabric8.kubernetes.api.model.Initializer"]
	},
	"ref42-io.fabric8.kubernetes.api.model.Initializer": {
		"setName": "java.lang.String"
	},
	"ref43-io.fabric8.kubernetes.api.model.OwnerReference": {
		"setName": "java.lang.String",
		"setController": "java.lang.Boolean",
		"setBlockOwnerDeletion": "java.lang.Boolean"
	},
	"ref44-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref45-io.fabric8.kubernetes.api.model.LabelSelectorRequirement": {
		"setKey": "java.lang.String",
		"setOperator": "java.lang.String",
		"setValues": ["java.lang.String0", "java.lang.String1"]
	},
	"ref46-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	},
	"ref47-io.fabric8.kubernetes.api.model.Quantity": {
		"setAmount": "java.lang.String",
		"setFormat": "java.lang.String"
	}
}
```
