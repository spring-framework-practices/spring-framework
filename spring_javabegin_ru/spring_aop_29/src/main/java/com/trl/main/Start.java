package com.trl.main;

import com.trl.objects.FileManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        FileManager fileManager = (FileManager) context.getBean("fileManager");
        // FileManager2 fileManager2 = (FileManager2)
        // context.getBean("fileManager2");

        // если у вас другая операционная система, измените путь к папке (в которую есть доступ у вашей учетной записи)


        // fileManager.getExtensionCount("c:\\Windows\\System32");
        // fileManager2.getExtensionCount("c:\\Windows\\");
        fileManager.getExtensionCount("/home/trl/Downloads");
        // fileManager.getExtensionList("c:\\Windows\\system32\\drivers");

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }

}
