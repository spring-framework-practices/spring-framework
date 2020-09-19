package com.trl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.trl.impls.robot.ModelT1000;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
