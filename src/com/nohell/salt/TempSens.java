package com.nohell.salt;
import java.util.ArrayList;
import java.util.List;

public class TempSens {

    private List<Observer> observers;
    private int Temperature;

    public TempSens(int temperature) {
        observers = new ArrayList<>();
        Temperature = temperature;
    }

    public void addObserver(Observer obs){
        this.observers.add(obs);
    }

    public void alarm(int temperature){
        for (Observer obs: this.observers
             ) {
            obs.alarm(temperature);
        }
    }

}
