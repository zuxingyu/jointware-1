package com.github.isdream.aliyunecs.kinds;

import com.aliyuncs.ecs.model.v20140526.ActivateRouterInterfaceRequest;

public class EmptyDirObject extends AliyunECSObject {
    public static String FILE = "/Users/zhangxuri/Desktop/jointware/jointware-modules/jointware-aliyun-ecs/examples/emptydir.yaml";

    @Override
    public String getTargetFile() {
        return FILE;
    }

    @Override
    public Class<?> getTargetClass() {
        return ActivateRouterInterfaceRequest.class;
    }

}
