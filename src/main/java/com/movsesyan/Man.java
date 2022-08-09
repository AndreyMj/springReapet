package com.movsesyan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("manBean2")
public class Man {
    private Coffee coffee;

    @Autowired

    public Man(@Qualifier("arabicaBean") Coffee coffee) {
        this.coffee = coffee;
    }

    public void manSay(){
        System.out.println("Aw i am buy coffee ");
        coffee.showSmell();
    }
}
