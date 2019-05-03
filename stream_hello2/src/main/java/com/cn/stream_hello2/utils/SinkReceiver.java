package com.cn.stream_hello2.utils;

import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/3上午11:43
 */
@EnableBinding(value = {Sink.class})
public class SinkReceiver {
    private static Logger logger=LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(User user){
        logger.info("Received:"+user);

    }
}
