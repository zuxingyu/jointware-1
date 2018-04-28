/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers;

import java.util.Map;

import com.github.isdream.jointware.core.utils.ObjectUtils;
import com.github.isdream.jointware.core.utils.StringUtils;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月11日
 */
public abstract class ConatinerExecutor {

	
	public final static String IGNORE_NAMESPACE = "ignore.namespace";
	
	protected Object kindModel = null;
	
	protected Map<String, String> paramTypes = null;
	
	/**
	 * 根据 用户 需要 发布的kind（如 Deployment, StatefulSet等），以及用户指定的key, value对params
	 * 向指定的Kubernetes和OpenShift进行部署
	 * 
	 * 如果名字存在重名，则发布失败，
	 * 
	 * 如果输入参数有问题，则会返回异常，通常包括空指针异常、无该方法可反射等异常
	 * 
	 * 此外，该方法适用于所有的kind，详情见https://github.com/isdream/cluster-dispatcher/blob/master/docs/yaml-kinds.md
	 * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param params 参数
	 * @return 具体对象
	 * @throws Exception 返回异常
	 */
	public Object create(Object client, String kind, Map<String, Map<String, Object>> params) throws Exception {
		if (ObjectUtils.isNull(params) || ObjectUtils.isNull(client) || StringUtils.isNull(kind)) {
			throw new Exception("neither name or namespace is null,  or the number is less than 0.");
		}
		
		return doCreate(client, kind, params);
	}

	/**
	 * @param client
	 * @param kind
	 * @param params
	 * @return
	 * @throws Exception
	 */
	protected abstract Object doCreate(Object client, String kind, Map<String, Map<String, Object>> params) throws Exception;
	
	/**
	 * 根据 用户 需要 发布的kind（如 Deployment, StatefulSet等），以及用户指定的key, value对params
	 * 向指定的Kubernetes和OpenShift进行部署
	 * 
	 * 如果名字存在重名，则会替换，不会报错。
	 * 
	 * 如果输入参数有问题，则会返回异常，通常包括空指针异常、无该方法可反射等异常
	 * 
	 * 此外，该方法适用于所有的kind，详情见https://github.com/is-dream/cluster-dispatcher/blob/master/docs/yaml-kinds.md
	 * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param params 参数
	 * @return 具体对象
	 * @throws Exception 返回异常
	 */
	public Object createOrReplace(Object client, String kind, Map<String, Map<String, Object>> params) throws Exception {
		if (ObjectUtils.isNull(params) || ObjectUtils.isNull(client) || StringUtils.isNull(kind)) {
			throw new Exception("neither name or namespace is null,  or the number is less than 0.");
		}
		
		return doCreateOrReplace(client, kind, params);
	}

	/**
	 * 根据 用户 需要 发布的kind（如 Deployment, StatefulSet等），以及用户指定的key, value对params
	 * 向指定的Kubernetes和OpenShift进行部署
	 * 
	 * 如果名字存在重名，则会替换，不会报错。
	 * 
	 * 如果输入参数有问题，则会返回异常，通常包括空指针异常、无该方法可反射等异常
	 * 
	 * 此外，该方法适用于所有的kind，详情见https://github.com/is-dream/cluster-dispatcher/blob/master/docs/yaml-kinds.md
	 * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param params 参数
	 * @return 具体对象
	 * @throws Exception 返回异常
	 */
	protected abstract Object doCreateOrReplace(Object client, String kind, Map<String, Map<String, Object>> params) throws Exception;
	
	/**
	 * 根用户 向指定的Kubernetes和OpenShift发起发送扩容/缩容请求，必须满足特定类型、namespace和name
	 * 
	 * 这里的名是指Metedata.name的名字
	 * 
	 * 扩展/缩小实例数,这里的numbers是指扩展后，或者收缩后的实例数。
	 * 
	 * 比如当前实例数为2，
	 *  - 如果numberes填写4，则执行后有4个pod
	 *  - 反之，如果numbers填写1， 则执行后仅有1个pod
	 * 
	 * 仅仅对以下kind有效 <br>
	 * 
	 * - Deployment  <br>
	 * - ReplicationController  <br>
	 * - Job  <br>
	 * - ReplicaSet  <br>
	 * - StatefulSet  <br>
	 * - DeploymentConfig  <br>
	 * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param namespace 命名空间
	 * @param name 名字
	 * @param numbers 数量
	 * @return 返回对象
	 * @throws Exception 返回异常
	 */
	public Object scaleTo(Object client, String kind, String namespace, String name, int numbers) throws Exception {
		if (ObjectUtils.isNull(client) || StringUtils.isNull(kind) || 
				StringUtils.isNull(namespace) || StringUtils.isNull(name) || numbers <= 0 || numbers >= Integer.MAX_VALUE) {
			throw new Exception("neither name or namespace is null,  or the number is less than 0.");
		}
		
		return doScaleTo(client, kind, namespace, name, numbers);
	}

