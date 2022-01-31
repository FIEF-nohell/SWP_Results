package com.nohell.swp_test;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

    Car c1 = new Car();
    EngineController ec1 = new EngineController();
    LightController lc1 = new LightController();
    SpeedController sc1 = new SpeedController();
    c1.setSpeedController(sc1);
    c1.setEngineController(ec1);
    c1.setLightController(lc1);
    Random rd = new Random(10, 190);

    Observer obs1 = ec1;
    sc1.addObserver(obs1);
    Observer obs2 = lc1;
    sc1.addObserver(obs2);

    SuperSaver ss = new SuperSaver();
    TopSpeed ts = new TopSpeed();
    Economy ec = new Economy();


    //Testing driving with each algorithm
    ec1.setAlgorithm(ss);
    c1.drive(rd.generate());

    ec1.setAlgorithm(ts);
    c1.drive(rd.generate());

    ec1.setAlgorithm(ec);
    c1.drive(rd.generate());

    //Smart Test

    System.out.println(" ");
    c1.driveSmart(rd.generate());
    System.out.println(" ");
    c1.driveSmart(rd.generate());
    System.out.println(" ");
    c1.driveSmart(rd.generate());
    System.out.println(" ");
    c1.driveSmart(rd.generate());
    System.out.println(" ");


    }
}
