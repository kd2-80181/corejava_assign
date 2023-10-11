package com.app.fruits;

public class Mango extends Fruit {
    public Mango(String color, double weight) {
        super("Mango", weight, color);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}

