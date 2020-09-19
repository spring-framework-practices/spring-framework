package com.springinaction;

import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws PerformanceException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");

        Performer hank = (Performer) applicationContext.getBean("hank");

        hank.perform();

    }
}
