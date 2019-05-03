package com.cn.eureka_consumer_ribbon_hystrix.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.lang.annotation.*;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/2下午3:28
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public @interface SpringCloudApplicaiton {
}
