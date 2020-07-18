package com.cloud.cache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: feng-cloud-template
 * @description: 缓存服务启动类
 * @author: feng
 * @create: 2020-07-19 01:11
 **/
@Slf4j
@SpringBootApplication
public class CacheServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheServerApplication.class,args);
        log.info("cache-server 启动成功");
    }

}
