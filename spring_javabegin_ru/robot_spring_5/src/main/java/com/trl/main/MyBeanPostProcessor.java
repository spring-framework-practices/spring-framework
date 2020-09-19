package com.trl.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import static java.lang.System.out;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object object, String name) throws BeansException {
        out.println(object + " - postProcessAfterInitialization()");
        return object;
    }

    @Override
    public Object postProcessBeforeInitialization(Object object, String name) throws BeansException {
        out.println(object + " - postProcessBeforeInitialization()");
        return object;
    }

}
