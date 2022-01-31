package com.nohell.swp_test;
import java.util.ArrayList;
import java.util.List;

public class Car {

    private List<Algorithm> AlgoList = new ArrayList<>();
    private Motorsteuerung ms;

    public void addAlgorithm(Algorithm alg){
        this.AlgoList.add(alg);
    }

    public void setMotorsteuerung(Motorsteuerung new_ms){
        this.ms = new_ms;
    }

    public void drive(int speed){
        this.ms.currentAlgorithm.drive(speed);
    }

}
