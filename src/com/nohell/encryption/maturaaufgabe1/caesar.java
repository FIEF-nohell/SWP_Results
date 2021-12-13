package com.nohell.encryption.maturaaufgabe1;

public class caesar implements encryption{
    @Override
    public String encrypt(String input) {
        return input + " ecrypted by caesar";
    }
}
