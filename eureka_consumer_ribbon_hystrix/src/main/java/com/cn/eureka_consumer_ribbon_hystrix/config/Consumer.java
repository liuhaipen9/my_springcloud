package com.cn.eureka_consumer_ribbon_hystrix.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/1下午7:55
 */
@Configuration
public class Consumer {

    @Bean
    /**
     * 加上这个注解restTemplate.getForObject中url的调用方的实例可以直接心
     */
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
