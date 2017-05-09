package com.anz.builder;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return new Float(18.8);
    }

    @Override
    public String name() {
        return "VegBurger";
    }

}
