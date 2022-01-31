package com.nohell.test_übung;

public abstract class AbstractObserver implements Observer{
    protected int serialNumber;

    public AbstractObserver(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
