package com.workintech.burger.model;

import com.workintech.burger.enums.DrinkType;

public class Drink {
    private DrinkType type;

    public Drink(DrinkType type) {
        this.type = type;
    }

    public DrinkType getType() {
        return type;
    }
}
