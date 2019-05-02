package com.cn.eureka_client.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/1下午10:30
 */
@RestController
public class UploadController {
    @PostMapping(value = "/uploadFile",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestParam(value = "file")MultipartFile multipartFile){
        return multipartFile.getName();

    }
}
