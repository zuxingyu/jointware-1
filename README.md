jointware
=======

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.fabric8/fabric8-project/badge.svg?style=flat-square)](https://maven-badges.herokuapp.com/maven-central/io.fabric8/fabric8-project/)

<p align="center">
  <a href="https://github.com/isdream/jointware">
  	<img src="https://avatars1.githubusercontent.com/u/19262176?s=200&v=4" alt="fabric8 logo"/>
  </a>
</p>

<b>jointware</b> is Java library for interacting with heterogeneous cloud service providers using a unified API.

#### **_Containers_**

* <a href="https://www.docker.com/">Docker/Swarm/Swarmkit</a>
* <a href="http://kubernetes.io/">Kubernetes</a>
* <a href="https://www.openshift.com/">OpenShift</a>
* <a href="https://amazonaws-china.com/ecs/?nc2=h_m1">AmazonECS</a>
* <a href="https://azure.microsoft.com/zh-cn/services/container-service/">AzureAKS</a>

#### **_VMs_**

* <a href="https://amazonaws-china.com/ec2/?nc2=h_m1">AmazonEC2</a>
* <a href="https://azure.microsoft.com/zh-cn/services/virtual-machines/">AzureCompute</a>
* <a href="https://docs.openstack.org/queens/">Openstack</a>
* <a href="https://www.vmware.com/">Vmware</a>
* <a href="https://cloud.baidu.com/product/bcc.html">BaiduBCC</a>
* <a href="https://www.aliyun.com/">AliyunECS</a>
* <a href="https://cloud.tencent.com/">TencentCVM</a>
* <a href="https://www.jdcloud.com/products/cloudhost">JDCloudVM</a>
* <a href="https://www.huaweicloud.com/product/ecs.html">HuaweiECS</a>

### Getting Started

* [Getting Started guides](get-started.md)


### Links

- #### **_Containers_**

  **_1. Docker/Swarm/Swarmkit_**
  
   * [Docker features and models](docs/containers/Docker/kind-model.md) 
   * [Docker parameters with key-value style](docs/containers/Docker/model-parameters-kv.md)
   * [Docker parameters with nested style](docs/containers/Docker/model-parameters-nested.md)
   * [Docker parameters with json style](docs/containers/Docker/model-parameters-json.md)
    
  **_2. Kubernetes_**
  
   * [Kubernetes features and models](docs/containers/Kubernetes/kind-model.md) 
   * [Kubernetes parameters with key-value style](docs/containers/Kubernetes/model-parameters-kv.md)
   * [Kubernetes parameters with nested style](docs/containers/Kubernetes/model-parameters-nested.md)
   * [Kubernetes parameters with json style](docs/containers/Kubernetes/model-parameters-json.md)
  
  **_3. OpenShift_**
  
   * [OpenShift features and models](docs/containers/OpenShift/kind-model.md) 
   * [OpenShift parameters with key-value style](docs/containers/OpenShift/model-parameters-kv.md)
   * [OpenShift parameters with nested style](docs/containers/OpenShift/model-parameters-nested.md)
   * [OpenShift parameters with json style](docs/containers/OpenShift/model-parameters-json.md)


- #### **_VMs_**

  **_1. AmazonEC2_**
  
   * [AmazonEC2 features and models](docs/VMs/AmazonEC2/kind-model.md) 
   * [AmazonEC2 parameters with key-value style](docs/VMs/AmazonEC2/model-parameters-kv.md)
   * [AmazonEC2 parameters with nested style](docs/VMs/AmazonEC2/model-parameters-nested.md)
   * [AmazonEC2 parameters with json style](docs/VMs/AmazonEC2/model-parameters-json.md)
   
  **_2. AzureCompute_**
  
   * [AzureCompute features and models](docs/VMs/AzureCompute/kind-model.md) 
   * [AzureCompute parameters with key-value style](docs/VMs/AzureCompute/model-parameters-kv.md)
   * [AzureCompute parameters with nested style](docs/VMs/AzureCompute/model-parameters-nested.md)
   * [AzureCompute parameters with json style](docs/VMs/AzureCompute/model-parameters-json.md)
   
  **_3. Google_**
   
  **_4. OpenStack_**
  
   * [OpenStack features and models](docs/VMs/OpenStack/kind-model.md) 
   * [OpenStack parameters with key-value style](docs/VMs/OpenStack/model-parameters-kv.md)
   * [OpenStack parameters with nested style](docs/VMs/OpenStack/model-parameters-nested.md)
   * [OpenStack parameters with json style](docs/VMs/OpenStack/model-parameters-json.md)
   
  **_5. VMWare_**
  
   * [VMWare features and models](docs/VMs/VMWare/kind-model.md) 
   * [VMWare parameters with key-value style](docs/VMs/VMWare/model-parameters-kv.md)
   * [VMWare parameters with nested style](docs/VMs/VMWare/model-parameters-nested.md)
   * [VMWare parameters with json style](docs/VMs/VMWare/model-parameters-json.md)

  **_6. BaiduBCC_**
  
   * [BaiduBCC features and models](docs/VMs/BaiduBCC/kind-model.md) 
   * [BaiduBCC parameters with key-value style](docs/VMs/BaiduBCC/model-parameters-kv.md)
   * [BaiduBCC parameters with nested style](docs/VMs/BaiduBCC/model-parameters-nested.md)
   * [BaiduBCC parameters with json style](docs/VMs/BaiduBCC/model-parameters-json.md)
   
   
  **_7. AliyunECS_**
  
   * [AliyunECS features and models](docs/VMs/AliyunECS/kind-model.md) 
   * [AliyunECS parameters with key-value style](docs/VMs/AliyunECS/model-parameters-kv.md)
   * [AliyunECS parameters with nested style](docs/VMs/AliyunECS/model-parameters-nested.md)
   * [AliyunECS parameters with json style](docs/VMs/AliyunECS/model-parameters-json.md)

  **_8. TencentCVM_**
  
   * [TencentCVM features and models](docs/VMs/TencentCVM/kind-model.md) 
   * [TencentCVM parameters with key-value style](docs/VMs/TencentCVM/model-parameters-kv.md)
   * [TencentCVM parameters with nested style](docs/VMs/TencentCVM/model-parameters-nested.md)
   * [TencentCVM parameters with json style](docs/VMs/TencentCVM/model-parameters-json.md)
   
  **_9. JDCloudVM_**
  
   * [JDCloudVM features and models](docs/VMs/JDCloudVM/kind-model.md) 
   * [JDCloudVM parameters with key-value style](docs/VMs/JDCloudVM/model-parameters-kv.md)
   * [JDCloudVM parameters with nested style](docs/VMs/JDCloudVM/model-parameters-nested.md)
   * [JDCloudVM parameters with json style](docs/VMs/JDCloudVM/model-parameters-json.md)

  **_10. HUaweiECS_**
  
   * [HUaweiECS features and models](docs/VMs/HUaweiECS/kind-model.md) 
   * [HUaweiECS parameters with key-value style](docs/VMs/HUaweiECS/model-parameters-kv.md)
   * [HUaweiECS parameters with nested style](docs/VMs/HUaweiECS/model-parameters-nested.md)
   * [HUaweiECS parameters with json style](docs/VMs/HUaweiECS/model-parameters-json.md)

### Building the code

Please see the [building.md](docs/building.md) file.

### Contributing to the project

We love [contributions](docs/contributing.md) and you are very welcome to help.

### Roadmaps

* [~~roadmap 2.0.0~~ ](docs/roadmaps/roadmap-2.0.0.md) 
* [roadmap 2.1.0](docs/roadmaps/roadmap-2.1.0.md)


### License

This project is [Apache Licensed](license.txt)
