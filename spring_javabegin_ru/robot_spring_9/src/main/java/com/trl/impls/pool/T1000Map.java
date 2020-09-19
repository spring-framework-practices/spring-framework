package com.trl.impls.pool;

import com.trl.interfaces.Robot;
import com.trl.interfaces.RobotMap;

import java.util.Map;

public class T1000Map implements RobotMap {

    private Map<Integer, Robot> robotMap;

    public T1000Map() {
    }

    public T1000Map(Map<Integer, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    @Override
    public Map<Integer, Robot> getRobotMap() {
        return robotMap;
    }

    public void setRobotMap(Map<Integer, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    public void action() {
        for (Map.Entry<Integer, Robot>  entry: robotMap.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().action();
        }
    }

}
