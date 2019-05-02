package com.cn.configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/1下午7:55
 */

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigservergitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigservergitApplication.class, args);
    }

}
