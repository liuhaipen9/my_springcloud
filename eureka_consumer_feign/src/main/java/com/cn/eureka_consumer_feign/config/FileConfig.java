package com.cn.eureka_consumer_feign.config;

import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.codec.Encoder;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/1下午10:46
 */
@Configuration
public class FileConfig {
    @Bean
    public Encoder feignFormEncoder(){
        return new SpringFormEncoder();
    }
}
