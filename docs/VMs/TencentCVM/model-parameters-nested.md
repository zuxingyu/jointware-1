## TencentCVM UpdateInstanceVpcConfig parameters:

```
- setVirtualPrivateCloud = com.tencentcloudapi.cvm.v20170312.models.VirtualPrivateCloud
- 	setPrivateIpAddresses = java.lang.String[]
```
## TencentCVM RenewHosts parameters:

```
- setHostIds = java.lang.String[]
```
## TencentCVM RenewInstances parameters:

```
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
- setInstanceIds = java.lang.String[]
```
## TencentCVM StopInstances parameters:

```
- setForceStop = java.lang.Boolean
- setStopType = java.lang.String
- setStoppedMode = java.lang.String
- setInstanceIds = java.lang.String[]
```
## TencentCVM ModifyKeyPairAttribute parameters:

```
- setKeyName = java.lang.String
- setKeyId = java.lang.String
- setDescription = java.lang.String
```
## TencentCVM DescribeZones parameters:

```
```
## TencentCVM DisassociateInstancesKeyPairs parameters:

```
- setForceStop = java.lang.Boolean
- setInstanceIds = java.lang.String[]
```
## TencentCVM TerminateInstances parameters:

```
- setDryRun = java.lang.Boolean
- setInstanceIds = java.lang.String[]
```
## TencentCVM DeleteImages parameters:

```
- setImageIds = java.lang.String[]
```
## TencentCVM DescribeHosts parameters:

```
- setOffset = java.lang.Integer
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
```
## TencentCVM SyncImages parameters:

```
- setDestinationRegions = java.lang.String[]
```
## TencentCVM DescribeInstanceOperationLogs parameters:

```
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
```
## TencentCVM ResetInstancesPassword parameters:

```
- setForceStop = java.lang.Boolean
- setPassword = java.lang.String
- setUserName = java.lang.String
- setInstanceIds = java.lang.String[]
```
## TencentCVM DescribeImages parameters:

```
- setOffset = java.lang.Integer
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
```
## TencentCVM ImportImage parameters:

```
- setOsVersion = java.lang.String
- setImageUrl = java.lang.String
- setImageName = java.lang.String
- setDryRun = java.lang.Boolean
- setForce = java.lang.Boolean
- setImageDescription = java.lang.String
- setArchitecture = java.lang.String
- setOsType = java.lang.String
```
## TencentCVM DescribeInstanceTypeConfigs parameters:

```
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
```
## TencentCVM InquiryPriceResetInstance parameters:

```
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- 	setPassword = java.lang.String
- 	setKeyIds = java.lang.String[]
```
## TencentCVM DescribeInstanceInternetBandwidthConfigs parameters:

```
- setInstanceId = java.lang.String
```
## TencentCVM RebootInstances parameters:

```
- setForceReboot = java.lang.Boolean
- setInstanceIds = java.lang.String[]
```
## TencentCVM AssociateInstancesKeyPairs parameters:

```
- setForceStop = java.lang.Boolean
- setInstanceIds = java.lang.String[]
```
## TencentCVM ResetInstancesInternetMaxBandwidth parameters:

```
- setInternetAccessible = com.tencentcloudapi.cvm.v20170312.models.InternetAccessible
- 	setInternetChargeType = java.lang.String
- 	setInternetMaxBandwidthOut = java.lang.Integer
- 	setPublicIpAssigned = java.lang.Boolean
- setInstanceIds = java.lang.String[]
```
## TencentCVM DescribeInstances parameters:

```
- setOffset = java.lang.Integer
- setInstanceIds = java.lang.String[]
```
## TencentCVM DescribeKeyPairs parameters:

```
- setOffset = java.lang.Integer
- setKeyIds = java.lang.String[]
```
## TencentCVM DescribeInstanceFamilyConfigs parameters:

```
```
## TencentCVM InquiryPriceRunInstances parameters:

```
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- 	setPassword = java.lang.String
- 	setKeyIds = java.lang.String[]
```
## TencentCVM InquiryPriceResetInstancesType parameters:

