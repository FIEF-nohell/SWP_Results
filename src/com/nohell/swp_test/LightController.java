package com.nohell.swp_test;

public class LightController implements Observer{
    @Override
    public void rangeReached(int speed) {
        System.out.println("lightController: The speed of " + speed + " km/h was reached just now. ");
    }
}
