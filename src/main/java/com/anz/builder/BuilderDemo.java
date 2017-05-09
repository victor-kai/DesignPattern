package com.anz.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderDemo {

    public static void main(String[] args) {
        try2();
    }

    public static void try1() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegBurgerSetMeal();
        Meal chickenMeal = mealBuilder.prepareChickenBurgerSetMeal();
        vegMeal.listItems();
        System.out.println("Set total price: " + vegMeal.getTotalPrice());
        System.out.println("--------------");
        chickenMeal.listItems();
        System.out.println("Set total price: " + chickenMeal.getTotalPrice());
    }

    public static void try2() {
        MealBuilder mealBuilder = new MealBuilder();
        List<Item> items = new ArrayList<Item>();
        items.add(new ChickenBurger());
        items.add(new Pepsi());
        items.add(new VegBurger());
        items.add(new Coke());
        Meal meal = mealBuilder.prepareSetMeal(items);
        meal.listItems();
        System.out.println("Set total price: " + meal.getTotalPrice());
    }
}
