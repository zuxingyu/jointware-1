## TencentCVM UpdateInstanceVpcConfig parameters:

```
- setVirtualPrivateCloud = com.tencentcloudapi.cvm.v20170312.models.VirtualPrivateCloud
- setVirtualPrivateCloud-setVpcId = java.lang.String
- setVirtualPrivateCloud-setSubnetId = java.lang.String
- setVirtualPrivateCloud-setAsVpcGateway = java.lang.Boolean
- setVirtualPrivateCloud-setPrivateIpAddresses = java.lang.String[]
```
## TencentCVM RenewHosts parameters:

```
- setHostIds = java.lang.String[]
```
## TencentCVM RenewInstances parameters:

```
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- setInstanceChargePrepaid-setRenewFlag = java.lang.String
- setInstanceChargePrepaid-setPeriod = java.lang.Integer
- setInstanceIds = java.lang.String[]
```
## TencentCVM StopInstances parameters:

```
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
- setInstanceIds = java.lang.String[]
```
## TencentCVM DescribeImages parameters:

```
- setOffset = java.lang.Integer
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
```
## TencentCVM ImportImage parameters:

```
- setArchitecture = java.lang.String
- setOsType = java.lang.String
- setOsVersion = java.lang.String
- setImageUrl = java.lang.String
- setDryRun = java.lang.Boolean
- setForce = java.lang.Boolean
- setImageDescription = java.lang.String
- setImageName = java.lang.String
```
## TencentCVM DescribeInstanceTypeConfigs parameters:

```
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
```
## TencentCVM InquiryPriceResetInstance parameters:

```
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- setSystemDisk-setDiskType = java.lang.String
- setSystemDisk-setDiskId = java.lang.String
- setSystemDisk-setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- setLoginSettings-setKeyIds = java.lang.String[]
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
- setInstanceIds = java.lang.String[]
```
## TencentCVM ResetInstancesInternetMaxBandwidth parameters:

```
- setInternetAccessible = com.tencentcloudapi.cvm.v20170312.models.InternetAccessible
- setInternetAccessible-setInternetChargeType = java.lang.String
- setInternetAccessible-setInternetMaxBandwidthOut = java.lang.Integer
- setInternetAccessible-setPublicIpAssigned = java.lang.Boolean
- setInstanceIds = java.lang.String[]
```
## TencentCVM DescribeInstances parameters:

```
- setOffset = java.lang.Integer
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
```
## TencentCVM DescribeKeyPairs parameters:

```
- setOffset = java.lang.Integer
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
```
## TencentCVM DescribeInstanceFamilyConfigs parameters:

```
```
## TencentCVM InquiryPriceRunInstances parameters:

```
- setInstanceType = java.lang.String
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- setSystemDisk-setDiskType = java.lang.String
- setSystemDisk-setDiskId = java.lang.String
- setSystemDisk-setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- setLoginSettings-setKeyIds = java.lang.String[]
```
## TencentCVM InquiryPriceResetInstancesType parameters:

```
- setInstanceType = java.lang.String
- setInstanceIds = java.lang.String[]
```
## TencentCVM StartInstances parameters:

```
- setInstanceIds = java.lang.String[]
```
## TencentCVM ModifyInstancesAttribute parameters:

```
- setInstanceIds = java.lang.String[]
```
## TencentCVM DescribeInstancesStatus parameters:

```
- setOffset = java.lang.Integer
- setLimit = java.lang.Integer
- setInstanceIds = java.lang.String[]
```
## TencentCVM AllocateHosts parameters:

```
- setHostChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.ChargePrepaid
- setHostChargePrepaid-setRenewFlag = java.lang.String
- setHostChargePrepaid-setPeriod = java.lang.Integer
- setHostChargeType = java.lang.String
- setClientToken = java.lang.String
- setPlacement = com.tencentcloudapi.cvm.v20170312.models.Placement
- setPlacement-setZone = java.lang.String
- setPlacement-setHostIds = java.lang.String[]
```
## TencentCVM InquiryPriceResetInstancesInternetMaxBandwidth parameters:

```
- setInternetAccessible = com.tencentcloudapi.cvm.v20170312.models.InternetAccessible
- setInternetAccessible-setInternetChargeType = java.lang.String
- setInternetAccessible-setInternetMaxBandwidthOut = java.lang.Integer
- setInternetAccessible-setPublicIpAssigned = java.lang.Boolean
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
- setPublicKey = java.lang.String
- setKeyName = java.lang.String
- setProjectId = java.lang.Integer
```
## TencentCVM ResetInstance parameters:

```
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- setSystemDisk-setDiskType = java.lang.String
- setSystemDisk-setDiskId = java.lang.String
- setSystemDisk-setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- setLoginSettings-setKeyIds = java.lang.String[]
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
- setImageDescription = java.lang.String
- setInstanceId = java.lang.String
- setImageName = java.lang.String
- setForcePoweroff = java.lang.String
- setSysprep = java.lang.String
- setReboot = java.lang.String
```
## TencentCVM DescribeInternetChargeTypeConfigs parameters:

```
```
## TencentCVM ResizeInstanceDisks parameters:

```
- setInstanceId = java.lang.String
- setDataDisks = com.tencentcloudapi.cvm.v20170312.models.DataDisk[]
```
## TencentCVM ModifyImageAttribute parameters:

```
- setImageId = java.lang.String
- setImageDescription = java.lang.String
- setImageName = java.lang.String
```
## TencentCVM ModifyHostsAttribute parameters:

```
- setHostIds = java.lang.String[]
```
## TencentCVM ModifyInstancesProject parameters:

```
- setInstanceIds = java.lang.String[]
```
## TencentCVM ResetInstancesType parameters:

```
- setInstanceType = java.lang.String
- setInstanceIds = java.lang.String[]
```
## TencentCVM InquiryPriceRenewInstances parameters:

```
- setDryRun = java.lang.Boolean
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- setInstanceChargePrepaid-setRenewFlag = java.lang.String
- setInstanceChargePrepaid-setPeriod = java.lang.Integer
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
- setInstanceId = java.lang.String
- setDataDisks = com.tencentcloudapi.cvm.v20170312.models.DataDisk[]
```
## TencentCVM RunInstances parameters:

```
- setInstanceType = java.lang.String
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- setSystemDisk-setDiskType = java.lang.String
- setSystemDisk-setDiskId = java.lang.String
- setSystemDisk-setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- setLoginSettings-setKeyIds = java.lang.String[]
```
