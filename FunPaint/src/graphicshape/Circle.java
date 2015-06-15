package graphicshape;

/**
 * Created by eladlavi on 6/11/15.
 */
public class Circle extends Shape {
    public int xPos;
    int yPos;
    private int radius;

    //constructor בנאי
    public Circle(){
        xPos = 20;
        yPos = 20;
        radius = 10;
    }

    @Override
    public String toString() {
        return "center = ("+xPos+","+yPos+") and radius = " +
                radius;
    }


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
}
