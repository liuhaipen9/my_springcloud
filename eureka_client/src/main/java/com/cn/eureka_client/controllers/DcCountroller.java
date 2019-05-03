package com.cn.eureka_client.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/1下午5:14
 */
@Slf4j
@RestController
public class DcCountroller {

    @Autowired
    DiscoveryClient discoveryClient;



    @GetMapping("/dc")
    public String dc(){
        //模拟hystriy
        /*try {
            Thread.sleep(6000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        String services="Service:"+discoveryClient.getServices();
        log.info("eureka客户端返回参数:{}",services);
        return services;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
