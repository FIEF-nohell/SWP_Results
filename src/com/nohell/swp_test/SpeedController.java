package com.nohell.swp_test;

import java.util.ArrayList;
import java.util.List;

public class SpeedController {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs){
        this.observers.add(obs);
    }

    public void notifyAll(int speed){
        for (Observer obs: this.observers) {
            obs.rangeReached(speed);
        }
    }

    public void checkSpeed(int speed) {
        if (speed < 51)         this.notifyAll(speed);
        else if (speed > 50)    this.notifyAll(speed);
        else if (speed > 100)   this.notifyAll(speed);
    }

}
