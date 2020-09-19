package com.trl.main;

import com.trl.impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;

public class Start {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        out.println("\n=================== t1000_A ===================\n");
        ModelT1000 t1000_a = (ModelT1000) context.getBean("t1000_A");
        t1000_a.action();

        out.println("\n=================== t1000_B ===================\n");
        ModelT1000 t1000_b = (ModelT1000) context.getBean("t1000_B");
        t1000_b.action();

        /*
        * Mucha atencion aqui, en este bean parametros se inicializan por contructor, pero
        * luego dos parametors 'head, hand' se sobre escriben con setters. Parametro 'leg'
        * se queda sin cambios.
        *
        * Se recomienda no utilizar constructores y setters alla vez para no equivocarse
        * y para no hacer codigo mas deficil para entenderlo.
        * */
        out.println("\n=================== t1000_C ===================\n");
        ModelT1000 t1000_c = (ModelT1000) context.getBean("t1000_C");
        t1000_c.action();

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную
    }
}
