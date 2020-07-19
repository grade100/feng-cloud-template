package com.cloud.middle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: feng-cloud-template
 * @description: MiddleApplication
 * @author: feng
 * @create: 2020-07-19 16:00
 **/
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class MiddleApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiddleApplication.class,args);
        log.info("Middle 启动成功");
    }
}