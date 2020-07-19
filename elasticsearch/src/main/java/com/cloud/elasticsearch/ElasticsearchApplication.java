package com.cloud.elasticsearch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: feng-cloud-template
 * @description: ElasticsearchApplication 启动类
 * @author: feng
 * @create: 2020-07-19 07:16
 **/
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class ElasticsearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchApplication.class,args);
        log.info("ElasticsearchApplication 启动成功");
    }
}
