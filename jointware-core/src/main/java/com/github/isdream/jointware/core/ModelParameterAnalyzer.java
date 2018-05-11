/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.github.isdream.jointware.core.utils.JavaUtils;
import com.github.isdream.jointware.core.utils.ObjectUtils;
import com.github.isdream.jointware.core.utils.StringUtils;


/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 *
 * 2018年3月2日
 */
public abstract class ModelParameterAnalyzer {

	protected final static Logger m_logger = Logger.getLogger(ModelParameterAnalyzer.class);
	
	protected final static String MODEL_METHOD_SET = "set";
	
	protected final static String MODEL_METHOD_WITH = "with";
	
	public final static Set<String> ignoreMethods = new HashSet<String>();
	
	/************************************************************************************
	 * 
	 *                                    Cores
	 * 
	 ************************************************************************************/
	
	/**
	 * 
	 * 记录以下信息，方便通过反射，进行实例化
	 * 
	 * setMetadata=io.fabric8.kubernetes.api.model.ObjectMeta
	 * setMetadata-setName=java.lang.String
	 * setMetadata-setNamespace=java.lang.String
	 * setMetadata-setClusterName=java.lang.String
	 * setMetadata-setGenerateName=java.lang.String
	 * setMetadata-setGeneration=java.lang.Long
	 * setMetadata-setInitializers=io.fabric8.kubernetes.api.model.Initializers
	 * setMetadata-setInitializers-setPending-setName=java.lang.String
	 * setMetadata-setSelfLink=java.lang.String
	 * setMetadata-setUid=java.lang.String
	 * setMetadata-setCreationTimestamp=java.lang.String
	 * setMetadata-setDeletionGracePeriodSeconds=java.lang.Long
	 * setMetadata-setDeletionTimestamp=java.lang.String
	 * setMetadata-setOwnerReferences-setName=java.lang.String
	 * setMetadata-setOwnerReferences-setKind=java.lang.String
	 * setMetadata-setOwnerReferences-setBlockOwnerDeletion=java.lang.Boolean
	 * setMetadata-setOwnerReferences-setUid=java.lang.String
	 * setMetadata-setOwnerReferences-setController=java.lang.Boolean
	 * setMetadata-setResourceVersion=java.lang.String
	 * setKind=java.lang.String
	 * setAutomountServiceAccountToken=java.lang.Boolean
	 * setImagePullSecrets-setName=java.lang.String
	 * setSecrets-setName=java.lang.String
	 * setSecrets-setKind=java.lang.String
	 * setSecrets-setNamespace=java.lang.String
	 * setSecrets-setUid=java.lang.String
	 * setSecrets-setResourceVersion=java.lang.String
	 * setSecrets-setFieldPath=java.lang.String
	 * 
	 * 比如setMetadata-setName=java.lang.String，是指
	 * 对应指定的kind的模型，比如Deployment，首先执行setMetadata操作，进行实例化
	 * 再执行setName操作生效
	 */
	protected final Map<String, Map<String, String>> parameters = new HashMap<String,  Map<String, String>>();
	
	/**
	 * 主要针对setMetadata和setSpec的场景，其parent为“”
	 * 如果是先setMetadata实例化，再setName，则setName的parent为setMetadata
	 */
	protected final static String DEFAULT_PARENT = "";
	
	/**
	 * 
	 */
	public ModelParameterAnalyzer() {
		for (String kind : getKindModels().keySet()) {
			try {
				Class<?> modelClass = Class.forName(getKindModels().get(kind));
				parameters.put(kind, new LinkedHashMap<String, String>());
				analyseParameters(modelClass, kind,  DEFAULT_PARENT);
			} catch (Exception e) {
				// ignore here
				e.printStackTrace();
				m_logger.error(e);
			}
		}
	}

	
	/**
	 * @param clazz class
	 * @param kind kind
	 * @param parent parent
	 * @throws Exception fail reason
	 */
	protected synchronized void analyseParameters(Class<?> clazz,  
							String kind, 
							String parent) throws Exception {
		for (Method method : clazz.getMethods()) {
			if(canReflect(method)) {
				addParametersToModel(kind, parent, method);
				if(canNested(getParamType(method))) {
					analyseParameters(Class.forName(getParamType(method)), kind, getParent(parent, method));
				}
			}
		}
	}

