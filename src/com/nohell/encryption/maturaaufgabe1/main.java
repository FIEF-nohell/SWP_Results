package com.nohell.encryption.maturaaufgabe1;

public class main {

    public static void main(String[] args) {

        encryption c = new caesar();
        encryption r = new reverse();

        System.out.println(c.encrypt("ses"));
        System.out.println(r.encrypt("ses"));

    }
}
