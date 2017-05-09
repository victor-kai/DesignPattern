package com.anz.builder;

import java.util.List;

public class MealBuilder {

    public Meal prepareVegBurgerSetMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareChickenBurgerSetMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareSetMeal(List<Item> items) {
        Meal meal = new Meal();
        for (Item item : items) {
            meal.addItem(item);
        }
        return meal;
    }
}
