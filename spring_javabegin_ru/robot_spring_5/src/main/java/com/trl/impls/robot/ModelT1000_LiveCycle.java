package com.trl.impls.robot;

import com.trl.interfaces.Hand;
import com.trl.interfaces.Head;
import com.trl.interfaces.Leg;
import com.trl.interfaces.Robot;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import static java.lang.System.out;

public class ModelT1000_LiveCycle implements Robot, InitializingBean, DisposableBean {

    private Hand hand;
    private Leg leg;
    private Head head;

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000_LiveCycle() {
    }

    public ModelT1000_LiveCycle(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public ModelT1000_LiveCycle(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000_LiveCycle(String color, int year, boolean soundEnabled) {
        super();
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
        out.println("color: " + color);
        out.println("year: " + year);
        out.println("can play sound: " + soundEnabled);
    }

    @Override
    public void dance() {
        out.println("T1000 is dancing!");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void destroy() throws Exception {
        out.println("destroy() --> ModelT1000_LiveCycle");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        out.println("afterPropertiesSet() --> ModelT1000_LiveCycle");
    }
}
