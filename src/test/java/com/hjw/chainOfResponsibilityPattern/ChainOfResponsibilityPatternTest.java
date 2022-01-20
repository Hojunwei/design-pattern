package com.hjw.chainOfResponsibilityPattern;

import com.hjw.chainOfResponsibilityPattern.spring.HandlerContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ChainOfResponsibilityPatternTest {

    @Resource
    HandlerContext handlerContext;

    @Test
    void test1() {
        handlerContext.execute("aaa");
    }

    @Test
    void test2() {
        handlerContext.execute(1);
    }


}
