package com.trl.replacer;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ActionReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
        System.out.println("new action!");
        return null;
    }

}
