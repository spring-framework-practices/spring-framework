package com.trl.impls.pool;

import com.trl.interfaces.Robot;
import com.trl.interfaces.RobotList;

import java.util.List;

public class T1000List implements RobotList {

    private List<Robot> robotList;

    @Override
    public List<Robot> getRobotList() {
        return robotList;
    }

    public void setRobotList(List<Robot> robotList) {
        this.robotList = robotList;
    }

    public void action() {
        for (Robot robot : robotList) {
            robot.action();
        }
    }

}
