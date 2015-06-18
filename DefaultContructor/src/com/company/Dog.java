package com.company;

/**
 * Created by eladlavi on 6/18/15.
 */
public class Dog {

    String name;
    int x;

    private Dog(String name, int x){
        System.out.println("in constructor " + name);
        this.name = name;
        this.x = 8;
    }
}
