package com.trl.main;

import com.trl.impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        out.println("============================================ t1000_DB ============================================");
        ModelT1000 t1000_db = (ModelT1000) context.getBean("t1000_DB");

        out.println("============================================ t1000_t1000Empty ============================================");
//        ModelT1000 t1000_t1000Empty = (ModelT1000) context.getBean("t1000_t1000Empty");

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
