/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.aliyunecs;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.CreateDiskRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance;
import com.aliyuncs.ecs.model.v20140526.DescribeZonesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
/**
 * @author wuheng{@otcaix.iscas.ac.cn}
 * 2018年3月30日
 *
 */
public class AliyunECSAPIExample {

	final static String REGINE_ID = "cn-qingdao";

	final static String ACCESS_KEY_ID = "";

	final static String ACCESS_KEY_SECRET = "";

	/**
	 * @param args
	 * @throws ClientException
	 * @throws ServerException
	 */
	public static void main(String[] args) throws ServerException, ClientException {

		IClientProfile profile = DefaultProfile.getProfile(REGINE_ID, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
		IAcsClient client = new DefaultAcsClient(profile);

		DescribeZonesRequest request = new DescribeZonesRequest();
		DescribeZonesResponse response = client.getAcsResponse(request);
		System.out.println(response.getZones().get(0).getZoneId());
		

		DescribeInstancesRequest dur = new DescribeInstancesRequest();
		for (Instance ins : client.getAcsResponse(dur).getInstances()) {
			System.out.println(ins.getInstanceName() + "\t:" + ins.getRegionId());
		}

	}

}
