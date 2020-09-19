package com.trl.abstracts.robot;

import com.trl.interfaces.Hand;
import com.trl.interfaces.Head;
import com.trl.interfaces.Leg;
import com.trl.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class BaseModel implements Robot {

    @Autowired
    @Qualifier(value = "toshibaHead")
    private Head head;

    @Autowired
    @Qualifier(value = "sonyHand")
    private Hand hand;

    @Autowired
    @Qualifier(value = "toshibaLeg")
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

    public BaseModel(Head head, Hand hand, Leg leg) {
        this();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
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

}
