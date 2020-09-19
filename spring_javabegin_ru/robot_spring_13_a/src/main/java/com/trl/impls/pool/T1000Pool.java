package com.trl.impls.pool;

import com.trl.enums.ColorStyle;
import com.trl.interfaces.Robot;
import com.trl.qualifiers.RobotType;
import org.springframework.beans.factory.annotation.Autowired;

public class T1000Pool {

    @Autowired
    @RobotType(sound = false, color = ColorStyle.BLACK)
    private Robot blackRobot;
    @Autowired
    @RobotType(sound = true, color = ColorStyle.BLACK)
    private Robot blackSoundableRobot;

    public T1000Pool() {
        System.out.println("t1000 pool constructor()");
    }

    public Robot getBlackRobot() {
        return blackRobot;
    }

    public Robot getBlackSoundableRobot() {
        return blackSoundableRobot;
    }

}
