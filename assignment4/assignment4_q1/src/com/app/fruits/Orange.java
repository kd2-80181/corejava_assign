package com.app.fruits;

public class Orange extends Fruit {
    public Orange(String color, double weight) {
        super("Orange", weight, color);
    }

    @Override
    public String taste() {
        return "sour";
    }
}
