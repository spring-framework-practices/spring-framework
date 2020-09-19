package com.trl.impls.sony;

import com.trl.interfaces.Leg;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SonyLeg implements Leg {

    public void go() {
        System.out.println("Go to Sony!");
    }

}
