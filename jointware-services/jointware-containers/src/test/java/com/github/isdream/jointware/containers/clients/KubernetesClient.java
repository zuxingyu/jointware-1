/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers.clients;

import java.util.Map;

import com.github.isdream.jointware.containers.ConatinerExecutor;
import com.github.isdream.jointware.containers.handlers.AbstractHandler;
import com.github.isdream.jointware.containers.handlers.KubernetesHandler;
import com.github.isdream.jointware.containers.impl.KubernetesExecutor;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年3月12日
 */
public class KubernetesClient implements AbstractClient {

	@Override
	public Object create(Map<String, Object> map) {
		
		String prefix = null;

		if (map == null || map.get(MASTER_TYPE) == null) {
			return null;
		} else if (map.get(MASTER_TYPE).equals(PROTOCOL_HTTP)) {
			prefix = PROTOCOL_HTTP + "://";
		} else {
			return null;
		}

		Config config = new ConfigBuilder().withMasterUrl(prefix + map.get(MASTER_IP) + ":" + map.get(MASTER_PORT))
				.build();
		return new DefaultKubernetesClient(config);
	}

	@Override
	public ConatinerExecutor getConatinerDispatcher() {
		return new KubernetesExecutor();
	}

	@Override
	public AbstractHandler getHandler() {
		return new KubernetesHandler();
	}
}
