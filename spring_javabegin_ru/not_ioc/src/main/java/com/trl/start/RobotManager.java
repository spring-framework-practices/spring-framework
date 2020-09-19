package com.trl.start;

import com.trl.objects.*;

public class RobotManager {

    public static void main(String[] args) {
//================================================ Sony realizacion ====================================================

        SonyHead head = new SonyHead();
        SonyLeg leg = new SonyLeg();
        SonyHand hand = new SonyHand();

        Robot robotMarcaSony = new Robot(head, hand, leg);

        robotMarcaSony.action();

//=============================================== Toshiba realizacion ==================================================

        /*
        * Ahora si quieremos robot de marca Toshiba tenemos que ir al
        * clase Robot y cambiar realizacion al modelo Toshiba.
        *
        * */

//        ToshibaHead head = new ToshibaHead();
//        ToshibaHand hand = new ToshibaHand();
//        ToshibaLeg leg = new ToshibaLeg();

//        Robot robotMarcaToshiba = new Robot(head, hand, leg);

//        robotMarcaToshiba.action();

//======================================================================================================================
    }

}
