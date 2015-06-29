package com.company;

/**
 * Created by eladlavi on 6/29/15.
 */
public class Dog {
    static int counter = 0;
    public Dog(){
        counter++;
    }
}

class Cat{
    private static Cat cat;

    private Cat(){

    }

    //Singleton
    public static Cat getCat(){
        if(cat==null)
            cat = new Cat();
        return cat;
    }


}