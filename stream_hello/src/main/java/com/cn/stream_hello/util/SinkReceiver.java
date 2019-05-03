package com.cn.stream_hello.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/3上午9:44
 */

@EnableBinding(Sink.class)
public class SinkReceiver {
   private static Logger logger=LoggerFactory.getLogger(SinkReceiver.class);

   @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        logger.info("Received:"+payload);
   }
}
