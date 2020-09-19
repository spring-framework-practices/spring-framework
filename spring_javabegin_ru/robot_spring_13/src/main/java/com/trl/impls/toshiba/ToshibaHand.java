package com.trl.impls.toshiba;

import com.trl.interfaces.Hand;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToshibaHand implements Hand {

    public void catchSomething() {
        System.out.println("Catched from Toshiba!");
    }

}
