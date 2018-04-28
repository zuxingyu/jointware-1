package com.github.isdream.aliyunecs.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtils {
    public static Map<String, Map<String, Object>> mockBOCOFrontend() {
        Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();

        Map<String, Object> main = new HashMap<String, Object>();
        map.put("main", main);
        return map;
    }
}
