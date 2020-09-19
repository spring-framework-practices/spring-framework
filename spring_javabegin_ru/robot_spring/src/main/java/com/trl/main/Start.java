package com.trl.main;

import com.trl.impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.dance();

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную
    }
}
