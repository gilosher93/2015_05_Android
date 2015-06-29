package graphicshape;

/**
 * Created by eladlavi on 6/11/15.
 */
public abstract class Shape {
    protected int color;

    public void fillColor(int newColor){
        System.out.println("filling the shape with color " + newColor);
    }

    public abstract double perimeter();

    public abstract double area();

    public static double sumOfShapes(Shape[] shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].perimeter();
        }
        return sum;
    }

}
