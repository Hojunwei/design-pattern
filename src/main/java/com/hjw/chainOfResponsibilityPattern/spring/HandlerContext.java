package com.hjw.chainOfResponsibilityPattern.spring;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class HandlerContext {

    /**
     * Spring注入
     *
     * @return
     */

    @Resource
    private List<AbstractHandler> handlerChainList;


    /**
     * 调用请求
     *
     * @param request
     */
    public void execute(Object request) {
        handlerChainList.forEach(handlerChain -> handlerChain.execute(request));
    }
}
