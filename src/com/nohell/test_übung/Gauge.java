package com.nohell.test_übung;

import java.util.ArrayList;
import java.util.List;

public class Gauge {

    private List<Observer> ObserverList = new ArrayList();

    public void addObserver(Observer obs){
        ObserverList.add(obs);
    }

    public void draw(int val1, int val2){
        for (Observer obs: ObserverList) {
            obs.draw(val1, val2);
        }
    }

}
