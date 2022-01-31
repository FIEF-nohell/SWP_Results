package com.nohell.swp_test;

public class Car {

    private EngineController ms;

    public void setMotorsteuerung(EngineController new_ms){
        this.ms = new_ms;
    }

    public void drive(int speed){
        this.ms.currentAlgorithm.drive(speed);
    }

}
