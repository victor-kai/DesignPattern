package com.anz.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    public List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getTotalPrice() {

        float price = 0f;
        for (Item item : items) {
            price += item.price();
        }

        return price;
    }

    public void listItems() {
        for (Item item : items) {
            System.out.print("Item name: " + item.name());
            System.out.print(", Item price: " + item.price());
            System.out.println(", Packing : " + item.packing().pack());
        }
    }

}
