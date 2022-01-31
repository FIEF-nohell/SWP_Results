package com.nohell.test_übung;

public class Main {
    public static void main(String[] args) {

    LineChart lc1 = new LineChart(1);
    LineChart lc2 = new LineChart(2);
    LineChart lc3 = new LineChart(3);

    Gauge gauge = new Gauge();

    gauge.addObserver(lc1);
    gauge.addObserver(lc2);
    gauge.addObserver(lc3);

    gauge.draw(1,2);

    }
}
