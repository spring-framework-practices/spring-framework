package com.trl.aop.objects;

import org.springframework.stereotype.Component;

@Component
public class SomeService {

    public int getIntValue() {
        return 5;
    }

    public double getDoubleValue() {
        return 5.6;
    }

    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }

}
