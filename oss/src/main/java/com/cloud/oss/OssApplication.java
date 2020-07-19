package com.cloud.oss;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: feng-cloud-template
 * @description: oss 启动类
 * @author: feng
 * @create: 2020-07-19 16:18
 **/

@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class OssApplication {
    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class,args);
        log.info("oss 启动成功");
    }
}