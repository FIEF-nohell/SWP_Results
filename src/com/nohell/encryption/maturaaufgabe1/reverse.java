package com.nohell.encryption.maturaaufgabe1;

public class reverse implements encryption{
    @Override
    public String encrypt(String input) {
        return input + " encrypted by reverse";
    }
}
