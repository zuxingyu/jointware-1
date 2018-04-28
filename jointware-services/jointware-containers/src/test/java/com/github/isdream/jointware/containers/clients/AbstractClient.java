/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers.clients;

import java.util.Map;

import com.github.isdream.jointware.containers.ConatinerExecutor;
import com.github.isdream.jointware.containers.handlers.AbstractHandler;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年3月12日
 */
public interface AbstractClient {

	public final static String KIND = "kind";

	public final static String MASTER_IP = "masterIp";

	public final static String MASTER_PORT = "masterPort";

	public final static String MASTER_TYPE = "masterType";

	public final static String PROTOCOL_HTTP = "http";

	public final static String PROTOCOL_HTTPS = "https";

	public abstract Object create(Map<String, Object> map);
	
	public abstract ConatinerExecutor getConatinerDispatcher();
	
	public abstract AbstractHandler getHandler();
}
