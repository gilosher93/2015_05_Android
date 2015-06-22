package graphicshape;

/**
 * Created by eladlavi on 6/15/15.
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(){
        this(20, 40);
    }

    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    //getter
    public int getWidth(){
        return width;
    }

    //setter
    public void setWidth(int width){
        if(width>0)
            this.width = width;
    }



    @Override
    public double perimeter() {
        return 2*(width + height);
    }


}







