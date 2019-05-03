package com.cn.stream_hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableBinding(value = {StreamHelloApplicationTests.SinkSender.class})
public class StreamHelloApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void setSinkSenderTester(){
        sinkSender.output().send(MessageBuilder.withPayload("produce a message ：http://blog.didispace.com").build());
    }

    @Autowired
    private SinkSender sinkSender;

    public interface SinkSender{
        String OUTPUT="input";

        @Output(SinkSender.OUTPUT)
        MessageChannel output();
    }
}
