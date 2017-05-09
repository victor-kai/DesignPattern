package com.anz.builder;

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi drink";
    }

    @Override
    public float price() {
        return 2.5f;
    }

}
