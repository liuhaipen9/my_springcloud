package com.cn.eureka_consumer_feign.feign.eureka_client_client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/1下午10:39
 */
@FeignClient(value = "eureka-client")
public interface UploadFileClient {

    @PostMapping(value = "/uploadFile",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleFileUpload(@RequestParam(value="file")MultipartFile multipartFile);
}
