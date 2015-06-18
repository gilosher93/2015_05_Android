package com.company;

public class Main {

    public static void main(String[] args) {
        wish();
    }

    public static void wish(String name){
        System.out.println("Happy Birthday " + name + "!");
    }

    public static void wish(){
        wish("to you");
    }
}
