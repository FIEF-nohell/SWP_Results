package com.nohell.swp_test;

public class Main {
    public static void main(String[] args) {

    Car c1 = new Car();
    Motorsteuerung ms1 = new Motorsteuerung();
    c1.setMotorsteuerung(ms1);

    SuperSaver ss = new SuperSaver();
    TopSpeed ts = new TopSpeed();
    Economy ec = new Economy();

    ms1.setAlgorithm(ss);
    c1.drive(12);

    ms1.setAlgorithm(ts);
    c1.drive(100);

    ms1.setAlgorithm(ec);
    c1.drive(69);



    }
}
