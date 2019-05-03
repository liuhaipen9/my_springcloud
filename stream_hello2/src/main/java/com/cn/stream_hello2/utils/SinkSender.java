package com.cn.stream_hello2.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.support.GenericMessage;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/3上午11:59
 */
@EnableBinding(value = {Source.class})
public class SinkSender {
    private static Logger logger=LoggerFactory.getLogger(SinkSender.class);

//    @Bean
//    @InboundChannelAdapter(Value=Source.OUTPUT)
//    public org.springframework.messaging.support.MessageBuilder<String> timerMessageSource(){
//        return ()->new GenericMessage<>("\"{\\\"name\\\":\\\"didi\\\", \\\"age\\\":30}\"");
//    }
}
