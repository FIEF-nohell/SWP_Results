package com.nohell.swp_test;

import java.util.List;

public class Car {

    private EngineController ec;
    private LightController lc;
    private SpeedController sc;

    public void setEngineController(EngineController new_ec){
        this.ec = new_ec;
    }

    public void setSpeedController(SpeedController new_sc){
        this.sc = new_sc;
    }

    public void setLightController(LightController new_lc){
        this.lc = new_lc;
    }

    public void drive(int speed){
        this.ec.currentAlgorithm.drive(speed);
    }

    public void driveSmart(int speed){
        sc.checkSpeed(speed);
    }

}
