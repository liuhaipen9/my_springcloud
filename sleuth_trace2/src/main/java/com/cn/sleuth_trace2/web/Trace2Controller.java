package com.cn.sleuth_trace2.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/3下午3:26
 */
@Slf4j
@RestController
public class Trace2Controller {

    @GetMapping("/trace2")
    public String trance2(HttpServletRequest request){
        log.info("===<call trace-2>===TraceId={},SpanId={}",request.getHeader("X-B3-TraceId"),request.getHeader("X-B3-SpanId"));
        return "trace2";
    }
}
