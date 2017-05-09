package com.anz.singleton;

public class Singleton1 {

    private volatile static Singleton1 singleton;

    private Singleton1() {
    }

    public static Singleton1 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton1.class) {
                if (singleton == null) {
                    singleton = new Singleton1();
                }
            }
        }
        return singleton;
    }

    public void print() {
        System.out.println("singleton one printing...");
    }
}
