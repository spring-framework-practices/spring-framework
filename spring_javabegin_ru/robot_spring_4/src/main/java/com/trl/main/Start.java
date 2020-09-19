package com.trl.main;

import com.trl.impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        out.println("\n============================== t1000_A ==============================\n");
        ModelT1000 t1000_a = (ModelT1000) context.getBean("t1000_A");
        t1000_a.action();

        out.println("\n============================== t1000_B ==============================\n");
        ModelT1000 t1000_b = (ModelT1000) context.getBean("t1000_B");
        t1000_b.action();

        out.println("\n============================== t1000_C ==============================\n");
        ModelT1000 t1000_c = (ModelT1000) context.getBean("t1000_C");
        t1000_c.action();

        out.println("\n============================== t1000_namespace_p ==============================\n");
        ModelT1000 t1000_namespace_p = (ModelT1000) context.getBean("t1000_namespace_p");
        t1000_namespace_p.action();

        out.println("\n============================== t1000_namespace_c ==============================\n");
        ModelT1000 t1000_namespace_c = (ModelT1000) context.getBean("t1000_namespace_c");
        t1000_namespace_c.action();

        out.println("\n============================== t1000 ==============================\n");
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();

        out.println("\n============================== t1000_Empty ==============================\n");
        ModelT1000 t1000_empty = (ModelT1000) context.getBean("t1000_Empty");

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную
    }
}
