package com.cn.eureka_consumer_feign.feign.eureka_client_client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/1下午9:04
 */

@FeignClient(name = "eureka-client")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}
