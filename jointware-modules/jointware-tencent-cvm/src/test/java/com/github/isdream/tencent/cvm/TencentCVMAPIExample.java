/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.tencent.cvm;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesResponse;
import com.tencentcloudapi.cvm.v20170312.models.ZoneInfo;

/**
 * @author wuheng{@otcaix.iscas.ac.cn} 2018年3月30日
 *
 */
public class TencentCVMAPIExample {

	final static String REGINE_ID = "ap-guangzhou";

	final static String secretId = "";

	final static String secretKey = "";

	/**
	 * @param args
	 * @throws ClientException
	 * @throws ServerException
	 */
	public static void main(String[] args) throws Exception {

		Credential cred = new Credential(secretId, secretKey);
		CvmClient client = new CvmClient(cred, "ap-guangzhou");

		DescribeZonesRequest request = new DescribeZonesRequest();
		DescribeZonesResponse response = client.DescribeZones(request);
		for (ZoneInfo zi : response.getZoneSet()) {
			System.out.println(zi.getZone());
		}
	}

}
