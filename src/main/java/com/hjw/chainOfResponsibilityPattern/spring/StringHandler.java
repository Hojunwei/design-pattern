package com.hjw.chainOfResponsibilityPattern.spring;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(5)
@Service
public class StringHandler extends AbstractHandler {

    @Override
    protected boolean match(Object params) {
        return params instanceof String;
    }

    @Override
    public void process(Object params) {
        System.out.println("string processed");
    }
}
