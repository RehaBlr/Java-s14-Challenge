package com.workintech.burger.model;

import com.workintech.burger.enums.BreadRollType;

public class Hamburger implements Addable {
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;
    private Addition[] additions;

    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = "Normal";
        this.additions = new Addition[4];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(BreadRollType breadRollType) {
        this.breadRollType = breadRollType;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    @Override
    public void addAddition(String name, double price) {
        for (int i = 0; i < additions.length; i++) {
            if (additions[i] == null) {
                additions[i] = new Addition(name, price);
                break;
            }
        }
    }
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("BreadRollType: " + breadRollType.name() + "\n");

        for(Addition addition: additions){
            if(addition != null){
                builder.append("Addition: " + addition.getName() + "\n");
                setPrice(price + addition.getPrice());
            }
        }

        System.out.print(builder);
        System.out.println("Total Price: " + getPrice());
    }
}
