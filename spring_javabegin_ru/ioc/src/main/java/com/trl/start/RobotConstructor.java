package com.trl.start;

import com.trl.impls.sony.SonyHand;
import com.trl.impls.sony.SonyHead;
import com.trl.impls.sony.SonyLeg;
import com.trl.impls.toshiba.ToshibaHand;
import com.trl.impls.toshiba.ToshibaHead;
import com.trl.impls.toshiba.ToshibaLeg;

public class RobotConstructor {

    public static void main(String[] args) {

        /*
        * Aque nosotros ya podemos poner differentes marcas de los detalles de Robot
        *
        * */

        SonyHead sonyHead_A= new SonyHead();
        SonyHand sonyHand_A = new SonyHand();
        SonyLeg sonyLeg_A = new SonyLeg();

        Robot robot_A = new Robot(sonyHead_A, sonyHand_A, sonyLeg_A);
        robot_A.action();



        ToshibaHead toshibaHead_B = new ToshibaHead();
        ToshibaHand toshibaHand_B = new ToshibaHand();
        ToshibaLeg toshibaLeg_B = new ToshibaLeg();

        Robot robot_B = new Robot(toshibaHead_B, toshibaHand_B, toshibaLeg_B);
        robot_B.action();



        /*
        * Incluso podemos poner los detalles de Robot de diferenets marcas
        *
        * */
        SonyHead sonyHead_C = new SonyHead();
        SonyHand sonyHand_C = new SonyHand();
        ToshibaLeg toshibaLeg_C = new ToshibaLeg();

        Robot robot_C = new Robot(sonyHead_C, sonyHand_C, toshibaLeg_C);
        robot_C.action();



        ToshibaHead toshibaHead_D = new ToshibaHead();
        SonyHand sonyHand_D = new SonyHand();
        ToshibaLeg toshibaLeg_D = new ToshibaLeg();

        Robot robot_D = new Robot(toshibaHead_D, sonyHand_D, toshibaLeg_D);
        robot_D.action();

        /*
        * Es la grande fuerza de IOC.
        * O tambien le dicen programacion a nivel de interfaces.
        * */
    }

}
