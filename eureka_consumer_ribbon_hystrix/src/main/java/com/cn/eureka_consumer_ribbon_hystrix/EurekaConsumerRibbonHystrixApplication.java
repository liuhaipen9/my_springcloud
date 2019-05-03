package com.cn.eureka_consumer_ribbon_hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/2下午3:28
 */

@SpringCloudApplication
public class EurekaConsumerRibbonHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonHystrixApplication.class, args);
    }

}
