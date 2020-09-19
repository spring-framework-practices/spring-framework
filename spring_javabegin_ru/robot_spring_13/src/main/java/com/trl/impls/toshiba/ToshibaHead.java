package com.trl.impls.toshiba;

import com.trl.interfaces.Head;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToshibaHead implements Head {

    public void calc() {
        System.out.println("Thinking about Toshiba...");
    }

}
