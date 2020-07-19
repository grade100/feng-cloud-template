package com.cloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: feng-cloud-template
 * @description: config 启动类
 * @author: feng
 * @create: 2020-07-19 07:16
 **/
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
        log.info("cache-server 启动成功");
    }
}
