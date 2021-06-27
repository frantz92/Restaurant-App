package com.example.strzelecka_18;

public class Dish {

    String title;
    String description;
    int price;

    Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return title;
    }
}
