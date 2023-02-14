package com.helix.spark.iam;

import com.helix.spark.core.spring.SpringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * All rights Reserved, Designed By www.helix.cn
 * How to create a SpringBoot Application
 *  first, Please invoke SpringUtils#setContext method to initialize the ApplicationContext
 * @author [Allen Wang]
 * @version V1.0
 * Copyright 2023 www.helix.cn Inc. All rights reserved.
 * @date 2023/2/12 14:13
 **/
@SpringBootApplication
public class HelixSparkIamApplication {
    public static void main(String[] args) {
        SpringUtils.setContext(SpringApplication.run(HelixSparkIamApplication.class,args));
    }
}