package com.cn.sleuth_trace2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/3上午9:44
 */

@EnableEurekaClient
@SpringBootApplication
public class SleuthTrace2Application {

    public static void main(String[] args) {
        SpringApplication.run(SleuthTrace2Application.class, args);
    }

}
