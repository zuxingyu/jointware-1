/**
 * 
 */
package com.github.isdream.jointware.containers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.github.isdream.jointware.containers.clients.AbstractClient;
import com.github.isdream.jointware.containers.clients.ClientsManager;
import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.kubernetes.KubernetesModelGenerator;

import io.fabric8.kubernetes.api.model.extensions.Deployment;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * @author Henry
 *
 */
public class JSONToExecutorSampleTest {
	
	
	
	/**********************************************
	 * 
	 *                Mock client request
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * 
	 **********************************************/
	
	public static Map<String, Map<String, Object>> getClientRequest() throws Exception {
		// examples/client-request.json
		return JSON.parseObject(new FileInputStream(new File("examples/client-request.json")), null, null);
	}

	/**************************************************
	 * 
	 *                 Create Client
	 * 
	 **************************************************/
	
	protected static Object createClient(Map<String, Object> map) {
		try {
			return ClientsManager.getClient((String)
					map.get(ClientsManager.PLATFORM_TYPE))
					.create(map);
		} catch (Exception e) {
			return null;
		}
	}
	
	/**************************************************
	 * 
	 *                 Create Executor
	 * 
	 **************************************************/
	
	protected static Object createExecutor(Map<String, Object> map) {
		try {
			return ClientsManager.getClient((String)
					map.get(ClientsManager.PLATFORM_TYPE))
					.getConatinerDispatcher();
		} catch (Exception e) {
			return null;
		}
	}
	
	/**************************************************
	 * 
	 *                 Get Kind
	 * 
	 **************************************************/
	
	protected static String getKind(Map<String, Object> map) {
		try {
			return (String) map.get(AbstractClient.KIND);
		} catch (Exception e) {
			return null;
		}
	}

	/**********************************************
	 * 
	 *                rules
	 * 
	 **********************************************/
	
	public static Map<String, Map<String, Object>> toTargetMap(Map<String, Map<String, Object>> origin, String key) {
		try {
			return ClientsManager.getClient((String)
					origin.get("target").get(ClientsManager.PLATFORM_TYPE))
					.getHandler().doHandle(origin, key, (String) origin.get("target").get("kind"));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**********************************************
	 * 
	 *                Main
	 * 
	 **********************************************/
	
	public static void main(String[] args) throws Exception {
		// JsonToMap
		Map<String, Map<String, Object>> originRequest = getClientRequest();
		
		// getClient
		DefaultKubernetesClient client = (DefaultKubernetesClient) createClient(originRequest.get("target"));
		
		// toTartgetMap
		Map<String, Map<String, Object>> targetRequest = toTargetMap(originRequest, "jointwareRef");
		
		// option : test 
		ModelGenerator mg = new KubernetesModelGenerator();
		System.out.println(mg.toObject(targetRequest, Deployment.class.getSimpleName()));
		
		// getExcutor
		ConatinerExecutor executor = (ConatinerExecutor) createExecutor(originRequest.get("target"));
		
		// impl
//		executor.create(client, getKind(originRequest.remove("target")), targetRequest);
	}

}
