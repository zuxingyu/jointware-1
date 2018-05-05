/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.amazon.ec2;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;

/**
 * @author wuheng{@otcaix.iscas.ac.cn}
 * 2018年3月30日
 *
 */
public class AmazonEC2APIExample {

	final static String REGINE_ID = "cn-qingdao";

	final static String ACCESS_KEY_ID = "";

	final static String ACCESS_KEY_SECRET = "";

	/**
	 * @param args
	 * @throws ClientException
	 * @throws ServerException
	 */
	public static void main(String[] args) throws Exception {
		AmazonEC2 client = AmazonEC2ClientBuilder.defaultClient();
		client.describeHosts();
	}

}
