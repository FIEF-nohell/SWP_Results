package com.nohell.encryption.maturaaufgabe1;

public class Caesar implements Encryption {
    @Override
    public String encrypt(String input) {
        return input + " ecrypted by caesar";
    }
}
