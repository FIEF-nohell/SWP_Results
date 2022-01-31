package com.nohell.swp_test;

public class EngineController implements Observer{
    protected Algorithm currentAlgorithm;

    public void setAlgorithm(Algorithm alg) {
        this.currentAlgorithm = alg;
    }

    public void setSmartAlgorithm(int speed){
        if (speed < 51){
            this.currentAlgorithm = new Economy();
            System.out.println("Now using Economy mode");
        }
        else if (speed > 50)    {
            this.currentAlgorithm = new TopSpeed();
            System.out.println("Now using TopSpeed mode");
        }
        else if (speed > 100)   {
            this.currentAlgorithm = new SuperSaver();
            System.out.println("Now using SuperSaver mode");
        }

        currentAlgorithm.drive(speed);
    }

    @Override
    public void rangeReached(int speed) {
        System.out.println("EngineController : The speed of " + speed + " km/h was reached just now. New algorithm now in use.");
        setSmartAlgorithm(speed);
    }
}
