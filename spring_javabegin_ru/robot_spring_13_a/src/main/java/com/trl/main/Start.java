package com.trl.main;

import com.trl.config.ApplicationConfig;
import com.trl.impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ModelT1000 model1 = (ModelT1000) context.getBean("model1");
        ModelT1000 model2 = (ModelT1000) context.getBean("model2");
        // ModelT1000 model3 = (ModelT1000) context.getBean("model1");

        model1.action();
        model2.action();
        // System.out.println(model3);

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
