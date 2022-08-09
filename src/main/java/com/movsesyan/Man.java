package com.movsesyan;

public class Man {
    private Coffee coffee;

    public Man(Coffee coffee) {
        this.coffee = coffee;
    }

    public void manSay(){
        System.out.println("Aw i am buy coffee ");
        coffee.showSmell();
    }
}
