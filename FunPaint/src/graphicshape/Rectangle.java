package graphicshape;

/**
 * Created by eladlavi on 6/15/15.
 */
public class Rectangle extends Shape {
    public int width;
    public int height;
    public Rectangle(){

    }

    @Override
    public double perimeter() {
        return 2*(width + height);
    }
}
