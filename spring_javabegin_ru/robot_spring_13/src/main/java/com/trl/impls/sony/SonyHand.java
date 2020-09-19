package com.trl.impls.sony;

import com.trl.interfaces.Hand;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SonyHand implements Hand {

    public void catchSomething() {
        System.out.println("Catched from Sony!!");
    }

}
