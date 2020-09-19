package com.trl.start;

import com.trl.objects.*;

public class Robot {
//================================================ Sony realizacion ====================================================

    /*
    *  Cada ves cuando queremos cambiar los detalles de Robot, tenemos que entrar a
    *  esta clase y cambiar una marca de modelo  por otra, y ademas cada ves tenemos
    *  que cambiar tambien parametros de constructor. Y tambien si clase va tener
    *  algunos metodos, es probable que estos metdos tambien van tener cambios.
    *
    * */
    private SonyHead head;
    private SonyHand hand;
    private SonyLeg leg;

    public Robot(SonyHead head, SonyHand hand, SonyLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    //=============================================== Toshiba realizacion ==================================================

    /*
     *  Cada ves cuando queremos cambiar los detalles de Robot, tenemos que entrar a
     *  esta clase y cambiar una marca de modelo  por otra, y ademas cada ves tenemos
     *  que cambiar tambien parametros de constructor. Y tambien si clase va tener
     *  algunos metodos, es probable que estos metdos tambien van tener cambios.
     *
    * */
//    private ToshibaHead head;
//    private ToshibaHand hand;
//    private ToshibaLeg leg;

//    public Robot(ToshibaHead head, ToshibaHand hand, ToshibaLeg leg) {
//        this.head = head;
//        this.hand = hand;
//        this.leg = leg;
//    }

//======================================================================================================================

    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

}