	/**
	 * 根用户 向指定的Kubernetes和OpenShift发起发送扩容/缩容请求，必须满足特定类型、namespace和name
	 * 
	 * 这里的名是指Metedata.name的名字
	 * 
	 * 扩展/缩小实例数,这里的numbers是指扩展后，或者收缩后的实例数。
	 * 
	 * 比如当前实例数为2，
	 *  - 如果numberes填写4，则执行后有4个pod
	 *  - 反之，如果numbers填写1， 则执行后仅有1个pod
	 * 
	 * 仅仅对以下kind有效 <br>
	 * 
	 * - Deployment  <br>
	 * - ReplicationController  <br>
	 * - Job  <br>
	 * - ReplicaSet  <br>
	 * - StatefulSet  <br>
	 * - DeploymentConfig  <br>
	 * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param namespace 命名空间
	 * @param name 名字
	 * @param numbers 数量
	 * @return 返回对象
	 * @throws Exception 返回异常
	 */
	
	protected abstract Object doScaleTo(Object client, String kind, 
										String namespace, String name, 
										int numbers) throws Exception;
	
	/**
	 * @param client 客户端
	 * @param kind   类型
	 * @param name   名字
	 * @return       对象
	 * @throws Exception 反射异常
	 */
	public Object query(Object client, String kind, String name) throws Exception {
		return this.query(client, kind, IGNORE_NAMESPACE, name);
	}
	
	/**
	 * 根用户 向指定的Kubernetes和OpenShift进行查询，必须满足特定类型、namespace和name
	 * 
	 * 这里的名是指Metedata.name的名字
	 * 
	 * 返回的是指定类型的对象
	 * 
     * 此外，该方法适用于所有的kind，详情见https://github.com/is-dream/cluster-dispatcher/blob/master/docs/yaml-kinds.md
     * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param namespace 命名空间
	 * @param name 名字
	 * @return 对象
	 * @throws Exception 返回异常
	 */
	public Object query(Object client, String kind, String namespace, String name) throws Exception {
		if (ObjectUtils.isNull(client) || StringUtils.isNull(namespace) || StringUtils.isNull(name)) {
			throw new Exception("client, or kind, or name, or namespace is null.");
		}
		
		return doQuery(client, kind, namespace, name);
	}

	/**
	 * 根用户 向指定的Kubernetes和OpenShift进行查询，必须满足特定类型、namespace和name
	 * 
	 * 这里的名是指Metedata.name的名字
	 * 
	 * 返回的是指定类型的对象
	 * 
     * 此外，该方法适用于所有的kind，详情见https://github.com/is-dream/cluster-dispatcher/blob/master/docs/yaml-kinds.md
     * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param namespace 命名空间
	 * @param name 名字
	 * @return 对象
	 * @throws Exception 返回异常
	 */
	protected abstract Object doQuery(Object client, String kind, 
									String namespace, String name) throws Exception;
	
	
	/**
	 * 删除不需要namespace的资源，比如Namespace自身
	 * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param name 名字
	 * @return 对象
	 * @throws Exception 返回异常
	 */
	public boolean delete(Object client, String kind, String name) throws Exception {
		return delete(client, kind, IGNORE_NAMESPACE, name);
	}
	
	/**
	 * 删除需要namespace的资源，比如Deployment、Job等
	 * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param namespace 命名空间
	 * @param name 名字
	 * @return 对象
	 * @throws Exception 返回异常
	 */
	public boolean delete(Object client, String kind, String namespace, String name) throws Exception {
		if (ObjectUtils.isNull(client) || StringUtils.isNull(namespace) || StringUtils.isNull(name)) {
			throw new Exception("client, or kind, or name, or namespace is null.");
		}
		return doDelete(client, kind, namespace, name);
	}

	/**
	 * 删除需要namespace的资源，比如Deployment、Job等
	 * 
	 * @param client 客户端
	 * @param kind 类型
	 * @param namespace 命名空间
	 * @param name 名字
	 * @return 对象
	 * @throws Exception 返回异常
	 */
	protected abstract boolean doDelete(Object client, String kind, String namespace, String name) throws Exception;
	
	
	/**
	 * @param client 客户端
	 * @param kind 类型
	 * @return kind 对应的对象实例
	 * @throws Exception 反射异常
	 */
	public abstract Object getKindModel(Object client, String kind) throws Exception;
	
	
	/**
	 * @return
	 */
	public abstract String getObjectRef();
}