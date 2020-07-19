package com.cloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: feng-cloud-template
 * @description: eureka 启动类
 * @author: feng
 * @create: 2020-07-19 07:30
 **/
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
        log.info("EurekaApplication 启动成功");
    }
}