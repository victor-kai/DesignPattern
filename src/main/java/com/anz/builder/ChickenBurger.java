package com.anz.builder;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger.";
    }

    @Override
    public float price() {
        return 28.8f;
    }

}
