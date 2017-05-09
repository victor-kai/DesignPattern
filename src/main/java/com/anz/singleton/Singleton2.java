package com.anz.singleton;

public class Singleton2 {

    private static Singleton2 singleton = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getSingleton() {
        if (singleton == null) {
            return new Singleton2();
        }

        return singleton;
    }

}
