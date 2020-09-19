package com.trl.aop.main;

import com.trl.aop.objects.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SomeService service = (SomeService) context.getBean("someService");

        System.out.println("================================================================ service.getDoubleValue()");
        double val = service.getDoubleValue();

        System.out.println("=================================================================== service.getIntValue()");
        double val_A = service.getIntValue();

        System.out.println("=========================================================== service.printThrowException()");
        try {
            service.printThrowException();
        } catch (IllegalArgumentException e) { /* NOT ACTION*/ }

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
