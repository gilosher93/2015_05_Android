package graphicshape;

/**
 * Created by eladlavi on 6/11/15.
 */
public class Circle extends Shape {

    private int xPos = 0;
    private int yPos = 0;
    private int radius = 0;

    final static int defaultXpos = 21;
    final static int defaultYpos = 21;

    //constructor בנאי
    public Circle(){
        this(defaultXpos, defaultYpos);
    }

    public Circle(int x, int y){
        this(x, y, 10);
    }

    public Circle(int x, int y, int r){
        setXpos(x);
        setYpos(y);
        setRadius(r);
    }
    public Circle(int r){
        this(defaultXpos, defaultYpos, r);
    }


    public void setXpos(int xPos){
        this.xPos = xPos;
    }

    public int getXpos(){
        return xPos;
    }

    public void setYpos(int yPos){
        this.yPos = yPos;
    }

    public int getYpos(){
        return yPos;
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

    public void fillColor(byte red, byte green, byte blue){
        System.out.println("filling the circle with color using RGB");
    }

    public void fillColor(float hue, float saturation, float brightness){
        System.out.println("filling the circle with color using hsb");
    }





    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
