package com.trl.abstracts.robot;

import com.trl.interfaces.Hand;
import com.trl.interfaces.Head;
import com.trl.interfaces.Leg;
import com.trl.interfaces.Robot;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public abstract class BaseModel implements Robot {

    /*
    * @Autowired(required = false) etot parameter v annotation hovorit chto esli
    * ne naidow elementa dlia automoaticheskoho sviazevania to necheho strawneho ne bydet, owibka ne vuletit.
    *
    * Annotation Autowired po ymolchaniu stoit true, eto oznachaet chto obezatelno dolzno
    * proisxodit automaticheskoe sviazevanie
    *
    * Esli propisat annotation @Qualifier(nazvanie bean) to v sony_context.xml ili v toshiba_context.xml
    * ne obezatelno ukazuvat nastoriky po ymolcahiy default-autowire-candidates="false". Automaticheskoe sviazuvanie
    * bydet tochno znat kakoi bean vukorustovyvatu.
    *
    * Teg id i qualifier pochti toze samoe no est kakayata raznica.
    * V annotation @Qualifier(nazvanie bean) mozno ykazuvat kak id tak i qualifier.6
     *
    * Ewcho est takoe svoistvo chto esli netu constructora s opredelonnumi parametrami to container sozdast ponachaly
    * konstruktor s etimi parametrami a potom sozdadit obekt.
    * */
    @Autowired
    @Qualifier("sonyHand")
    private Hand hand;

    @Autowired
    @Qualifier("sonyLeg")
    private Leg leg;

    @Autowired
    @Qualifier("sonyGoldenHead")
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }


}
