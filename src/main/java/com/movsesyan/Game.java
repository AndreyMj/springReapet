package com.movsesyan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Game {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        ArabicaCoffee arabicaCoffee = context.getBean("arabicaBean",ArabicaCoffee.class);

        Man man = context.getBean("manBean2",Man.class);
        man.manSay();
        System.out.println("price: "+ arabicaCoffee.getPriceOfOnce());


        context.close();





    }
}
