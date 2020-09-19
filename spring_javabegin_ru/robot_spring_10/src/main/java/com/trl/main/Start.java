package com.trl.main;

import com.trl.impls.pool.T1000List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        T1000List t1000GoldenPool = (T1000List) context.getBean("t1000_List_SpEL");
        t1000GoldenPool.beginShow();

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
