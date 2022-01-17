package com.nohell.salt.observers;

import com.nohell.salt.Observer;

public class Heating implements Observer {

    @Override
    public void alarm(int temperature) {
        System.out.println("ALARM " + temperature + "°C IN HEATING" );
    }
}
