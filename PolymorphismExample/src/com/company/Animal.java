package com.company;

/**
 * Created by eladlavi on 6/18/15.
 */
public class Animal {
    int yearOfBirth;
    private String color;
    public Animal(){
        yearOfBirth = 2000;
        color = "Brown";
    }

    public int getAge(){
        return 2015-yearOfBirth;
    }

    public void setColor(String someColor){
        color = someColor;
    }

    public void eat(String food){
        System.out.println("I'm eating " + food + ".");
    }

    public void sleep(int hours){
        System.out.println("I'm going to sleep for " +
        hours + " hours.");
    }


}
