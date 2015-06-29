package graphicshape;

import appcanvas.Point;

/**
 * Created by eladlavi on 6/11/15.
 */
public final class Circle extends Shape {

    static final int DEFAULT_RADIUS = 10;
    public static final int DEFAULT_X = 21;
    public static final int DEFAULT_Y = 24;

    private Point center;
    private int radius = 0;



    //constructor בנאי
    public Circle(){
        this(DEFAULT_RADIUS);
    }

    public Circle(Point center){
        this(center, DEFAULT_RADIUS);
    }

    public Circle(Point center, int r){
        setCenter(center);
        setRadius(r);
    }

    public Circle(int r){
        this(new Point(DEFAULT_X, DEFAULT_Y), r);
    }

    public Circle(Circle circleCopy){
        this(circleCopy.getCenter(), circleCopy.getRadius());
    }


    public Point getCenter() {
        //return new Point(center); //without aliasing
        return center; //with aliasing
    }

    public void setCenter(Point center) {
        this.center = new Point(center);
    }

    public void setRadius(int radius){
        if(radius>0)
                this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }



    @Override
    public String toString() {
        return "center = " + center.toString() + " and radius = " +
                radius;
    }


    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    /*
    public static double calculateArea(int radius){
        return Math.PI * radius * radius;
    }
    */

    @Override
    public void fillColor(int newColor) {
        System.out.println("filling the circle with color " + newColor);
    }

    public void fillColor(byte red, byte green, byte blue){
        System.out.println("filling the circle with color using RGB");
    }

    public void fillColor(float hue, float saturation, float brightness){
        System.out.println("filling the circle with color using hsb");
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj instanceof Circle){
            Circle other = (Circle)obj;
            return this.center.equals(other.center) && this.radius
                    == other.radius;
        }
        return false;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
