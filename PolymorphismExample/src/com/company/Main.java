package com.company;

public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat("Bananna");
        a1.sleep(12);

        Animal a2 = new Cat();
        a2.yearOfBirth = 2014;
        System.out.println(a2.getAge());
        if(a2 instanceof Dog)
            ((Dog)a2).bark();

        Dog d1 = new Dog();
        feedAnimal(d1);

        System.out.println("end");

    }

    public static void feedAnimal(Animal a){
        a.eat("Tomato");
    }

    public static Animal findOldestAnimal(Animal[] animals){
        
    }

}
//PolymorphismExample

//Create a class named Animal
//Add at least two fields and at least two methods and a constructor
//Create a class named Dog that will inherit from Animal
//Add at least one field to Dog and one method.
//Also override one of the methods of Animal.

//Create a class named Cat that will also inherit from Animal
//Also add a field and a method and override the same method in Animal you
//did with Dog.

//Create a class named Poodle that will inherit from Dog
//Add a field and a method.

//In main, create at least two objects of each class. Once with a pointer of type
//Animal and once with pointer of the direct type of the object.

//Polymorphism, Inheritance, Casting, Override, "instanceof"
