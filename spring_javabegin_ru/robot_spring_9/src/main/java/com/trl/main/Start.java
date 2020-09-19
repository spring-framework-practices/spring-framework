package com.trl.main;

import com.trl.impls.pool.T1000List;
import com.trl.impls.pool.T1000Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

//        System.out.println("================================= t1000List =================================");
//        T1000List t1000List = (T1000List) context.getBean("t1000List");
//        t1000List.action();

        System.out.println("================================= t1000Map =================================");
        T1000Map t1000Map = (T1000Map) context.getBean("t1000Map");
        t1000Map.action();


        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
