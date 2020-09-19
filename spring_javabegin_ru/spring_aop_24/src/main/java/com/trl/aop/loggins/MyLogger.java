package com.trl.aop.loggins;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyLogger {

    public void printValue(Object obj) {
        System.out.println(obj);
    }

    public void init() {
        System.out.println("init");
    }

    public void close() {
        System.out.println("close");
    }

    public void afterThrowingAdvice(JoinPoint jp, Throwable error){
        System.out.println("Method Signature: "  + jp.getSignature());
        System.out.println("Exception: "+error);
    }

}