```
- setForceStop = java.lang.Boolean
- setInstanceIds = java.lang.String[]
```
## TencentCVM StartInstances parameters:

```
- setInstanceIds = java.lang.String[]
```
## TencentCVM ModifyInstancesAttribute parameters:

```
- setInstanceName = java.lang.String
- setInstanceIds = java.lang.String[]
```
## TencentCVM DescribeInstancesStatus parameters:

```
- setOffset = java.lang.Integer
- setInstanceIds = java.lang.String[]
```
## TencentCVM AllocateHosts parameters:

```
- setHostChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.ChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
- setHostChargeType = java.lang.String
- setClientToken = java.lang.String
- setPlacement = com.tencentcloudapi.cvm.v20170312.models.Placement
- 	setZone = java.lang.String
- 	setProjectId = java.lang.Integer
- 	setHostIds = java.lang.String[]
```
## TencentCVM InquiryPriceResetInstancesInternetMaxBandwidth parameters:

```
- setInternetAccessible = com.tencentcloudapi.cvm.v20170312.models.InternetAccessible
- 	setInternetChargeType = java.lang.String
- 	setInternetMaxBandwidthOut = java.lang.Integer
- 	setPublicIpAssigned = java.lang.Boolean
- setInstanceIds = java.lang.String[]
```
## TencentCVM ModifyImageSharePermission parameters:

```
- setPermission = java.lang.String
- setImageId = java.lang.String
- setAccountIds = java.lang.String[]
```
## TencentCVM ModifyInstancesRenewFlag parameters:

```
- setRenewFlag = java.lang.String
- setInstanceIds = java.lang.String[]
```
## TencentCVM DeleteKeyPairs parameters:

```
- setKeyIds = java.lang.String[]
```
## TencentCVM DescribeImageSharePermission parameters:

```
- setImageId = java.lang.String
```
## TencentCVM ImportKeyPair parameters:

```
- setKeyName = java.lang.String
- setProjectId = java.lang.Integer
- setPublicKey = java.lang.String
```
## TencentCVM ResetInstance parameters:

```
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- 	setPassword = java.lang.String
- 	setKeyIds = java.lang.String[]
```
## TencentCVM QueryMigrateTask parameters:

```
- setTaskId = java.lang.String
```
## TencentCVM DescribeImageQuota parameters:

```
```
## TencentCVM DescribeRegions parameters:

```
```
## TencentCVM CreateImage parameters:

```
- setImageName = java.lang.String
- setForcePoweroff = java.lang.String
- setSysprep = java.lang.String
- setReboot = java.lang.String
- setImageDescription = java.lang.String
- setInstanceId = java.lang.String
```
## TencentCVM DescribeInternetChargeTypeConfigs parameters:

```
```
## TencentCVM ResizeInstanceDisks parameters:

```
- setDataDisks = com.tencentcloudapi.cvm.v20170312.models.DataDisk[]
```
## TencentCVM ModifyImageAttribute parameters:

```
- setImageName = java.lang.String
- setImageId = java.lang.String
- setImageDescription = java.lang.String
```
## TencentCVM ModifyHostsAttribute parameters:

```
- setHostIds = java.lang.String[]
```
## TencentCVM ModifyInstancesProject parameters:

```
- setProjectId = java.lang.Integer
- setInstanceIds = java.lang.String[]
```
## TencentCVM ResetInstancesType parameters:

```
- setForceStop = java.lang.Boolean
- setInstanceIds = java.lang.String[]
```
## TencentCVM InquiryPriceRenewInstances parameters:

```
- setDryRun = java.lang.Boolean
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
- setInstanceIds = java.lang.String[]
```
## TencentCVM DescribeImportImageOs parameters:

```
```
## TencentCVM CreateKeyPair parameters:

```
- setKeyName = java.lang.String
- setProjectId = java.lang.Integer
```
## TencentCVM InquiryPriceResizeInstanceDisks parameters:

```
- setDataDisks = com.tencentcloudapi.cvm.v20170312.models.DataDisk[]
```
## TencentCVM RunInstances parameters:

```
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- 	setPassword = java.lang.String
- 	setKeyIds = java.lang.String[]
```
