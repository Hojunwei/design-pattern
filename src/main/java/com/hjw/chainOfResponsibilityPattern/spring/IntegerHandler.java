package com.hjw.chainOfResponsibilityPattern.spring;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(2)
@Service
public class IntegerHandler extends AbstractHandler {

    @Override
    protected boolean match(Object params) {
        return params instanceof Integer;
    }

    @Override
    public void process(Object params) {
        System.out.println("integer processed");
    }
}
