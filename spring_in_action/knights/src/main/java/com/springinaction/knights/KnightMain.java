package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {

        //<co id="co_loadKnightContext"/>
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");

        //<co id="co_getBeanKnight"/>
        Knight knight = (Knight) context.getBean("knight");

        //<co id="co_useKnight"/>
        knight.embarkOnQuest();

    }
}
