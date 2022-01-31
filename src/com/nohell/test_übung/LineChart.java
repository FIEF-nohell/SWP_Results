package com.nohell.test_übung;

public class LineChart extends AbstractObserver{

    public LineChart(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Printed Line Chart " + serialNumber + " at location x:" + x + " and y:" + y);
    }

    public int getSerialNumber(){
        return this.serialNumber;
    }

}
