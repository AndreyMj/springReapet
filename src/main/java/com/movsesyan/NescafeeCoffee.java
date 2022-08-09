package com.movsesyan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("nescaffeeBean")

public class NescafeeCoffee implements Coffee{
    @Value("${NescafeeCoffee.name}")
    private String name;
    private int priceOfOnce;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceOfOnce() {
        return priceOfOnce;
    }

    public void setPriceOfOnce(int priceOfOnce) {
        this.priceOfOnce = priceOfOnce;
    }

    @Override
    public void showSmell() {
        System.out.println("great "+name+" coffee!");
    }
}
