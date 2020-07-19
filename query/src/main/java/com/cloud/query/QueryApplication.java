package com.cloud.query;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: feng-cloud-template
 * @description: query 启动类
 * @author: feng
 * @create: 2020-07-19 16:19
 **/
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class QueryApplication {
    public static void main(String[] args) {
        SpringApplication.run(QueryApplication.class,args);
        log.info("query 启动成功");
    }
}