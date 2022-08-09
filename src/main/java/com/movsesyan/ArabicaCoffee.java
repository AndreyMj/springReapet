package com.movsesyan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("arabicaBean")
public class ArabicaCoffee implements Coffee{
    @Value("${ArabicaCoffee.name}")
    private String name;
    @Value("${ArabicaCoffe.priceOfOnce}")
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
