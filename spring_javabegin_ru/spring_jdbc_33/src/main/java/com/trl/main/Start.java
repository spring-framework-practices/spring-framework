package com.trl.main;

import com.trl.dao.impls.PSQLDAO;
import com.trl.dao.objects.MP3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        MP3 mp3 = new MP3();
        mp3.setName("Song name 3");
        mp3.setAuthor("Song author 3");

//         new PSQLDAO().insertWithJDBC(mp3);

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        PSQLDAO PSQLDAO = (PSQLDAO) context.getBean("pSQLDAO");
//
        PSQLDAO.insert(mp3);
//
        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную


    }

}
