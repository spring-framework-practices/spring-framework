package com.trl.impls.sony;

import com.trl.interfaces.Head;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SonyHead implements Head {

    private String color;

    public void calc() {
        System.out.println("Thinking about Sony...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
