package com.trl.start;

import com.trl.interfaces.Hand;
import com.trl.interfaces.Head;
import com.trl.interfaces.Leg;

public class Robot {

    /*
    *  Aqui ya no estamos obligados hacer cambios cada vez que quieremos cambirar modelo de Robot.
    *  Gracias a las interfaces y a IOC.
    *
    * */
    private Head head;
    private Hand hand;
    private Leg leg;

    public Robot(Head head, Hand hand, Leg leg) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

}
