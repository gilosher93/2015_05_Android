package com.company;

public class Main {

    public static void main(String[] args) {

        MyCollection1 myCollection1 = new MyCollection1();
        myCollection1.add(123);
        myCollection1.add(5);
        myCollection1.add(-18);
        myCollection1.remove(4);
        System.out.println(myCollection1);


//        Drawable d = new Point();
//        Drawable d2 = new Segment();
//
//        Drawable[] drawables = new Drawable[2];
//        drawables[0] = new Point();
//        drawables[1] = new Segment();
//        boolean[][] canvas = new boolean[10][10];
//        for(Drawable drawable : drawables){
//            drawable.draw(canvas);
//        }


    }
}
