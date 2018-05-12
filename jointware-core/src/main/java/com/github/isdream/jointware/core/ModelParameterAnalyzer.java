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
 *         2018骞�3鏈�2鏃�
 */
public abstract class ModelParameterAnalyzer {

	protected final static Logger m_logger = Logger.getLogger(ModelParameterAnalyzer.class);

	protected final static String MODEL_METHOD_SET = "set";

	protected final static String MODEL_METHOD_WITH = "with";

	public final static Set<String> ignoreMethods = new HashSet<String>();

	/************************************************************************************
	 * 
	 * Cores
	 * 
	 ************************************************************************************/

	/**
	 * 
	 * 璁板綍浠ヤ笅淇℃伅锛屾柟渚块�氳繃鍙嶅皠锛岃繘琛屽疄渚嬪寲
	 * 
	 * setMetadata=io.fabric8.kubernetes.api.model.ObjectMeta
	 * setMetadata-setName=java.lang.String
	 * setMetadata-setNamespace=java.lang.String
	 * setMetadata-setClusterName=java.lang.String
	 * setMetadata-setGenerateName=java.lang.String
	 * setMetadata-setGeneration=java.lang.Long
	 * setMetadata-setInitializers=io.fabric8.kubernetes.api.model.Initializers
	 * setMetadata-setInitializers-setPending-setName=java.lang.String
	 * setMetadata-setSelfLink=java.lang.String setMetadata-setUid=java.lang.String
	 * setMetadata-setCreationTimestamp=java.lang.String
	 * setMetadata-setDeletionGracePeriodSeconds=java.lang.Long
	 * setMetadata-setDeletionTimestamp=java.lang.String
	 * setMetadata-setOwnerReferences-setName=java.lang.String
	 * setMetadata-setOwnerReferences-setKind=java.lang.String
	 * setMetadata-setOwnerReferences-setBlockOwnerDeletion=java.lang.Boolean
	 * setMetadata-setOwnerReferences-setUid=java.lang.String
	 * setMetadata-setOwnerReferences-setController=java.lang.Boolean
	 * setMetadata-setResourceVersion=java.lang.String setKind=java.lang.String
	 * setAutomountServiceAccountToken=java.lang.Boolean
	 * setImagePullSecrets-setName=java.lang.String
	 * setSecrets-setName=java.lang.String setSecrets-setKind=java.lang.String
	 * setSecrets-setNamespace=java.lang.String setSecrets-setUid=java.lang.String
	 * setSecrets-setResourceVersion=java.lang.String
	 * setSecrets-setFieldPath=java.lang.String
	 * 
	 * 姣斿setMetadata-setName=java.lang.String锛屾槸鎸�
	 * 瀵瑰簲鎸囧畾鐨刱ind鐨勬ā鍨嬶紝姣斿Deployment锛岄鍏堟墽琛宻etMetadata鎿嶄綔锛岃繘琛屽疄渚嬪寲
	 * 鍐嶆墽琛宻etName鎿嶄綔鐢熸晥
	 */
	protected final Map<String, Map<String, String>> parameters = new HashMap<String, Map<String, String>>();

	/**
	 * 涓昏閽堝setMetadata鍜宻etSpec鐨勫満鏅紝鍏秔arent涓衡�溾��
	 * 濡傛灉鏄厛setMetadata瀹炰緥鍖栵紝鍐峴etName锛屽垯setName鐨刾arent涓簊etMetadata
	 */
	protected final static String DEFAULT_PARENT = "";

	/**
	 * 
	 */
	public ModelParameterAnalyzer() {
		for (String kind : getKindModels().keySet()) {
			try {
				if (kind.equals("LoadImage")) {
					System.out.println("I am here");
				}
				Class<?> modelClass = Class.forName(getKindModels().get(kind));
				parameters.put(kind, new LinkedHashMap<String, String>());
				analyseParameters(modelClass, kind, DEFAULT_PARENT);
			} catch (Exception e) {
				// ignore here
				m_logger.error(e);
			}
		}
	}

	/**
	 * @param clazz
	 *            class
	 * @param kind
	 *            kind
	 * @param parent
	 *            parent
	 * @throws Exception
	 *             fail reason
	 */
	protected synchronized void analyseParameters(Class<?> clazz, String kind, String parent) throws Exception {
		for (Method method : clazz.getMethods()) {
			if (canReflect(method)) {
				addParametersToModel(kind, parent, method);
				if (canNested(getParamType(method))) {
					analyseParameters(Class.forName(getParamType(method)), kind, getParent(parent, method));
				}
			}
		}
	}

	/**
	 * 涓昏閽堝杩欑鍦烘櫙杩涜鎻愬彇 鍒欏弬鏁扮殑绫诲瀷鏄痠o.fabric8.kubernetes.api.model.OwnerReference
	 * 
	 * @param method
	 *            鏂规硶鍚�
	 * @return 鍙傛暟绫诲瀷
	 */
	private String getParamType(Method method) {
		String fullname = method.getGenericParameterTypes()[0].getTypeName();
		int idx = fullname.indexOf(",") == -1 ? fullname.indexOf("<") : fullname.indexOf(",");
		String typename = (idx == -1) ? fullname : fullname.substring(idx + 1, fullname.indexOf(">")).trim();
		return typename;
	}

