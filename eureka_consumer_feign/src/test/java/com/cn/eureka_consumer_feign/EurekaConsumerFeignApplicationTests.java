package com.cn.eureka_consumer_feign;

import com.cn.eureka_consumer_feign.feign.eureka_client_client.UploadFileClient;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class EurekaConsumerFeignApplicationTests {

   @Autowired
    private UploadFileClient uploadFileClient;

    @Test
    @SneakyThrows
    public void testHandleFileUpload(){
        File file=new File("/Users/liuhaipeng/roc-work/workspace/ams/springcloud/my_springcloud/eureka_consumer_feign/src/test/java/com/cn/eureka_consumer_feign/upload.txt");
        DiskFileItem fileItem=(DiskFileItem) new DiskFileItemFactory().createItem("file",
                MediaType.TEXT_PLAIN_VALUE, true, file.getName());
        try(InputStream inputStream=new FileInputStream(file);
            OutputStream outputStream=fileItem.getOutputStream();){
            IOUtils.copy(inputStream,outputStream);

        }catch (Exception e){
            throw new IllegalArgumentException("Invalid file: " + e, e);
            }
        MultipartFile multipartFile=new CommonsMultipartFile(fileItem);
        log.info(uploadFileClient.handleFileUpload(multipartFile));
    }




}
