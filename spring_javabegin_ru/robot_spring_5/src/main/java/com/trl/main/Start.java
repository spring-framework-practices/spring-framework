package com.trl.main;

import com.trl.impls.robot.ModelT1000;
import com.trl.impls.robot.ModelT1000_LiveCycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

         ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
         out.println(t1000.getHead());



        out.println("\n============================== t1000_scope_singleton_singleton ==============================\n");
        ModelT1000 t1000_scope_singleton_singleton = (ModelT1000) context.getBean("t1000_scope_singleton_singleton");
        out.println("t1000_scope_singleton_singleton                   " + t1000_scope_singleton_singleton);
        out.println("t1000_scope_singleton_singleton.getHead()         " + t1000_scope_singleton_singleton.getHead());

         t1000_scope_singleton_singleton = (ModelT1000) context.getBean("t1000_scope_singleton_singleton");
        out.println("t1000_scope_singleton_singleton                   " + t1000_scope_singleton_singleton);
        out.println("t1000_scope_singleton_singleton.getHead()         " + t1000_scope_singleton_singleton.getHead());

        out.println("\n============================== t1000_scope_singleton_prototype ==============================\n");
        ModelT1000 t1000_scope_singleton_prototype = (ModelT1000) context.getBean("t1000_scope_singleton_prototype");
        out.println("t1000_scope_singleton_prototype                   " + t1000_scope_singleton_prototype);
        out.println("t1000_scope_singleton_prototype.getHead()         " + t1000_scope_singleton_prototype.getHead());

         t1000_scope_singleton_prototype = (ModelT1000) context.getBean("t1000_scope_singleton_prototype");
        out.println("t1000_scope_singleton_prototype                   " + t1000_scope_singleton_prototype);
        out.println("t1000_scope_singleton_prototype.getHead()         " + t1000_scope_singleton_prototype.getHead());



        out.println("\n============================== t1000_scope_prototype_prototype ==============================\n");
        ModelT1000 t1000_scope_prototype_prototype = (ModelT1000) context.getBean("t1000_scope_prototype_prototype");
        out.println("t1000_scope_prototype_prototype                   " + t1000_scope_prototype_prototype);
        out.println("t1000_scope_prototype_prototype.getHead()         " + t1000_scope_prototype_prototype.getHead());

        t1000_scope_prototype_prototype = (ModelT1000) context.getBean("t1000_scope_prototype_prototype");
        out.println("t1000_scope_prototype_prototype                   " + t1000_scope_prototype_prototype);
        out.println("t1000_scope_prototype_prototype.getHead()         " + t1000_scope_prototype_prototype.getHead());

        out.println("\n============================== t1000_scope_prototype_singleton ==============================\n");
        ModelT1000 t1000_scope_prototype_singleton = (ModelT1000) context.getBean("t1000_scope_prototype_singleton");
        out.println("t1000_scope_prototype_singleton                   " + t1000_scope_prototype_singleton);
        out.println("t1000_scope_prototype_singleton.getHead()         " + t1000_scope_prototype_singleton.getHead());

        t1000_scope_prototype_singleton = (ModelT1000) context.getBean("t1000_scope_prototype_singleton");
        out.println("t1000_scope_prototype_singleton                   " + t1000_scope_prototype_singleton);
        out.println("t1000_scope_prototype_singleton.getHead()         " + t1000_scope_prototype_singleton.getHead());




        out.println("\n============================== t1000_init_destroy ==============================\n");
        ModelT1000 t1000_init_destroy = (ModelT1000) context.getBean("t1000_init_destroy");
        out.println("t1000_init_destroy                   " + t1000_init_destroy);
        out.println("t1000_init_destroy.getHead()         " + t1000_init_destroy.getHead());

        out.println("\n============================== t1000_implementationsInterfaces_init_destroy ==============================\n");
        ModelT1000_LiveCycle t1000_implementationsInterfaces_init_destroy = (ModelT1000_LiveCycle) context.getBean("t1000_implementationsInterfaces_init_destroy");
        out.println("t1000_implementationsInterfaces_init_destroy                   " + t1000_implementationsInterfaces_init_destroy);
        out.println("t1000_implementationsInterfaces_init_destroy.getHead()         " + t1000_implementationsInterfaces_init_destroy.getHead());



        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
