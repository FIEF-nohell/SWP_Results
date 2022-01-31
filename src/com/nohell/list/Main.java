package com.nohell.list;

public class Main {
    public static void main(String[] args) {

        HTL_liste l = new HTL_liste();
        l.add(4);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(69);
        l.add(5);
        l.add(5);
        l.add(5);
        System.out.println(l.get(4));
        System.out.println(l.get(5));
        System.out.println(l.get(6));

    }
}
