package com.nohell.maturaaufgabe1;

public class Caesar implements Encryption {
    @Override
    public String encrypt(String input) {
        return input + " ecrypted by caesar";
    }
}
