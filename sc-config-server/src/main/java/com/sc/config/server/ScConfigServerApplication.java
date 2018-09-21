package com.sc.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ConfigServer启动主类
 *
 * @author yangweixing
 * @date 2018/9/21 11:29
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ScConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScConfigServerApplication.class, args);
    }
}
