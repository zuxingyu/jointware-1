/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core.utils;

import java.util.ArrayList;

/**
 * The {@code StringUtils} class provides some common String processing functions.
 * <p>
 *
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public class StringUtils {

	/**
	 * Check whether a string is null
	 *
	 * @param str string
	 * @return return true of the string is null, otherwise return false
	 */
	public static boolean isNull(String str) {
		return (str == null || "".equals(str)) ? true : false;
	}

	/**
	 * 以大写字母将字符串分为字符串数组
	 *
	 * @param str 传入字符串
	 * @return return 以大写字母将字符串分为字符串数组
	 */
	private static ArrayList<String> splitByUpperCase(String str) {
		ArrayList<String> rs = new ArrayList<String>();
		int index = 0;
		int len = str.length();
		for (int i = 1; i < len; i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				rs.add(str.substring(index, i));
				index = i;
			}
		}
		rs.add(str.substring(index, len));
		return rs;
	}
	/**
	 * 以大写字母将字符串分为字符串数组
	 *
	 * @param string 传入字符串
	 * @return return 按照去掉包名、去掉Request的规则过滤后的kind名称
	 */
	public static String splitByUpperCaseAndGetKind(String string){
		ArrayList<String> stringArrayList = splitByUpperCase(string);
		StringBuilder result= new StringBuilder();
		if (stringArrayList.get(stringArrayList.size() - 1).equals("Request")){
			for (int i=1;i<stringArrayList.size()-1;i++){
				result.append(stringArrayList.get(i));
			}
		}
		else{
			for (int i=1;i<stringArrayList.size();i++){
				result.append(stringArrayList.get(i));
			}
		}
		return result.toString();
	}

}
