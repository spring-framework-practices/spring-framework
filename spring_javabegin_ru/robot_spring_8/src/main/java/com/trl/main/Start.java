package com.trl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.trl.interfaces.Robot;
import com.trl.interfaces.RobotConveyor;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        // BaseModel baseModel = (BaseModel) context.getBean("baseModel");

        System.out.println("\n=============================== lookup-method ===============================\n");
        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");

        Robot terminator1 = t1000Conveyor.createRobot();
        Robot terminator2 = t1000Conveyor.createRobot();
        Robot terminator3 = t1000Conveyor.createRobot();

        System.out.println("terminator1 " + terminator1);
        System.out.println("terminator2 " + terminator2);
        System.out.println("terminator3 " + terminator3);

        System.out.println("\n=============================== replaced-methodA ===============================\n");
        Robot t1000Conveyor_replaced_methodA = (Robot) context.getBean("t1000_replaced_method");

        t1000Conveyor_replaced_methodA.action();

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
