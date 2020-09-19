package com.trl.impls.toshiba;

import com.trl.interfaces.Leg;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToshibaLeg implements Leg {

    public void go() {
        System.out.println("Go to Toshiba!");
    }

}
