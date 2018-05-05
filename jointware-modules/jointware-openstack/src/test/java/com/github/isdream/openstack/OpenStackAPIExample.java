/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.openstack;

import org.openstack4j.api.OSClient.OSClientV3;
import org.openstack4j.api.compute.ComputeService;
import org.openstack4j.openstack.internal.OSClientSession.OSClientSessionV3;

/**
 * @author wuheng{@otcaix.iscas.ac.cn}
 * 2018年3月30日
 *
 */
public class OpenStackAPIExample {

	final static String REGINE_ID = "cn-qingdao";

	final static String ACCESS_KEY_ID = "";

	final static String ACCESS_KEY_SECRET = "";

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ComputeService os = OSClientSessionV3.getCurrent().compute();
		System.out.println(os.images());
	}

}
