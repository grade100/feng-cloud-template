package com.cloud.operate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: feng-cloud-template
 * @description: operate 启动类
 * @author: feng
 * @create: 2020-07-19 16:15
 **/

@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class OperateApplication {
    public static void main(String[] args) {
        SpringApplication.run(OperateApplication.class,args);
        log.info("operate 启动成功");
    }
}