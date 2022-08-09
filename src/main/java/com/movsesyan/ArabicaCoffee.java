package com.movsesyan;

public class ArabicaCoffee implements Coffee{
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
