package com.nohell.encryption.maturaaufgabe1;

public class Reverse implements Encryption {
    @Override
    public String encrypt(String input) {
        return input + " encrypted by reverse";
    }
}
