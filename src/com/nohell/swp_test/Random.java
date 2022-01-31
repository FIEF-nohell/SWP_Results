package com.nohell.swp_test;
import java.util.concurrent.ThreadLocalRandom;

public class Random {

    int min, max;

    public Random(int min, int max){
        this.min = min;
        this.max = max;
    }

    public int generate()
    {
        int rnd = ThreadLocalRandom.current().nextInt(this.min, this.max + 1);
        return rnd;
    }

}
