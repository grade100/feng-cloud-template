package com.cloud.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: feng-cloud-template
 * @description: Stream 启动类
 * @author: feng
 * @create: 2020-07-19 16:13
 **/
@Slf4j
@SpringBootApplication
public class StreamApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class,args);
        log.info("stream 启动成功");
    }
}
