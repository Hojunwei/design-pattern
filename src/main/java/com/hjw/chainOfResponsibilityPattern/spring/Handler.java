package com.hjw.chainOfResponsibilityPattern.spring;

/**
 * 处理请求的类
 */
public interface Handler {

    /**
     * 处理请求
     *
     * @param params
     */
    void process(Object params);

}
