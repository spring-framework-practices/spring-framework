package com.trl.main;

import com.trl.dao.interfaces.MP3Dao;
import com.trl.dao.objects.MP3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        MP3 mp3 = new MP3();
        mp3.setName("Song name");
        mp3.setAuthor("Song author");

        // new SQLiteDAO().insertWithJDBC(mp3);

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        MP3Dao sqLiteDAO = (MP3Dao) context.getBean("pSQLDAO");

        System.out.println(sqLiteDAO.getMP3ListByAuthor("Justin").size());

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

    }
}
