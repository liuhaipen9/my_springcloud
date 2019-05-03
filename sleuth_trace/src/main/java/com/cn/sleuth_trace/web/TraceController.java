package com.cn.sleuth_trace.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/3下午3:28
 */
@Slf4j
@RestController
public class TraceController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/trace")
    public String trace(){
        log.info("===<call trace-2>===");
        ServiceInstance serviceInstance=loadBalancerClient.choose("trace2");
        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/trace2";
        return restTemplate.getForObject(url,String.class);
    }
}
