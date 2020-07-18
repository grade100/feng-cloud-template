package com.cloud.middle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: feng-cloud-template
 * @description: 中台 api
 * @author: feng
 * @create: 2020-07-19 01:11
 **/
@Slf4j
@SpringBootApplication
public class MiddlePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiddlePlatformApplication.class,args);
        log.info("middle-platform 启动成功");
    }

}