	/**
	 * 主要针对这种场景进行提取
	 * 则参数的类型是io.fabric8.kubernetes.api.model.OwnerReference
	 * 
	 * @param method 方法名
	 * @return 参数类型
	 */
	private String getParamType(Method method) {
		String fullname = method.getGenericParameterTypes()[0].getTypeName();
		int idx = fullname.indexOf(",") == -1 ? fullname.indexOf("<") : fullname.indexOf(",");
		String typename = (idx == -1) ? fullname 
				: fullname.substring(idx + 1, fullname.indexOf(">")).trim();
		return typename;
	}

	/**
	 * 对于分析出来的参数及其类型，进行记录，比如
	 * 
	 * setMetadata=io.fabric8.kubernetes.api.model.ObjectMeta
	 * setMetadata-setName=java.lang.String
	 * 
	 */
	protected synchronized void addParametersToModel(String kind, String parent, Method method) {
		String key = getParent(parent, method);
		String typeName = method.getGenericParameterTypes()[0].getTypeName();
		Map<String, String> results = parameters.get(kind);
		results.put(key, typeName);
	}

	/**
	 * 对于setMetadata，则models记录的key为setMetadata
	 * 对于setMetadata后再执行setName此类u操作，models里记录的应该是setMetadata-setName
	 * 
	 * @param parent 父节点
	 * @param method 方法名
	 * @return 得到父节点
	 */
	protected String getParent(String parent, Method method) {
		return DEFAULT_PARENT.equals(parent) 
				? method.getName() : parent + "-" + method.getName();
	}

	
	/************************************************************************************
	 * 
	 *                   You should implement it by yourself
	 * 
	 ************************************************************************************/
	
	/**
	 * @return 获取所有kind对应的模型
	 */
	public Map<String, String> getKindModels() {
		return getKindModelAnalyzer().getKindModels();
	}

	/**
	 * @return 获取所有模型
	 */
	public Map<String, Map<String, String>> getParameters() {
		return parameters;
	}
	
	/**
	 * @param kind kind类型
	 * @return 获取所有模型参数
	 */
	public Map<String, String> getModelParameters(String kind) {
		return StringUtils.isNull(kind) 
				? new HashMap<String, String>() : parameters.get(kind);
	}
	
	/**
	 * （1）不是基础类型，如int, String等
	 * （2）也不是Map类型，因为在fabric8中，Map中只会存储String类型的key, value对
	 * 
	 * 如果不满足上述两个条件，则说明需要进一步进行分析
	 * 
	 * @param typename 类型名
	 * @return 是否可以循环
	 */
	protected synchronized boolean canNested(String typename) {
		return !JavaUtils.isPrimitive(typename) // 不是基础类型
				&& !JavaUtils.isStringList(typename) //不是List<String>
				&& !JavaUtils.isStringSet(typename) //不是Set<String>
				&& !JavaUtils.isStringStringMap(typename) //不是Map<String, String>
				&& !typename.endsWith("[]") //不是Array
				&& typename.split(",").length < 2; // 不是Map，在fabric8中，Map会通过泛型表示，如Map<String, String>，则通过,划分，长度小于2的不是Map
	}
	
	/************************************************************************************
	 * 
	 *                   You should implement it by yourself
	 * 
	 ************************************************************************************/
	
	/**
	 * @return 分析器
 	 */
	public abstract KindModelAnalyzer getKindModelAnalyzer();
	
	/**
	 * 根据fabric8的代码规范，只过滤add和set开头，且只有一个参数的方法
	 * 这些方法可以说明这个方法的反射规则
	 * 
	 * @param method 方法名
	 * @return 是否可以反射
	 */
	protected synchronized boolean canReflect(Method method) {
		return !ObjectUtils.isNull(method) &&        
				((method.getName().startsWith(MODEL_METHOD_SET)             // set开头的方法
						|| method.getName().startsWith(MODEL_METHOD_WITH))  // with开头的方法
				   && method.getParameterCount() == 1 // 该方法只有一个参数
				   && !JavaUtils.ignoreMethod(method.getName())
				   && !ignoreMethods.contains(method.getName())
				); // 可以人工指定过滤哪些方法
	}
	
}
