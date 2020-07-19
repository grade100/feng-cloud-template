package com.cloud.cache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: feng-cloud-template
 * @description: 缓存服务启动类
 * @author: feng
 * @create: 2020-07-19 01:11
 **/
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class,args);
        log.info("cache 启动成功");
    }

}
