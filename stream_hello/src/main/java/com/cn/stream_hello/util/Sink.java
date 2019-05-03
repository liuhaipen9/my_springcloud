package com.cn.stream_hello.util;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/3上午10:20
 */
public interface Sink {
    String INPUT="input";

    @Input(Sink.INPUT)
    SubscribableChannel input();
}
