package com.hjw;

import com.hjw.chainOfResponsibilityPattern.spring.HandlerContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DesignPatternApplication.class, args);

        HandlerContext handlerContext = context.getBean(HandlerContext.class);
        handlerContext.execute("aaa");
    }

}
