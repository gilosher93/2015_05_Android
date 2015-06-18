package com.company;

/**
 * Created by eladlavi on 6/18/15.
 */
public class Dog extends Animal {

    String name;
    String breed;

    @Override
    public int getAge() {
        return super.getAge()*7;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if(food != "Bonzo")
            System.out.println("But I'd rather Bonzo.");
        else
            System.out.println("Thanks. That's what I like");
    }

    public void bark(){
        System.out.println("waf waf");
    }
}
