package graphicshape;

/**
 * Created by eladlavi on 6/11/15.
 */
public abstract class Shape {
    protected Color color;

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


    public static class Color{

        protected byte red, green, blue, alpha;
        public Color(byte r, byte g, byte b, byte a){
            red = r;
            green = g;
            blue = b;
            alpha = a;
        }

        public Color(Color color){
            this(color.red, color.green, color.blue, color.alpha);
        }




        @Override
        public String toString() {
            return "red: " + red + ", green: " + green +
                    ", blue: " + blue + ", alpha: " + alpha;
        }
    }


}
