package com.github.isdream.aliyunecs;

import com.github.isdream.jointware.core.ModelParameterGenerator;
import com.github.isdream.jointware.core.utils.StringUtils;

import java.util.HashSet;
import java.util.Set;

public class AliyunECSModelParameterGenerator extends ModelParameterGenerator {
    protected final static Set<String> ignoreMethods = new HashSet<String>();

    protected final static String GET = "get";

    /**
     *
     */
    public AliyunECSModelParameterGenerator() {
        super();
    }

    /**
     * @param objectRef
     */
    public AliyunECSModelParameterGenerator(String objectRef) {
        super(objectRef);
    }

    static {
        ignoreMethods.add("setResponseClass");
        ignoreMethods.add("setQueryParameters");
        ignoreMethods.add("setBodyParameters");
        ignoreMethods.add("setDomainParameters");
        ignoreMethods.add("setHeaders");
        ignoreMethods.add("setProduct");

        ignoreMethods.add("getResponseClass");
        ignoreMethods.add("getQueryParameters");
        ignoreMethods.add("getBodyParameters");
        ignoreMethods.add("getDomainParameters");
        ignoreMethods.add("getHeaders");
        ignoreMethods.add("getProduct");

    }

    @Override
    public boolean ignoreMethod(String name) {
        return StringUtils.isNull(name) || (!name.startsWith(GET)
                || ignoreMethods.contains(name));
    }

}
