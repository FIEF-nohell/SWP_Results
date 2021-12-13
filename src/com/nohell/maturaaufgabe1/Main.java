package com.nohell.maturaaufgabe1;

public class Main {

    public static void main(String[] args) {

        Encryption c = new Caesar();
        Encryption r = new Reverse();

        System.out.println(c.encrypt("ses"));
        System.out.println(r.encrypt("ses"));

    }
}
