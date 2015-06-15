package appcanvas;


import graphicshape.Circle;

/**
 * Created by eladlavi on 6/11/15.
 */
public class Canvas {

    public static void main(String[] args) {
        System.out.println("in main of Canvas");
        Circle circle = new Circle();
        System.out.println(circle.area());
        System.out.println(Circle.calculateArea(20));



    }
}