	/**
	 * 瀵逛簬鍒嗘瀽鍑烘潵鐨勫弬鏁板強鍏剁被鍨嬶紝杩涜璁板綍锛屾瘮濡�
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
	 * 瀵逛簬setMetadata锛屽垯models璁板綍鐨刱ey涓簊etMetadata
	 * 瀵逛簬setMetadata鍚庡啀鎵цsetName姝ょ被u鎿嶄綔锛宮odels閲岃褰曠殑搴旇鏄痵etMetadata-setName
	 * 
	 * @param parent
	 *            鐖惰妭鐐�
	 * @param method
	 *            鏂规硶鍚�
	 * @return 寰楀埌鐖惰妭鐐�
	 */
	protected String getParent(String parent, Method method) {
		return DEFAULT_PARENT.equals(parent) ? method.getName() : parent + "-" + method.getName();
	}

	/************************************************************************************
	 * 
	 * You should implement it by yourself
	 * 
	 ************************************************************************************/

	/**
	 * @return 鑾峰彇鎵�鏈塳ind瀵瑰簲鐨勬ā鍨�
	 */
	public Map<String, String> getKindModels() {
		return getKindModelAnalyzer().getKindModels();
	}

	/**
	 * @return 鑾峰彇鎵�鏈夋ā鍨�
	 */
	public Map<String, Map<String, String>> getParameters() {
		return parameters;
	}

	/**
	 * @param kind
	 *            kind绫诲瀷
	 * @return 鑾峰彇鎵�鏈夋ā鍨嬪弬鏁�
	 */
	public Map<String, String> getModelParameters(String kind) {
		return StringUtils.isNull(kind) ? new HashMap<String, String>() : parameters.get(kind);
	}

	/**
	 * 锛�1锛変笉鏄熀纭�绫诲瀷锛屽int, String绛�
	 * 锛�2锛変篃涓嶆槸Map绫诲瀷锛屽洜涓哄湪fabric8涓紝Map涓彧浼氬瓨鍌⊿tring绫诲瀷鐨刱ey, value瀵�
	 * 
	 * 濡傛灉涓嶆弧瓒充笂杩颁袱涓潯浠讹紝鍒欒鏄庨渶瑕佽繘涓�姝ヨ繘琛屽垎鏋�
	 * 
	 * @param typename
	 *            绫诲瀷鍚�
	 * @return 鏄惁鍙互寰幆
	 */
	protected synchronized boolean canNested(String typename) {
		return !JavaUtils.isPrimitive(typename) // 涓嶆槸鍩虹绫诲瀷
				&& !JavaUtils.isStream(typename) // 涓嶆槸Map<String, String>
				&& !JavaUtils.isStringSet(typename) // 涓嶆槸Set<String>
				&& !JavaUtils.isStringStringMap(typename) // 涓嶆槸Map<String, String>
				&& !typename.endsWith("[]") // 涓嶆槸Array
				&& typename.split(",").length < 2; // 涓嶆槸Map锛屽湪fabric8涓紝Map浼氶�氳繃娉涘瀷琛ㄧず锛屽Map<String,
													// String>锛屽垯閫氳繃,鍒掑垎锛岄暱搴﹀皬浜�2鐨勪笉鏄疢ap
	}

	/************************************************************************************
	 * 
	 * You should implement it by yourself
	 * 
	 ************************************************************************************/

	/**
	 * @return 鍒嗘瀽鍣�
	 */
	public abstract KindModelAnalyzer getKindModelAnalyzer();

	/**
	 * 鏍规嵁fabric8鐨勪唬鐮佽鑼冿紝鍙繃婊dd鍜宻et寮�澶达紝涓斿彧鏈変竴涓弬鏁扮殑鏂规硶 杩欎簺鏂规硶鍙互璇存槑杩欎釜鏂规硶鐨勫弽灏勮鍒�
	 * 
	 * @param method
	 *            鏂规硶鍚�
	 * @return 鏄惁鍙互鍙嶅皠
	 */
	protected synchronized boolean canReflect(Method method) {
		return !ObjectUtils.isNull(method) && ((method.getName().startsWith(MODEL_METHOD_SET) // set寮�澶寸殑鏂规硶
				|| method.getName().startsWith(MODEL_METHOD_WITH)) // with寮�澶寸殑鏂规硶
				&& method.getParameterCount() == 1 // 璇ユ柟娉曞彧鏈変竴涓弬鏁�
				&& !JavaUtils.ignoreMethod(method.getName()) && !ignoreMethods.contains(method.getName())); // 鍙互浜哄伐鎸囧畾杩囨护鍝簺鏂规硶
	}

}
