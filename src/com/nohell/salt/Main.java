package com.nohell.salt;
import com.nohell.salt.observers.AC;
import com.nohell.salt.observers.Heating;
import com.nohell.salt.observers.Salt;

public class Main {
    public static void main(String[] args) {

        Salt s1 = new Salt();
        Heating h1 = new Heating();
        AC AC1 = new AC();

        Observer o1 = new Heating();
        TempSens ts = new TempSens(20);

        ts.addObserver(s1);
        ts.addObserver(h1);
        ts.addObserver(AC1);

        ts.alarm(-2);

    }
}
