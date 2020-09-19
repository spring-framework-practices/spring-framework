package com.trl.main;

import com.trl.objects.FileManager;
import com.trl.objects.FileManager2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        FileManager fileManager = (FileManager) context.getBean("fileManager");
        FileManager2 fileManager2 = (FileManager2) context.getBean("fileManager");
        context.getBean("fileManager2");


        // если у вас другая операционная система, измените путь к папке (в которую есть доступ у вашей учетной записи)
        fileManager.getExtensionCount("/home/trl/Downloads");
        fileManager.getExtensionCount("/home/trl/Documents");
        fileManager.getExtensionCount("/home/trl");
        fileManager.getExtensionList("/home/trl/Downloads");

        fileManager2.getExtensionCount("/home/trl/Downloads");

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
