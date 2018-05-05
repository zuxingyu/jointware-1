/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker;

import com.alibaba.fastjson.JSON;
import com.github.dockerjava.api.model.AuthConfig;
import com.github.isdream.jointware.docker.models.CreateContainerCmdImpl;

/**
 * @author Henry
 *
 */
public class DockerModelParameterGeneratorTest {

	public final static String text = "{\r\n" + 
			"	\"authConfig\": {\r\n" + 
			"		\"auth\": \"auth\",\r\n" + 
			"		\"email\": \"email@email.com\",\r\n" + 
			"		\"password\": \"password\",\r\n" + 
			"		\"registryAddress\": \"https://index.docker.io/v1/\",\r\n" + 
			"		\"username\": \"username\"\r\n" + 
			"	},\r\n" + 
			"	\"binds\": [],\r\n" + 
			"	\"exposedPorts\": [],\r\n" + 
			"	\"hostConfig\": {\r\n" + 
			"		\"binds\": [],\r\n" + 
			"		\"links\": [],\r\n" + 
			"		\"logConfig\": {},\r\n" + 
			"		\"userDefinedNetwork\": false\r\n" + 
			"	},\r\n" + 
			"	\"links\": [],\r\n" + 
			"	\"logConfig\": {},\r\n" + 
			"	\"name\": \"henry\",\r\n" + 
			"	\"volumes\": []\r\n" + 
			"}";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		CreateContainerCmdImpl ccci = new CreateContainerCmdImpl();
//		ccci.withName("henry");
//		AuthConfig authConfig = new AuthConfig();
//		authConfig.withAuth("auth");
//		authConfig.withEmail("email@email.com");
//		authConfig.withPassword("password");
//		authConfig.withUsername("username");
//		ccci.withAuthConfig(authConfig );
//		System.out.println(JSON.toJSONString(ccci));
		CreateContainerCmdImpl c3i = JSON.parseObject(text, CreateContainerCmdImpl.class);
		System.out.println(c3i.getName());
	}

}
