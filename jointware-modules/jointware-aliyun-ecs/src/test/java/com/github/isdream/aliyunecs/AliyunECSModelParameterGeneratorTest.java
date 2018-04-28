package com.github.isdream.aliyunecs;

import com.github.isdream.aliyunecs.kinds.EmptyDirObject;
import com.github.isdream.jointware.core.ModelParameterGenerator;

public class AliyunECSModelParameterGeneratorTest {
    public static void main(String[] args) {
        AliyunECSModelParameterGenerator generator = new AliyunECSModelParameterGenerator(
                ModelParameterGenerator.JOINTWARE);
        System.out.println(generator.toJson(
                generator.toMap(
                        new EmptyDirObject().create())));
    }
}
