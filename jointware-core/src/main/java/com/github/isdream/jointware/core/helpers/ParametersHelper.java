/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.core.helpers;

import com.alibaba.fastjson.JSON;
import com.github.isdream.jointware.core.utils.JavaUtils;

import java.util.*;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018骞�3鏈�2鏃�
 */
@Deprecated
public class ParametersHelper {

	/**
	 * @param type
	 *            type
	 * @param kind
	 *            kind
	 * @param models
	 *            models
	 */
	public static void showModelParametersWithKeyValueStyle(String type, String kind, Map<String, String> models) {
		System.out.println("## " + type + " " + kind + " parameters:");
		System.out.println();
		System.out.println("```");
		for (String key : models.keySet()) {
			System.out.println("- " + key + " = " + models.get(key));
		}
		System.out.println("```");
	}

	/**
	 * @param type
	 *            type
	 * @param kind
	 *            kind
	 * @param models
	 *            models
	 */
	public static void showModelParametersWithNetstedStyle(String type, String kind, Map<String, String> models) {
		System.out.println("## " + type + " " + kind + " parameters:");
		System.out.println();
		System.out.println("```");
		for (String key : models.keySet()) {
			System.out.println("- " + getIndent(key) + getSimpleName(key) + " = " + models.get(key));
		}
		System.out.println("```");
	}

	/**
	 * @param type
	 *            type
	 * @param kind
	 *            kind
	 * @param models
	 *            models
	 */
	public static void showModelParametersWithJsonStyle(String type, String kind, Map<String, String> models) {
		System.out.println("## " + type + " " + kind + " parameters:");
		System.out.println();
		System.out.println("```");
		String s = JSON.toJSONString(toJSonStyle(models));
		int level = 0;
		StringBuffer jsonForMatStr = new StringBuffer();
		for (int index = 0; index < s.length(); index++) {
			char c = s.charAt(index);
			if (level > 0 && '\n' == jsonForMatStr.charAt(jsonForMatStr.length() - 1)) {
				jsonForMatStr.append(getLevelStr(level));
			}
			switch (c) {
			case '{':
			case '[':
				jsonForMatStr.append(c + "\n");
				level++;
				break;
			case ',':
				jsonForMatStr.append(c + "\n");
				break;
			case '}':
			case ']':
				jsonForMatStr.append("\n");
				level--;
				jsonForMatStr.append(getLevelStr(level));
				jsonForMatStr.append(c);
				break;
			default:
				jsonForMatStr.append(c);
				break;
			}
		}
		System.out.println(jsonForMatStr.toString());
		System.out.println("```");
	}

	protected static String getLevelStr(int level) {
		StringBuffer levelStr = new StringBuffer();
		for (int levelI = 0; levelI < level; levelI++) {
			levelStr.append("\t");
		}
		return levelStr.toString();
	}

	/*********************************************************************
	 * 
	 * 
	 *********************************************************************/

	/**
	 * @param models
	 *            models
	 * @return map
	 */
	public static Map<String, Map<String, Object>> toJSonStyle(Map<String, String> models) {
		Map<String, Map<String, Object>> json = new LinkedHashMap<String, Map<String, Object>>();
		int id = 0;
		String type = "main";
		String prefix = null;
		Set<String> blackList = new HashSet<String>();
		
		
		for (String key : models.keySet()) {
			if (prefix != null && !key.contains(prefix)) {
				type = "main";
				prefix = null;
			}
			String value = models.get(key);
			if (!json.keySet().contains(type)) {
				json.put(type, new LinkedHashMap<String, Object>());
			}
			Map<String, Object> kv = json.get(type);
			if (JavaUtils.isPrimitive(value)) {
				kv.put(getRealKey(key, prefix), value);
			} else if (JavaUtils.isStringList(value) || JavaUtils.isStringSet(value)) {
				List<String> list = new ArrayList<String>();
				list.add(String.class.getName() + "0");
				list.add(String.class.getName() + "1");
				kv.put(getRealKey(key, prefix), list);
			} else if (JavaUtils.isStringStringMap(value)) {
				Map<String, String> map = new HashMap<String, String>();
				map.put(String.class.getName() + "0", String.class.getName() + "0");
				map.put(String.class.getName() + "1", String.class.getName() + "1");
				kv.put(getRealKey(key, prefix), map);
			} else if (JavaUtils.isObjectList(value) || JavaUtils.isObjectSet(value)) {
				if (ignore(blackList, key)) {
					continue;
				}
				id += 1;
				type = "ref" + id + "-" + JavaUtils.getClassNameForListOrSetStyle(value);
				prefix = key;
				List<String> list = new ArrayList<String>();
				list.add(type);
				kv.put(getRealKey(key, prefix), list);
				blackList.add(key);
			} else if (JavaUtils.isStringObjectMap(value)) {
				if (ignore(blackList, key)) {
					continue;
				}
				id += 1;
				type = "ref" + id + "-" + JavaUtils.getClassNameForMapStyle(value);
				prefix = key;
				Map<String, String> map = new HashMap<String, String>();
				map.put(String.class.getName() + "0", type);
				kv.put(getRealKey(key, prefix), map);
				blackList.add(key);
			} else {
				continue;
			}
		}
		return json;
	}

	protected static boolean ignore(Set<String> blackList, String key) {
		for (String bl : blackList) {
			if (key.indexOf(bl) != -1) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @param key
	 *            key
	 * @param prefix
	 *            prefix
	 * @return prefix-key
	 */
	public static String getRealKey(String key, String prefix) {
		try {
			return key.substring(prefix.length() + 1);
		} catch (Exception e) {
			return key;
		}

	}

	/**
	 * @param fullname
	 *            fullname
	 * @return true if ok
	 */
	protected static String getSimpleName(String fullname) {
		int idx = fullname.lastIndexOf("-");
		return idx == -1 ? fullname : fullname.substring(idx + 1);
	}

	/**
	 * @param fullname
	 *            fullname
	 * @return true
	 */
	protected static String getIndent(String fullname) {
		int num = fullname.split("-").length;
		StringBuffer sb = new StringBuffer();
		while (--num > 0) {
			sb.append("\t");
		}
		return sb.toString();
	}

}
