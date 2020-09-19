package com.trl.main;

import com.trl.objects.FileManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        FileManager fileUtil = (FileManager) context.getBean("fileManager");

        // если у вас другая операционная система, измените путь к папке (в которую есть доступ у вашей учетной записи)
        fileUtil.getExtensionCount("/home/trl/Downloads");
        fileUtil.getExtensionCount("/home/trl/Documents");
        fileUtil.getExtensionCount("/home/trl");

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
