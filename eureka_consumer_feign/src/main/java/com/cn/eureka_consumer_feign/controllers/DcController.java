package com.cn.eureka_consumer_feign.controllers;

import com.cn.eureka_consumer_feign.feign.eureka_client_client.DcClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/1下午9:07
 */

@Slf4j
@RestController
public class DcController {
    @Autowired
    DcClient dcClient;


    @GetMapping("/consumer")
    public String dc(){
        return dcClient.consumer();
    }
}
