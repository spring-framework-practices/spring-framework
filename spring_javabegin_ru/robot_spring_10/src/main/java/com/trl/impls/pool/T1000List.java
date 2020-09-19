package com.trl.impls.pool;

import com.trl.interfaces.Robot;
import com.trl.interfaces.RobotList;

import java.util.List;

public class T1000List implements RobotList {

    private List<Robot> robotList;

    public T1000List(List<Robot> robotList) {
        super();
        this.robotList = robotList;
    }

    @Override
    public List<Robot> getRobotList() {
        return robotList;
    }

    public void beginShow() {
        for (Robot robot : robotList) {
            robot.action();
        }
    }

}
