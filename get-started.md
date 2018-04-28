## Prerequisite

We have updated this project to MAVEN Center (Public), and you can use it by configuring your pom.xml.

```
<dependency>
    <groupId>com.github.isdream</groupId>
    <artifactId>cluster-dispatcher</artifactId>
    <version>1.2.1</version>
</dependency>
```


## Prepare YAML

- Firstly, You should write a YAML file, which can solve some problems you want. Here is a YAML file with Deployment kind.

```
apiVersion: extensions/v1beta1
kind: Deployment
metadata:
  name: busybox-dm
  namespace: default
  labels:
    app: busybox-dm
spec:
  replicas: 2
  template:
    metadata:
      name: busybox-dm
      labels:
        app: busybox-dm
    spec:
      containers:
      - image: dcr.io:5000/busybox:latest
        command:
          - sleep
          - "3600"
        imagePullPolicy: IfNotPresent
        name: busybox-dm
```
 
- Then, you should exceute this YAML on a Kubernetes or OpenShift cluster by kubectl command. If it works well, go to next step. 

```
kubectl create -f *.yaml
```

- Next, you can get the <key, value> styles by parsing YAML.   
  
  - Code:
  
```
public static void main(String[] args) throws Exception {
//		System.out.println(write(Constants.YAML_DEPLOYMENT, "examples/controllers/busybox-dm.yaml"));
//		System.out.println(write(Constants.YAML_PERSISTENTVOLUME, "examples/constructors/persistentvolume.yaml"));
//		System.out.println(write(Constants.YAML_SERVICE, "examples/constructors/service.yaml"));
		  System.out.println(write(Constants.YAML_DEPLOYMENT, "examples/controllers/deployment.yaml"));
	}

protected static String write(String kind, String file) throws ClassNotFoundException, FileNotFoundException, Exception {
		Class<?> clazz = Class.forName(KubernetesKindModelsAnalyzer
							.getAnalyzer().getKindModel(kind));
		
		Object obj = new Yaml().loadAs(new FileInputStream(file), clazz);

		return new UserMapWriter().yamlToMap(obj);
	}
```

   - Output:
   
```
 public Map<String, Object> params = new HashMap<String, Object>();
 
	params.put("setMetadata-setName", "busybox-dm");
	params.put("setMetadata-setNamespace", "wuheng");
	params.put("setMetadata-setLabels", new HashMap<String, String>() {
		{
			put("app", "busybox-dm");
		}
	});
	params.put("setSpec-setReplicas", 2);
	params.put("setSpec-setTemplate-setMetadata-setName", "busybox-dm");
	params.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String, String>() {
		{
			put("app", "busybox-dm");
		}
	});
	params.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
		{
			add(new HashMap<String, Object>() {
				{
					put("setName", "busybox-dm");
					put("setCommand", new ArrayList<String>() {
						{
							add("sleep");
							add("3600");
						}
					});
					put("setImage", "dcr.io:5000/busybox:latest");
					put("setImagePullPolicy", "IfNotPresent");
				}
			});
		}
	});
```
  
  
## Samples

- create, support all kubernetes and OpenShift features. https://github.com/isdream/cluster-dispatcher/blob/master/docs/yaml-kinds.md

Kubernetes:

```
   DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
	 KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
	 generator.create(client, Constants.YAML_DEPLOYMENT, params);
```

OpenShift:

```
   DefaultOpenShiftClient client = new DefaultOpenShiftClient("http://118.190.46.58:9888");
	 OpenShiftModelParametersGenerator generator = new OpenShiftModelParametersGenerator();
	 generator.create(client, Constants.YAML_DEPLOYMENT, params);
```

- update, only support - Deployment, ReplicationController, Job, ReplicaSet, StatefulSet, DeploymentConfig  


Kubernetes:

```
   DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
	 KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
	 generator.scaleTo(client, Constants.YAML_DEPLOYMENT, "default", "busybox-dm", 4);
```

OpenShift:

```
   DefaultOpenShiftClient client = new DefaultOpenShiftClient("http://118.190.46.58:9888");
	 OpenShiftModelParametersGenerator generator = new OpenShiftModelParametersGenerator();
	 generator.scaleTo(client, Constants.YAML_DEPLOYMENT, "default", "busybox-dm", 4);
```

 Please see https://github.com/isdream/cluster-dispatcher/blob/master/src/main/java/com/github/isdream/cdispatcher/ModelParamtersGenerator.java for more detail 
