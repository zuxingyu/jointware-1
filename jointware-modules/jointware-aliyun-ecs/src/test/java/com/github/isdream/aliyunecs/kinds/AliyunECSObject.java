package com.github.isdream.aliyunecs.kinds;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;

public abstract class AliyunECSObject {
    /**
     * @return
     */
    public Object create() {
        try {
            return new Yaml().loadAs(
                    new FileInputStream(
                            new File(getTargetFile())),
                    getTargetClass());
        } catch (Exception e) {
            e.printStackTrace();
            return new Object();
        }
    }

    /**
     * @return
     */
    public abstract String getTargetFile();

    /**
     * @return
     */
    public abstract Class<?> getTargetClass();
}
