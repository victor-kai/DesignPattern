package com.anz.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getSingleton();
        singleton1.print();
    }

}
