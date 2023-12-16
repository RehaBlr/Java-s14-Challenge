package com.workintech.burger.model;

import com.workintech.burger.enums.BreadRollType;

public class HealthyBurger extends Hamburger implements HealthyAddable{
    private Addition healthyAddition1;
    private Addition healthyAddition2;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, price, breadRollType);
        setMeat("Tofu");
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    @Override
    public void addHealthyAddition(String name, double price) {
        if(healthyAddition1 == null){
            healthyAddition1 = new Addition(name, price);
        } else if(healthyAddition2 == null){
            healthyAddition2 = new Addition(name, price);
        }
    }

    @Override
    public void itemizeHamburger() {

        StringBuilder builder = new StringBuilder();
        if(getHealthyAddition1() != null){
            builder.append("HealthyAddition1: " + getHealthyAddition1().getName());
            setPrice(getPrice() + getHealthyAddition1().getPrice());
        }

        if(getHealthyAddition2() != null){
            builder.append("HealthyAddition2: " + getHealthyAddition2().getName());
            setPrice(getPrice() + getHealthyAddition2().getPrice());
        }

        System.out.println("\n" + builder);
        super.itemizeHamburger();

    }
}