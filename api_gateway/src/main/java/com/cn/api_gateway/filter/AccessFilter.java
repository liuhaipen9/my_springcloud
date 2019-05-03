package com.cn.api_gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 刘海鹏
 * @iphone 13714872954
 * @date 2019/5/2下午8:01
 */
@Slf4j
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest req=ctx.getRequest();

        log.info("send{} request to {}",req);
        Object accessToken=req.getParameter("accessToken");
//        if (accessToken==null){
//            log.warn("access token is not empty!!!");
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            ctx.setResponseBody("请求被拦截，请保证accessToken有值！！！");
//            return null;
//        }
        log.info("access token ok");
        return null;
    }
}
