package com.anz.builder;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public float price() {
        return 2.5f;
    }

}
